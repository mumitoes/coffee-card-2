package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class coffeetheme_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private SQL1 As SQL";
coffeetheme._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",coffeetheme._sql1);
 //BA.debugLineNum = 8;BA.debugLine="Private cursor1 As Cursor";
coffeetheme._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_cursor1",coffeetheme._cursor1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _drinkextras(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrinkExtras (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("drinkextras")) return __ref.runUserSub(false, "coffeetheme","drinkextras", __ref);
 BA.debugLineNum = 67;BA.debugLine="Sub DrinkExtras As Cursor";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Description , C";
Debug.ShouldStop(8);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID, Description , Cost FROM CoffeeExtras"))));
 BA.debugLineNum = 69;BA.debugLine="Return cursor1";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extraselect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExtraSelect (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("extraselect")) return __ref.runUserSub(false, "coffeetheme","extraselect", __ref);
 BA.debugLineNum = 72;BA.debugLine="Sub ExtraSelect As Cursor";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Description FROM Co";
Debug.ShouldStop(256);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Description FROM CoffeeExtras"))));
 BA.debugLineNum = 74;BA.debugLine="Return cursor1";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "coffeetheme","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 17;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
Debug.ShouldStop(65536);
coffeetheme.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(coffeetheme.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(coffeetheme.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite")));
 BA.debugLineNum = 21;BA.debugLine="If SQL1.IsInitialized=False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1").runMethod(true,"IsInitialized"),coffeetheme.__c.getField(true,"False"))) { 
 BA.debugLineNum = 22;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1").runVoidMethod ("Initialize",(Object)(coffeetheme.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(coffeetheme.__c.getField(true,"False")));
 };
 BA.debugLineNum = 24;BA.debugLine="End Sub";
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
public static RemoteObject  _loadbtncolours(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadBtnColours (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("loadbtncolours")) return __ref.runUserSub(false, "coffeetheme","loadbtncolours", __ref);
 BA.debugLineNum = 47;BA.debugLine="Sub loadBtnColours As Cursor";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BtnRed, BtnBlue, Bt";
Debug.ShouldStop(32768);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT BtnRed, BtnBlue, BtnGreen FROM themes"))));
 BA.debugLineNum = 49;BA.debugLine="Return cursor1";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcoffeemenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadCoffeeMenu (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("loadcoffeemenu")) return __ref.runUserSub(false, "coffeetheme","loadcoffeemenu", __ref);
 BA.debugLineNum = 57;BA.debugLine="Sub loadCoffeeMenu As Cursor";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Name, Descripti";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID, Name, Description, Cost FROM CoffeeMenu"))));
 BA.debugLineNum = 59;BA.debugLine="Return cursor1";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcolours(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadColours (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("loadcolours")) return __ref.runUserSub(false, "coffeetheme","loadcolours", __ref);
 BA.debugLineNum = 26;BA.debugLine="Sub loadColours As Cursor";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BG1Red, BG1Blue, BG";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes"))));
 BA.debugLineNum = 29;BA.debugLine="Return cursor1";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcompanydetails(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadCompanyDetails (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("loadcompanydetails")) return __ref.runUserSub(false, "coffeetheme","loadcompanydetails", __ref);
 BA.debugLineNum = 52;BA.debugLine="Sub loadCompanyDetails As Cursor 'load company inf";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name, Address1 , A";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Name, Address1 , Address2 , Suburb , City , PhoneCode , PhoneNo FROM CompanyDetails"))));
 BA.debugLineNum = 54;BA.debugLine="Return cursor1";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcompanyname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadCompanyName (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("loadcompanyname")) return __ref.runUserSub(false, "coffeetheme","loadcompanyname", __ref);
 BA.debugLineNum = 36;BA.debugLine="Sub loadCompanyName As Cursor";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name FROM CompanyDe";
Debug.ShouldStop(16);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Name FROM CompanyDetails"))));
 BA.debugLineNum = 38;BA.debugLine="Return cursor1";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlogo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadLogo (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("loadlogo")) return __ref.runUserSub(false, "coffeetheme","loadlogo", __ref);
 BA.debugLineNum = 31;BA.debugLine="Sub loadLogo As Cursor";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Logo FROM themes\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Logo FROM themes"))));
 BA.debugLineNum = 33;BA.debugLine="Return cursor1";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadstampicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadStampIcon (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("loadstampicon")) return __ref.runUserSub(false, "coffeetheme","loadstampicon", __ref);
 BA.debugLineNum = 41;BA.debugLine="Sub loadStampIcon As Cursor";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT StampIcon FROM them";
Debug.ShouldStop(512);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT StampIcon FROM themes"))));
 BA.debugLineNum = 43;BA.debugLine="Return cursor1";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectdrink(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SelectDrink (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("selectdrink")) return __ref.runUserSub(false, "coffeetheme","selectdrink", __ref);
 BA.debugLineNum = 62;BA.debugLine="Sub SelectDrink As Cursor";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name FROM CoffeeMen";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Name FROM CoffeeMenu"))));
 BA.debugLineNum = 64;BA.debugLine="Return cursor1";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}