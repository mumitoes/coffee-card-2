package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class address_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Dim myColors, myLogo, myContactDeets, myAddress,";
address._mycolors = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_mycolors",address._mycolors);
address._mylogo = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_mylogo",address._mylogo);
address._mycontactdeets = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_mycontactdeets",address._mycontactdeets);
address._myaddress = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_myaddress",address._myaddress);
address._mybuttoncolours = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_mybuttoncolours",address._mybuttoncolours);
address._mystamp = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_mystamp",address._mystamp);
 //BA.debugLineNum = 5;BA.debugLine="Dim myData As CoffeeTheme";
address._mydata = RemoteObject.createNew ("b4a.example.coffeetheme");__ref.setField("_mydata",address._mydata);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (address) ","address",6,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "address","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="myData.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadaddress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadAddress (address) ","address",6,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("loadaddress")) return __ref.runUserSub(false, "address","loadaddress", __ref);
RemoteObject _address = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _address2 = RemoteObject.createImmutable("");
 BA.debugLineNum = 48;BA.debugLine="Sub loadAddress() As String 'method to assign addr";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="myAddress = myData.loadCompanyDetails";
Debug.ShouldStop(65536);
__ref.setField ("_myaddress",__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_loadcompanydetails"));
 BA.debugLineNum = 50;BA.debugLine="Dim address As String";
Debug.ShouldStop(131072);
_address = RemoteObject.createImmutable("");Debug.locals.put("address", _address);
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To myAddress.RowCount - 1";
Debug.ShouldStop(262144);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_myaddress").runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="myAddress.Position = i";
Debug.ShouldStop(524288);
__ref.getField(false,"_myaddress").runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 53;BA.debugLine="Dim address2 As String";
Debug.ShouldStop(1048576);
_address2 = RemoteObject.createImmutable("");Debug.locals.put("address2", _address2);
 BA.debugLineNum = 54;BA.debugLine="address2 = myAddress.GetString(\"Address2\")";
Debug.ShouldStop(2097152);
_address2 = __ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Address2")));Debug.locals.put("address2", _address2);
 BA.debugLineNum = 55;BA.debugLine="If address2 <> Null Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_address2)) { 
 BA.debugLineNum = 56;BA.debugLine="address = myAddress.Getstring(\"Address1\") & CRLF";
Debug.ShouldStop(8388608);
_address = RemoteObject.concat(__ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Address1"))),address.__c.getField(true,"CRLF"),__ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Address2"))),RemoteObject.createImmutable(", "),__ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Suburb"))),address.__c.getField(true,"CRLF"),__ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("City"))));Debug.locals.put("address", _address);
 }else {
 BA.debugLineNum = 58;BA.debugLine="address = myAddress.Getstring(\"Address1\") & CRLF";
Debug.ShouldStop(33554432);
_address = RemoteObject.concat(__ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Address1"))),address.__c.getField(true,"CRLF"),__ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Suburb"))),address.__c.getField(true,"CRLF"),__ref.getField(false,"_myaddress").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("City"))));Debug.locals.put("address", _address);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 61;BA.debugLine="Return address";
Debug.ShouldStop(268435456);
if (true) return _address;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadbgcolours(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadBGColours (address) ","address",6,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("loadbgcolours")) return __ref.runUserSub(false, "address","loadbgcolours", __ref);
RemoteObject _bggradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
int _i = 0;
RemoteObject _colours = null;
 BA.debugLineNum = 14;BA.debugLine="Sub LoadBGColours() As GradientDrawable";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="myColors = myData.loadColours";
Debug.ShouldStop(16384);
__ref.setField ("_mycolors",__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_loadcolours"));
 BA.debugLineNum = 16;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(32768);
_bggradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 17;BA.debugLine="For i = 0 To myColors.RowCount - 1";
Debug.ShouldStop(65536);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolors").runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10); _i = ((int)(0 + _i + step10))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 18;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(131072);
__ref.getField(false,"_mycolors").runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 19;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(262144);
_colours = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colours", _colours);
 BA.debugLineNum = 20;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(524288);
_colours.setArrayElement (address.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(__ref.getField(false,"_mycolors").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Red")))),(Object)(__ref.getField(false,"_mycolors").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Blue")))),(Object)(__ref.getField(false,"_mycolors").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Green"))))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 21;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(1048576);
_colours.setArrayElement (address.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(__ref.getField(false,"_mycolors").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Red")))),(Object)(__ref.getField(false,"_mycolors").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Blue")))),(Object)(__ref.getField(false,"_mycolors").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Green"))))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 22;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(2097152);
_bggradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(_colours));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 24;BA.debugLine="Return bgGradient";
Debug.ShouldStop(8388608);
if (true) return _bggradient;
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddbbuttoncolours(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadDBbuttonColours (address) ","address",6,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("loaddbbuttoncolours")) return __ref.runUserSub(false, "address","loaddbbuttoncolours", __ref);
RemoteObject _btnrbg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _colours = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 74;BA.debugLine="Sub loadDBbuttonColours() As ColorDrawable ' metho";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="myButtonColours = myData.loadBtnColours";
Debug.ShouldStop(1024);
__ref.setField ("_mybuttoncolours",__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_loadbtncolours"));
 BA.debugLineNum = 76;BA.debugLine="Dim btnRBG As ColorDrawable";
Debug.ShouldStop(2048);
_btnrbg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("btnRBG", _btnrbg);
 BA.debugLineNum = 77;BA.debugLine="Dim colours As Int";
Debug.ShouldStop(4096);
_colours = RemoteObject.createImmutable(0);Debug.locals.put("colours", _colours);
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
Debug.ShouldStop(8192);
{
final int step65 = 1;
final int limit65 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mybuttoncolours").runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step65 > 0 && _i <= limit65) || (step65 < 0 && _i >= limit65); _i = ((int)(0 + _i + step65))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="myButtonColours.Position = i";
Debug.ShouldStop(16384);
__ref.getField(false,"_mybuttoncolours").runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 80;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
Debug.ShouldStop(32768);
_colours = address.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(__ref.getField(false,"_mybuttoncolours").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BtnRed")))),(Object)(__ref.getField(false,"_mybuttoncolours").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BtnBlue")))),(Object)(__ref.getField(false,"_mybuttoncolours").runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BtnGreen")))));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 81;BA.debugLine="btnRBG.Initialize(colours, 10)";
Debug.ShouldStop(65536);
_btnrbg.runVoidMethod ("Initialize",(Object)(_colours),(Object)(BA.numberCast(int.class, 10)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 83;BA.debugLine="Return btnRBG";
Debug.ShouldStop(262144);
if (true) return _btnrbg;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddblogo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadDBlogo (address) ","address",6,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("loaddblogo")) return __ref.runUserSub(false, "address","loaddblogo", __ref);
RemoteObject _logo = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
 BA.debugLineNum = 64;BA.debugLine="Sub loadDBlogo() As Bitmap 'Assign Logo as string";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="myLogo=myData.loadLogo";
Debug.ShouldStop(1);
__ref.setField ("_mylogo",__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_loadlogo"));
 BA.debugLineNum = 66;BA.debugLine="Dim logo As Bitmap";
Debug.ShouldStop(2);
_logo = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("logo", _logo);
 BA.debugLineNum = 67;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
Debug.ShouldStop(4);
{
final int step55 = 1;
final int limit55 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mylogo").runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55); _i = ((int)(0 + _i + step55))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 68;BA.debugLine="myLogo.Position=i";
Debug.ShouldStop(8);
__ref.getField(false,"_mylogo").runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 69;BA.debugLine="logo.Initialize(File.DirAssets, myLogo.GetString";
Debug.ShouldStop(16);
_logo.runVoidMethod ("Initialize",(Object)(address.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(false,"_mylogo").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Logo")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 71;BA.debugLine="Return logo";
Debug.ShouldStop(64);
if (true) return _logo;
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadName (address) ","address",6,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("loadname")) return __ref.runUserSub(false, "address","loadname", __ref);
RemoteObject _name = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 37;BA.debugLine="Sub loadName() As String ' method to assign compan";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
Debug.ShouldStop(32);
__ref.setField ("_mycontactdeets",__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_loadcompanydetails"));
 BA.debugLineNum = 39;BA.debugLine="Dim name As String";
Debug.ShouldStop(64);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
 BA.debugLineNum = 40;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
Debug.ShouldStop(128);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycontactdeets").runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 41;BA.debugLine="myContactDeets.Position=i";
Debug.ShouldStop(256);
__ref.getField(false,"_mycontactdeets").runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 42;BA.debugLine="name  = myContactDeets.GetString(\"Name\")";
Debug.ShouldStop(512);
_name = __ref.getField(false,"_mycontactdeets").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Name")));Debug.locals.put("name", _name);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 44;BA.debugLine="Return name";
Debug.ShouldStop(2048);
if (true) return _name;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadphone(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadPhone (address) ","address",6,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("loadphone")) return __ref.runUserSub(false, "address","loadphone", __ref);
RemoteObject _phone = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 27;BA.debugLine="Sub loadPhone() As String ' method to assign Phone";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
Debug.ShouldStop(134217728);
__ref.setField ("_mycontactdeets",__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_loadcompanydetails"));
 BA.debugLineNum = 29;BA.debugLine="Dim phone As String";
Debug.ShouldStop(268435456);
_phone = RemoteObject.createImmutable("");Debug.locals.put("phone", _phone);
 BA.debugLineNum = 30;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
Debug.ShouldStop(536870912);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycontactdeets").runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22); _i = ((int)(0 + _i + step22))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 31;BA.debugLine="myContactDeets.Position=i";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mycontactdeets").runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 32;BA.debugLine="phone  = myContactDeets.GetString(\"PhoneCode\") &";
Debug.ShouldStop(-2147483648);
_phone = RemoteObject.concat(__ref.getField(false,"_mycontactdeets").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("PhoneCode"))),RemoteObject.createImmutable(" "),__ref.getField(false,"_mycontactdeets").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("PhoneNo"))));Debug.locals.put("phone", _phone);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 34;BA.debugLine="Return phone";
Debug.ShouldStop(2);
if (true) return _phone;
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadstamp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadStamp (address) ","address",6,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("loadstamp")) return __ref.runUserSub(false, "address","loadstamp", __ref);
int _i = 0;
RemoteObject _stamp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 86;BA.debugLine="Sub loadStamp() As Bitmap ' method to assign stamp";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="myStamp=myData.loadStampIcon";
Debug.ShouldStop(4194304);
__ref.setField ("_mystamp",__ref.getField(false,"_mydata").runClassMethod (b4a.example.coffeetheme.class, "_loadstampicon"));
 BA.debugLineNum = 88;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
Debug.ShouldStop(8388608);
{
final int step74 = 1;
final int limit74 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mystamp").runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step74 > 0 && _i <= limit74) || (step74 < 0 && _i >= limit74); _i = ((int)(0 + _i + step74))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 89;BA.debugLine="myStamp.Position=i";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mystamp").runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 90;BA.debugLine="Dim stamp As Bitmap";
Debug.ShouldStop(33554432);
_stamp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 91;BA.debugLine="stamp.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(67108864);
_stamp.runVoidMethod ("Initialize",(Object)(address.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(false,"_mylogo").runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("StampIcon")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 93;BA.debugLine="Return stamp";
Debug.ShouldStop(268435456);
if (true) return _stamp;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}