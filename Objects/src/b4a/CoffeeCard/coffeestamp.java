package b4a.CoffeeCard;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class coffeestamp extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.CoffeeCard.coffeestamp");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.CoffeeCard.coffeestamp",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _shopname = "";
public String _stampid = "";
public int _date = 0;
public b4a.CoffeeCard.main _main = null;
public b4a.CoffeeCard.drinkextras _drinkextras = null;
public b4a.CoffeeCard.drinkmenu _drinkmenu = null;
public b4a.CoffeeCard.storepurchase _storepurchase = null;
public b4a.CoffeeCard.maplocator _maplocator = null;
public b4a.CoffeeCard.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Date",_date,"DrinkExtras",Debug.moduleToString(b4a.CoffeeCard.drinkextras.class),"DrinkMenu",Debug.moduleToString(b4a.CoffeeCard.drinkmenu.class),"Main",Debug.moduleToString(b4a.CoffeeCard.main.class),"MapLocator",Debug.moduleToString(b4a.CoffeeCard.maplocator.class),"ShopName",_shopname,"StampID",_stampid,"StorePurchase",Debug.moduleToString(b4a.CoffeeCard.storepurchase.class),"ThemeCalc",Debug.moduleToString(b4a.CoffeeCard.themecalc.class)};
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim ShopName As String";
_shopname = "";
 //BA.debugLineNum = 4;BA.debugLine="Dim StampID As String";
_stampid = "";
 //BA.debugLineNum = 5;BA.debugLine="Dim Date As Int";
_date = 0;
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (coffeestamp) ","coffeestamp",10,ba,this,9);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return "";
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
