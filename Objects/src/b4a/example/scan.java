package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class scan extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.scan");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.scan",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _laststampscanned = "";
public ice.zxing.b4aZXingLib _zx = null;
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
public String  _scanqr(b4a.example.scan __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scan";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Scanqr";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="zx.isportrait = True";
__ref._zx.isportrait = __c.True;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="zx.useFrontCam = False";
__ref._zx.useFrontCam = __c.False;
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="zx.timeoutDuration = 30";
__ref._zx.timeoutDuration = (int) (30);
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="zx.theViewFinderXfactor = 0.7";
__ref._zx.theViewFinderXfactor = 0.7;
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="zx.theViewFinderYfactor = 0.5";
__ref._zx.theViewFinderYfactor = 0.5;
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="zx.theFrameColor = Colors.LightGray";
__ref._zx.theFrameColor = __c.Colors.LightGray;
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="zx.theLaserColor = Colors.Red";
__ref._zx.theLaserColor = __c.Colors.Red;
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="zx.theTopPromptMessage = \"This was done......\"";
__ref._zx.theTopPromptMessage = "This was done......";
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="zx.theTopPromptTextSize = 5%y";
__ref._zx.theTopPromptTextSize = __c.PerYToCurrent((float) (5),ba);
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="zx.topPromptColor = Colors.Red";
__ref._zx.topPromptColor = __c.Colors.Red;
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="zx.topPromptDistanceFromTop = 1%y";
__ref._zx.topPromptDistanceFromTop = __c.PerYToCurrent((float) (1),ba);
RDebugUtils.currentLine=1966101;
 //BA.debugLineNum = 1966101;BA.debugLine="zx.theBottomPromptMessage = \"Just for fun......\"";
__ref._zx.theBottomPromptMessage = "Just for fun......";
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="zx.theBottomPromptTextSize = 5%y";
__ref._zx.theBottomPromptTextSize = __c.PerYToCurrent((float) (5),ba);
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="zx.bottomPromptColor = Colors.Blue";
__ref._zx.bottomPromptColor = __c.Colors.Blue;
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="zx.bottomPromptDistanceFromBottom = 5%y";
__ref._zx.bottomPromptDistanceFromBottom = __c.PerYToCurrent((float) (5),ba);
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="zx.BeginScan(\"StampScan\")";
__ref._zx.BeginScan(ba,"StampScan");
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.scan __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="scan";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public String  _stampscan_noscan(b4a.example.scan __ref,String _atype,String _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="scan";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub StampScan_noscan(atype As String,Values As Str";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Msgbox(Values, \"type:\" & atype & \"Scan Failed\")";
__c.Msgbox(_values,"type:"+_atype+"Scan Failed",ba);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _stampscan_result(b4a.example.scan __ref,String _atype,String _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="scan";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub StampScan_result(atype As String,Values As Str";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="LastStampScanned = Values";
__ref._laststampscanned = _values;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
}