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
public b4a.example.drinkmenu _drinkmenu = null;
public b4a.example.drinkextras _drinkextras = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
public int  _coffee_stamp(b4a.example.card __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="card";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Coffee_Stamp As Int";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="CoffeeCount = CoffeeCount + 1 'Adds 1 stamp to cof";
__ref._coffeecount = (int) (__ref._coffeecount+1);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Return CoffeeCount ' and returns the new number of";
if (true) return __ref._coffeecount;
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.card __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="card";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public boolean  _redeem(b4a.example.card __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="card";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Redeem As Boolean  'this part of code will hol";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If CoffeeCount = 6 Then ' if the person got 6 stam";
if (__ref._coffeecount==6) { 
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="img7.Initialize(File.DirAssets,\"free-coffee-1-2.jp";
__ref._img7.Initialize(__c.File.getDirAssets(),"free-coffee-1-2.jpg");
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="End Sub";
return false;
}
}