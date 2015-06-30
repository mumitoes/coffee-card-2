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

public class drinkextras extends Activity implements B4AActivity{
	public static drinkextras mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.CoffeeCard", "b4a.CoffeeCard.drinkextras");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (drinkextras).");
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
		activityBA = new BA(this, layout, processBA, "b4a.CoffeeCard", "b4a.CoffeeCard.drinkextras");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.CoffeeCard.drinkextras", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (drinkextras) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (drinkextras) Resume **");
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
		return drinkextras.class;
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
        BA.LogInfo("** Activity (drinkextras) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (drinkextras) Resume **");
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
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _mydrinkextras = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _extraselect = null;
public static String _selectedextras = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnorder = null;
public anywheresoftware.b4a.objects.PanelWrapper _pgbackground = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndrinkmenu = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner2 = null;
public b4a.CoffeeCard.thememanager _companydetails = null;
public b4a.CoffeeCard.databasemanager _mytheme = null;
public b4a.CoffeeCard.main _main = null;
public b4a.CoffeeCard.drinkmenu _drinkmenu = null;
public b4a.CoffeeCard.storepurchase _storepurchase = null;
public b4a.CoffeeCard.maplocator _maplocator = null;
public b4a.CoffeeCard.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"btnDrinkMenu",mostCurrent._btndrinkmenu,"btnOrder",mostCurrent._btnorder,"companyDetails",mostCurrent._companydetails,"DrinkMenu",Debug.moduleToString(b4a.CoffeeCard.drinkmenu.class),"ExtraSelect",_extraselect,"ListView2",mostCurrent._listview2,"Main",Debug.moduleToString(b4a.CoffeeCard.main.class),"MapLocator",Debug.moduleToString(b4a.CoffeeCard.maplocator.class),"myDrinkExtras",_mydrinkextras,"myTheme",mostCurrent._mytheme,"pgBackGround",mostCurrent._pgbackground,"selectedextras",_selectedextras,"Spinner2",mostCurrent._spinner2,"StorePurchase",Debug.moduleToString(b4a.CoffeeCard.storepurchase.class),"ThemeCalc",Debug.moduleToString(b4a.CoffeeCard.themecalc.class)};
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
		Debug.PushSubsStack("Activity_Create (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,23);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"Extras\")";
Debug.ShouldStop(16777216);
mostCurrent._activity.LoadLayout("Extras",mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="myTheme.Initialize";
Debug.ShouldStop(33554432);
mostCurrent._mytheme._initialize(processBA);
 BA.debugLineNum = 27;BA.debugLine="companyDetails.Initialize";
Debug.ShouldStop(67108864);
mostCurrent._companydetails._initialize(processBA);
 BA.debugLineNum = 28;BA.debugLine="Extras_Layout";
Debug.ShouldStop(134217728);
_extras_layout();
 BA.debugLineNum = 29;BA.debugLine="Drink_Extras";
Debug.ShouldStop(268435456);
_drink_extras();
 BA.debugLineNum = 30;BA.debugLine="Drink_Extra_Selector";
Debug.ShouldStop(536870912);
_drink_extra_selector();
 BA.debugLineNum = 32;BA.debugLine="End Sub";
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
public static String  _activity_pause(boolean _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,38);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static String  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,34);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
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
public static String  _btndrinkmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnDrinkMenu_Click (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,84);
 BA.debugLineNum = 84;BA.debugLine="Sub btnDrinkMenu_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="StartActivity(DrinkMenu)";
Debug.ShouldStop(1048576);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._drinkmenu.getObject()));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btnOrder_Click (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,80);
 BA.debugLineNum = 80;BA.debugLine="Sub btnOrder_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="StartActivity(StorePurchase)";
