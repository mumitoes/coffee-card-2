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
public b4a.example.drinkmenu _drinkmenu = null;
public b4a.example.drinkextras _drinkextras = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
public String  _initialize(b4a.example.coffeetheme __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
__c.File.Copy(__c.File.getDirAssets(),"customerthemes.sqlite",__c.File.getDirInternal(),"customerthemes.sqlite");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="If SQL1.IsInitialized=False Then";
if (__ref._sql1.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
__ref._sql1.Initialize(__c.File.getDirInternal(),"customerthemes.sqlite",__c.False);
 };
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _drinkextras(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub DrinkExtras As Cursor";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Description , C";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT ID, Description , Cost FROM CoffeeExtras")));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _extraselect(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub ExtraSelect As Cursor";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Description FROM Co";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Description FROM CoffeeExtras")));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadbtncolours(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub loadBtnColours As Cursor";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BtnRed, BtnBlue, Bt";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT BtnRed, BtnBlue, BtnGreen FROM themes")));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcoffeemenu(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub loadCoffeeMenu As Cursor";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Name, Descripti";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT ID, Name, Description, Cost FROM CoffeeMenu")));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcolours(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub loadColours As Cursor";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BG1Red, BG1Blue, BG";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcompanydetails(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub loadCompanyDetails As Cursor 'load company inf";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name, Address1 , A";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Name, Address1 , Address2 , Suburb , City , PhoneCode , PhoneNo FROM CompanyDetails")));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcompanyname(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub loadCompanyName As Cursor";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name FROM CompanyDe";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Name FROM CompanyDetails")));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadlogo(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub loadLogo As Cursor";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Logo FROM themes\")";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Logo FROM themes")));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadstampicon(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub loadStampIcon As Cursor";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT StampIcon FROM them";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT StampIcon FROM themes")));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _selectdrink(b4a.example.coffeetheme __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="coffeetheme";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub SelectDrink As Cursor";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name FROM CoffeeMen";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Name FROM CoffeeMenu")));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="End Sub";
return null;
}
}