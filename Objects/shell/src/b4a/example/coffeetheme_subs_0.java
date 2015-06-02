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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "coffeetheme","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="If File.Exists(File.DirInternal, \"customerthemes.";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",coffeetheme.__c.getField(false,"File").runMethod(true,"Exists",(Object)(coffeetheme.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite"))),coffeetheme.__c.getField(true,"False"))) { 
 BA.debugLineNum = 14;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
Debug.ShouldStop(8192);
coffeetheme.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(coffeetheme.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(coffeetheme.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite")));
 };
 BA.debugLineNum = 18;BA.debugLine="If SQL1.IsInitialized=False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1").runMethod(true,"IsInitialized"),coffeetheme.__c.getField(true,"False"))) { 
 BA.debugLineNum = 19;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1").runVoidMethod ("Initialize",(Object)(coffeetheme.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(coffeetheme.__c.getField(true,"False")));
 };
 BA.debugLineNum = 21;BA.debugLine="End Sub";
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
public static RemoteObject  _loadcolours(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadColours (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("loadcolours")) return __ref.runUserSub(false, "coffeetheme","loadcolours", __ref);
 BA.debugLineNum = 23;BA.debugLine="Sub loadColours As Cursor";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BG1Red, BG1Blue, BG";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes"))));
 BA.debugLineNum = 26;BA.debugLine="Return cursor1";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("loadCompanyName (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("loadcompanyname")) return __ref.runUserSub(false, "coffeetheme","loadcompanyname", __ref);
 BA.debugLineNum = 33;BA.debugLine="Sub loadCompanyName As Cursor";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT CompanyName FROM th";
Debug.ShouldStop(2);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT CompanyName FROM themes"))));
 BA.debugLineNum = 35;BA.debugLine="Return cursor1";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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
public static RemoteObject  _loadlogo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadLogo (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("loadlogo")) return __ref.runUserSub(false, "coffeetheme","loadlogo", __ref);
 BA.debugLineNum = 28;BA.debugLine="Sub loadLogo As Cursor";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Logo FROM themes\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Logo FROM themes"))));
 BA.debugLineNum = 30;BA.debugLine="Return cursor1";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("loadStampIcon (coffeetheme) ","coffeetheme",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("loadstampicon")) return __ref.runUserSub(false, "coffeetheme","loadstampicon", __ref);
 BA.debugLineNum = 38;BA.debugLine="Sub loadStampIcon As Cursor";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT StampIcon FROM them";
Debug.ShouldStop(64);
__ref.getField(false,"_cursor1").setObject (__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT StampIcon FROM themes"))));
 BA.debugLineNum = 40;BA.debugLine="Return cursor1";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_cursor1");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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