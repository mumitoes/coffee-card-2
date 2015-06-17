package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class card extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.card");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.card",
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
public b4a.example.card _card = null;
public int _coffeecount = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img7 = null;
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
public b4a.example.storepurchase _storepurchase = null;
public int  _coffeestamp(b4a.example.card __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="card";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub CoffeeStamp As Int";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="CoffeeCount = CoffeeCount + 1 'Adds 1 stamp to cof";
__ref._coffeecount = (int) (__ref._coffeecount+1);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Return CoffeeCount ' and returns the new number of";
if (true) return __ref._coffeecount;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.card __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="card";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public boolean  _redeem(b4a.example.card __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="card";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Redeem As Boolean  'this part of code will hol";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If CoffeeCount = 6 Then ' if the person got 6 stam";
if (__ref._coffeecount==6) { 
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="img7.Initialize(File.DirAssets,\"free-coffee-1-2.jp";
__ref._img7.Initialize(__c.File.getDirAssets(),"free-coffee-1-2.jpg");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return false;
}
}