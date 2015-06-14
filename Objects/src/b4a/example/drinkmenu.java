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
public static String _htmlcss = "";
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
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"btnExtras",mostCurrent._btnextras,"btnOrder",mostCurrent._btnorder,"btnScan",mostCurrent._btnscan,"Card",Debug.moduleToString(b4a.example.card.class),"CoffeeCount",_coffeecount,"HtmlCSS",_htmlcss,"imgLogo",mostCurrent._imglogo,"imgStamp1",mostCurrent._imgstamp1,"imgStamp2",mostCurrent._imgstamp2,"imgStamp3",mostCurrent._imgstamp3,"imgStamp4",mostCurrent._imgstamp4,"imgStamp5",mostCurrent._imgstamp5,"imgStamp6",mostCurrent._imgstamp6,"lblCompanyName",mostCurrent._lblcompanyname,"Main",Debug.moduleToString(b4a.example.main.class),"myButtonColours",_mybuttoncolours,"myColors",_mycolors,"myCoName",_myconame,"myLogo",_mylogo,"myStamp",_mystamp,"myTheme",mostCurrent._mytheme,"No",mostCurrent._no,"pgBackGround",mostCurrent._pgbackground,"pnlBG",mostCurrent._pnlbg,"pnlStamp1",mostCurrent._pnlstamp1,"pnlStamp2",mostCurrent._pnlstamp2,"pnlStamp3",mostCurrent._pnlstamp3,"pnlStamp4",mostCurrent._pnlstamp4,"pnlStamp5",mostCurrent._pnlstamp5,"pnlStamp6",mostCurrent._pnlstamp6,"qrscanner",mostCurrent._qrscanner,"scanSuccess",_scansuccess,"ScrollView1",mostCurrent._scrollview1,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class),"WebView1",mostCurrent._webview1,"Yes",mostCurrent._yes};
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
		Debug.PushSubsStack("Activity_Create (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,46);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="Activity.LoadLayout(\"DrinksMenu\")";
Debug.ShouldStop(32768);
mostCurrent._activity.LoadLayout("DrinksMenu",mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Pause (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,57);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,53);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _btnextras_click() throws Exception{
try {
		Debug.PushSubsStack("btnExtras_Click (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,136);
 BA.debugLineNum = 136;BA.debugLine="Sub btnExtras_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btnOrder_Click (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,132);
 BA.debugLineNum = 132;BA.debugLine="Sub btnOrder_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("DrinkMenubuttonColours (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,76);
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _btnrbg = null;
int _colours = 0;
 BA.debugLineNum = 76;BA.debugLine="Sub DrinkMenubuttonColours 'Sets button colours";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="myButtonColours =myTheme.loadBtnColours";
Debug.ShouldStop(4096);
_mybuttoncolours = mostCurrent._mytheme._loadbtncolours();
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
Debug.ShouldStop(8192);
{
final int step51 = 1;
final int limit51 = (int) (_mybuttoncolours.getRowCount()-1);
for (_i = (int) (0); (step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51); _i = ((int)(0 + _i + step51))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="myButtonColours.Position = i";
Debug.ShouldStop(16384);
_mybuttoncolours.setPosition(_i);
 BA.debugLineNum = 80;BA.debugLine="Dim btnRBG As ColorDrawable";
Debug.ShouldStop(32768);
_btnrbg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("btnRBG", _btnrbg);
 BA.debugLineNum = 81;BA.debugLine="Dim colours As Int";
Debug.ShouldStop(65536);
_colours = 0;Debug.locals.put("colours", _colours);
 BA.debugLineNum = 82;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
Debug.ShouldStop(131072);
_colours = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mybuttoncolours.GetInt("BtnRed"),_mybuttoncolours.GetInt("BtnBlue"),_mybuttoncolours.GetInt("BtnGreen"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 83;BA.debugLine="btnRBG.Initialize(colours, 5)";
Debug.ShouldStop(262144);
_btnrbg.Initialize(_colours,(int) (5));
 BA.debugLineNum = 84;BA.debugLine="btnExtras.background=btnRBG";
Debug.ShouldStop(524288);
mostCurrent._btnextras.setBackground((android.graphics.drawable.Drawable)(_btnrbg.getObject()));
 BA.debugLineNum = 85;BA.debugLine="btnOrder.background=btnRBG";
Debug.ShouldStop(1048576);
mostCurrent._btnorder.setBackground((android.graphics.drawable.Drawable)(_btnrbg.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Drinks_Menu (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,90);
 BA.debugLineNum = 90;BA.debugLine="Sub Drinks_Menu";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _drinkspinner(anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
try {
		Debug.PushSubsStack("DrinkSpinner (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,118);
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Spinner1", _spinner1);
 BA.debugLineNum = 118;BA.debugLine="Sub DrinkSpinner(SQL As SQL, Query As String, Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Spinner1.Clear";
Debug.ShouldStop(4194304);
_spinner1.Clear();
 BA.debugLineNum = 120;BA.debugLine="Dim Table As List";
Debug.ShouldStop(8388608);
_table = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("Table", _table);
 BA.debugLineNum = 121;BA.debugLine="Table = MemoryTable(SQL, Query, StringArgs, Limit";
Debug.ShouldStop(16777216);
_table = _memorytable(_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 122;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(33554432);
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 123;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(67108864);
{
final int step90 = 1;
final int limit90 = (int) (_table.getSize()-1);
for (_i = (int) (0); (step90 > 0 && _i <= limit90) || (step90 < 0 && _i >= limit90); _i = ((int)(0 + _i + step90))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 124;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(134217728);
_cols = (String[])(_table.Get(_i));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 125;BA.debugLine="Spinner1.Add(Cols(1))";
Debug.ShouldStop(268435456);
_spinner1.Add(_cols[(int) (1)]);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Dim Card As Card";
mostCurrent._card = new b4a.example.card();
 //BA.debugLineNum = 27;BA.debugLine="Private btnScan As Button";
mostCurrent._btnscan = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private imgLogo As ImageView";
mostCurrent._imglogo = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private imgStamp1, imgStamp2, imgStamp3, imgStamp";
mostCurrent._imgstamp1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp5 = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgstamp6 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lblCompanyName As Label";
mostCurrent._lblcompanyname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private pnlBG As Panel";
mostCurrent._pnlbg = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private pnlStamp1, pnlStamp2, pnlStamp3, pnlStamp";
mostCurrent._pnlstamp1 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp2 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp3 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp4 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp5 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlstamp6 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Dim myTheme As CoffeeTheme";
mostCurrent._mytheme = new b4a.example.coffeetheme();
 //BA.debugLineNum = 35;BA.debugLine="Dim scanSuccess As Boolean";
_scansuccess = false;
 //BA.debugLineNum = 36;BA.debugLine="Dim qrscanner As JhsIceZxing1";
mostCurrent._qrscanner = new ice.zxing.b4aZXingLib();
 //BA.debugLineNum = 37;BA.debugLine="Private No As Button";
mostCurrent._no = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Yes As Button";
mostCurrent._yes = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private btnOrder As Button";
mostCurrent._btnorder = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private pgBackGround As Panel";
mostCurrent._pgbackground = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private WebView1 As WebView";
mostCurrent._webview1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private btnExtras As Button";
mostCurrent._btnextras = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _loadbackgroundcolours() throws Exception{
try {
		Debug.PushSubsStack("loadBackGroundcolours (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,63);
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _bggradient = null;
int[] _colours = null;
 BA.debugLineNum = 63;BA.debugLine="Sub loadBackGroundcolours 'Sets backgrouns colours";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="myColors = myTheme.loadColours";
Debug.ShouldStop(-2147483648);
_mycolors = mostCurrent._mytheme._loadcolours();
 BA.debugLineNum = 65;BA.debugLine="For i = 0 To myColors.RowCount - 1 '";
Debug.ShouldStop(1);
{
final int step39 = 1;
final int limit39 = (int) (_mycolors.getRowCount()-1);
for (_i = (int) (0); (step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39); _i = ((int)(0 + _i + step39))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(2);
_mycolors.setPosition(_i);
 BA.debugLineNum = 67;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(4);
_bggradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 68;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(8);
_colours = new int[(int) (2)];
;Debug.locals.put("colours", _colours);
 BA.debugLineNum = 69;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(16);
_colours[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mycolors.GetInt("BG1Red"),_mycolors.GetInt("BG1Blue"),_mycolors.GetInt("BG1Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 70;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(32);
_colours[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_mycolors.GetInt("BG2Red"),_mycolors.GetInt("BG2Blue"),_mycolors.GetInt("BG2Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 71;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(64);
_bggradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),_colours);
 BA.debugLineNum = 72;BA.debugLine="pgBackGround.Background=bgGradient";
Debug.ShouldStop(128);
mostCurrent._pgbackground.setBackground((android.graphics.drawable.Drawable)(_bggradient.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static anywheresoftware.b4a.objects.collections.List  _memorytable(anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
try {
		Debug.PushSubsStack("MemoryTable (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,95);
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
int _row = 0;
String[] _values = null;
int _col = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 95;BA.debugLine="Sub MemoryTable(SQL As SQL, Query As String, Strin";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(-2147483648);
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();Debug.locals.put("cur", _cur);
 BA.debugLineNum = 97;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(1);
if (_stringargs!= null) { 
 BA.debugLineNum = 98;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(2);
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
 BA.debugLineNum = 100;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(8);
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
 BA.debugLineNum = 102;BA.debugLine="Log(\"MemoryTable: \" & Query)";
Debug.ShouldStop(32);
anywheresoftware.b4a.keywords.Common.Log("MemoryTable: "+_query);
 BA.debugLineNum = 103;BA.debugLine="Dim table As List";
Debug.ShouldStop(64);
_table = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("table", _table);
 BA.debugLineNum = 104;BA.debugLine="table.Initialize";
Debug.ShouldStop(128);
_table.Initialize();
 BA.debugLineNum = 105;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(256);
if (_limit>0) { 
_limit = (int) (anywheresoftware.b4a.keywords.Common.Min(_limit,_cur.getRowCount()));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.getRowCount();Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 106;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(512);
{
final int step74 = 1;
final int limit74 = (int) (_limit-1);
for (_row = (int) (0); (step74 > 0 && _row <= limit74) || (step74 < 0 && _row >= limit74); _row = ((int)(0 + _row + step74))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 107;BA.debugLine="cur.Position = row";
Debug.ShouldStop(1024);
_cur.setPosition(_row);
 BA.debugLineNum = 108;BA.debugLine="Dim values(cur.ColumnCount) As String";
Debug.ShouldStop(2048);
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");Debug.locals.put("values", _values);
 BA.debugLineNum = 109;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(4096);
{
final int step77 = 1;
final int limit77 = (int) (_cur.getColumnCount()-1);
for (_col = (int) (0); (step77 > 0 && _col <= limit77) || (step77 < 0 && _col >= limit77); _col = ((int)(0 + _col + step77))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 110;BA.debugLine="values(col) = cur.GetString2(col)";
Debug.ShouldStop(8192);
_values[_col] = _cur.GetString2(_col);Debug.locals.put("values", _values);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 112;BA.debugLine="table.Add(values)";
Debug.ShouldStop(32768);
_table.Add((Object)(_values));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 114;BA.debugLine="cur.Close";
Debug.ShouldStop(131072);
_cur.Close();
 BA.debugLineNum = 115;BA.debugLine="Return table";
Debug.ShouldStop(262144);
if (true) return _table;
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return null;
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
 //BA.debugLineNum = 12;BA.debugLine="Dim HtmlCSS As String";
_htmlcss = "";
 //BA.debugLineNum = 13;BA.debugLine="HtmlCSS = \"table {width: 100%;border: 1px solid #c";
_htmlcss = "table {width: 100%;border: 1px solid #cef;text-align: left; }"+" th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }"+"td,th {	padding: 4px 5px; }"+".odd {background-color: #def; } .odd td {border-bottom: 1px solid #cef; }"+"a { text-decoration:none; color: #000;}";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _spinner1_itemclick(int _position,Object _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (drinkmenu) ","drinkmenu",6,mostCurrent.activityBA,mostCurrent,129);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 129;BA.debugLine="Sub Spinner1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
