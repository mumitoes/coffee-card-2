package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scan_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim LastStampScanned As String";
scan._laststampscanned = RemoteObject.createImmutable("");__ref.setField("_laststampscanned",scan._laststampscanned);
 //BA.debugLineNum = 4;BA.debugLine="Dim zx As JhsIceZxing1";
scan._zx = RemoteObject.createNew ("ice.zxing.b4aZXingLib");__ref.setField("_zx",scan._zx);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (scan) ","scan",6,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "scan","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scanqr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Scanqr (scan) ","scan",6,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("scanqr")) return __ref.runUserSub(false, "scan","scanqr", __ref);
 BA.debugLineNum = 11;BA.debugLine="Sub Scanqr";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="zx.isportrait = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_zx").setField ("isportrait",scan.__c.getField(true,"True"));
 BA.debugLineNum = 13;BA.debugLine="zx.useFrontCam = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_zx").setField ("useFrontCam",scan.__c.getField(true,"False"));
 BA.debugLineNum = 16;BA.debugLine="zx.timeoutDuration = 30";
Debug.ShouldStop(32768);
__ref.getField(false,"_zx").setField ("timeoutDuration",BA.numberCast(int.class, 30));
 BA.debugLineNum = 20;BA.debugLine="zx.theViewFinderXfactor = 0.7";
Debug.ShouldStop(524288);
__ref.getField(false,"_zx").setField ("theViewFinderXfactor",BA.numberCast(double.class, 0.7));
 BA.debugLineNum = 21;BA.debugLine="zx.theViewFinderYfactor = 0.5";
Debug.ShouldStop(1048576);
__ref.getField(false,"_zx").setField ("theViewFinderYfactor",BA.numberCast(double.class, 0.5));
 BA.debugLineNum = 23;BA.debugLine="zx.theFrameColor = Colors.LightGray";
Debug.ShouldStop(4194304);
__ref.getField(false,"_zx").setField ("theFrameColor",scan.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 24;BA.debugLine="zx.theLaserColor = Colors.Red";
Debug.ShouldStop(8388608);
__ref.getField(false,"_zx").setField ("theLaserColor",scan.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 27;BA.debugLine="zx.theTopPromptMessage = \"This was done......\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_zx").setField ("theTopPromptMessage",BA.ObjectToString("This was done......"));
 BA.debugLineNum = 28;BA.debugLine="zx.theTopPromptTextSize = 5%y";
Debug.ShouldStop(134217728);
__ref.getField(false,"_zx").setField ("theTopPromptTextSize",scan.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")));
 BA.debugLineNum = 29;BA.debugLine="zx.topPromptColor = Colors.Red";
Debug.ShouldStop(268435456);
__ref.getField(false,"_zx").setField ("topPromptColor",scan.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 30;BA.debugLine="zx.topPromptDistanceFromTop = 1%y";
Debug.ShouldStop(536870912);
__ref.getField(false,"_zx").setField ("topPromptDistanceFromTop",scan.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba")));
 BA.debugLineNum = 32;BA.debugLine="zx.theBottomPromptMessage = \"Just for fun......\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_zx").setField ("theBottomPromptMessage",BA.ObjectToString("Just for fun......"));
 BA.debugLineNum = 33;BA.debugLine="zx.theBottomPromptTextSize = 5%y";
Debug.ShouldStop(1);
__ref.getField(false,"_zx").setField ("theBottomPromptTextSize",scan.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")));
 BA.debugLineNum = 34;BA.debugLine="zx.bottomPromptColor = Colors.Blue";
Debug.ShouldStop(2);
__ref.getField(false,"_zx").setField ("bottomPromptColor",scan.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 35;BA.debugLine="zx.bottomPromptDistanceFromBottom = 5%y";
Debug.ShouldStop(4);
__ref.getField(false,"_zx").setField ("bottomPromptDistanceFromBottom",scan.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")));
 BA.debugLineNum = 37;BA.debugLine="zx.BeginScan(\"StampScan\")";
Debug.ShouldStop(16);
__ref.getField(false,"_zx").runVoidMethod ("BeginScan",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("StampScan")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
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
public static RemoteObject  _stampscan_noscan(RemoteObject __ref,RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("StampScan_noscan (scan) ","scan",6,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("stampscan_noscan")) return __ref.runUserSub(false, "scan","stampscan_noscan", __ref, _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 44;BA.debugLine="Sub StampScan_noscan(atype As String,Values As Str";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Msgbox(Values, \"type:\" & atype & \"Scan Failed\")";
Debug.ShouldStop(4096);
scan.__c.runVoidMethodAndSync ("Msgbox",(Object)(_values),(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Scan Failed"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stampscan_result(RemoteObject __ref,RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("StampScan_result (scan) ","scan",6,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("stampscan_result")) return __ref.runUserSub(false, "scan","stampscan_result", __ref, _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 40;BA.debugLine="Sub StampScan_result(atype As String,Values As Str";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="LastStampScanned = Values";
Debug.ShouldStop(256);
__ref.setField ("_laststampscanned",_values);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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