package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class themecalc {
private static themecalc mostCurrent = new themecalc();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.drinkmenu _drinkmenu = null;
  public Object[] GetGlobals() {
		return new Object[] {"DrinkMenu",Debug.moduleToString(b4a.example.drinkmenu.class),"Main",Debug.moduleToString(b4a.example.main.class)};
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
