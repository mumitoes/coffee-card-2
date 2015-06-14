package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class address_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private SQL1 As SQL";
address._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",address._sql1);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (address) ","address",5,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "address","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 12;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
Debug.ShouldStop(2048);
address.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(address.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(address.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("customerthemes.sqlite")));
 BA.debugLineNum = 16;BA.debugLine="If SQL1.IsInitialized=False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1").runMethod(true,"IsInitialized"),address.__c.getField(true,"False"))) { 
 BA.debugLineNum = 17;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1").runVoidMethod ("Initialize",(Object)(address.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("customerthemes.sqlite")),(Object)(address.__c.getField(true,"False")));
 };
 BA.debugLineNum = 19;BA.debugLine="End Sub";
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
}