package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class card extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.card");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.card _card = null;
public int _coffeecount = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img7 = null;
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
public b4a.example.drinkmenu _drinkmenu = null;
public b4a.example.drinkextras _drinkextras = null;
  public Object[] GetGlobals() {
		return new Object[] {"Card",Debug.moduleToString(b4a.example.card.class),"CoffeeCount",_coffeecount,"DrinkExtras",Debug.moduleToString(b4a.example.drinkextras.class),"DrinkMenu",Debug.moduleToString(b4a.example.drinkmenu.class),"img7",_img7,"Main",Debug.moduleToString(b4a.example.main.class),"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim Card As Card";
_card = new b4a.example.card();
 //BA.debugLineNum = 4;BA.debugLine="Dim CoffeeCount As Int";
_coffeecount = 0;
 //BA.debugLineNum = 5;BA.debugLine="Dim img7 As Bitmap";
_img7 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public int  _coffeestamp() throws Exception{
try {
		Debug.PushSubsStack("CoffeeStamp (card) ","card",2,ba,this,12);
 BA.debugLineNum = 12;BA.debugLine="Sub CoffeeStamp As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="CoffeeCount = CoffeeCount + 1 'Adds 1 stamp to cof";
Debug.ShouldStop(4096);
_coffeecount = (int) (_coffeecount+1);
 BA.debugLineNum = 14;BA.debugLine="Return CoffeeCount ' and returns the new number of";
Debug.ShouldStop(8192);
if (true) return _coffeecount;
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (card) ","card",2,ba,this,8);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _redeem() throws Exception{
try {
		Debug.PushSubsStack("Redeem (card) ","card",2,ba,this,16);
 BA.debugLineNum = 16;BA.debugLine="Sub Redeem As Boolean  'this part of code will hol";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="If CoffeeCount = 6 Then ' if the person got 6 stam";
Debug.ShouldStop(65536);
if (_coffeecount==6) { 
 BA.debugLineNum = 18;BA.debugLine="img7.Initialize(File.DirAssets,\"free-coffee-1-2.jp";
Debug.ShouldStop(131072);
_img7.Initialize(__c.File.getDirAssets(),"free-coffee-1-2.jpg");
 BA.debugLineNum = 20;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return __c.True;
 };
 BA.debugLineNum = 22;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) return __c.False;
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
