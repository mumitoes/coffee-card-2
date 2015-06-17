package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
		BA.handler.postDelayed(new WaitForLayout(), 5);

	}
	private static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEvent(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (storepurchase.mostCurrent != null);
return vis;}

public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = main.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (storepurchase.previousOne != null) {
				__a = storepurchase.previousOne.get();
			}
            else {
                BA ba = storepurchase.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mycolors = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mylogo = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _myconame = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mystamp = null;
public b4a.example.card _card = null;
public static int _coffeecount = 0;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mybuttoncolours = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnscan = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imglogo = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstamp1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstamp2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstamp3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstamp4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstamp5 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstamp6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcompanyname = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbg = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlstamp1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlstamp2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlstamp3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlstamp4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlstamp5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlstamp6 = null;
public b4a.example.coffeetheme _mytheme = null;
public static boolean _scansuccess = false;
public ice.zxing.b4aZXingLib _qrscanner = null;
public anywheresoftware.b4a.objects.ButtonWrapper _no = null;
public anywheresoftware.b4a.objects.ButtonWrapper _yes = null;
public b4a.example.themecalc _themecalc = null;
public b4a.example.storepurchase _storepurchase = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="myTheme.Initialize ' initialise theme database on";
mostCurrent._mytheme._initialize(null,processBA);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="loadDBcolours";
_loaddbcolours();
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="loadDBlogo";
_loaddblogo();
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="loadDBname";
_loaddbname();
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="loadStamp";
_loadstamp();
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="loadDBbuttonColours";
_loaddbbuttoncolours();
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="CoffeeCount=5";
_coffeecount = (int) (5);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="End Sub";
return "";
}
public static String  _loaddbcolours() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _bggradient = null;
int[] _colours = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub loadDBcolours 'Assign background colours from";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="myColors = myTheme.loadColours";
_mycolors = mostCurrent._mytheme._loadcolours(null);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="For i = 0 To myColors.RowCount - 1";
{
final int step35 = 1;
final int limit35 = (int) (_mycolors.getRowCount()-1);
for (_i = (int) (0); (step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35); _i = ((int)(0 + _i + step35))) {
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="myColors.Position = i";
_mycolors.setPosition(_i);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim bgGradient As GradientDrawable";
_bggradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim colours(2) As Int";
_colours = new int[(int) (2)];
;
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
_colours[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mycolors.GetInt("BG1Red"),_mycolors.GetInt("BG1Blue"),_mycolors.GetInt("BG1Green"));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
_colours[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mycolors.GetInt("BG2Red"),_mycolors.GetInt("BG2Blue"),_mycolors.GetInt("BG2Green"));
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
_bggradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),_colours);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="pnlBG.Background=bgGradient";
mostCurrent._pnlbg.setBackground((android.graphics.drawable.Drawable)(_bggradient.getObject()));
 }
};
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="End Sub";
return "";
}
public static String  _loaddblogo() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub loadDBlogo 'Assign Logo as string from databas";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="myLogo=myTheme.loadLogo";
_mylogo = mostCurrent._mytheme._loadlogo(null);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
{
final int step47 = 1;
final int limit47 = (int) (_mylogo.getRowCount()-1);
for (_i = (int) (0); (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47))) {
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="myLogo.Position=i";
_mylogo.setPosition(_i);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Dim image As Bitmap";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
_image.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_mylogo.GetString("Logo"));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="imgLogo.Bitmap=image";
mostCurrent._imglogo.setBitmap((android.graphics.Bitmap)(_image.getObject()));
 }
};
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="End Sub";
return "";
}
public static String  _loaddbname() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub loadDBname ' method to assign Company Name to";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="myCoName=myTheme.loadCompanyName";
_myconame = mostCurrent._mytheme._loadcompanyname(null);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="For i = 0 To myCoName.RowCount - 1";
{
final int step56 = 1;
final int limit56 = (int) (_myconame.getRowCount()-1);
for (_i = (int) (0); (step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56); _i = ((int)(0 + _i + step56))) {
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="myCoName.Position=i";
_myconame.setPosition(_i);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="lblCompanyName.Text  =myCoName.GetString(\"Name\")";
mostCurrent._lblcompanyname.setText((Object)(_myconame.GetString("Name")));
 }
};
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public static String  _loadstamp() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub loadStamp ' method to assign stamp image to St";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="myStamp=myTheme.loadStampIcon";
_mystamp = mostCurrent._mytheme._loadstampicon(null);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
{
final int step63 = 1;
final int limit63 = (int) (_mystamp.getRowCount()-1);
for (_i = (int) (0); (step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63); _i = ((int)(0 + _i + step63))) {
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="myStamp.Position=i";
_mystamp.setPosition(_i);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Dim image As Bitmap";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
_image.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_mylogo.GetString("StampIcon"));
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="imgStamp1.Bitmap=image";
mostCurrent._imgstamp1.setBitmap((android.graphics.Bitmap)(_image.getObject()));
 }
};
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="End Sub";
return "";
}
public static String  _loaddbbuttoncolours() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _btnrbg = null;
int _colours = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub loadDBbuttonColours ' method to assign colours";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="myButtonColours =myTheme.loadBtnColours";
_mybuttoncolours = mostCurrent._mytheme._loadbtncolours(null);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
{
final int step72 = 1;
final int limit72 = (int) (_mybuttoncolours.getRowCount()-1);
for (_i = (int) (0); (step72 > 0 && _i <= limit72) || (step72 < 0 && _i >= limit72); _i = ((int)(0 + _i + step72))) {
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="myButtonColours.Position = i";
_mybuttoncolours.setPosition(_i);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Dim btnRBG As ColorDrawable";
_btnrbg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim colours As Int";
_colours = 0;
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
_colours = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mybuttoncolours.GetInt("BtnRed"),_mybuttoncolours.GetInt("BtnBlue"),_mybuttoncolours.GetInt("BtnGreen"));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="btnRBG.Initialize(colours, 5)";
_btnrbg.Initialize(_colours,(int) (5));
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="btnScan.background=btnRBG";
mostCurrent._btnscan.setBackground((android.graphics.drawable.Drawable)(_btnrbg.getObject()));
 }
};
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _btnno_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub btnno_Click ' you can also save and redeem lat";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Activity.LoadLayout(\"main\") 'will return to main";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _btnscan_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="updateStamps";
_updatestamps();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public static String  _updatestamps() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub updateStamps";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If CoffeeCount = 6 Then";
if (_coffeecount==6) { 
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="ToastMessageShow(\" You Have Earned A free Coffee\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You Have Earned A free Coffee",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Activity.LoadLayout(\"freecoffee\") 'will load 2 la";
mostCurrent._activity.LoadLayout("freecoffee",mostCurrent.activityBA);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="imgStamp5.Visible = True";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="imgStamp6.Visible = True";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="If CoffeeCount = 5 Then 'from 5 to 1 will show ho";
if (_coffeecount==5) { 
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="ToastMessageShow (\" You still need 1 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 1 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="imgStamp5.Visible = True";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="If CoffeeCount = 4 Then";
if (_coffeecount==4) { 
RDebugUtils.currentLine=1376279;
 //BA.debugLineNum = 1376279;BA.debugLine="ToastMessageShow (\" You still need 2 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 2 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376280;
 //BA.debugLineNum = 1376280;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376281;
 //BA.debugLineNum = 1376281;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376282;
 //BA.debugLineNum = 1376282;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376283;
 //BA.debugLineNum = 1376283;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376284;
 //BA.debugLineNum = 1376284;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376285;
 //BA.debugLineNum = 1376285;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1376287;
 //BA.debugLineNum = 1376287;BA.debugLine="If CoffeeCount = 3 Then";
if (_coffeecount==3) { 
RDebugUtils.currentLine=1376288;
 //BA.debugLineNum = 1376288;BA.debugLine="ToastMessageShow (\" You still need 3 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 3 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376289;
 //BA.debugLineNum = 1376289;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376290;
 //BA.debugLineNum = 1376290;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376291;
 //BA.debugLineNum = 1376291;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376292;
 //BA.debugLineNum = 1376292;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376293;
 //BA.debugLineNum = 1376293;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376294;
 //BA.debugLineNum = 1376294;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1376296;
 //BA.debugLineNum = 1376296;BA.debugLine="If CoffeeCount = 2 Then";
if (_coffeecount==2) { 
RDebugUtils.currentLine=1376297;
 //BA.debugLineNum = 1376297;BA.debugLine="ToastMessageShow (\" you still need 4  more stamp";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" you still need 4  more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376298;
 //BA.debugLineNum = 1376298;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376299;
 //BA.debugLineNum = 1376299;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376300;
 //BA.debugLineNum = 1376300;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376301;
 //BA.debugLineNum = 1376301;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376302;
 //BA.debugLineNum = 1376302;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376303;
 //BA.debugLineNum = 1376303;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1376305;
 //BA.debugLineNum = 1376305;BA.debugLine="If CoffeeCount = 1 Then";
if (_coffeecount==1) { 
RDebugUtils.currentLine=1376306;
 //BA.debugLineNum = 1376306;BA.debugLine="ToastMessageShow (\" You still need 5  more stamp";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 5  more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376307;
 //BA.debugLineNum = 1376307;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376308;
 //BA.debugLineNum = 1376308;BA.debugLine="imgStamp2.Visible = False";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376309;
 //BA.debugLineNum = 1376309;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376310;
 //BA.debugLineNum = 1376310;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376311;
 //BA.debugLineNum = 1376311;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376312;
 //BA.debugLineNum = 1376312;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1376315;
 //BA.debugLineNum = 1376315;BA.debugLine="If CoffeeCount = 0 Then";
if (_coffeecount==0) { 
RDebugUtils.currentLine=1376316;
 //BA.debugLineNum = 1376316;BA.debugLine="ToastMessageShow (\" Don't Forget to use your Coff";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" Don't Forget to use your Coffe-E-Card when you buying  a coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376317;
 //BA.debugLineNum = 1376317;BA.debugLine="imgStamp1.Visible = False";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376318;
 //BA.debugLineNum = 1376318;BA.debugLine="imgStamp2.Visible = False";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376319;
 //BA.debugLineNum = 1376319;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376320;
 //BA.debugLineNum = 1376320;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376321;
 //BA.debugLineNum = 1376321;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376322;
 //BA.debugLineNum = 1376322;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1376324;
 //BA.debugLineNum = 1376324;BA.debugLine="End Sub";
return "";
}
public static String  _btnscan_longclick() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="qrscanner.isportrait = True";
mostCurrent._qrscanner.isportrait = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="qrscanner.useFrontCam = False";
mostCurrent._qrscanner.useFrontCam = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="qrscanner.timeoutDuration = 30";
mostCurrent._qrscanner.timeoutDuration = (int) (30);
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="qrscanner.theViewFinderXfactor = 0.7";
mostCurrent._qrscanner.theViewFinderXfactor = 0.7;
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="qrscanner.theViewFinderYfactor = 0.5";
mostCurrent._qrscanner.theViewFinderYfactor = 0.5;
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="qrscanner.theFrameColor = Colors.LightGray";
mostCurrent._qrscanner.theFrameColor = anywheresoftware.b4a.keywords.Common.Colors.LightGray;
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="qrscanner.theLaserColor = Colors.Red";
mostCurrent._qrscanner.theLaserColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="qrscanner.theMaskColor = Colors.argb(95, 0, 0, 25";
mostCurrent._qrscanner.theMaskColor = anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (95),(int) (0),(int) (0),(int) (255));
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="qrscanner.theResultColor = Colors.Green";
mostCurrent._qrscanner.theResultColor = anywheresoftware.b4a.keywords.Common.Colors.Green;
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="qrscanner.theResultPointColor = Colors.Red";
mostCurrent._qrscanner.theResultPointColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="qrscanner.theBottomPromptMessage = \"Scan Your Cof";
mostCurrent._qrscanner.theBottomPromptMessage = "Scan Your Coffee Stamp.";
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="qrscanner.theBottomPromptTextSize = 5%y";
mostCurrent._qrscanner.theBottomPromptTextSize = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="qrscanner.bottomPromptColor = Colors.Yellow";
mostCurrent._qrscanner.bottomPromptColor = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="qrscanner.bottomPromptDistanceFromBottom = 5%y";
mostCurrent._qrscanner.bottomPromptDistanceFromBottom = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="scanSuccess = False";
_scansuccess = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="qrscanner.BeginScan(\"scanner\")	'This is the funct";
mostCurrent._qrscanner.BeginScan(mostCurrent.activityBA,"scanner");
RDebugUtils.currentLine=1638427;
 //BA.debugLineNum = 1638427;BA.debugLine="End Sub";
return "";
}
public static String  _btnyes_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub btnyes_Click 'to redeem your free coffee press";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="CoffeeCount = 0";
_coffeecount = (int) (0);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="updateStamps";
_updatestamps();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="End Sub";
return "";
}
public static String  _scanner_noscan(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub scanner_noscan(atype As String,Values As Strin";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
anywheresoftware.b4a.keywords.Common.Log("type:"+_atype+"Values:"+_values);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Msgbox(Values,\"Scan Failed\")";
anywheresoftware.b4a.keywords.Common.Msgbox(_values,"Scan Failed",mostCurrent.activityBA);
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="End Sub";
return "";
}
public static String  _scanner_result(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub scanner_result(atype As String,Values As Strin";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If Values <> \"Null\" Then";
if ((_values).equals("Null") == false) { 
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="scanSuccess = True";
_scansuccess = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="CoffeeCount = CoffeeCount + 1";
_coffeecount = (int) (_coffeecount+1);
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
anywheresoftware.b4a.keywords.Common.Log("type:"+_atype+"Values:"+_values);
 };
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="updateStamps";
_updatestamps();
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="End Sub";
return "";
}
}