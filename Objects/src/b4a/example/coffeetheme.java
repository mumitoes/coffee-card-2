package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class coffeetheme extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.coffeetheme");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.coffeetheme",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public b4a.example.main _main = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"cursor1",_cursor1,"Main",Debug.moduleToString(b4a.example.main.class),"MapLocator",Debug.moduleToString(b4a.example.maplocator.class),"SQL1",_sql1,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private SQL1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 8;BA.debugLine="Private cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (coffeetheme) ","coffeetheme",1,ba,this,12);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 17;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
Debug.ShouldStop(65536);
__c.File.Copy(__c.File.getDirAssets(),"customerthemes.sqlite",__c.File.getDirInternal(),"customerthemes.sqlite");
 BA.debugLineNum = 21;BA.debugLine="If SQL1.IsInitialized=False Then";
Debug.ShouldStop(1048576);
if (_sql1.IsInitialized()==__c.False) { 
 BA.debugLineNum = 22;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
Debug.ShouldStop(2097152);
Debug.DebugWarningEngine.CheckInitialize(_sql1);_sql1.Initialize(__c.File.getDirInternal(),"customerthemes.sqlite",__c.False);
 };
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadbtncolours() throws Exception{
try {
		Debug.PushSubsStack("loadBtnColours (coffeetheme) ","coffeetheme",1,ba,this,47);
 BA.debugLineNum = 47;BA.debugLine="Sub loadBtnColours As Cursor";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BtnRed, BtnBlue, Bt";
Debug.ShouldStop(32768);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT BtnRed, BtnBlue, BtnGreen FROM themes")));
 BA.debugLineNum = 49;BA.debugLine="Return cursor1";
Debug.ShouldStop(65536);
if (true) return _cursor1;
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcolours() throws Exception{
try {
		Debug.PushSubsStack("loadColours (coffeetheme) ","coffeetheme",1,ba,this,26);
 BA.debugLineNum = 26;BA.debugLine="Sub loadColours As Cursor";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BG1Red, BG1Blue, BG";
Debug.ShouldStop(67108864);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")));
 BA.debugLineNum = 29;BA.debugLine="Return cursor1";
Debug.ShouldStop(268435456);
if (true) return _cursor1;
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcompanyname() throws Exception{
try {
		Debug.PushSubsStack("loadCompanyName (coffeetheme) ","coffeetheme",1,ba,this,36);
 BA.debugLineNum = 36;BA.debugLine="Sub loadCompanyName As Cursor";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT CompanyName FROM th";
Debug.ShouldStop(16);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT CompanyName FROM themes")));
 BA.debugLineNum = 38;BA.debugLine="Return cursor1";
Debug.ShouldStop(32);
if (true) return _cursor1;
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadlogo() throws Exception{
try {
		Debug.PushSubsStack("loadLogo (coffeetheme) ","coffeetheme",1,ba,this,31);
 BA.debugLineNum = 31;BA.debugLine="Sub loadLogo As Cursor";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Logo FROM themes\")";
Debug.ShouldStop(-2147483648);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT Logo FROM themes")));
 BA.debugLineNum = 33;BA.debugLine="Return cursor1";
Debug.ShouldStop(1);
if (true) return _cursor1;
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadstampicon() throws Exception{
try {
		Debug.PushSubsStack("loadStampIcon (coffeetheme) ","coffeetheme",1,ba,this,41);
 BA.debugLineNum = 41;BA.debugLine="Sub loadStampIcon As Cursor";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT StampIcon FROM them";
Debug.ShouldStop(512);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT StampIcon FROM themes")));
 BA.debugLineNum = 43;BA.debugLine="Return cursor1";
Debug.ShouldStop(1024);
if (true) return _cursor1;
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return null;
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
