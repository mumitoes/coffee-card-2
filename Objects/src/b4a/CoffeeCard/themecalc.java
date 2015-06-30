package b4a.CoffeeCard;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class themecalc {
private static themecalc mostCurrent = new themecalc();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.CoffeeCard.main _main = null;
public b4a.CoffeeCard.drinkextras _drinkextras = null;
public b4a.CoffeeCard.drinkmenu _drinkmenu = null;
public b4a.CoffeeCard.storepurchase _storepurchase = null;
public b4a.CoffeeCard.maplocator _maplocator = null;
  public Object[] GetGlobals() {
		return new Object[] {"DrinkExtras",Debug.moduleToString(b4a.CoffeeCard.drinkextras.class),"DrinkMenu",Debug.moduleToString(b4a.CoffeeCard.drinkmenu.class),"Main",Debug.moduleToString(b4a.CoffeeCard.main.class),"MapLocator",Debug.moduleToString(b4a.CoffeeCard.maplocator.class),"StorePurchase",Debug.moduleToString(b4a.CoffeeCard.storepurchase.class)};
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
