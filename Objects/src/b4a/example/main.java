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
vis = vis | (drinkmenu.mostCurrent != null);
vis = vis | (drinkextras.mostCurrent != null);
vis = vis | (maplocator.mostCurrent != null);
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
            if (drinkmenu.previousOne != null) {
				__a = drinkmenu.previousOne.get();
			}
            else {
                BA ba = drinkmenu.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (drinkextras.previousOne != null) {
				__a = drinkextras.previousOne.get();
			}
            else {
                BA ba = drinkextras.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (maplocator.previousOne != null) {
				__a = maplocator.previousOne.get();
			}
            else {
                BA ba = maplocator.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.card _card = null;
public static int _coffeecount = 0;
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnorder = null;
public anywheresoftware.b4a.objects.PanelWrapper _pgbackground = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnextras = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public b4a.example.address _companydetails = null;
public b4a.example.drinkmenu _drinkmenu = null;
public b4a.example.drinkextras _drinkextras = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="myTheme.Initialize ' initialise theme database on";
mostCurrent._mytheme._initialize(null,processBA);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="companyDetails.Initialize 'initialise methods to";
mostCurrent._companydetails._initialize(null,processBA);
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="loadLayout";
_loadlayout();
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="End Sub";
return "";
}
public static String  _loadlayout() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub loadLayout";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="pnlBG.Background = companyDetails.LoadBGColours()";
mostCurrent._pnlbg.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loadbgcolours(null).getObject()));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="lblCompanyName.Text = companyDetails.loadName() '";
mostCurrent._lblcompanyname.setText((Object)(mostCurrent._companydetails._loadname(null)));
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="imgLogo.Bitmap = companyDetails.loadDBlogo() 'Log";
mostCurrent._imglogo.setBitmap((android.graphics.Bitmap)(mostCurrent._companydetails._loaddblogo(null).getObject()));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="btnScan.Background = companyDetails.loadDBbuttonC";
mostCurrent._btnscan.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loaddbbuttoncolours(null).getObject()));
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="imgStamp1.Bitmap = companyDetails.loadStamp()'loa";
mostCurrent._imgstamp1.setBitmap((android.graphics.Bitmap)(mostCurrent._companydetails._loadstamp(null).getObject()));
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="imgStamp2.Bitmap = companyDetails.loadStamp()'loa";
mostCurrent._imgstamp2.setBitmap((android.graphics.Bitmap)(mostCurrent._companydetails._loadstamp(null).getObject()));
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="imgStamp3.Bitmap = companyDetails.loadStamp()'loa";
mostCurrent._imgstamp3.setBitmap((android.graphics.Bitmap)(mostCurrent._companydetails._loadstamp(null).getObject()));
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="imgStamp4.Bitmap = companyDetails.loadStamp()'loa";
mostCurrent._imgstamp4.setBitmap((android.graphics.Bitmap)(mostCurrent._companydetails._loadstamp(null).getObject()));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="imgStamp5.Bitmap = companyDetails.loadStamp()'loa";
mostCurrent._imgstamp5.setBitmap((android.graphics.Bitmap)(mostCurrent._companydetails._loadstamp(null).getObject()));
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="imgStamp6.Bitmap = companyDetails.loadStamp()'loa";
mostCurrent._imgstamp6.setBitmap((android.graphics.Bitmap)(mostCurrent._companydetails._loadstamp(null).getObject()));
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _btnno_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub btnno_Click ' you can also save and redeem lat";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Activity.LoadLayout(\"main\") 'will return to main";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _btnscan_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="StartActivity(DrinkExtras)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._drinkextras.getObject()));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
return "";
}
public static String  _btnscan_longclick() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="qrscanner.isportrait = True";
mostCurrent._qrscanner.isportrait = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="qrscanner.useFrontCam = False";
mostCurrent._qrscanner.useFrontCam = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="qrscanner.timeoutDuration = 30";
mostCurrent._qrscanner.timeoutDuration = (int) (30);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="qrscanner.theViewFinderXfactor = 0.7";
mostCurrent._qrscanner.theViewFinderXfactor = 0.7;
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="qrscanner.theViewFinderYfactor = 0.5";
mostCurrent._qrscanner.theViewFinderYfactor = 0.5;
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="qrscanner.theFrameColor = Colors.LightGray";
mostCurrent._qrscanner.theFrameColor = anywheresoftware.b4a.keywords.Common.Colors.LightGray;
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="qrscanner.theLaserColor = Colors.Red";
mostCurrent._qrscanner.theLaserColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="qrscanner.theMaskColor = Colors.argb(95, 0, 0, 25";
mostCurrent._qrscanner.theMaskColor = anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (95),(int) (0),(int) (0),(int) (255));
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="qrscanner.theResultColor = Colors.Green";
mostCurrent._qrscanner.theResultColor = anywheresoftware.b4a.keywords.Common.Colors.Green;
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="qrscanner.theResultPointColor = Colors.Red";
mostCurrent._qrscanner.theResultPointColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="qrscanner.theBottomPromptMessage = \"Scan Your Cof";
mostCurrent._qrscanner.theBottomPromptMessage = "Scan Your Coffee Stamp.";
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="qrscanner.theBottomPromptTextSize = 5%y";
mostCurrent._qrscanner.theBottomPromptTextSize = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="qrscanner.bottomPromptColor = Colors.Yellow";
mostCurrent._qrscanner.bottomPromptColor = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="qrscanner.bottomPromptDistanceFromBottom = 5%y";
mostCurrent._qrscanner.bottomPromptDistanceFromBottom = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="scanSuccess = False";
_scansuccess = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="qrscanner.BeginScan(\"scanner\")	'This is the funct";
mostCurrent._qrscanner.BeginScan(mostCurrent.activityBA,"scanner");
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="End Sub";
return "";
}
public static String  _btnyes_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub btnyes_Click 'to redeem your free coffee press";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="CoffeeCount = 0";
_coffeecount = (int) (0);
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="updateStamps";
_updatestamps();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="End Sub";
return "";
}
public static String  _updatestamps() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub updateStamps";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If CoffeeCount = 6 Then";
if (_coffeecount==6) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="ToastMessageShow(\" You Have Earned A free Coffee\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You Have Earned A free Coffee",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Activity.LoadLayout(\"freecoffee\") 'will load 2 la";
mostCurrent._activity.LoadLayout("freecoffee",mostCurrent.activityBA);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="imgStamp5.Visible = True";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="imgStamp6.Visible = True";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="If CoffeeCount = 5 Then 'from 5 to 1 will show ho";
if (_coffeecount==5) { 
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="ToastMessageShow (\" You still need 1 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 1 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="imgStamp5.Visible = True";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="If CoffeeCount = 4 Then";
if (_coffeecount==4) { 
RDebugUtils.currentLine=393239;
 //BA.debugLineNum = 393239;BA.debugLine="ToastMessageShow (\" You still need 2 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 2 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393240;
 //BA.debugLineNum = 393240;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="imgStamp4.Visible = True";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393244;
 //BA.debugLineNum = 393244;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=393247;
 //BA.debugLineNum = 393247;BA.debugLine="If CoffeeCount = 3 Then";
if (_coffeecount==3) { 
RDebugUtils.currentLine=393248;
 //BA.debugLineNum = 393248;BA.debugLine="ToastMessageShow (\" You still need 3 more stamp i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 3 more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393249;
 //BA.debugLineNum = 393249;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393250;
 //BA.debugLineNum = 393250;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393251;
 //BA.debugLineNum = 393251;BA.debugLine="imgStamp3.Visible = True";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393252;
 //BA.debugLineNum = 393252;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393253;
 //BA.debugLineNum = 393253;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393254;
 //BA.debugLineNum = 393254;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=393256;
 //BA.debugLineNum = 393256;BA.debugLine="If CoffeeCount = 2 Then";
if (_coffeecount==2) { 
RDebugUtils.currentLine=393257;
 //BA.debugLineNum = 393257;BA.debugLine="ToastMessageShow (\" you still need 4  more stamp";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" you still need 4  more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393258;
 //BA.debugLineNum = 393258;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393259;
 //BA.debugLineNum = 393259;BA.debugLine="imgStamp2.Visible = True";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393260;
 //BA.debugLineNum = 393260;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393261;
 //BA.debugLineNum = 393261;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393262;
 //BA.debugLineNum = 393262;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393263;
 //BA.debugLineNum = 393263;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=393265;
 //BA.debugLineNum = 393265;BA.debugLine="If CoffeeCount = 1 Then";
if (_coffeecount==1) { 
RDebugUtils.currentLine=393266;
 //BA.debugLineNum = 393266;BA.debugLine="ToastMessageShow (\" You still need 5  more stamp";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" You still need 5  more stamp in order to get a free coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393267;
 //BA.debugLineNum = 393267;BA.debugLine="imgStamp1.Visible = True";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393268;
 //BA.debugLineNum = 393268;BA.debugLine="imgStamp2.Visible = False";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393269;
 //BA.debugLineNum = 393269;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393270;
 //BA.debugLineNum = 393270;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393271;
 //BA.debugLineNum = 393271;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393272;
 //BA.debugLineNum = 393272;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=393275;
 //BA.debugLineNum = 393275;BA.debugLine="If CoffeeCount = 0 Then";
if (_coffeecount==0) { 
RDebugUtils.currentLine=393276;
 //BA.debugLineNum = 393276;BA.debugLine="ToastMessageShow (\" Don't Forget to use your Coff";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(" Don't Forget to use your Coffe-E-Card when you buying  a coffee",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393277;
 //BA.debugLineNum = 393277;BA.debugLine="imgStamp1.Visible = False";
mostCurrent._imgstamp1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393278;
 //BA.debugLineNum = 393278;BA.debugLine="imgStamp2.Visible = False";
mostCurrent._imgstamp2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393279;
 //BA.debugLineNum = 393279;BA.debugLine="imgStamp3.Visible = False";
mostCurrent._imgstamp3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393280;
 //BA.debugLineNum = 393280;BA.debugLine="imgStamp4.Visible = False";
mostCurrent._imgstamp4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393281;
 //BA.debugLineNum = 393281;BA.debugLine="imgStamp5.Visible = False";
mostCurrent._imgstamp5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393282;
 //BA.debugLineNum = 393282;BA.debugLine="imgStamp6.Visible = False";
mostCurrent._imgstamp6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=393284;
 //BA.debugLineNum = 393284;BA.debugLine="End Sub";
return "";
}
public static String  _scanner_noscan(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub scanner_noscan(atype As String,Values As Strin";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
anywheresoftware.b4a.keywords.Common.Log("type:"+_atype+"Values:"+_values);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Msgbox(Values,\"Scan Failed\")";
anywheresoftware.b4a.keywords.Common.Msgbox(_values,"Scan Failed",mostCurrent.activityBA);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public static String  _scanner_result(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub scanner_result(atype As String,Values As Strin";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="If Values <> \"Null\" Then";
if ((_values).equals("Null") == false) { 
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="scanSuccess = True";
_scansuccess = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="CoffeeCount = CoffeeCount + 1";
_coffeecount = (int) (_coffeecount+1);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
anywheresoftware.b4a.keywords.Common.Log("type:"+_atype+"Values:"+_values);
 };
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="updateStamps";
_updatestamps();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="End Sub";
return "";
}
}