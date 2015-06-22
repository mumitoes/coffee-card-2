package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class thememanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.thememanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.thememanager",
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
public b4a.example.databasemanager _mydata = null;
public b4a.example.main _main = null;
public b4a.example.drinkmenu _drinkmenu = null;
public b4a.example.drinkextras _drinkextras = null;
public b4a.example.maplocator _maplocator = null;
public b4a.example.themecalc _themecalc = null;
public String  _initialize(b4a.example.thememanager __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="thememanager";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="myData.Initialize";
__ref._mydata._initialize(null,ba);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.GradientDrawable  _loadbgcolours(b4a.example.thememanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="thememanager";
anywheresoftware.b4a.objects.drawable.GradientDrawable _bggradient = null;
int _i = 0;
int[] _colours = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub LoadBGColours() As GradientDrawable";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="myColors = myData.loadColours";
__ref._mycolors = __ref._mydata._loadcolours(null);
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim bgGradient As GradientDrawable";
_bggradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="For i = 0 To myColors.RowCount - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mycolors.getRowCount()-1);
for (_i = (int) (0); (step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10); _i = ((int)(0 + _i + step10))) {
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="myColors.Position = i";
__ref._mycolors.setPosition(_i);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim colours(2) As Int";
_colours = new int[(int) (2)];
;
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
_colours[(int) (0)] = __c.Colors.RGB(__ref._mycolors.GetInt("BG1Red"),__ref._mycolors.GetInt("BG1Blue"),__ref._mycolors.GetInt("BG1Green"));
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
_colours[(int) (1)] = __c.Colors.RGB(__ref._mycolors.GetInt("BG2Red"),__ref._mycolors.GetInt("BG2Blue"),__ref._mycolors.GetInt("BG2Green"));
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
_bggradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),_colours);
 }
};
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="Return bgGradient";
if (true) return _bggradient;
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.ColorDrawable  _loaddbbuttoncolours(b4a.example.thememanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="thememanager";
anywheresoftware.b4a.objects.drawable.ColorDrawable _btnrbg = null;
int _colours = 0;
int _i = 0;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub loadDBbuttonColours() As ColorDrawable ' metho";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="myButtonColours = myData.loadBtnColours";
__ref._mybuttoncolours = __ref._mydata._loadbtncolours(null);
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Dim btnRBG As ColorDrawable";
_btnrbg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Dim colours As Int";
_colours = 0;
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mybuttoncolours.getRowCount()-1);
for (_i = (int) (0); (step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50); _i = ((int)(0 + _i + step50))) {
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="myButtonColours.Position = i";
__ref._mybuttoncolours.setPosition(_i);
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
_colours = __c.Colors.RGB(__ref._mybuttoncolours.GetInt("BtnRed"),__ref._mybuttoncolours.GetInt("BtnBlue"),__ref._mybuttoncolours.GetInt("BtnGreen"));
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="btnRBG.Initialize(colours, 10)";
_btnrbg.Initialize(_colours,(int) (10));
 }
};
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="Return btnRBG";
if (true) return _btnrbg;
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="End Sub";
return null;
}
public String  _loadphone(b4a.example.thememanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="thememanager";
String _phone = "";
int _i = 0;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub loadPhone() As String ' method to assign Phone";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
__ref._mycontactdeets = __ref._mydata._loadcompanydetails(null);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim phone As String";
_phone = "";
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mycontactdeets.getRowCount()-1);
for (_i = (int) (0); (step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22); _i = ((int)(0 + _i + step22))) {
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="myContactDeets.Position=i";
__ref._mycontactdeets.setPosition(_i);
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="phone  = myContactDeets.GetString(\"PhoneCode\") &";
_phone = __ref._mycontactdeets.GetString("PhoneCode")+" "+__ref._mycontactdeets.GetString("PhoneNo");
 }
};
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="Return phone";
if (true) return _phone;
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="End Sub";
return "";
}
public String  _loadname(b4a.example.thememanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="thememanager";
String _name = "";
int _i = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub loadName() As String ' method to assign compan";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="myContactDeets=myData.loadCompanyDetails";
__ref._mycontactdeets = __ref._mydata._loadcompanydetails(null);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim name As String";
_name = "";
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="For i = 0 To myContactDeets.RowCount - 1";
{
final int step31 = 1;
final int limit31 = (int) (__ref._mycontactdeets.getRowCount()-1);
for (_i = (int) (0); (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31))) {
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="myContactDeets.Position=i";
__ref._mycontactdeets.setPosition(_i);
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="name  = myContactDeets.GetString(\"Name\")";
_name = __ref._mycontactdeets.GetString("Name");
 }
};
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Return name";
if (true) return _name;
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loaddblogo(b4a.example.thememanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="thememanager";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _logo = null;
int _i = 0;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub loadDBlogo() As Bitmap 'Assign Logo as string";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="myLogo=myData.loadLogo";
__ref._mylogo = __ref._mydata._loadlogo(null);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Dim logo As Bitmap";
_logo = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
{
final int step40 = 1;
final int limit40 = (int) (__ref._mylogo.getRowCount()-1);
for (_i = (int) (0); (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="myLogo.Position=i";
__ref._mylogo.setPosition(_i);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="logo.Initialize(File.DirAssets, myLogo.GetString";
_logo.Initialize(__c.File.getDirAssets(),__ref._mylogo.GetString("Logo"));
 }
};
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Return logo";
if (true) return _logo;
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="End Sub";
return null;
}
public String  _loadmap(b4a.example.thememanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="thememanager";
String _address = "";
String _url = "";
int _i = 0;
String _address2 = "";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub loadMap() As String";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="myAddress = myData.loadCompanyDetails";
__ref._myaddress = __ref._mydata._loadcompanydetails(null);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim address As String";
_address = "";
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Dim url As String";
_url = "";
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="For i = 0 To myAddress.RowCount - 1";
{
final int step70 = 1;
final int limit70 = (int) (__ref._myaddress.getRowCount()-1);
for (_i = (int) (0); (step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70); _i = ((int)(0 + _i + step70))) {
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="myAddress.Position = i";
__ref._myaddress.setPosition(_i);
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Dim address2 As String";
_address2 = "";
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="address2 = myAddress.GetString(\"Address2\")";
_address2 = __ref._myaddress.GetString("Address2");
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="If address2 <> Null Then";
if (_address2!= null) { 
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="address = myAddress.Getstring(\"Address1\") & \"+";
_address = __ref._myaddress.GetString("Address1")+"+"+__ref._myaddress.GetString("Address2")+"+"+__ref._myaddress.GetString("Suburb")+"+"+__ref._myaddress.GetString("City");
 }else {
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="address = myAddress.Getstring(\"Address1\") & \"+";
_address = __ref._myaddress.GetString("Address1")+"+"+__ref._myaddress.GetString("Suburb")+"+"+__ref._myaddress.GetString("City");
 };
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="address = address.Replace(\" \", \"+\")";
_address = _address.replace(" ","+");
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="url = \"https://www.google.com/maps?q=\" & addres";
_url = "https://www.google.com/maps?q="+_address;
 }
};
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="Return url";
if (true) return _url;
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loadstamp(b4a.example.thememanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="thememanager";
int _i = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _stamp = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub loadStamp() As Bitmap ' method to assign stamp";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="myStamp=myData.loadStampIcon";
__ref._mystamp = __ref._mydata._loadstampicon(null);
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mystamp.getRowCount()-1);
for (_i = (int) (0); (step59 > 0 && _i <= limit59) || (step59 < 0 && _i >= limit59); _i = ((int)(0 + _i + step59))) {
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="myStamp.Position=i";
__ref._mystamp.setPosition(_i);
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Dim stamp As Bitmap";
_stamp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="stamp.Initialize(File.DirAssets, myLogo.GetStrin";
_stamp.Initialize(__c.File.getDirAssets(),__ref._mylogo.GetString("StampIcon"));
 }
};
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="Return stamp";
if (true) return _stamp;
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="End Sub";
return null;
}
}