package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class address extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.address");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4a.example.drinkmenu _drinkmenu = null;
public b4a.example.drinkextras _drinkextras = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
public String  _initialize(b4a.example.address __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="address";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="myData.Initialize";
__ref._mydata._initialize(null,ba);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.GradientDrawable  _loadbgcolours(b4a.example.address __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="address";
anywheresoftware.b4a.objects.drawable.GradientDrawable _bggradient = null;
int _i = 0;
int[] _colours = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub LoadBGColours() As GradientDrawable";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="myColors = myData.loadColours";
__ref._mycolors = __ref._mydata._loadcolours(null);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim bgGradient As GradientDrawable";
_bggradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="For i = 0 To myColors.RowCount - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mycolors.getRowCount()-1);
for (_i = (int) (0); (step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10); _i = ((int)(0 + _i + step10))) {
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="myColors.Position = i";
__ref._mycolors.setPosition(_i);
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Dim colours(2) As Int";
_colours = new int[(int) (2)];
;
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
_colours[(int) (0)] = __c.Colors.RGB(__ref._mycolors.GetInt("BG1Red"),__ref._mycolors.GetInt("BG1Blue"),__ref._mycolors.GetInt("BG1Green"));
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
_colours[(int) (1)] = __c.Colors.RGB(__ref._mycolors.GetInt("BG2Red"),__ref._mycolors.GetInt("BG2Blue"),__ref._mycolors.GetInt("BG2Green"));
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
_bggradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),_colours);
 }
};
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="Return bgGradient";
if (true) return _bggradient;
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="End Sub";
return null;
}
public String  _loadname(b4a.example.address __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="address";
String _name = "";
int _i = 0;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub loadName() As String ' method to assign compan";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
__ref._mycontactdeets = __ref._mydata._loadcompanydetails(null);
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Dim name As String";
_name = "";
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
{
final int step31 = 1;
final int limit31 = (int) (__ref._mycontactdeets.getRowCount()-1);
for (_i = (int) (0); (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31))) {
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="myContactDeets.Position=i";
__ref._mycontactdeets.setPosition(_i);
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="name  = myContactDeets.GetString(\"Name\")";
_name = __ref._mycontactdeets.GetString("Name");
 }
};
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="Return name";
if (true) return _name;
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loaddblogo(b4a.example.address __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="address";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _logo = null;
int _i = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub loadDBlogo() As Bitmap 'Assign Logo as string";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="myLogo=myData.loadLogo";
__ref._mylogo = __ref._mydata._loadlogo(null);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim logo As Bitmap";
_logo = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mylogo.getRowCount()-1);
for (_i = (int) (0); (step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55); _i = ((int)(0 + _i + step55))) {
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="myLogo.Position=i";
__ref._mylogo.setPosition(_i);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="logo.Initialize(File.DirAssets, myLogo.GetString";
_logo.Initialize(__c.File.getDirAssets(),__ref._mylogo.GetString("Logo"));
 }
};
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Return logo";
if (true) return _logo;
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.ColorDrawable  _loaddbbuttoncolours(b4a.example.address __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="address";
anywheresoftware.b4a.objects.drawable.ColorDrawable _btnrbg = null;
int _colours = 0;
int _i = 0;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub loadDBbuttonColours() As ColorDrawable ' metho";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="myButtonColours = myData.loadBtnColours";
__ref._mybuttoncolours = __ref._mydata._loadbtncolours(null);
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim btnRBG As ColorDrawable";
_btnrbg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim colours As Int";
_colours = 0;
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
{
final int step65 = 1;
final int limit65 = (int) (__ref._mybuttoncolours.getRowCount()-1);
for (_i = (int) (0); (step65 > 0 && _i <= limit65) || (step65 < 0 && _i >= limit65); _i = ((int)(0 + _i + step65))) {
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="myButtonColours.Position = i";
__ref._mybuttoncolours.setPosition(_i);
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
_colours = __c.Colors.RGB(__ref._mybuttoncolours.GetInt("BtnRed"),__ref._mybuttoncolours.GetInt("BtnBlue"),__ref._mybuttoncolours.GetInt("BtnGreen"));
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="btnRBG.Initialize(colours, 10)";
_btnrbg.Initialize(_colours,(int) (10));
 }
};
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="Return btnRBG";
if (true) return _btnrbg;
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loadstamp(b4a.example.address __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="address";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _stamp = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub loadStamp() As Bitmap ' method to assign stamp";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="myStamp=myData.loadStampIcon";
__ref._mystamp = __ref._mydata._loadstampicon(null);
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
{
final int step74 = 1;
final int limit74 = (int) (__ref._mystamp.getRowCount()-1);
for (_i = (int) (0); (step74 > 0 && _i <= limit74) || (step74 < 0 && _i >= limit74); _i = ((int)(0 + _i + step74))) {
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="myStamp.Position=i";
__ref._mystamp.setPosition(_i);
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Dim stamp As Bitmap";
_stamp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="stamp.Initialize(File.DirAssets, myLogo.GetStrin";
_stamp.Initialize(__c.File.getDirAssets(),__ref._mylogo.GetString("StampIcon"));
 }
};
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="Return stamp";
if (true) return _stamp;
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="End Sub";
return null;
}
public String  _loadaddress(b4a.example.address __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="address";
String _address = "";
int _i = 0;
String _address2 = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub loadAddress() As String 'method to assign addr";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="myAddress = myData.loadCompanyDetails";
__ref._myaddress = __ref._mydata._loadcompanydetails(null);
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim address As String";
_address = "";
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="For i = 0 To myAddress.RowCount - 1";
{
final int step40 = 1;
final int limit40 = (int) (__ref._myaddress.getRowCount()-1);
for (_i = (int) (0); (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="myAddress.Position = i";
__ref._myaddress.setPosition(_i);
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Dim address2 As String";
_address2 = "";
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="address2 = myAddress.GetString(\"Address2\")";
_address2 = __ref._myaddress.GetString("Address2");
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="If address2 <> Null Then";
if (_address2!= null) { 
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="address = myAddress.Getstring(\"Address1\") & CRLF";
_address = __ref._myaddress.GetString("Address1")+__c.CRLF+__ref._myaddress.GetString("Address2")+", "+__ref._myaddress.GetString("Suburb")+__c.CRLF+__ref._myaddress.GetString("City");
 }else {
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="address = myAddress.Getstring(\"Address1\") & CRLF";
_address = __ref._myaddress.GetString("Address1")+__c.CRLF+__ref._myaddress.GetString("Suburb")+__c.CRLF+__ref._myaddress.GetString("City");
 };
 }
};
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Return address";
if (true) return _address;
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="End Sub";
return "";
}
public String  _loadphone(b4a.example.address __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="address";
String _phone = "";
int _i = 0;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub loadPhone() As String ' method to assign Phone";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
__ref._mycontactdeets = __ref._mydata._loadcompanydetails(null);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim phone As String";
_phone = "";
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mycontactdeets.getRowCount()-1);
for (_i = (int) (0); (step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22); _i = ((int)(0 + _i + step22))) {
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="myContactDeets.Position=i";
__ref._mycontactdeets.setPosition(_i);
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="phone  = myContactDeets.GetString(\"PhoneCode\") &";
_phone = __ref._mycontactdeets.GetString("PhoneCode")+" "+__ref._mycontactdeets.GetString("PhoneNo");
 }
};
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Return phone";
if (true) return _phone;
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="End Sub";
return "";
}
}