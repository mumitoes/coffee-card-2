package b4a.CoffeeCard;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class databasemanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.CoffeeCard.databasemanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.CoffeeCard.databasemanager",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public b4a.CoffeeCard.main _main = null;
public b4a.CoffeeCard.drinkextras _drinkextras = null;
public b4a.CoffeeCard.drinkmenu _drinkmenu = null;
public b4a.CoffeeCard.storepurchase _storepurchase = null;
public b4a.CoffeeCard.maplocator _maplocator = null;
public b4a.CoffeeCard.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"cursor1",_cursor1,"DrinkExtras",Debug.moduleToString(b4a.CoffeeCard.drinkextras.class),"DrinkMenu",Debug.moduleToString(b4a.CoffeeCard.drinkmenu.class),"Main",Debug.moduleToString(b4a.CoffeeCard.main.class),"MapLocator",Debug.moduleToString(b4a.CoffeeCard.maplocator.class),"SQL1",_sql1,"StorePurchase",Debug.moduleToString(b4a.CoffeeCard.storepurchase.class),"ThemeCalc",Debug.moduleToString(b4a.CoffeeCard.themecalc.class)};
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
		Debug.PushSubsStack("Initialize (databasemanager) ","databasemanager",2,ba,this,12);
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
		Debug.PushSubsStack("loadBtnColours (databasemanager) ","databasemanager",2,ba,this,42);
 BA.debugLineNum = 42;BA.debugLine="Sub loadBtnColours As Cursor";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BtnRed, BtnBlue, Bt";
Debug.ShouldStop(1024);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT BtnRed, BtnBlue, BtnGreen FROM themes")));
 BA.debugLineNum = 44;BA.debugLine="Return cursor1";
Debug.ShouldStop(2048);
if (true) return _cursor1;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcoffeemenu() throws Exception{
try {
		Debug.PushSubsStack("loadCoffeeMenu (databasemanager) ","databasemanager",2,ba,this,52);
 BA.debugLineNum = 52;BA.debugLine="Sub loadCoffeeMenu As Cursor";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, CoffeeName, Des";
Debug.ShouldStop(1048576);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT ID, CoffeeName, Description, Cost FROM CoffeeMenu")));
 BA.debugLineNum = 54;BA.debugLine="Return cursor1";
Debug.ShouldStop(2097152);
if (true) return _cursor1;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("loadColours (databasemanager) ","databasemanager",2,ba,this,26);
 BA.debugLineNum = 26;BA.debugLine="Sub loadColours As Cursor";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT BG1Red, BG1Blue, BG";
Debug.ShouldStop(67108864);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")));
 BA.debugLineNum = 28;BA.debugLine="Return cursor1";
Debug.ShouldStop(134217728);
if (true) return _cursor1;
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadcompanydetails() throws Exception{
try {
		Debug.PushSubsStack("loadCompanyDetails (databasemanager) ","databasemanager",2,ba,this,47);
 BA.debugLineNum = 47;BA.debugLine="Sub loadCompanyDetails As Cursor 'load company inf";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT CompanyName, Addre";
Debug.ShouldStop(32768);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT CompanyName, Address1 , Address2 , Suburb , City , PhoneCode , PhoneNo FROM CompanyDetails")));
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
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loaddrinkextras() throws Exception{
try {
		Debug.PushSubsStack("LoadDrinkExtras (databasemanager) ","databasemanager",2,ba,this,62);
 BA.debugLineNum = 62;BA.debugLine="Sub LoadDrinkExtras As Cursor";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Description , C";
Debug.ShouldStop(1073741824);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT ID, Description , Cost FROM CoffeeExtras")));
 BA.debugLineNum = 64;BA.debugLine="Return cursor1";
Debug.ShouldStop(-2147483648);
if (true) return _cursor1;
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _loadextraselect() throws Exception{
try {
		Debug.PushSubsStack("LoadExtraSelect (databasemanager) ","databasemanager",2,ba,this,67);
 BA.debugLineNum = 67;BA.debugLine="Sub LoadExtraSelect As Cursor";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Description FROM Co";
Debug.ShouldStop(8);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT Description FROM CoffeeExtras")));
 BA.debugLineNum = 69;BA.debugLine="Return cursor1";
Debug.ShouldStop(16);
if (true) return _cursor1;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("loadLogo (databasemanager) ","databasemanager",2,ba,this,31);
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
		Debug.PushSubsStack("loadStampIcon (databasemanager) ","databasemanager",2,ba,this,36);
 BA.debugLineNum = 36;BA.debugLine="Sub loadStampIcon As Cursor";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT StampIcon FROM them";
Debug.ShouldStop(16);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT StampIcon FROM themes")));
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
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _selectdrink() throws Exception{
try {
		Debug.PushSubsStack("SelectDrink (databasemanager) ","databasemanager",2,ba,this,57);
 BA.debugLineNum = 57;BA.debugLine="Sub SelectDrink As Cursor";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT CoffeeName FROM Cof";
Debug.ShouldStop(33554432);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT CoffeeName FROM CoffeeMenu")));
 BA.debugLineNum = 59;BA.debugLine="Return cursor1";
Debug.ShouldStop(67108864);
if (true) return _cursor1;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _selectdrinkvalue() throws Exception{
try {
		Debug.PushSubsStack("SelectDrinkValue (databasemanager) ","databasemanager",2,ba,this,72);
 BA.debugLineNum = 72;BA.debugLine="Sub SelectDrinkValue As Cursor";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, CoffeeName, Cos";
Debug.ShouldStop(256);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT ID, CoffeeName, Cost, picture FROM CoffeeMenu WHERE CoffeeName= '"+_drinkmenu._selecteddrink+"'")));
 BA.debugLineNum = 75;BA.debugLine="Return cursor1";
Debug.ShouldStop(1024);
if (true) return _cursor1;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _selectextrasvalue() throws Exception{
try {
		Debug.PushSubsStack("SelectExtrasValue (databasemanager) ","databasemanager",2,ba,this,78);
 BA.debugLineNum = 78;BA.debugLine="Sub SelectExtrasValue As Cursor";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT ID, Description, Co";
Debug.ShouldStop(16384);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT ID, Description, Cost FROM CoffeeExtras WHERE Description= '"+_drinkextras._selectedextras+"'")));
 BA.debugLineNum = 80;BA.debugLine="Return cursor1";
Debug.ShouldStop(32768);
if (true) return _cursor1;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _updateorderdatabase() throws Exception{
try {
		Debug.PushSubsStack("UpdateOrderDatabase (databasemanager) ","databasemanager",2,ba,this,95);
 BA.debugLineNum = 95;BA.debugLine="Sub UpdateOrderDatabase As Cursor";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="cursor1=SQL1.ExecQuery(\"INSERT INTO CoffeePurchase";
Debug.ShouldStop(1);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("INSERT INTO CoffeePurchases (CustomerID,Picture,Description,Qty,Cost,PickUpTime,CompFKID)"+"VALUES (@CustomerID,@picture,@name,@desc,@Qty@,@Cost,@PickUp,@CompFKID")));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
