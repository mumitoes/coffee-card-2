package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qrgenerator_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim mResult As String";
qrgenerator._mresult = RemoteObject.createImmutable("");__ref.setField("_mresult",qrgenerator._mresult);
 //BA.debugLineNum = 4;BA.debugLine="Dim Button1 As Button";
qrgenerator._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",qrgenerator._button1);
 //BA.debugLineNum = 5;BA.debugLine="Dim myABBarcode As ABZxing";
qrgenerator._myabbarcode = RemoteObject.createNew ("com.AB.ABZxing.ABZxing");__ref.setField("_myabbarcode",qrgenerator._myabbarcode);
 //BA.debugLineNum = 6;BA.debugLine="Dim Label1 As Label";
qrgenerator._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",qrgenerator._label1);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (qrgenerator) ","qrgenerator",8,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "qrgenerator","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
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
}