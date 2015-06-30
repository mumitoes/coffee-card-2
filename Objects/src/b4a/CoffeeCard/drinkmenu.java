package b4a.CoffeeCard;


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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.CoffeeCard", "b4a.CoffeeCard.drinkmenu");
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
		activityBA = new BA(this, layout, processBA, "b4a.CoffeeCard", "b4a.CoffeeCard.drinkmenu");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.CoffeeCard.drinkmenu", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mydrinkmenu = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _drinkselect = null;
public static String _selecteddrink = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnorder = null;
public anywheresoftware.b4a.objects.PanelWrapper _pgbackground = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnextras = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public b4a.CoffeeCard.thememanager _companydetails = null;
public b4a.CoffeeCard.databasemanager _mydb = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1 = null;
public b4a.CoffeeCard.main _main = null;
public b4a.CoffeeCard.drinkextras _drinkextras = null;
public b4a.CoffeeCard.storepurchase _storepurchase = null;
public b4a.CoffeeCard.maplocator _maplocator = null;
public b4a.CoffeeCard.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"btnExtras",mostCurrent._btnextras,"btnOrder",mostCurrent._btnorder,"companyDetails",mostCurrent._companydetails,"DrinkExtras",Debug.moduleToString(b4a.CoffeeCard.drinkextras.class),"DrinkSelect",_drinkselect,"ListView1",mostCurrent._listview1,"Main",Debug.moduleToString(b4a.CoffeeCard.main.class),"MapLocator",Debug.moduleToString(b4a.CoffeeCard.maplocator.class),"myDB",mostCurrent._mydb,"myDrinkMenu",_mydrinkmenu,"pgBackGround",mostCurrent._pgbackground,"selecteddrink",_selecteddrink,"Spinner1",mostCurrent._spinner1,"StorePurchase",Debug.moduleToString(b4a.CoffeeCard.storepurchase.class),"ThemeCalc",Debug.moduleToString(b4a.CoffeeCard.themecalc.class)};
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
		Debug.PushSubsStack("Activity_Create (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,28);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"DrinksMenu\")";
Debug.ShouldStop(536870912);
mostCurrent._activity.LoadLayout("DrinksMenu",mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="myDB.Initialize";
Debug.ShouldStop(1073741824);
mostCurrent._mydb._initialize(processBA);
 BA.debugLineNum = 32;BA.debugLine="companyDetails.Initialize";
Debug.ShouldStop(-2147483648);
mostCurrent._companydetails._initialize(processBA);
 BA.debugLineNum = 33;BA.debugLine="Menu_Layout";
Debug.ShouldStop(1);
_menu_layout();
 BA.debugLineNum = 34;BA.debugLine="Drink_Menu";
Debug.ShouldStop(2);
_drink_menu();
 BA.debugLineNum = 35;BA.debugLine="Drink_Spinner_Load";
Debug.ShouldStop(4);
_drink_spinner_load();
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,42);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Resume (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,38);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
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
public static String  _btnextras_click() throws Exception{
try {
		Debug.PushSubsStack("btnExtras_Click (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,94);
 BA.debugLineNum = 94;BA.debugLine="Sub btnExtras_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="StartActivity(DrinkExtras)";
Debug.ShouldStop(1073741824);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._drinkextras.getObject()));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnOrder_Click (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,90);
 BA.debugLineNum = 90;BA.debugLine="Sub btnOrder_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="StartActivity(StorePurchase)";
Debug.ShouldStop(67108864);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._storepurchase.getObject()));
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
public static String  _drink_menu() throws Exception{
try {
		Debug.PushSubsStack("Drink_Menu (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,57);
int _i = 0;
 BA.debugLineNum = 57;BA.debugLine="Sub Drink_Menu";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(33554432);
mostCurrent._listview1.Clear();
 BA.debugLineNum = 59;BA.debugLine="myDrinkMenu = myDB.loadCoffeeMenu";
Debug.ShouldStop(67108864);
_mydrinkmenu = mostCurrent._mydb._loadcoffeemenu();
 BA.debugLineNum = 60;BA.debugLine="For i = 0 To myDrinkMenu.RowCount -1";
Debug.ShouldStop(134217728);
{
final int step34 = 1;
final int limit34 = (int) (_mydrinkmenu.getRowCount()-1);
for (_i = (int) (0); (step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34); _i = ((int)(0 + _i + step34))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="myDrinkMenu.Position = i";
Debug.ShouldStop(268435456);
_mydrinkmenu.setPosition(_i);
 BA.debugLineNum = 62;BA.debugLine="ListView1.AddSingleLine(myDrinkMenu.GetString(\"ID\"";
Debug.ShouldStop(536870912);
mostCurrent._listview1.AddSingleLine(_mydrinkmenu.GetString("ID")+" : "+_mydrinkmenu.GetString("CoffeeName")+anywheresoftware.b4a.keywords.Common.CRLF+_mydrinkmenu.GetString("Description")+anywheresoftware.b4a.keywords.Common.CRLF+"$"+BA.NumberToString(_mydrinkmenu.GetDouble("Cost")));
 BA.debugLineNum = 64;BA.debugLine="ListView1.SingleLineLayout.ItemHeight = 150";
Debug.ShouldStop(-2147483648);
mostCurrent._listview1.getSingleLineLayout().setItemHeight((int) (150));
 BA.debugLineNum = 65;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize = 15";
Debug.ShouldStop(1);
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (15));
 BA.debugLineNum = 66;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor = Color";
Debug.ShouldStop(2);
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 BA.debugLineNum = 67;BA.debugLine="ListView1.SingleLineLayout.Label.Color = Colors.Wh";
Debug.ShouldStop(4);
mostCurrent._listview1.getSingleLineLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 69;BA.debugLine="myDrinkMenu.Close";
Debug.ShouldStop(16);
_mydrinkmenu.Close();
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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
public static String  _drink_spinner_load() throws Exception{
try {
		Debug.PushSubsStack("Drink_Spinner_Load (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,73);
int _i = 0;
 BA.debugLineNum = 73;BA.debugLine="Sub Drink_Spinner_Load()";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="Spinner1.Clear";
Debug.ShouldStop(1024);
mostCurrent._spinner1.Clear();
 BA.debugLineNum = 76;BA.debugLine="DrinkSelect = myDB.SelectDrink";
Debug.ShouldStop(2048);
_drinkselect = mostCurrent._mydb._selectdrink();
 BA.debugLineNum = 77;BA.debugLine="For i = 0 To DrinkSelect.RowCount -1";
Debug.ShouldStop(4096);
{
final int step47 = 1;
final int limit47 = (int) (_drinkselect.getRowCount()-1);
for (_i = (int) (0); (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 78;BA.debugLine="DrinkSelect.Position = i";
Debug.ShouldStop(8192);
_drinkselect.setPosition(_i);
 BA.debugLineNum = 79;BA.debugLine="Spinner1.Add(DrinkSelect.GetString(\"CoffeeName\"))";
Debug.ShouldStop(16384);
mostCurrent._spinner1.Add(_drinkselect.GetString("CoffeeName"));
 BA.debugLineNum = 80;BA.debugLine="If File.Exists(File.DirInternal, \"customerthemes.s";
Debug.ShouldStop(32768);
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite")) { 
 BA.debugLineNum = 81;BA.debugLine="Spinner1.SelectedIndex = Spinner1.IndexOf (File.Re";
Debug.ShouldStop(65536);
mostCurrent._spinner1.setSelectedIndex(mostCurrent._spinner1.IndexOf(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite")));
 }else {
 BA.debugLineNum = 83;BA.debugLine="Spinner1.SelectedIndex = 1";
Debug.ShouldStop(262144);
mostCurrent._spinner1.setSelectedIndex((int) (1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private btnOrder As Button";
mostCurrent._btnorder = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private pgBackGround As Panel";
mostCurrent._pgbackground = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private btnExtras As Button";
mostCurrent._btnextras = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ListView1 As ListView";
mostCurrent._listview1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim companyDetails As ThemeManager";
mostCurrent._companydetails = new b4a.CoffeeCard.thememanager();
 //BA.debugLineNum = 22;BA.debugLine="Dim myDB As DatabaseManager";
mostCurrent._mydb = new b4a.CoffeeCard.databasemanager();
 //BA.debugLineNum = 23;BA.debugLine="Dim Spinner1 As Spinner";
mostCurrent._spinner1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _menu_layout() throws Exception{
try {
		Debug.PushSubsStack("Menu_Layout (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,48);
 BA.debugLineNum = 48;BA.debugLine="Sub Menu_Layout";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="pgBackGround.Background = companyDetails.LoadBGCo";
Debug.ShouldStop(65536);
mostCurrent._pgbackground.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loadbgcolours().getObject()));
 BA.debugLineNum = 50;BA.debugLine="btnExtras.Background = companyDetails.loadDBbutto";
Debug.ShouldStop(131072);
mostCurrent._btnextras.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loaddbbuttoncolours().getObject()));
 BA.debugLineNum = 51;BA.debugLine="btnOrder.Background = companyDetails.loadDBbutton";
Debug.ShouldStop(262144);
mostCurrent._btnorder.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loaddbbuttoncolours().getObject()));
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
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim myDrinkMenu As Cursor";
_mydrinkmenu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim DrinkSelect As Cursor";
_drinkselect = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim selecteddrink As String";
_selecteddrink = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _spinner1_itemclick(int _position,Object _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (drinkmenu) ","drinkmenu",4,mostCurrent.activityBA,mostCurrent,98);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 98;BA.debugLine="Sub Spinner1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="selecteddrink = Value";
Debug.ShouldStop(4);
_selecteddrink = BA.ObjectToString(_value);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
