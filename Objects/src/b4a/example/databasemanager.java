package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class databasemanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.databasemanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.databasemanager",
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
public String  _initialize(b4a.example.databasemanager __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
__c.File.Copy(__c.File.getDirAssets(),"customerthemes.sqlite",__c.File.getDirInternal(),"customerthemes.sqlite");
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="If SQL1.IsInitialized=False Then";
if (__ref._sql1.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
__ref._sql1.Initialize(__c.File.getDirInternal(),"customerthemes.sqlite",__c.False);
 };
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcoffeemenu(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub loadCoffeeMenu As Cursor";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Name, Descripti";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT ID, Name, Description, Cost FROM CoffeeMenu")));
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _selectdrink(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub SelectDrink As Cursor";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name FROM CoffeeMen";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Name FROM CoffeeMenu")));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadextraselect(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub LoadExtraSelect As Cursor";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Description FROM Co";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Description FROM CoffeeExtras")));
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loaddrinkextras(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub LoadDrinkExtras As Cursor";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Description , C";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT ID, Description , Cost FROM CoffeeExtras")));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcolours(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub loadColours As Cursor";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BG1Red, BG1Blue, BG";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")));
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadbtncolours(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub loadBtnColours As Cursor";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BtnRed, BtnBlue, Bt";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT BtnRed, BtnBlue, BtnGreen FROM themes")));
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadlogo(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub loadLogo As Cursor";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Logo FROM themes\")";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Logo FROM themes")));
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcompanydetails(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub loadCompanyDetails As Cursor 'load company inf";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name, Address1 , A";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT Name, Address1 , Address2 , Suburb , City , PhoneCode , PhoneNo FROM CompanyDetails")));
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadstampicon(b4a.example.databasemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="databasemanager";
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub loadStampIcon As Cursor";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT StampIcon FROM them";
__ref._cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT StampIcon FROM themes")));
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Return cursor1";
if (true) return __ref._cursor1;
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="End Sub";
return null;
}
}