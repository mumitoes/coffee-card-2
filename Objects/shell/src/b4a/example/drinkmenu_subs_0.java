package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class drinkmenu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"DrinksMenu\")";
Debug.ShouldStop(268435456);
drinkmenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DrinksMenu")),drinkmenu.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="myDB.Initialize";
Debug.ShouldStop(536870912);
drinkmenu.mostCurrent._mydb.runClassMethod (b4a.example.databasemanager.class, "_initialize",drinkmenu.processBA);
 BA.debugLineNum = 31;BA.debugLine="companyDetails.Initialize";
Debug.ShouldStop(1073741824);
drinkmenu.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_initialize",drinkmenu.processBA);
 BA.debugLineNum = 32;BA.debugLine="Menu_Layout";
Debug.ShouldStop(-2147483648);
_menu_layout();
 BA.debugLineNum = 33;BA.debugLine="Drink_Menu";
Debug.ShouldStop(1);
_drink_menu();
 BA.debugLineNum = 34;BA.debugLine="Drink_Selector";
Debug.ShouldStop(2);
_drink_selector();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,41);
if (RapidSub.canDelegate("activity_pause")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,37);
if (RapidSub.canDelegate("activity_resume")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","activity_resume");
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _btndrinkextras_click() throws Exception{
try {
		Debug.PushSubsStack("btnDrinkExtras_Click (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,92);
if (RapidSub.canDelegate("btndrinkextras_click")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","btndrinkextras_click");
 BA.debugLineNum = 92;BA.debugLine="Sub btnDrinkExtras_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Activity.LoadLayout(\"Extras\")";
Debug.ShouldStop(268435456);
drinkmenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Extras")),drinkmenu.mostCurrent.activityBA);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
public static RemoteObject  _btnorder_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrder_Click (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,88);
if (RapidSub.canDelegate("btnorder_click")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","btnorder_click");
 BA.debugLineNum = 88;BA.debugLine="Sub btnOrder_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
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
public static RemoteObject  _drink_menu() throws Exception{
try {
		Debug.PushSubsStack("Drink_Menu (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,56);
if (RapidSub.canDelegate("drink_menu")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","drink_menu");
int _i = 0;
 BA.debugLineNum = 56;BA.debugLine="Sub Drink_Menu";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16777216);
drinkmenu.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 58;BA.debugLine="myDrinkMenu = myDB.loadCoffeeMenu";
Debug.ShouldStop(33554432);
drinkmenu._mydrinkmenu = drinkmenu.mostCurrent._mydb.runClassMethod (b4a.example.databasemanager.class, "_loadcoffeemenu");
 BA.debugLineNum = 59;BA.debugLine="For i = 0 To myDrinkMenu.RowCount -1";
Debug.ShouldStop(67108864);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {drinkmenu._mydrinkmenu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33); _i = ((int)(0 + _i + step33))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="myDrinkMenu.Position = i";
Debug.ShouldStop(134217728);
drinkmenu._mydrinkmenu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 61;BA.debugLine="ListView1.AddSingleLine(myDrinkMenu.GetString(\"ID\"";
Debug.ShouldStop(268435456);
drinkmenu.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.concat(drinkmenu._mydrinkmenu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ID"))),RemoteObject.createImmutable(" : "),drinkmenu._mydrinkmenu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Name"))),drinkmenu.mostCurrent.__c.getField(true,"CRLF"),drinkmenu._mydrinkmenu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Description"))),drinkmenu.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("$"),drinkmenu._mydrinkmenu.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Cost"))))));
 BA.debugLineNum = 63;BA.debugLine="ListView1.SingleLineLayout.ItemHeight = 150";
Debug.ShouldStop(1073741824);
drinkmenu.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",BA.numberCast(int.class, 150));
 BA.debugLineNum = 64;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize = 15";
Debug.ShouldStop(-2147483648);
drinkmenu.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 65;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor = Color";
Debug.ShouldStop(1);
drinkmenu.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",drinkmenu.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 66;BA.debugLine="ListView1.SingleLineLayout.Label.Color = Colors.Wh";
Debug.ShouldStop(2);
drinkmenu.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runVoidMethod ("setColor",drinkmenu.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="myDrinkMenu.Close";
Debug.ShouldStop(8);
drinkmenu._mydrinkmenu.runVoidMethod ("Close");
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
public static RemoteObject  _drink_selector() throws Exception{
try {
		Debug.PushSubsStack("Drink_Selector (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,72);
if (RapidSub.canDelegate("drink_selector")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","drink_selector");
int _i = 0;
 BA.debugLineNum = 72;BA.debugLine="Sub Drink_Selector";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Spinner1.Clear";
Debug.ShouldStop(256);
drinkmenu.mostCurrent._spinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 74;BA.debugLine="DrinkSelect = myDB.SelectDrink";
Debug.ShouldStop(512);
drinkmenu._drinkselect = drinkmenu.mostCurrent._mydb.runClassMethod (b4a.example.databasemanager.class, "_selectdrink");
 BA.debugLineNum = 75;BA.debugLine="For i = 0 To DrinkSelect.RowCount -1";
Debug.ShouldStop(1024);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {drinkmenu._drinkselect.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46); _i = ((int)(0 + _i + step46))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="DrinkSelect.Position = i";
Debug.ShouldStop(2048);
drinkmenu._drinkselect.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 77;BA.debugLine="Spinner1.Add(DrinkSelect.GetString(\"Name\"))";
Debug.ShouldStop(4096);
drinkmenu.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(drinkmenu._drinkselect.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Name")))));
 BA.debugLineNum = 78;BA.debugLine="If File.Exists(File.DirInternal, \"customerthemes.s";
Debug.ShouldStop(8192);
if (drinkmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(drinkmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="Spinner1.SelectedIndex = Spinner1.IndexOf (File.Re";
Debug.ShouldStop(16384);
drinkmenu.mostCurrent._spinner1.runMethod(true,"setSelectedIndex",drinkmenu.mostCurrent._spinner1.runMethod(true,"IndexOf",(Object)(drinkmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(drinkmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite"))))));
 }else {
 BA.debugLineNum = 81;BA.debugLine="Spinner1.SelectedIndex = 1";
Debug.ShouldStop(65536);
drinkmenu.mostCurrent._spinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private btnOrder As Button";
drinkmenu.mostCurrent._btnorder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private pgBackGround As Panel";
drinkmenu.mostCurrent._pgbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnExtras As Button";
drinkmenu.mostCurrent._btnextras = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ListView1 As ListView";
drinkmenu.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim companyDetails As ThemeManager";
drinkmenu.mostCurrent._companydetails = RemoteObject.createNew ("b4a.example.thememanager");
 //BA.debugLineNum = 22;BA.debugLine="Dim myDB As DatabaseManager";
drinkmenu.mostCurrent._mydb = RemoteObject.createNew ("b4a.example.databasemanager");
 //BA.debugLineNum = 23;BA.debugLine="Private Spinner1 As Spinner";
drinkmenu.mostCurrent._spinner1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _menu_layout() throws Exception{
try {
		Debug.PushSubsStack("Menu_Layout (drinkmenu) ","drinkmenu",4,drinkmenu.mostCurrent.activityBA,drinkmenu.mostCurrent,47);
if (RapidSub.canDelegate("menu_layout")) return drinkmenu.remoteMe.runUserSub(false, "drinkmenu","menu_layout");
 BA.debugLineNum = 47;BA.debugLine="Sub Menu_Layout";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="pgBackGround.Background = companyDetails.LoadBGCol";
Debug.ShouldStop(32768);
drinkmenu.mostCurrent._pgbackground.runMethod(false,"setBackground",(drinkmenu.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loadbgcolours").getObject()));
 BA.debugLineNum = 49;BA.debugLine="btnExtras.Background = companyDetails.loadDBbutto";
Debug.ShouldStop(65536);
drinkmenu.mostCurrent._btnextras.runMethod(false,"setBackground",(drinkmenu.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loaddbbuttoncolours").getObject()));
 BA.debugLineNum = 50;BA.debugLine="btnOrder.Background = companyDetails.loadDBbutton";
Debug.ShouldStop(131072);
drinkmenu.mostCurrent._btnorder.runMethod(false,"setBackground",(drinkmenu.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loaddbbuttoncolours").getObject()));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim myDrinkMenu As Cursor";
drinkmenu._mydrinkmenu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim DrinkSelect As Cursor";
drinkmenu._drinkselect = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}