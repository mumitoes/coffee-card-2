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

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mycolors = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mylogo = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _myconame = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mystamp = null;
public b4a.example.card _card = null;
public static int _coffeecount = 0;
public static String _mresult = "";
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
public b4a.example.scan _scanner = null;
public com.AB.ABZxing.ABZxing _myabbarcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public b4a.example.themecalc _themecalc = null;
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
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="loadDBlogo";
_loaddblogo();
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="loadDBname";
_loaddbname();
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="loadStamp";
_loadstamp();
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="End Sub";
return "";
}
public static String  _loaddblogo() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub loadDBlogo 'Load Logo as string from database";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="myLogo=myTheme.loadLogo";
_mylogo = mostCurrent._mytheme._loadlogo(null);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
{
final int step31 = 1;
final int limit31 = (int) (_mylogo.getRowCount()-1);
for (_i = (int) (0); (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31))) {
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="myLogo.Position=i";
_mylogo.setPosition(_i);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Dim image As Bitmap";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
_image.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_mylogo.GetString("Logo"));
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="imgLogo.Bitmap=image";
mostCurrent._imglogo.setBitmap((android.graphics.Bitmap)(_image.getObject()));
 }
};
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="End Sub";
return "";
}
public static String  _loaddbname() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub loadDBname 'Load company name from database";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="myCoName=myTheme.loadCompanyName";
_myconame = mostCurrent._mytheme._loadcompanyname(null);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="For i = 0 To myCoName.RowCount - 1";
{
final int step40 = 1;
final int limit40 = (int) (_myconame.getRowCount()-1);
for (_i = (int) (0); (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="myCoName.Position=i";
_myconame.setPosition(_i);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="lblCompanyName.Text  =myCoName.GetString(\"Compan";
mostCurrent._lblcompanyname.setText((Object)(_myconame.GetString("CompanyName")));
 }
};
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="End Sub";
return "";
}
public static String  _loadstamp() throws Exception{
RDebugUtils.currentModule="main";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub loadStamp 'load stamp from database";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="myStamp=myTheme.loadStampIcon";
_mystamp = mostCurrent._mytheme._loadstampicon(null);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
{
final int step47 = 1;
final int limit47 = (int) (_mystamp.getRowCount()-1);
for (_i = (int) (0); (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47))) {
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="myStamp.Position=i";
_mystamp.setPosition(_i);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Dim image As Bitmap";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
_image.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_mylogo.GetString("StampIcon"));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="imgStamp1.Bitmap=image";
mostCurrent._imgstamp1.setBitmap((android.graphics.Bitmap)(_image.getObject()));
 }
};
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public static String  _btnscan_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If CoffeeCount = 6 Then";
if (_coffeecount==6) { 
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="ToastMessageShow(\" You Have Earned A free Coffee\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You Have Earned A free Coffee",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Activity.LoadLayout(\"freecoffee\") 'will load 2 la";
mostCurrent._activity.LoadLayout("freecoffee",mostCurrent.activityBA);
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="imgStamp5.Visible = True";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="imgStamp6.Visible = True";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="If CoffeeCount = 5 Then 'from 5 to 1 will show ho";
if (_coffeecount==5) { 
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="ToastMessageShow (\" You still need 1 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 1 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="imgStamp5.Visible = True";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="If CoffeeCount = 4 Then";
if (_coffeecount==4) { 
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="ToastMessageShow (\" You still need 2 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 2 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="If CoffeeCount = 3 Then";
if (_coffeecount==3) { 
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="ToastMessageShow (\" You still need 3 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 3 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524325;
 //BA.debugLineNum = 524325;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="If CoffeeCount = 2 Then";
if (_coffeecount==2) { 
RDebugUtils.currentLine=524329;
 //BA.debugLineNum = 524329;BA.debugLine="ToastMessageShow (\" you still need 4  more stamp";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" you still need 4  more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524330;
 //BA.debugLineNum = 524330;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524331;
 //BA.debugLineNum = 524331;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524332;
 //BA.debugLineNum = 524332;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524333;
 //BA.debugLineNum = 524333;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524335;
 //BA.debugLineNum = 524335;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524337;
 //BA.debugLineNum = 524337;BA.debugLine="If CoffeeCount = 1 Then";
if (_coffeecount==1) { 
RDebugUtils.currentLine=524338;
 //BA.debugLineNum = 524338;BA.debugLine="ToastMessageShow (\" You still need 5  more stamp";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 5  more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524339;
 //BA.debugLineNum = 524339;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524340;
 //BA.debugLineNum = 524340;BA.debugLine="imgStamp2.Visible = False";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524341;
 //BA.debugLineNum = 524341;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524342;
 //BA.debugLineNum = 524342;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524343;
 //BA.debugLineNum = 524343;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524344;
 //BA.debugLineNum = 524344;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524347;
 //BA.debugLineNum = 524347;BA.debugLine="If CoffeeCount = 0 Then";
if (_coffeecount==0) { 
RDebugUtils.currentLine=524348;
 //BA.debugLineNum = 524348;BA.debugLine="ToastMessageShow (\" Don't Forget to use your Coff";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" Don't Forget to use your Coffe-E-Card when you buying  a coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524349;
 //BA.debugLineNum = 524349;BA.debugLine="imgStamp1.Visible = False";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524350;
 //BA.debugLineNum = 524350;BA.debugLine="imgStamp2.Visible = False";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524351;
 //BA.debugLineNum = 524351;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524352;
 //BA.debugLineNum = 524352;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524353;
 //BA.debugLineNum = 524353;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524354;
 //BA.debugLineNum = 524354;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524357;
 //BA.debugLineNum = 524357;BA.debugLine="End Sub";
return "";
}
public static String  _btnscan_longclick() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Scanner.Scanqr()";
mostCurrent._scanner._scanqr(null);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _myabbarcode_barcodefound(String _barcode,String _formatname) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub myABBarcode_BarcodeFound (barCode As String, f";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Label1.Text = barCode";
mostCurrent._label1.setText((Object)(_barcode));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="mResult = barCode";
_mresult = _barcode;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public static String  _no_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub No_Click ' you can also save and redeem later";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="activity.LoadLayout(\"main\") 'will return to main";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _yes_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub yes_Click 'to redeem your free coffee press Ye";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Activity.LoadLayout(\"ABBarcodeTest\")";
mostCurrent._activity.LoadLayout("ABBarcodeTest",mostCurrent.activityBA);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Label1.Text = mResult";
mostCurrent._label1.setText((Object)(_mresult));
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="myABBarcode.ABGetBarcode(\"myabbarcode\", \"\")";
mostCurrent._myabbarcode.ABGetBarcode(mostCurrent.activityBA,"myabbarcode","");
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
}