Debug.ShouldStop(65536);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._storepurchase.getObject()));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _drink_extra_selector() throws Exception{
try {
		Debug.PushSubsStack("Drink_Extra_Selector (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,66);
int _i = 0;
 BA.debugLineNum = 66;BA.debugLine="Sub Drink_Extra_Selector";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Spinner2.Clear";
Debug.ShouldStop(4);
mostCurrent._spinner2.Clear();
 BA.debugLineNum = 68;BA.debugLine="ExtraSelect = myTheme.LoadExtraSelect";
Debug.ShouldStop(8);
_extraselect = mostCurrent._mytheme._loadextraselect();
 BA.debugLineNum = 69;BA.debugLine="For i = 0 To ExtraSelect.RowCount -1";
Debug.ShouldStop(16);
{
final int step47 = 1;
final int limit47 = (int) (_extraselect.getRowCount()-1);
for (_i = (int) (0); (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 70;BA.debugLine="ExtraSelect.Position = i";
Debug.ShouldStop(32);
_extraselect.setPosition(_i);
 BA.debugLineNum = 71;BA.debugLine="Spinner2.Add(ExtraSelect.GetString(\"Description\"))";
Debug.ShouldStop(64);
mostCurrent._spinner2.Add(_extraselect.GetString("Description"));
 BA.debugLineNum = 72;BA.debugLine="If File.Exists(File.DirInternal, \"customerthemes.s";
Debug.ShouldStop(128);
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite")) { 
 BA.debugLineNum = 73;BA.debugLine="Spinner2.SelectedIndex = Spinner2.IndexOf (File.Re";
Debug.ShouldStop(256);
mostCurrent._spinner2.setSelectedIndex(mostCurrent._spinner2.IndexOf(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite")));
 }else {
 BA.debugLineNum = 75;BA.debugLine="Spinner2.SelectedIndex = 1";
Debug.ShouldStop(1024);
mostCurrent._spinner2.setSelectedIndex((int) (1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _drink_extras() throws Exception{
try {
		Debug.PushSubsStack("Drink_Extras (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,49);
int _i = 0;
 BA.debugLineNum = 49;BA.debugLine="Sub Drink_Extras";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="ListView2.Clear";
Debug.ShouldStop(131072);
mostCurrent._listview2.Clear();
 BA.debugLineNum = 51;BA.debugLine="myDrinkExtras = myTheme.LoadDrinkExtras";
Debug.ShouldStop(262144);
_mydrinkextras = mostCurrent._mytheme._loaddrinkextras();
 BA.debugLineNum = 52;BA.debugLine="For i = 0 To myDrinkExtras.RowCount -1";
Debug.ShouldStop(524288);
{
final int step34 = 1;
final int limit34 = (int) (_mydrinkextras.getRowCount()-1);
for (_i = (int) (0); (step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34); _i = ((int)(0 + _i + step34))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 53;BA.debugLine="myDrinkExtras.Position = i";
Debug.ShouldStop(1048576);
_mydrinkextras.setPosition(_i);
 BA.debugLineNum = 54;BA.debugLine="ListView2.AddSingleLine(myDrinkExtras.GetInt(\"ID\")";
Debug.ShouldStop(2097152);
mostCurrent._listview2.AddSingleLine(BA.NumberToString(_mydrinkextras.GetInt("ID"))+" : "+_mydrinkextras.GetString("Description")+anywheresoftware.b4a.keywords.Common.CRLF+"$"+_mydrinkextras.GetString("Cost")+"0");
 BA.debugLineNum = 56;BA.debugLine="ListView2.SingleLineLayout.ItemHeight = 150";
Debug.ShouldStop(8388608);
mostCurrent._listview2.getSingleLineLayout().setItemHeight((int) (150));
 BA.debugLineNum = 57;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize = 15";
Debug.ShouldStop(16777216);
mostCurrent._listview2.getSingleLineLayout().Label.setTextSize((float) (15));
 BA.debugLineNum = 58;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor = Color";
Debug.ShouldStop(33554432);
mostCurrent._listview2.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 BA.debugLineNum = 59;BA.debugLine="ListView2.SingleLineLayout.Label.Color = Colors.Wh";
Debug.ShouldStop(67108864);
mostCurrent._listview2.getSingleLineLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="myDrinkExtras.Close";
Debug.ShouldStop(536870912);
_mydrinkextras.Close();
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
public static String  _extras_layout() throws Exception{
try {
		Debug.PushSubsStack("Extras_Layout (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,42);
 BA.debugLineNum = 42;BA.debugLine="Sub Extras_Layout";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="pgBackGround.Background = companyDetails.LoadBGCol";
Debug.ShouldStop(1024);
mostCurrent._pgbackground.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loadbgcolours().getObject()));
 BA.debugLineNum = 44;BA.debugLine="btnDrinkMenu.Background = companyDetails.loadDBbu";
Debug.ShouldStop(2048);
mostCurrent._btndrinkmenu.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loaddbbuttoncolours().getObject()));
 BA.debugLineNum = 45;BA.debugLine="btnOrder.Background = companyDetails.loadDBbutton";
Debug.ShouldStop(4096);
mostCurrent._btnorder.setBackground((android.graphics.drawable.Drawable)(mostCurrent._companydetails._loaddbbuttoncolours().getObject()));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private btnOrder As Button";
mostCurrent._btnorder = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private pgBackGround As Panel";
mostCurrent._pgbackground = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private btnDrinkMenu As Button";
mostCurrent._btndrinkmenu = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private ListView2 As ListView";
mostCurrent._listview2 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim Spinner2 As Spinner";
mostCurrent._spinner2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim companyDetails As ThemeManager";
mostCurrent._companydetails = new b4a.CoffeeCard.thememanager();
 //BA.debugLineNum = 19;BA.debugLine="Dim myTheme As DatabaseManager";
mostCurrent._mytheme = new b4a.CoffeeCard.databasemanager();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim myDrinkExtras As Cursor";
_mydrinkextras = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim ExtraSelect As Cursor";
_extraselect = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim selectedextras As String";
_selectedextras = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public static String  _spinner2_itemclick(int _position,Object _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner2_ItemClick (drinkextras) ","drinkextras",3,mostCurrent.activityBA,mostCurrent,88);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 88;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="selectedextras = Value";
Debug.ShouldStop(16777216);
_selectedextras = BA.ObjectToString(_value);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
