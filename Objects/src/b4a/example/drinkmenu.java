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

public class drinkmenu extends Activity implements B4AActivity{
	public static drinkmenu mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.drinkmenu");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (drinkmenu).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.drinkmenu");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.drinkmenu", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (drinkmenu) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (drinkmenu) Resume **");
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
		return drinkmenu.class;
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
        BA.LogInfo("** Activity (drinkmenu) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (drinkmenu) Resume **");
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

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mycolors = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mylogo = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _myconame = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mystamp = null;
public b4a.example.card _card = null;
public static int _coffeecount = 0;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mybuttoncolours = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mydrinkmenu = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _drinkselect = null;
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnorder = null;
public anywheresoftware.b4a.objects.PanelWrapper _pgbackground = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnextras = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _selectdrink = null;
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
public b4a.example.drinkextras _drinkextras = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"btnExtras",mostCurrent._btnextras,"btnOrder",mostCurrent._btnorder,"btnScan",mostCurrent._btnscan,"Card",Debug.moduleToString(b4a.example.card.class),"CoffeeCount",_coffeecount,"DrinkExtras",Debug.moduleToString(b4a.example.drinkextras.class),"DrinkSelect",_drinkselect,"imgLogo",mostCurrent._imglogo,"imgStamp1",mostCurrent._imgstamp1,"imgStamp2",mostCurrent._imgstamp2,"imgStamp3",mostCurrent._imgstamp3,"imgStamp4",mostCurrent._imgstamp4,"imgStamp5",mostCurrent._imgstamp5,"imgStamp6",mostCurrent._imgstamp6,"lblCompanyName",mostCurrent._lblcompanyname,"ListView1",mostCurrent._listview1,"Main",Debug.moduleToString(b4a.example.main.class),"myButtonColours",_mybuttoncolours,"myColors",_mycolors,"myCoName",_myconame,"myDrinkMenu",_mydrinkmenu,"myLogo",_mylogo,"myStamp",_mystamp,"myTheme",mostCurrent._mytheme,"No",mostCurrent._no,"pgBackGround",mostCurrent._pgbackground,"pnlBG",mostCurrent._pnlbg,"pnlStamp1",mostCurrent._pnlstamp1,"pnlStamp2",mostCurrent._pnlstamp2,"pnlStamp3",mostCurrent._pnlstamp3,"pnlStamp4",mostCurrent._pnlstamp4,"pnlStamp5",mostCurrent._pnlstamp5,"pnlStamp6",mostCurrent._pnlstamp6,"qrscanner",mostCurrent._qrscanner,"scanSuccess",_scansuccess,"ScrollView1",mostCurrent._scrollview1,"Selectdrink",mostCurrent._selectdrink,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class),"WebView1",mostCurrent._webview1,"Yes",mostCurrent._yes};
}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,44);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="Activity.LoadLayout(\"DrinksMenu\")";
Debug.ShouldStop(8192);
mostCurrent._activity.LoadLayout("DrinksMenu",mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _activity_pause(boolean _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,55);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,51);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _btndrinkextras_click() throws Exception{
try {
		Debug.PushSubsStack("btnDrinkExtras_Click (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,119);
 BA.debugLineNum = 119;BA.debugLine="Sub btnDrinkExtras_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Activity.LoadLayout(\"Extras\")";
Debug.ShouldStop(8388608);
mostCurrent._activity.LoadLayout("Extras",mostCurrent.activityBA);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _btnorder_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrder_Click (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,115);
 BA.debugLineNum = 115;BA.debugLine="Sub btnOrder_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _drinkmenubuttoncolours() throws Exception{
try {
		Debug.PushSubsStack("DrinkMenubuttonColours (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,74);
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _btnrbg = null;
int _colours = 0;
 BA.debugLineNum = 74;BA.debugLine="Sub DrinkMenubuttonColours 'Sets button colours";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="myButtonColours =myTheme.loadBtnColours";
Debug.ShouldStop(1024);
_mybuttoncolours = mostCurrent._mytheme._loadbtncolours();
 BA.debugLineNum = 76;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
Debug.ShouldStop(2048);
{
final int step53 = 1;
final int limit53 = (int) (_mybuttoncolours.getRowCount()-1);
for (_i = (int) (0); (step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53); _i = ((int)(0 + _i + step53))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 77;BA.debugLine="myButtonColours.Position = i";
Debug.ShouldStop(4096);
_mybuttoncolours.setPosition(_i);
 BA.debugLineNum = 78;BA.debugLine="Dim btnRBG As ColorDrawable";
Debug.ShouldStop(8192);
_btnrbg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("btnRBG", _btnrbg);
 BA.debugLineNum = 79;BA.debugLine="Dim colours As Int";
Debug.ShouldStop(16384);
_colours = 0;Debug.locals.put("colours", _colours);
 BA.debugLineNum = 80;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
Debug.ShouldStop(32768);
_colours = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mybuttoncolours.GetInt("BtnRed"),_mybuttoncolours.GetInt("BtnBlue"),_mybuttoncolours.GetInt("BtnGreen"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 81;BA.debugLine="btnRBG.Initialize(colours, 5)";
Debug.ShouldStop(65536);
_btnrbg.Initialize(_colours,(int) (5));
 BA.debugLineNum = 82;BA.debugLine="btnExtras.background=btnRBG";
Debug.ShouldStop(131072);
mostCurrent._btnextras.setBackground((android.graphics.drawable.Drawable)(_btnrbg.getObject()));
 BA.debugLineNum = 83;BA.debugLine="btnOrder.background=btnRBG";
Debug.ShouldStop(262144);
mostCurrent._btnorder.setBackground((android.graphics.drawable.Drawable)(_btnrbg.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _drinks_menu() throws Exception{
try {
		Debug.PushSubsStack("Drinks_Menu (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,88);
int _i = 0;
 BA.debugLineNum = 88;BA.debugLine="Sub Drinks_Menu";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16777216);
mostCurrent._listview1.Clear();
 BA.debugLineNum = 90;BA.debugLine="For i = 0 To myDrinkMenu.RowCount -1";
Debug.ShouldStop(33554432);
{
final int step65 = 1;
final int limit65 = (int) (_mydrinkmenu.getRowCount()-1);
for (_i = (int) (0); (step65 > 0 && _i <= limit65) || (step65 < 0 && _i >= limit65); _i = ((int)(0 + _i + step65))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 91;BA.debugLine="myDrinkMenu.Position = i";
Debug.ShouldStop(67108864);
_mydrinkmenu.setPosition(_i);
 BA.debugLineNum = 92;BA.debugLine="ListView1.AddSingleLine(myDrinkMenu.GetInt(\"ID\") &";
Debug.ShouldStop(134217728);
mostCurrent._listview1.AddSingleLine(BA.NumberToString(_mydrinkmenu.GetInt("ID"))+" : "+_mydrinkmenu.GetString("Name")+" "+_mydrinkmenu.GetString("Description")+" "+BA.NumberToString(_mydrinkmenu.GetInt("Cost")));
 BA.debugLineNum = 94;BA.debugLine="ListView1.SingleLineLayout.ItemHeight = 350";
Debug.ShouldStop(536870912);
mostCurrent._listview1.getSingleLineLayout().setItemHeight((int) (350));
 BA.debugLineNum = 95;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize = 35";
Debug.ShouldStop(1073741824);
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (35));
 BA.debugLineNum = 96;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor = Color";
Debug.ShouldStop(-2147483648);
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 BA.debugLineNum = 97;BA.debugLine="ListView1.SingleLineLayout.Label.Color = Colors.Wh";
Debug.ShouldStop(1);
mostCurrent._listview1.getSingleLineLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim Card As Card";
mostCurrent._card = new b4a.example.card();
 //BA.debugLineNum = 22;BA.debugLine="Private btnScan As Button";
mostCurrent._btnscan = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private imgLogo As ImageView";
mostCurrent._imglogo = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private imgStamp1, imgStamp2, imgStamp3, imgStamp";
mostCurrent._imgstamp1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp5 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp6 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lblCompanyName As Label";
mostCurrent._lblcompanyname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private pnlBG As Panel";
mostCurrent._pnlbg = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private pnlStamp1, pnlStamp2, pnlStamp3, pnlStamp";
mostCurrent._pnlstamp1 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp2 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp3 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp4 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp5 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp6 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim myTheme As CoffeeTheme";
mostCurrent._mytheme = new b4a.example.coffeetheme();
 //BA.debugLineNum = 30;BA.debugLine="Dim scanSuccess As Boolean";
_scansuccess = false;
 //BA.debugLineNum = 31;BA.debugLine="Dim qrscanner As JhsIceZxing1";
mostCurrent._qrscanner = new ice.zxing.b4aZXingLib();
 //BA.debugLineNum = 32;BA.debugLine="Private No As Button";
mostCurrent._no = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Yes As Button";
mostCurrent._yes = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private btnOrder As Button";
mostCurrent._btnorder = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private pgBackGround As Panel";
mostCurrent._pgbackground = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private WebView1 As WebView";
mostCurrent._webview1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private btnExtras As Button";
mostCurrent._btnextras = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private ListView1 As ListView";
mostCurrent._listview1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Selectdrink As Spinner";
mostCurrent._selectdrink = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _loadbackgroundcolours() throws Exception{
try {
		Debug.PushSubsStack("loadBackGroundcolours (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,61);
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _bggradient = null;
int[] _colours = null;
 BA.debugLineNum = 61;BA.debugLine="Sub loadBackGroundcolours 'Sets backgrouns colours";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="myColors = myTheme.loadColours";
Debug.ShouldStop(536870912);
_mycolors = mostCurrent._mytheme._loadcolours();
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To myColors.RowCount - 1 '";
Debug.ShouldStop(1073741824);
{
final int step41 = 1;
final int limit41 = (int) (_mycolors.getRowCount()-1);
for (_i = (int) (0); (step41 > 0 && _i <= limit41) || (step41 < 0 && _i >= limit41); _i = ((int)(0 + _i + step41))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(-2147483648);
_mycolors.setPosition(_i);
 BA.debugLineNum = 65;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(1);
_bggradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 66;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(2);
_colours = new int[(int) (2)];
;Debug.locals.put("colours", _colours);
 BA.debugLineNum = 67;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(4);
_colours[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mycolors.GetInt("BG1Red"),_mycolors.GetInt("BG1Blue"),_mycolors.GetInt("BG1Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 68;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(8);
_colours[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mycolors.GetInt("BG2Red"),_mycolors.GetInt("BG2Blue"),_mycolors.GetInt("BG2Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 69;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(16);
_bggradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),_colours);
 BA.debugLineNum = 70;BA.debugLine="pgBackGround.Background=bgGradient";
Debug.ShouldStop(32);
mostCurrent._pgbackground.setBackground((android.graphics.drawable.Drawable)(_bggradient.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Dim myColors As Cursor";
_mycolors = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim myLogo As Cursor";
_mylogo = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim myCoName As Cursor";
_myconame = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim myStamp As Cursor";
_mystamp = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim Card As Card";
mostCurrent._card = new b4a.example.card();
 //BA.debugLineNum = 9;BA.debugLine="Dim CoffeeCount As Int";
_coffeecount = 0;
 //BA.debugLineNum = 10;BA.debugLine="Dim myButtonColours As Cursor";
_mybuttoncolours = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim myDrinkMenu As Cursor";
_mydrinkmenu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim DrinkSelect As Cursor";
_drinkselect = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static String  _spinner1_itemclick() throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,104);
 BA.debugLineNum = 104;BA.debugLine="Sub Spinner1_ItemClick";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Selectdrink.Clear";
Debug.ShouldStop(256);
mostCurrent._selectdrink.Clear();
 BA.debugLineNum = 106;BA.debugLine="Selectdrink.Add(\"Name\")";
Debug.ShouldStop(512);
mostCurrent._selectdrink.Add("Name");
 BA.debugLineNum = 107;BA.debugLine="If File.Exists(File.DirInternal, \"customerthemes.s";
Debug.ShouldStop(1024);
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite")) { 
 BA.debugLineNum = 108;BA.debugLine="Selectdrink.SelectedIndex = Selectdrink.IndexOf (F";
Debug.ShouldStop(2048);
mostCurrent._selectdrink.setSelectedIndex(mostCurrent._selectdrink.IndexOf(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite")));
 }else {
 BA.debugLineNum = 110;BA.debugLine="Selectdrink.SelectedIndex = 1";
Debug.ShouldStop(8192);
mostCurrent._selectdrink.setSelectedIndex((int) (1));
 };
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}