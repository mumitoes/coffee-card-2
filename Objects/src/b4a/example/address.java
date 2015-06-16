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
public anywheresoftware.b4a.sql.SQL.CursorWrapper _mycolors = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _mylogo = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _mycontactdeets = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _myaddress = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _mybuttoncolours = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _mystamp = null;
public b4a.example.coffeetheme _mydata = null;
public b4a.example.main _main = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(b4a.example.main.class),"MapLocator",Debug.moduleToString(b4a.example.maplocator.class),"myAddress",_myaddress,"myButtonColours",_mybuttoncolours,"myColors",_mycolors,"myContactDeets",_mycontactdeets,"myData",_mydata,"myLogo",_mylogo,"myStamp",_mystamp,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim myColors, myLogo, myContactDeets, myAddress,";
_mycolors = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_mylogo = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_mycontactdeets = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_myaddress = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_mybuttoncolours = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_mystamp = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim myData As CoffeeTheme";
_mydata = new b4a.example.coffeetheme();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (address) ","address",5,ba,this,8);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="myData.Initialize";
Debug.ShouldStop(256);
_mydata._initialize(ba);
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
public String  _loadaddress() throws Exception{
try {
		Debug.PushSubsStack("loadAddress (address) ","address",5,ba,this,47);
String _address = "";
int _i = 0;
String _address2 = "";
 BA.debugLineNum = 47;BA.debugLine="Sub loadAddress() As String 'method to assign addr";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="myAddress = myData.loadCompanyDetails";
Debug.ShouldStop(32768);
_myaddress = _mydata._loadcompanydetails();
 BA.debugLineNum = 49;BA.debugLine="Dim address As String";
Debug.ShouldStop(65536);
_address = "";Debug.locals.put("address", _address);
 BA.debugLineNum = 50;BA.debugLine="For i = 0 To myAddress.RowCount - 1";
Debug.ShouldStop(131072);
{
final int step40 = 1;
final int limit40 = (int) (_myaddress.getRowCount()-1);
for (_i = (int) (0); (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 51;BA.debugLine="myAddress.Position = i";
Debug.ShouldStop(262144);
_myaddress.setPosition(_i);
 BA.debugLineNum = 52;BA.debugLine="Dim address2 As String";
Debug.ShouldStop(524288);
_address2 = "";Debug.locals.put("address2", _address2);
 BA.debugLineNum = 53;BA.debugLine="address2 = myAddress.GetString(\"Address2\")";
Debug.ShouldStop(1048576);
_address2 = _myaddress.GetString("Address2");Debug.locals.put("address2", _address2);
 BA.debugLineNum = 54;BA.debugLine="If address2 <> Null Then";
Debug.ShouldStop(2097152);
if (_address2!= null) { 
 BA.debugLineNum = 55;BA.debugLine="address = myAddress.Getstring(\"Address1\") & CRLF";
Debug.ShouldStop(4194304);
_address = _myaddress.GetString("Address1")+__c.CRLF+_myaddress.GetString("Address2")+", "+_myaddress.GetString("Suburb")+__c.CRLF+_myaddress.GetString("City");Debug.locals.put("address", _address);
 }else {
 BA.debugLineNum = 57;BA.debugLine="address = myAddress.Getstring(\"Address1\") & CRLF";
Debug.ShouldStop(16777216);
_address = _myaddress.GetString("Address1")+__c.CRLF+_myaddress.GetString("Suburb")+__c.CRLF+_myaddress.GetString("City");Debug.locals.put("address", _address);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 60;BA.debugLine="Return address";
Debug.ShouldStop(134217728);
if (true) return _address;
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("LoadBGColours (address) ","address",5,ba,this,13);
anywheresoftware.b4a.objects.drawable.GradientDrawable _bggradient = null;
int _i = 0;
int[] _colours = null;
 BA.debugLineNum = 13;BA.debugLine="Sub LoadBGColours() As GradientDrawable";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="myColors = myData.loadColours";
Debug.ShouldStop(8192);
_mycolors = _mydata._loadcolours();
 BA.debugLineNum = 15;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(16384);
_bggradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 16;BA.debugLine="For i = 0 To myColors.RowCount - 1";
Debug.ShouldStop(32768);
{
final int step10 = 1;
final int limit10 = (int) (_mycolors.getRowCount()-1);
for (_i = (int) (0); (step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10); _i = ((int)(0 + _i + step10))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 17;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(65536);
_mycolors.setPosition(_i);
 BA.debugLineNum = 18;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(131072);
_colours = new int[(int) (2)];
;Debug.locals.put("colours", _colours);
 BA.debugLineNum = 19;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(262144);
_colours[(int) (0)] = __c.Colors.RGB(_mycolors.GetInt("BG1Red"),_mycolors.GetInt("BG1Blue"),_mycolors.GetInt("BG1Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 20;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(524288);
_colours[(int) (1)] = __c.Colors.RGB(_mycolors.GetInt("BG2Red"),_mycolors.GetInt("BG2Blue"),_mycolors.GetInt("BG2Green"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 21;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(1048576);
_bggradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),_colours);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 23;BA.debugLine="Return bgGradient";
Debug.ShouldStop(4194304);
if (true) return _bggradient;
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.drawable.ColorDrawable  _loaddbbuttoncolours() throws Exception{
try {
		Debug.PushSubsStack("loadDBbuttonColours (address) ","address",5,ba,this,73);
anywheresoftware.b4a.objects.drawable.ColorDrawable _btnrbg = null;
int _colours = 0;
int _i = 0;
 BA.debugLineNum = 73;BA.debugLine="Sub loadDBbuttonColours() As ColorDrawable ' metho";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="myButtonColours = myData.loadBtnColours";
Debug.ShouldStop(512);
_mybuttoncolours = _mydata._loadbtncolours();
 BA.debugLineNum = 75;BA.debugLine="Dim btnRBG As ColorDrawable";
Debug.ShouldStop(1024);
_btnrbg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("btnRBG", _btnrbg);
 BA.debugLineNum = 76;BA.debugLine="Dim colours As Int";
Debug.ShouldStop(2048);
_colours = 0;Debug.locals.put("colours", _colours);
 BA.debugLineNum = 77;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
Debug.ShouldStop(4096);
{
final int step65 = 1;
final int limit65 = (int) (_mybuttoncolours.getRowCount()-1);
for (_i = (int) (0); (step65 > 0 && _i <= limit65) || (step65 < 0 && _i >= limit65); _i = ((int)(0 + _i + step65))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 78;BA.debugLine="myButtonColours.Position = i";
Debug.ShouldStop(8192);
_mybuttoncolours.setPosition(_i);
 BA.debugLineNum = 79;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
Debug.ShouldStop(16384);
_colours = __c.Colors.RGB(_mybuttoncolours.GetInt("BtnRed"),_mybuttoncolours.GetInt("BtnBlue"),_mybuttoncolours.GetInt("BtnGreen"));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 80;BA.debugLine="btnRBG.Initialize(colours, 10)";
Debug.ShouldStop(32768);
_btnrbg.Initialize(_colours,(int) (10));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 82;BA.debugLine="Return btnRBG";
Debug.ShouldStop(131072);
if (true) return _btnrbg;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loaddblogo() throws Exception{
try {
		Debug.PushSubsStack("loadDBlogo (address) ","address",5,ba,this,63);
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _logo = null;
int _i = 0;
 BA.debugLineNum = 63;BA.debugLine="Sub loadDBlogo() As Bitmap 'Assign Logo as string";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="myLogo=myData.loadLogo";
Debug.ShouldStop(-2147483648);
_mylogo = _mydata._loadlogo();
 BA.debugLineNum = 65;BA.debugLine="Dim logo As Bitmap";
Debug.ShouldStop(1);
_logo = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();Debug.locals.put("logo", _logo);
 BA.debugLineNum = 66;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
Debug.ShouldStop(2);
{
final int step55 = 1;
final int limit55 = (int) (_mylogo.getRowCount()-1);
for (_i = (int) (0); (step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55); _i = ((int)(0 + _i + step55))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="myLogo.Position=i";
Debug.ShouldStop(4);
_mylogo.setPosition(_i);
 BA.debugLineNum = 68;BA.debugLine="logo.Initialize(File.DirAssets, myLogo.GetString";
Debug.ShouldStop(8);
_logo.Initialize(__c.File.getDirAssets(),_mylogo.GetString("Logo"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="Return logo";
Debug.ShouldStop(32);
if (true) return _logo;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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
public String  _loadname() throws Exception{
try {
		Debug.PushSubsStack("loadName (address) ","address",5,ba,this,36);
String _name = "";
int _i = 0;
 BA.debugLineNum = 36;BA.debugLine="Sub loadName() As String ' method to assign compan";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
Debug.ShouldStop(16);
_mycontactdeets = _mydata._loadcompanydetails();
 BA.debugLineNum = 38;BA.debugLine="Dim name As String";
Debug.ShouldStop(32);
_name = "";Debug.locals.put("name", _name);
 BA.debugLineNum = 39;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
Debug.ShouldStop(64);
{
final int step31 = 1;
final int limit31 = (int) (_mycontactdeets.getRowCount()-1);
for (_i = (int) (0); (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 40;BA.debugLine="myContactDeets.Position=i";
Debug.ShouldStop(128);
_mycontactdeets.setPosition(_i);
 BA.debugLineNum = 41;BA.debugLine="name  = myContactDeets.GetString(\"Name\")";
Debug.ShouldStop(256);
_name = _mycontactdeets.GetString("Name");Debug.locals.put("name", _name);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 43;BA.debugLine="Return name";
Debug.ShouldStop(1024);
if (true) return _name;
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _loadphone() throws Exception{
try {
		Debug.PushSubsStack("loadPhone (address) ","address",5,ba,this,26);
String _phone = "";
int _i = 0;
 BA.debugLineNum = 26;BA.debugLine="Sub loadPhone() As String ' method to assign Phone";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
Debug.ShouldStop(67108864);
_mycontactdeets = _mydata._loadcompanydetails();
 BA.debugLineNum = 28;BA.debugLine="Dim phone As String";
Debug.ShouldStop(134217728);
_phone = "";Debug.locals.put("phone", _phone);
 BA.debugLineNum = 29;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
Debug.ShouldStop(268435456);
{
final int step22 = 1;
final int limit22 = (int) (_mycontactdeets.getRowCount()-1);
for (_i = (int) (0); (step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22); _i = ((int)(0 + _i + step22))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 30;BA.debugLine="myContactDeets.Position=i";
Debug.ShouldStop(536870912);
_mycontactdeets.setPosition(_i);
 BA.debugLineNum = 31;BA.debugLine="phone  = myContactDeets.GetString(\"PhoneCode\") &";
Debug.ShouldStop(1073741824);
_phone = _mycontactdeets.GetString("PhoneCode")+" "+_mycontactdeets.GetString("PhoneNo");Debug.locals.put("phone", _phone);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 33;BA.debugLine="Return phone";
Debug.ShouldStop(1);
if (true) return _phone;
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loadstamp() throws Exception{
try {
		Debug.PushSubsStack("loadStamp (address) ","address",5,ba,this,85);
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _stamp = null;
 BA.debugLineNum = 85;BA.debugLine="Sub loadStamp() As Bitmap ' method to assign stamp";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="myStamp=myData.loadStampIcon";
Debug.ShouldStop(2097152);
_mystamp = _mydata._loadstampicon();
 BA.debugLineNum = 87;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
Debug.ShouldStop(4194304);
{
final int step74 = 1;
final int limit74 = (int) (_mystamp.getRowCount()-1);
for (_i = (int) (0); (step74 > 0 && _i <= limit74) || (step74 < 0 && _i >= limit74); _i = ((int)(0 + _i + step74))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 88;BA.debugLine="myStamp.Position=i";
Debug.ShouldStop(8388608);
_mystamp.setPosition(_i);
 BA.debugLineNum = 89;BA.debugLine="Dim stamp As Bitmap";
Debug.ShouldStop(16777216);
_stamp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 90;BA.debugLine="stamp.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(33554432);
_stamp.Initialize(__c.File.getDirAssets(),_mylogo.GetString("StampIcon"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 92;BA.debugLine="Return stamp";
Debug.ShouldStop(134217728);
if (true) return _stamp;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
