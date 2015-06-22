package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class address extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.address");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.address",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _mycolors = null;
public b4a.example.coffeetheme _mydata = null;
public b4a.example.main _main = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"cursor1",_cursor1,"Main",Debug.moduleToString(b4a.example.main.class),"MapLocator",Debug.moduleToString(b4a.example.maplocator.class),"myColors",_mycolors,"myData",_mydata,"SQL1",_sql1,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private SQL1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 4;BA.debugLine="Private cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim myColors As Cursor";
_mycolors = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim myData As CoffeeTheme";
_mydata = new b4a.example.coffeetheme();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (address) ","address",5,ba,this,10);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="myData.Initialize";
Debug.ShouldStop(2048);
_mydata._initialize(ba);
 BA.debugLineNum = 16;BA.debugLine="File.Copy(File.DirAssets, \"customerthemes.sqlite\"";
Debug.ShouldStop(32768);
__c.File.Copy(__c.File.getDirAssets(),"customerthemes.sqlite",__c.File.getDirInternal(),"customerthemes.sqlite");
 BA.debugLineNum = 20;BA.debugLine="If SQL1.IsInitialized=False Then";
Debug.ShouldStop(524288);
if (_sql1.IsInitialized()==__c.False) { 
 BA.debugLineNum = 21;BA.debugLine="SQL1.Initialize(File.DirInternal, \"customerthemes";
Debug.ShouldStop(1048576);
Debug.DebugWarningEngine.CheckInitialize(_sql1);_sql1.Initialize(__c.File.getDirInternal(),"customerthemes.sqlite",__c.False);
 };
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.drawable.GradientDrawable  _loadbgcolours() throws Exception{
try {
		Debug.PushSubsStack("LoadBGColours (address) ","address",5,ba,this,35);
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _bggradient = null;
int[] _colours = null;
 BA.debugLineNum = 35;BA.debugLine="Sub LoadBGColours() As GradientDrawable";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="myColors = myData.loadColours";
Debug.ShouldStop(8);
_mycolors = _mydata._loadcolours();
 BA.debugLineNum = 37;BA.debugLine="For i = 0 To myColors.RowCount - 1";
Debug.ShouldStop(16);
{
final int step19 = 1;
final int limit19 = (int) (_mycolors.getRowCount()-1);
for (_i = (int) (0); (step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19); _i = ((int)(0 + _i + step19))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(32);
_mycolors.setPosition(_i);
 BA.debugLineNum = 39;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(64);
_bggradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 40;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(128);
_colours = new int[(int) (2)];
;Debug.locals.put("colours", _colours);
 BA.debugLineNum = 41;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(256);
_colours[(int) (0)] = __c.Colors.RGB(_mycolors.GetInt("BG1Red"),_mycolors.GetInt("BG1Blue"),_mycolors.GetInt("BG1Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 42;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(512);
_colours[(int) (1)] = __c.Colors.RGB(_mycolors.GetInt("BG2Red"),_mycolors.GetInt("BG2Blue"),_mycolors.GetInt("BG2Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 43;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(1024);
_bggradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),_colours);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 45;BA.debugLine="Return bgGradient";
Debug.ShouldStop(4096);
if (true) return _bggradient;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("loadCompanyDetails (address) ","address",5,ba,this,25);
 BA.debugLineNum = 25;BA.debugLine="Sub loadCompanyDetails As Cursor";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="cursor1=SQL1.ExecQuery(\"SELECT Name, Address1 , A";
Debug.ShouldStop(33554432);
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT Name, Address1 , Address2 , Suburb , City , PhoneCode , PhoneNo FROM CompanyDetails")));
 BA.debugLineNum = 27;BA.debugLine="Return cursor1";
Debug.ShouldStop(67108864);
if (true) return _cursor1;
 BA.debugLineNum = 28;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
