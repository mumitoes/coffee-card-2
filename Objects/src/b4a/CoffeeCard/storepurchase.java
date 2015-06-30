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

public class storepurchase extends Activity implements B4AActivity{
	public static storepurchase mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.CoffeeCard", "b4a.CoffeeCard.storepurchase");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (storepurchase).");
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
		activityBA = new BA(this, layout, processBA, "b4a.CoffeeCard", "b4a.CoffeeCard.storepurchase");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.CoffeeCard.storepurchase", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (storepurchase) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (storepurchase) Resume **");
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
		return storepurchase.class;
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
        BA.LogInfo("** Activity (storepurchase) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (storepurchase) Resume **");
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
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _csrstorecart = null;
public static int _alarmhours = 0;
public static int _alarmminutes = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btnplaceorder = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnremove = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnpickup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgbasket = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imglogo = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgitem = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtqtytotal = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtcosttotal = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcart = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlitem = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scvmain = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcompliment = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemcost = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemscostsubtotal = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtitemqty = null;
public b4a.CoffeeCard.thememanager _mytheme = null;
public b4a.CoffeeCard.databasemanager _mydb = null;
public b4a.CoffeeCard.main _main = null;
public b4a.CoffeeCard.drinkextras _drinkextras = null;
public b4a.CoffeeCard.drinkmenu _drinkmenu = null;
public b4a.CoffeeCard.maplocator _maplocator = null;
public b4a.CoffeeCard.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"alarmHours",_alarmhours,"alarmMinutes",_alarmminutes,"btnBack",mostCurrent._btnback,"btnPickUp",mostCurrent._btnpickup,"btnPlaceOrder",mostCurrent._btnplaceorder,"btnRemove",mostCurrent._btnremove,"csrStoreCart",_csrstorecart,"DrinkExtras",Debug.moduleToString(b4a.CoffeeCard.drinkextras.class),"DrinkMenu",Debug.moduleToString(b4a.CoffeeCard.drinkmenu.class),"edtCostTotal",mostCurrent._edtcosttotal,"edtItemQty",mostCurrent._edtitemqty,"edtQtyTotal",mostCurrent._edtqtytotal,"imgBasket",mostCurrent._imgbasket,"imgItem",mostCurrent._imgitem,"imgLogo",mostCurrent._imglogo,"lblCompliment",mostCurrent._lblcompliment,"lblItemCost",mostCurrent._lblitemcost,"lblItemName",mostCurrent._lblitemname,"lblItemsCostSubtotal",mostCurrent._lblitemscostsubtotal,"Main",Debug.moduleToString(b4a.CoffeeCard.main.class),"MapLocator",Debug.moduleToString(b4a.CoffeeCard.maplocator.class),"myDB",mostCurrent._mydb,"myTheme",mostCurrent._mytheme,"pnlCart",mostCurrent._pnlcart,"pnlItem",mostCurrent._pnlitem,"scvMain",mostCurrent._scvmain,"ThemeCalc",Debug.moduleToString(b4a.CoffeeCard.themecalc.class)};
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
		Debug.PushSubsStack("Activity_Create (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,33);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"cart\")";
Debug.ShouldStop(4);
mostCurrent._activity.LoadLayout("cart",mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="myTheme.Initialize";
Debug.ShouldStop(16);
mostCurrent._mytheme._initialize(processBA);
 BA.debugLineNum = 38;BA.debugLine="myDB.Initialize";
Debug.ShouldStop(32);
mostCurrent._mydb._initialize(processBA);
 BA.debugLineNum = 39;BA.debugLine="myDB.loadLogo";
Debug.ShouldStop(64);
mostCurrent._mydb._loadlogo();
 BA.debugLineNum = 40;BA.debugLine="cartLayout";
Debug.ShouldStop(128);
_cartlayout();
 BA.debugLineNum = 41;BA.debugLine="FillScrollView";
Debug.ShouldStop(256);
_fillscrollview();
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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
public static String  _activity_pause(boolean _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,47);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,44);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("btnBack_Click (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,132);
 BA.debugLineNum = 132;BA.debugLine="Sub btnBack_Click' add more to cart";
Debug.ShouldStop(8);
 BA.debugLineNum = 135;BA.debugLine="StartActivity(\"DrinkMenu\")";
Debug.ShouldStop(64);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("DrinkMenu"));
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
public static String  _btnpickup_click() throws Exception{
try {
		Debug.PushSubsStack("btnPickUp_Click (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,140);
anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog _td = null;
 BA.debugLineNum = 140;BA.debugLine="Sub btnPickUp_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 142;BA.debugLine="Dim td As TimeDialog 'the dialog from the dialog l";
Debug.ShouldStop(8192);
_td = new anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog();Debug.locals.put("td", _td);
 BA.debugLineNum = 143;BA.debugLine="td.Hour = alarmHours";
Debug.ShouldStop(16384);
_td.setHour(_alarmhours);
 BA.debugLineNum = 144;BA.debugLine="td.Minute = alarmMinutes";
Debug.ShouldStop(32768);
_td.setMinute(_alarmminutes);
 BA.debugLineNum = 146;BA.debugLine="If td.Show(\"Convenient Pick Up Time\", \"\", \"Ok\", \"C";
Debug.ShouldStop(131072);
if (_td.Show("Convenient Pick Up Time","","Ok","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null))==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 BA.debugLineNum = 147;BA.debugLine="alarmHours = td.Hour";
Debug.ShouldStop(262144);
_alarmhours = _td.getHour();
 BA.debugLineNum = 148;BA.debugLine="alarmMinutes = td.Minute";
Debug.ShouldStop(524288);
_alarmminutes = _td.getMinute();
 };
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
public static String  _btnplaceorder_click() throws Exception{
try {
		Debug.PushSubsStack("btnPlaceOrder_Click (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,152);
 BA.debugLineNum = 152;BA.debugLine="Sub btnPlaceOrder_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 155;BA.debugLine="myDB.UpdateOrderDatabase";
Debug.ShouldStop(67108864);
mostCurrent._mydb._updateorderdatabase();
 BA.debugLineNum = 156;BA.debugLine="End Sub";
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
public static String  _btnremove_click() throws Exception{
try {
		Debug.PushSubsStack("btnRemove_Click (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,128);
 BA.debugLineNum = 128;BA.debugLine="Sub btnRemove_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="pnlItem.RemoveView";
Debug.ShouldStop(1);
mostCurrent._pnlitem.RemoveView();
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
public static String  _cartlayout() throws Exception{
try {
		Debug.PushSubsStack("cartLayout (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,50);
 BA.debugLineNum = 50;BA.debugLine="Sub cartLayout";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="pnlCart.Background=myTheme.LoadBGColours()";
Debug.ShouldStop(262144);
mostCurrent._pnlcart.setBackground((android.graphics.drawable.Drawable)(mostCurrent._mytheme._loadbgcolours().getObject()));
 BA.debugLineNum = 52;BA.debugLine="imgLogo.Bitmap=myTheme.loadDBlogo() 'Logo called";
Debug.ShouldStop(524288);
mostCurrent._imglogo.setBitmap((android.graphics.Bitmap)(mostCurrent._mytheme._loaddblogo().getObject()));
 BA.debugLineNum = 53;BA.debugLine="btnPickUp.Background=myTheme.loadDBbuttonColours(";
Debug.ShouldStop(1048576);
mostCurrent._btnpickup.setBackground((android.graphics.drawable.Drawable)(mostCurrent._mytheme._loaddbbuttoncolours().getObject()));
 BA.debugLineNum = 54;BA.debugLine="btnPlaceOrder.Background=myTheme.loadDBbuttonColo";
Debug.ShouldStop(2097152);
mostCurrent._btnplaceorder.setBackground((android.graphics.drawable.Drawable)(mostCurrent._mytheme._loaddbbuttoncolours().getObject()));
 BA.debugLineNum = 55;BA.debugLine="btnBack.Background=myTheme.loadDBbuttonColours()";
Debug.ShouldStop(4194304);
mostCurrent._btnback.setBackground((android.graphics.drawable.Drawable)(mostCurrent._mytheme._loaddbbuttoncolours().getObject()));
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
public static String  _edtitemqty_textchanged(String _old,String _new) throws Exception{
try {
		Debug.PushSubsStack("edtItemQty_TextChanged (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,107);
int _qty = 0;
float _cost = 0f;
float _costsubtotal = 0f;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 107;BA.debugLine="Sub edtItemQty_TextChanged(Old As String, New As S";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Dim qty As Int=0";
Debug.ShouldStop(2048);
_qty = (int) (0);Debug.locals.put("qty", _qty);Debug.locals.put("qty", _qty);
 BA.debugLineNum = 109;BA.debugLine="Dim Cost As Float=0";
Debug.ShouldStop(4096);
_cost = (float) (0);Debug.locals.put("Cost", _cost);Debug.locals.put("Cost", _cost);
 BA.debugLineNum = 110;BA.debugLine="Dim CostSubtotal As Float =0";
Debug.ShouldStop(8192);
_costsubtotal = (float) (0);Debug.locals.put("CostSubtotal", _costsubtotal);Debug.locals.put("CostSubtotal", _costsubtotal);
 BA.debugLineNum = 112;BA.debugLine="qty=edtItemQty.Text";
Debug.ShouldStop(32768);
_qty = (int)(Double.parseDouble(mostCurrent._edtitemqty.getText()));Debug.locals.put("qty", _qty);
 BA.debugLineNum = 113;BA.debugLine="Cost=lblItemCost.Text";
Debug.ShouldStop(65536);
_cost = (float)(Double.parseDouble(mostCurrent._lblitemcost.getText()));Debug.locals.put("Cost", _cost);
 BA.debugLineNum = 114;BA.debugLine="CostSubtotal = qty * Cost";
Debug.ShouldStop(131072);
_costsubtotal = (float) (_qty*_cost);Debug.locals.put("CostSubtotal", _costsubtotal);
 BA.debugLineNum = 115;BA.debugLine="lblItemsCostSubtotal.Text=CostSubtotal 'qty times";
Debug.ShouldStop(262144);
mostCurrent._lblitemscostsubtotal.setText((Object)(_costsubtotal));
 BA.debugLineNum = 117;BA.debugLine="edtQtyTotal.Text=(qty)";
Debug.ShouldStop(1048576);
mostCurrent._edtqtytotal.setText((Object)((_qty)));
 BA.debugLineNum = 119;BA.debugLine="LogColor(qty,Colors.Blue)";
Debug.ShouldStop(4194304);
anywheresoftware.b4a.keywords.Common.LogColor(BA.NumberToString(_qty),anywheresoftware.b4a.keywords.Common.Colors.Blue);
 BA.debugLineNum = 120;BA.debugLine="edtCostTotal.Text=(CostSubtotal)";
Debug.ShouldStop(8388608);
mostCurrent._edtcosttotal.setText((Object)((_costsubtotal)));
 BA.debugLineNum = 122;BA.debugLine="LogColor(CostSubtotal,Colors.Blue)";
Debug.ShouldStop(33554432);
anywheresoftware.b4a.keywords.Common.LogColor(BA.NumberToString(_costsubtotal),anywheresoftware.b4a.keywords.Common.Colors.Blue);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _fillscrollview() throws Exception{
try {
		Debug.PushSubsStack("FillScrollView (storepurchase) ","storepurchase",5,mostCurrent.activityBA,mostCurrent,60);
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _purchase = null;
String _drink = "";
int _i = 0;
 BA.debugLineNum = 60;BA.debugLine="Sub FillScrollView 'fills the scroll view which co";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 67;BA.debugLine="Dim purchase As Bitmap";
Debug.ShouldStop(4);
_purchase = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();Debug.locals.put("purchase", _purchase);
 BA.debugLineNum = 68;BA.debugLine="Dim drink As String =  DrinkMenu.selecteddrink";
Debug.ShouldStop(8);
_drink = mostCurrent._drinkmenu._selecteddrink;Debug.locals.put("drink", _drink);Debug.locals.put("drink", _drink);
 BA.debugLineNum = 69;BA.debugLine="LogColor(drink,Colors.Green)";
Debug.ShouldStop(16);
anywheresoftware.b4a.keywords.Common.LogColor(_drink,anywheresoftware.b4a.keywords.Common.Colors.Green);
 BA.debugLineNum = 71;BA.debugLine="csrStoreCart=myDB.SelectDrinkValue";
Debug.ShouldStop(64);
_csrstorecart = mostCurrent._mydb._selectdrinkvalue();
 BA.debugLineNum = 72;BA.debugLine="For i =0 To csrStoreCart.RowCount-1";
Debug.ShouldStop(128);
{
final int step39 = 1;
final int limit39 = (int) (_csrstorecart.getRowCount()-1);
for (_i = (int) (0); (step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39); _i = ((int)(0 + _i + step39))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 73;BA.debugLine="csrStoreCart.Position=i";
Debug.ShouldStop(256);
_csrstorecart.setPosition(_i);
 BA.debugLineNum = 75;BA.debugLine="purchase.Initialize(File.DirAssets,csrStoreCart.G";
Debug.ShouldStop(1024);
_purchase.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_csrstorecart.GetString("picture"));
 BA.debugLineNum = 76;BA.debugLine="lblItemName.Text=csrStoreCart.GetString(\"CoffeeNa";
Debug.ShouldStop(2048);
mostCurrent._lblitemname.setText((Object)(_csrstorecart.GetString("CoffeeName")));
 BA.debugLineNum = 77;BA.debugLine="lblItemCost.Text=csrStoreCart.GetDouble (\"Cost\")'";
Debug.ShouldStop(4096);
mostCurrent._lblitemcost.setText((Object)(_csrstorecart.GetDouble("Cost")));
 BA.debugLineNum = 78;BA.debugLine="imgItem.Bitmap=purchase";
Debug.ShouldStop(8192);
mostCurrent._imgitem.setBitmap((android.graphics.Bitmap)(_purchase.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 103;BA.debugLine="csrStoreCart.Close";
Debug.ShouldStop(64);
_csrstorecart.Close();
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
public static String  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Private btnPlaceOrder,btnRemove,btnPickUp, btnBac";
mostCurrent._btnplaceorder = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnremove = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnpickup = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private imgBasket, imgLogo, imgItem As ImageView";
mostCurrent._imgbasket = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imglogo = new anywheresoftware.b4a.objects.ImageViewWrapper();
mostCurrent._imgitem = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private edtQtyTotal, edtCostTotal As EditText";
mostCurrent._edtqtytotal = new anywheresoftware.b4a.objects.EditTextWrapper();
mostCurrent._edtcosttotal = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim pnlCart, pnlItem As Panel";
mostCurrent._pnlcart = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlitem = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim scvMain As ScrollView 'the scrollview for the";
mostCurrent._scvmain = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim lblCompliment, lblItemName, lblItemCost, lblI";
mostCurrent._lblcompliment = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._lblitemname = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._lblitemcost = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._lblitemscostsubtotal = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim edtItemQty As EditText";
mostCurrent._edtitemqty = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim myTheme As ThemeManager";
mostCurrent._mytheme = new b4a.CoffeeCard.thememanager();
 //BA.debugLineNum = 29;BA.debugLine="Dim myDB As DatabaseManager";
mostCurrent._mydb = new b4a.CoffeeCard.databasemanager();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private csrStoreCart As Cursor";
_csrstorecart = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Dim alarmHours, alarmMinutes As Int";
_alarmhours = 0;
_alarmminutes = 0;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
}
