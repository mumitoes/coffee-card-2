package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class coffeetheme extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.coffeetheme");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
public b4a.example.storepurchase _storepurchase = null;
public String  _initialize(b4a.example.coffeetheme __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
__c.File.Copy(__c.File.getDirAssets(),"customerthemes.sqlite",__c.File.getDirInternal(),"customerthemes.sqlite");
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="If SQL1.IsInitialized=False Then";
if (__ref._sql1.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
__ref._sql1.Initialize(__c.File.getDirInternal(),"customerthemes.sqlite",__c.False);
 };
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadbtncolours(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub loadBtnColours As Cursor";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BtnRed, BtnBlue, Bt";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT BtnRed, BtnBlue, BtnGreen FROM themes")));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcolours(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub loadColours As Cursor";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BG1Red, BG1Blue, BG";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadlogo(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub loadLogo As Cursor";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Logo FROM themes\")";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Logo FROM themes")));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcompanyname(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub loadCompanyName As Cursor";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name FROM CompanyDe";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Name FROM CompanyDetails")));
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadstampicon(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub loadStampIcon As Cursor";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT StampIcon FROM them";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT StampIcon FROM themes")));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return null;
}
}