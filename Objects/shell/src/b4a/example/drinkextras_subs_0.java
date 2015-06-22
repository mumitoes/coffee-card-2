package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class drinkextras_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"Extras\")";
Debug.ShouldStop(8388608);
drinkextras.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Extras")),drinkextras.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="myTheme.Initialize";
Debug.ShouldStop(16777216);
drinkextras.mostCurrent._mytheme.runClassMethod (b4a.example.databasemanager.class, "_initialize",drinkextras.processBA);
 BA.debugLineNum = 26;BA.debugLine="companyDetails.Initialize";
Debug.ShouldStop(33554432);
drinkextras.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_initialize",drinkextras.processBA);
 BA.debugLineNum = 27;BA.debugLine="Extras_Layout";
Debug.ShouldStop(67108864);
_extras_layout();
 BA.debugLineNum = 28;BA.debugLine="Drink_Extras";
Debug.ShouldStop(134217728);
_drink_extras();
 BA.debugLineNum = 29;BA.debugLine="Drink_Extra_Selector";
Debug.ShouldStop(268435456);
_drink_extra_selector();
 BA.debugLineNum = 31;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,37);
if (RapidSub.canDelegate("activity_pause")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Resume (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,33);
if (RapidSub.canDelegate("activity_resume")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","activity_resume");
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndrinkmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnDrinkMenu_Click (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,85);
if (RapidSub.canDelegate("btndrinkmenu_click")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","btndrinkmenu_click");
 BA.debugLineNum = 85;BA.debugLine="Sub btnDrinkMenu_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Activity.LoadLayout(\"DrinksMenu\")";
Debug.ShouldStop(2097152);
drinkextras.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DrinksMenu")),drinkextras.mostCurrent.activityBA);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnorder_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrder_Click (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,81);
if (RapidSub.canDelegate("btnorder_click")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","btnorder_click");
 BA.debugLineNum = 81;BA.debugLine="Sub btnOrder_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drink_extra_selector() throws Exception{
try {
		Debug.PushSubsStack("Drink_Extra_Selector (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,65);
if (RapidSub.canDelegate("drink_extra_selector")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","drink_extra_selector");
int _i = 0;
 BA.debugLineNum = 65;BA.debugLine="Sub Drink_Extra_Selector";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Spinner2.Clear";
Debug.ShouldStop(2);
drinkextras.mostCurrent._spinner2.runVoidMethod ("Clear");
 BA.debugLineNum = 67;BA.debugLine="ExtraSelect = myTheme.LoadExtraSelect";
Debug.ShouldStop(4);
drinkextras._extraselect = drinkextras.mostCurrent._mytheme.runClassMethod (b4a.example.databasemanager.class, "_loadextraselect");
 BA.debugLineNum = 68;BA.debugLine="For i = 0 To ExtraSelect.RowCount -1";
Debug.ShouldStop(8);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {drinkextras._extraselect.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46); _i = ((int)(0 + _i + step46))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 69;BA.debugLine="ExtraSelect.Position = i";
Debug.ShouldStop(16);
drinkextras._extraselect.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 70;BA.debugLine="Spinner2.Add(ExtraSelect.GetString(\"Description\"))";
Debug.ShouldStop(32);
drinkextras.mostCurrent._spinner2.runVoidMethod ("Add",(Object)(drinkextras._extraselect.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Description")))));
 BA.debugLineNum = 71;BA.debugLine="If File.Exists(File.DirInternal, \"customerthemes.s";
Debug.ShouldStop(64);
if (drinkextras.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(drinkextras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="Spinner2.SelectedIndex = Spinner2.IndexOf (File.Re";
Debug.ShouldStop(128);
drinkextras.mostCurrent._spinner2.runMethod(true,"setSelectedIndex",drinkextras.mostCurrent._spinner2.runMethod(true,"IndexOf",(Object)(drinkextras.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(drinkextras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite"))))));
 }else {
 BA.debugLineNum = 74;BA.debugLine="Spinner2.SelectedIndex = 1";
Debug.ShouldStop(512);
drinkextras.mostCurrent._spinner2.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drink_extras() throws Exception{
try {
		Debug.PushSubsStack("Drink_Extras (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,48);
if (RapidSub.canDelegate("drink_extras")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","drink_extras");
int _i = 0;
 BA.debugLineNum = 48;BA.debugLine="Sub Drink_Extras";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="ListView2.Clear";
Debug.ShouldStop(65536);
drinkextras.mostCurrent._listview2.runVoidMethod ("Clear");
 BA.debugLineNum = 50;BA.debugLine="myDrinkExtras = myTheme.LoadDrinkExtras";
Debug.ShouldStop(131072);
drinkextras._mydrinkextras = drinkextras.mostCurrent._mytheme.runClassMethod (b4a.example.databasemanager.class, "_loaddrinkextras");
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To myDrinkExtras.RowCount -1";
Debug.ShouldStop(262144);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {drinkextras._mydrinkextras.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33); _i = ((int)(0 + _i + step33))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="myDrinkExtras.Position = i";
Debug.ShouldStop(524288);
drinkextras._mydrinkextras.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 53;BA.debugLine="ListView2.AddSingleLine(myDrinkExtras.GetInt(\"ID\")";
Debug.ShouldStop(1048576);
drinkextras.mostCurrent._listview2.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.concat(drinkextras._mydrinkextras.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID"))),RemoteObject.createImmutable(" : "),drinkextras._mydrinkextras.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Description"))),drinkextras.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("$"),drinkextras._mydrinkextras.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Cost"))),RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 55;BA.debugLine="ListView2.SingleLineLayout.ItemHeight = 150";
Debug.ShouldStop(4194304);
drinkextras.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",BA.numberCast(int.class, 150));
 BA.debugLineNum = 56;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize = 15";
Debug.ShouldStop(8388608);
drinkextras.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 57;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor = Color";
Debug.ShouldStop(16777216);
drinkextras.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",drinkextras.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 58;BA.debugLine="ListView2.SingleLineLayout.Label.Color = Colors.Wh";
Debug.ShouldStop(33554432);
drinkextras.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runVoidMethod ("setColor",drinkextras.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 61;BA.debugLine="myDrinkExtras.Close";
Debug.ShouldStop(268435456);
drinkextras._mydrinkextras.runVoidMethod ("Close");
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extras_layout() throws Exception{
try {
		Debug.PushSubsStack("Extras_Layout (drinkextras) ","drinkextras",5,drinkextras.mostCurrent.activityBA,drinkextras.mostCurrent,41);
if (RapidSub.canDelegate("extras_layout")) return drinkextras.remoteMe.runUserSub(false, "drinkextras","extras_layout");
 BA.debugLineNum = 41;BA.debugLine="Sub Extras_Layout";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="pgBackGround.Background = companyDetails.LoadBGCol";
Debug.ShouldStop(512);
drinkextras.mostCurrent._pgbackground.runMethod(false,"setBackground",(drinkextras.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loadbgcolours").getObject()));
 BA.debugLineNum = 43;BA.debugLine="btnDrinkMenu.Background = companyDetails.loadDBbu";
Debug.ShouldStop(1024);
drinkextras.mostCurrent._btndrinkmenu.runMethod(false,"setBackground",(drinkextras.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loaddbbuttoncolours").getObject()));
 BA.debugLineNum = 44;BA.debugLine="btnOrder.Background = companyDetails.loadDBbutton";
Debug.ShouldStop(2048);
drinkextras.mostCurrent._btnorder.runMethod(false,"setBackground",(drinkextras.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loaddbbuttoncolours").getObject()));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private btnOrder As Button";
drinkextras.mostCurrent._btnorder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private pgBackGround As Panel";
drinkextras.mostCurrent._pgbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private btnDrinkMenu As Button";
drinkextras.mostCurrent._btndrinkmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private ListView2 As ListView";
drinkextras.mostCurrent._listview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim Spinner2 As Spinner";
drinkextras.mostCurrent._spinner2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim companyDetails As ThemeManager";
drinkextras.mostCurrent._companydetails = RemoteObject.createNew ("b4a.example.thememanager");
 //BA.debugLineNum = 18;BA.debugLine="Dim myTheme As DatabaseManager";
drinkextras.mostCurrent._mytheme = RemoteObject.createNew ("b4a.example.databasemanager");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim myDrinkExtras As Cursor";
drinkextras._mydrinkextras = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Dim ExtraSelect As Cursor";
drinkextras._extraselect = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}