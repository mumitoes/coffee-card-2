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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.storepurchase");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.storepurchase");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.storepurchase", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sqlstorecart = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _csrstorecart = null;
public static int _alarmhours = 0;
public static int _alarmminutes = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btnplaceorder = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnremove = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnpickup = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgbasket = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imglogo = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgitem = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtqtytotal = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtcosttotal = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcart = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlitem = null;
public b4a.example.coffeetheme _mytheme = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scvmain = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcompliment = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemdesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemcost = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtitemqty = null;
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Activity.LoadLayout(\"cart\")";
mostCurrent._activity.LoadLayout("cart",mostCurrent.activityBA);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="scvMain.Initialize(200dip)";
mostCurrent._scvmain.Initialize(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="FillScrollView";
_fillscrollview();
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="myTheme.loadLogo";
mostCurrent._mytheme._loadlogo(null);
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="myTheme.Initialize";
mostCurrent._mytheme._initialize(null,processBA);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="loadDBlogo";
_loaddblogo();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="RunningTotals";
_runningtotals();
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="End Sub";
return "";
}
public static String  _fillscrollview() throws Exception{
RDebugUtils.currentModule="storepurchase";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub FillScrollView 'fills the scroll view which co";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="CoffeePurchasesDB 'databsae call";
_coffeepurchasesdb();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="loadPanelColours";
_loadpanelcolours();
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="For i=0 To csrStoreCart.RowCount-1";
{
final int step73 = 1;
final int limit73 = (int) (_csrstorecart.getRowCount()-1);
for (_i = (int) (0); (step73 > 0 && _i <= limit73) || (step73 < 0 && _i >= limit73); _i = ((int)(0 + _i + step73))) {
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="csrStoreCart.Position=i";
_csrstorecart.setPosition(_i);
 }
};
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Dim bitmap As Bitmap";
_bitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="bitmap.Initialize(File.DirAssets,csrStoreCart .Ge";
_bitmap.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_csrstorecart.GetString("picture"));
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="lblItemName.Text=csrStoreCart.GetString(\"Name\")'N";
mostCurrent._lblitemname.setText((Object)(_csrstorecart.GetString("Name")));
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="lblItemDesc.Text=csrStoreCart.GetString(\"Descript";
mostCurrent._lblitemdesc.setText((Object)(_csrstorecart.GetString("Description")));
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="edtItemQty.Text=csrStoreCart.GetString(\"Qty\")'QTY";
mostCurrent._edtitemqty.setText((Object)(_csrstorecart.GetString("Qty")));
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="lblItemCost.Text=csrStoreCart.GetString(\"Cost\")'C";
mostCurrent._lblitemcost.setText((Object)(_csrstorecart.GetString("Cost")));
RDebugUtils.currentLine=2949143;
 //BA.debugLineNum = 2949143;BA.debugLine="csrStoreCart.Close";
_csrstorecart.Close();
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="End Sub";
return "";
}
public static String  _loaddblogo() throws Exception{
RDebugUtils.currentModule="storepurchase";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub loadDBlogo 'Assign Logo as string from databas";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="csrStoreCart=myTheme.loadLogo";
_csrstorecart = mostCurrent._mytheme._loadlogo(null);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="For i = 0 To csrStoreCart.RowCount - 1";
{
final int step36 = 1;
final int limit36 = (int) (_csrstorecart.getRowCount()-1);
for (_i = (int) (0); (step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36); _i = ((int)(0 + _i + step36))) {
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="csrStoreCart.Position=i";
_csrstorecart.setPosition(_i);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim image As Bitmap";
_image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="image.Initialize(File.DirAssets, csrStoreCart.Ge";
_image.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_csrstorecart.GetString("Logo"));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="imgLogo.Bitmap=image";
mostCurrent._imglogo.setBitmap((android.graphics.Bitmap)(_image.getObject()));
 }
};
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="End Sub";
return "";
}
public static String  _runningtotals() throws Exception{
RDebugUtils.currentModule="storepurchase";
int _i = 0;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub RunningTotals";
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Dim edtItemQty As EditText";
mostCurrent._edtitemqty = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Dim lblItemCost As Label";
mostCurrent._lblitemcost = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="For i = 1 To 99";
{
final int step46 = 1;
final int limit46 = (int) (99);
for (_i = (int) (1); (step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46); _i = ((int)(0 + _i + step46))) {
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="If edtItemQty.Text <> \"0\" Or lblItemCost.Text <>";
if ((mostCurrent._edtitemqty.getText()).equals("0") == false || (mostCurrent._lblitemcost.getText()).equals("0") == false) { 
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="edtQtyTotal.Text=edtItemQty+1";
mostCurrent._edtqtytotal.setText((Object)((double)(BA.ObjectToNumber(mostCurrent._edtitemqty))+1));
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="edtCostTotal.Text=lblItemCost+1";
mostCurrent._edtcosttotal.setText((Object)((double)(BA.ObjectToNumber(mostCurrent._lblitemcost))+1));
 };
 }
};
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="End Sub";
return "";
}
public static String  _btnpickup_click() throws Exception{
RDebugUtils.currentModule="storepurchase";
anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog _td = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub btnPickUp_Click";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim td As TimeDialog 'the dialog from the dialog l";
_td = new anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="td.Hour = alarmHours";
_td.setHour(_alarmhours);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="td.Minute = alarmMinutes";
_td.setMinute(_alarmminutes);
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="If td.Show(\"Select time to activate alarm\", \"\", \"O";
if (_td.Show("Select time to activate alarm","","Ok","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null))==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="alarmHours = td.Hour";
_alarmhours = _td.getHour();
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="alarmMinutes = td.Minute";
_alarmminutes = _td.getMinute();
 };
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="End Sub";
return "";
}
public static String  _btnplaceorder_click() throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub btnPlaceOrder_Click";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="UpdateOrderDatabase";
_updateorderdatabase();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public static String  _updateorderdatabase() throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub UpdateOrderDatabase";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"INSERT INTO";
_csrstorecart.setObject((android.database.Cursor)(_sqlstorecart.ExecQuery("INSERT INTO CoffeePurchases (CustomerID,Picture,Description,Qty,Cost,PickUpTime)"+"VALUES (@CustID,@picture,@name,@desc,@Qty@,@Cost,@PickUp")));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public static String  _btnremove_click() throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub btnRemove_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="scvMain.Panel.RemoveView";
mostCurrent._scvmain.getPanel().RemoveView();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public static String  _coffeepurchasesdb() throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub CoffeePurchasesDB";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"SELECT ID,Nam";
_csrstorecart.setObject((android.database.Cursor)(_sqlstorecart.ExecQuery("SELECT ID,Name,Description,Cost,picture FROM CoffeeMenu INNER JOIN SELECT ID, CompanyName FROM themes ON CoffeeMenu.ID=themes.ID")));
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"SELECT ID,Nam";
_csrstorecart.setObject((android.database.Cursor)(_sqlstorecart.ExecQuery("SELECT ID,Name,Description,Cost,picture FROM CoffeeExtra INNER JOIN SELECT ID, CompanyName FROM themes ON CoffeeExtras.ID=themes.ID")));
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadpanelcolours() throws Exception{
RDebugUtils.currentModule="storepurchase";
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd1 = null;
int[] _colours = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub loadPanelColours As Cursor";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"SELECT BG1Red";
_csrstorecart.setObject((android.database.Cursor)(_sqlstorecart.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="For i = 0 To csrStoreCart.RowCount - 1";
{
final int step55 = 1;
final int limit55 = (int) (_csrstorecart.getRowCount()-1);
for (_i = (int) (0); (step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55); _i = ((int)(0 + _i + step55))) {
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="csrStoreCart.Position = i";
_csrstorecart.setPosition(_i);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim gd1 As GradientDrawable";
_gd1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Dim colours(2) As Int";
_colours = new int[(int) (2)];
;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="colours(0) = Colors.RGB(csrStoreCart.GetInt(\"BG1";
_colours[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_csrstorecart.GetInt("BG1Red"),_csrstorecart.GetInt("BG1Blue"),_csrstorecart.GetInt("BG1Green"));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="colours(1) = Colors.RGB(csrStoreCart.GetInt(\"BG2";
_colours[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB(_csrstorecart.GetInt("BG2Red"),_csrstorecart.GetInt("BG2Blue"),_csrstorecart.GetInt("BG2Green"));
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="gd1.Initialize(\"TOP_BOTTOM\",colours)";
_gd1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colours);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="PnlItem.background=gd1";
mostCurrent._pnlitem.setBackground((android.graphics.drawable.Drawable)(_gd1.getObject()));
 }
};
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Return loadPanelColours";
if (true) return _loadpanelcolours();
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="End Sub";
return null;
}
public static String  _initialize() throws Exception{
RDebugUtils.currentModule="storepurchase";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"customerthemes.sqlite",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite");
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="If SQLstoreCart.IsInitialized=False Then";
if (_sqlstorecart.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="SQLstoreCart.Initialize(File.DirInternal, \"custom";
_sqlstorecart.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"customerthemes.sqlite",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="End Sub";
return "";
}
}