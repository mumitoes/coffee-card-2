package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class storepurchase_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"cart\")";
Debug.ShouldStop(4);
storepurchase.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("cart")),storepurchase.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="scvMain.Initialize(200dip)";
Debug.ShouldStop(8);
storepurchase.mostCurrent._scvmain.runVoidMethod ("Initialize",storepurchase.mostCurrent.activityBA,(Object)(storepurchase.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 37;BA.debugLine="FillScrollView";
Debug.ShouldStop(16);
_fillscrollview();
 BA.debugLineNum = 38;BA.debugLine="myTheme.loadLogo";
Debug.ShouldStop(32);
storepurchase.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadlogo");
 BA.debugLineNum = 39;BA.debugLine="myTheme.Initialize";
Debug.ShouldStop(64);
storepurchase.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",storepurchase.processBA);
 BA.debugLineNum = 40;BA.debugLine="loadDBlogo";
Debug.ShouldStop(128);
_loaddblogo();
 BA.debugLineNum = 41;BA.debugLine="RunningTotals";
Debug.ShouldStop(256);
_runningtotals();
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,58);
if (RapidSub.canDelegate("activity_pause")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,55);
if (RapidSub.canDelegate("activity_resume")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","activity_resume");
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpickup_click() throws Exception{
try {
		Debug.PushSubsStack("btnPickUp_Click (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,136);
if (RapidSub.canDelegate("btnpickup_click")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","btnpickup_click");
RemoteObject _td = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog");
 BA.debugLineNum = 136;BA.debugLine="Sub btnPickUp_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim td As TimeDialog 'the dialog from the dialog l";
Debug.ShouldStop(256);
_td = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog");Debug.locals.put("td", _td);
 BA.debugLineNum = 138;BA.debugLine="td.Hour = alarmHours";
Debug.ShouldStop(512);
_td.runMethod(true,"setHour",storepurchase._alarmhours);
 BA.debugLineNum = 139;BA.debugLine="td.Minute = alarmMinutes";
Debug.ShouldStop(1024);
_td.runMethod(true,"setMinute",storepurchase._alarmminutes);
 BA.debugLineNum = 141;BA.debugLine="If td.Show(\"Select time to activate alarm\", \"\", \"O";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_td.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Select time to activate alarm")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),storepurchase.mostCurrent.activityBA,(Object)((storepurchase.mostCurrent.__c.getField(false,"Null")))),BA.numberCast(double.class, storepurchase.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 142;BA.debugLine="alarmHours = td.Hour";
Debug.ShouldStop(8192);
storepurchase._alarmhours = _td.runMethod(true,"getHour");
 BA.debugLineNum = 143;BA.debugLine="alarmMinutes = td.Minute";
Debug.ShouldStop(16384);
storepurchase._alarmminutes = _td.runMethod(true,"getMinute");
 };
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnplaceorder_click() throws Exception{
try {
		Debug.PushSubsStack("btnPlaceOrder_Click (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,147);
if (RapidSub.canDelegate("btnplaceorder_click")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","btnplaceorder_click");
 BA.debugLineNum = 147;BA.debugLine="Sub btnPlaceOrder_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 149;BA.debugLine="UpdateOrderDatabase";
Debug.ShouldStop(1048576);
_updateorderdatabase();
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnremove_click() throws Exception{
try {
		Debug.PushSubsStack("btnRemove_Click (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,152);
if (RapidSub.canDelegate("btnremove_click")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","btnremove_click");
 BA.debugLineNum = 152;BA.debugLine="Sub btnRemove_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="scvMain.Panel.RemoveView";
Debug.ShouldStop(16777216);
storepurchase.mostCurrent._scvmain.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _coffeepurchasesdb() throws Exception{
try {
		Debug.PushSubsStack("CoffeePurchasesDB (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,103);
if (RapidSub.canDelegate("coffeepurchasesdb")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","coffeepurchasesdb");
 BA.debugLineNum = 103;BA.debugLine="Sub CoffeePurchasesDB";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"SELECT ID,Nam";
Debug.ShouldStop(256);
storepurchase._csrstorecart.setObject(storepurchase._sqlstorecart.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID,Name,Description,Cost,picture FROM CoffeeMenu INNER JOIN SELECT ID, CompanyName FROM themes ON CoffeeMenu.ID=themes.ID"))));
 BA.debugLineNum = 107;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"SELECT ID,Nam";
Debug.ShouldStop(1024);
storepurchase._csrstorecart.setObject(storepurchase._sqlstorecart.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID,Name,Description,Cost,picture FROM CoffeeExtra INNER JOIN SELECT ID, CompanyName FROM themes ON CoffeeExtras.ID=themes.ID"))));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillscrollview() throws Exception{
try {
		Debug.PushSubsStack("FillScrollView (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,110);
if (RapidSub.canDelegate("fillscrollview")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","fillscrollview");
int _i = 0;
RemoteObject _bitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 110;BA.debugLine="Sub FillScrollView 'fills the scroll view which co";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="CoffeePurchasesDB 'databsae call";
Debug.ShouldStop(16384);
_coffeepurchasesdb();
 BA.debugLineNum = 112;BA.debugLine="loadPanelColours";
Debug.ShouldStop(32768);
_loadpanelcolours();
 BA.debugLineNum = 114;BA.debugLine="For i=0 To csrStoreCart.RowCount-1";
Debug.ShouldStop(131072);
{
final int step73 = 1;
final int limit73 = RemoteObject.solve(new RemoteObject[] {storepurchase._csrstorecart.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step73 > 0 && _i <= limit73) || (step73 < 0 && _i >= limit73); _i = ((int)(0 + _i + step73))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 115;BA.debugLine="csrStoreCart.Position=i";
Debug.ShouldStop(262144);
storepurchase._csrstorecart.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 122;BA.debugLine="Dim bitmap As Bitmap";
Debug.ShouldStop(33554432);
_bitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bitmap", _bitmap);
 BA.debugLineNum = 123;BA.debugLine="bitmap.Initialize(File.DirAssets,csrStoreCart .Ge";
Debug.ShouldStop(67108864);
_bitmap.runVoidMethod ("Initialize",(Object)(storepurchase.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(storepurchase._csrstorecart.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("picture")))));
 BA.debugLineNum = 125;BA.debugLine="lblItemName.Text=csrStoreCart.GetString(\"Name\")'N";
Debug.ShouldStop(268435456);
storepurchase.mostCurrent._lblitemname.runMethod(true,"setText",(storepurchase._csrstorecart.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Name")))));
 BA.debugLineNum = 126;BA.debugLine="lblItemDesc.Text=csrStoreCart.GetString(\"Descript";
Debug.ShouldStop(536870912);
storepurchase.mostCurrent._lblitemdesc.runMethod(true,"setText",(storepurchase._csrstorecart.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Description")))));
 BA.debugLineNum = 127;BA.debugLine="edtItemQty.Text=csrStoreCart.GetString(\"Qty\")'QTY";
Debug.ShouldStop(1073741824);
storepurchase.mostCurrent._edtitemqty.runMethodAndSync(true,"setText",(storepurchase._csrstorecart.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Qty")))));
 BA.debugLineNum = 128;BA.debugLine="lblItemCost.Text=csrStoreCart.GetString(\"Cost\")'C";
Debug.ShouldStop(-2147483648);
storepurchase.mostCurrent._lblitemcost.runMethod(true,"setText",(storepurchase._csrstorecart.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Cost")))));
 BA.debugLineNum = 133;BA.debugLine="csrStoreCart.Close";
Debug.ShouldStop(16);
storepurchase._csrstorecart.runVoidMethod ("Close");
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private btnPlaceOrder,btnRemove,btnPickUp As Butt";
storepurchase.mostCurrent._btnplaceorder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
storepurchase.mostCurrent._btnremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
storepurchase.mostCurrent._btnpickup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private imgBasket, imgLogo, imgItem As ImageView";
storepurchase.mostCurrent._imgbasket = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
storepurchase.mostCurrent._imglogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
storepurchase.mostCurrent._imgitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private edtQtyTotal, edtCostTotal As EditText";
storepurchase.mostCurrent._edtqtytotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
storepurchase.mostCurrent._edtcosttotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private pnlCart, pnlItem As Panel";
storepurchase.mostCurrent._pnlcart = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
storepurchase.mostCurrent._pnlitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim myTheme As CoffeeTheme";
storepurchase.mostCurrent._mytheme = RemoteObject.createNew ("b4a.example.coffeetheme");
 //BA.debugLineNum = 27;BA.debugLine="Dim scvMain As ScrollView 'the scrollview for the";
storepurchase.mostCurrent._scvmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim lblCompliment, lblItemName, lblItemDesc, lblI";
storepurchase.mostCurrent._lblcompliment = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
storepurchase.mostCurrent._lblitemname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
storepurchase.mostCurrent._lblitemdesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
storepurchase.mostCurrent._lblitemcost = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim edtItemQty As EditText";
storepurchase.mostCurrent._edtitemqty = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,45);
if (RapidSub.canDelegate("initialize")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","initialize");
 BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 48;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
Debug.ShouldStop(32768);
storepurchase.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(storepurchase.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(storepurchase.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite")));
 BA.debugLineNum = 50;BA.debugLine="If SQLstoreCart.IsInitialized=False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",storepurchase._sqlstorecart.runMethod(true,"IsInitialized"),storepurchase.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 51;BA.debugLine="SQLstoreCart.Initialize(File.DirInternal, \"custom";
Debug.ShouldStop(262144);
storepurchase._sqlstorecart.runVoidMethod ("Initialize",(Object)(storepurchase.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(storepurchase.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddblogo() throws Exception{
try {
		Debug.PushSubsStack("loadDBlogo (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,61);
if (RapidSub.canDelegate("loaddblogo")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","loaddblogo");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 61;BA.debugLine="Sub loadDBlogo 'Assign Logo as string from databas";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="csrStoreCart=myTheme.loadLogo";
Debug.ShouldStop(536870912);
storepurchase._csrstorecart = storepurchase.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadlogo");
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To csrStoreCart.RowCount - 1";
Debug.ShouldStop(1073741824);
{
final int step36 = 1;
final int limit36 = RemoteObject.solve(new RemoteObject[] {storepurchase._csrstorecart.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36); _i = ((int)(0 + _i + step36))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="csrStoreCart.Position=i";
Debug.ShouldStop(-2147483648);
storepurchase._csrstorecart.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 65;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(1);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 66;BA.debugLine="image.Initialize(File.DirAssets, csrStoreCart.Ge";
Debug.ShouldStop(2);
_image.runVoidMethod ("Initialize",(Object)(storepurchase.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(storepurchase._csrstorecart.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Logo")))));
 BA.debugLineNum = 67;BA.debugLine="imgLogo.Bitmap=image";
Debug.ShouldStop(4);
storepurchase.mostCurrent._imglogo.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadpanelcolours() throws Exception{
try {
		Debug.PushSubsStack("loadPanelColours (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,88);
if (RapidSub.canDelegate("loadpanelcolours")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","loadpanelcolours");
int _i = 0;
RemoteObject _gd1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colours = null;
 BA.debugLineNum = 88;BA.debugLine="Sub loadPanelColours As Cursor";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"SELECT BG1Red";
Debug.ShouldStop(16777216);
storepurchase._csrstorecart.setObject(storepurchase._sqlstorecart.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes"))));
 BA.debugLineNum = 90;BA.debugLine="For i = 0 To csrStoreCart.RowCount - 1";
Debug.ShouldStop(33554432);
{
final int step55 = 1;
final int limit55 = RemoteObject.solve(new RemoteObject[] {storepurchase._csrstorecart.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55); _i = ((int)(0 + _i + step55))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 91;BA.debugLine="csrStoreCart.Position = i";
Debug.ShouldStop(67108864);
storepurchase._csrstorecart.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 92;BA.debugLine="Dim gd1 As GradientDrawable";
Debug.ShouldStop(134217728);
_gd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd1", _gd1);
 BA.debugLineNum = 93;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(268435456);
_colours = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colours", _colours);
 BA.debugLineNum = 94;BA.debugLine="colours(0) = Colors.RGB(csrStoreCart.GetInt(\"BG1";
Debug.ShouldStop(536870912);
_colours.setArrayElement (storepurchase.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(storepurchase._csrstorecart.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Red")))),(Object)(storepurchase._csrstorecart.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Blue")))),(Object)(storepurchase._csrstorecart.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Green"))))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 95;BA.debugLine="colours(1) = Colors.RGB(csrStoreCart.GetInt(\"BG2";
Debug.ShouldStop(1073741824);
_colours.setArrayElement (storepurchase.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(storepurchase._csrstorecart.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Red")))),(Object)(storepurchase._csrstorecart.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Blue")))),(Object)(storepurchase._csrstorecart.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Green"))))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 96;BA.debugLine="gd1.Initialize(\"TOP_BOTTOM\",colours)";
Debug.ShouldStop(-2147483648);
_gd1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_colours));
 BA.debugLineNum = 97;BA.debugLine="PnlItem.background=gd1";
Debug.ShouldStop(1);
storepurchase.mostCurrent._pnlitem.runMethod(false,"setBackground",(_gd1.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 99;BA.debugLine="Return loadPanelColours";
Debug.ShouldStop(4);
if (true) return _loadpanelcolours();
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private SQLstoreCart As SQL";
storepurchase._sqlstorecart = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Private csrStoreCart As Cursor";
storepurchase._csrstorecart = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim alarmHours, alarmMinutes As Int";
storepurchase._alarmhours = RemoteObject.createImmutable(0);
storepurchase._alarmminutes = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _runningtotals() throws Exception{
try {
		Debug.PushSubsStack("RunningTotals (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,72);
if (RapidSub.canDelegate("runningtotals")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","runningtotals");
int _i = 0;
 BA.debugLineNum = 72;BA.debugLine="Sub RunningTotals";
Debug.ShouldStop(128);
 BA.debugLineNum = 75;BA.debugLine="Dim edtItemQty As EditText";
Debug.ShouldStop(1024);
storepurchase.mostCurrent._edtitemqty = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 BA.debugLineNum = 76;BA.debugLine="Dim lblItemCost As Label";
Debug.ShouldStop(2048);
storepurchase.mostCurrent._lblitemcost = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 78;BA.debugLine="For i = 1 To 99";
Debug.ShouldStop(8192);
{
final int step46 = 1;
final int limit46 = 99;
for (_i = 1; (step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46); _i = ((int)(0 + _i + step46))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="If edtItemQty.Text <> \"0\" Or lblItemCost.Text <>";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",storepurchase.mostCurrent._edtitemqty.runMethod(true,"getText"),BA.ObjectToString("0")) || RemoteObject.solveBoolean("!",storepurchase.mostCurrent._lblitemcost.runMethod(true,"getText"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 80;BA.debugLine="edtQtyTotal.Text=edtItemQty+1";
Debug.ShouldStop(32768);
storepurchase.mostCurrent._edtqtytotal.runMethodAndSync(true,"setText",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, storepurchase.mostCurrent._edtitemqty),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 81;BA.debugLine="edtCostTotal.Text=lblItemCost+1";
Debug.ShouldStop(65536);
storepurchase.mostCurrent._edtcosttotal.runMethodAndSync(true,"setText",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, storepurchase.mostCurrent._lblitemcost),RemoteObject.createImmutable(1)}, "+",1, 0)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateorderdatabase() throws Exception{
try {
		Debug.PushSubsStack("UpdateOrderDatabase (storepurchase) ","storepurchase",6,storepurchase.mostCurrent.activityBA,storepurchase.mostCurrent,156);
if (RapidSub.canDelegate("updateorderdatabase")) return storepurchase.remoteMe.runUserSub(false, "storepurchase","updateorderdatabase");
 BA.debugLineNum = 156;BA.debugLine="Sub UpdateOrderDatabase";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 158;BA.debugLine="csrStoreCart=SQLstoreCart.ExecQuery(\"INSERT INTO";
Debug.ShouldStop(536870912);
storepurchase._csrstorecart.setObject(storepurchase._sqlstorecart.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO CoffeePurchases (CustomerID,Picture,Description,Qty,Cost,PickUpTime)"),RemoteObject.createImmutable("VALUES (@CustID,@picture,@name,@desc,@Qty@,@Cost,@PickUp")))));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}