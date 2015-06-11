package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"MapLocation\")";
Debug.ShouldStop(2097152);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapLocation")),main.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="myTheme.Initialize ' initialise theme database on";
Debug.ShouldStop(8388608);
main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",main.processBA);
 BA.debugLineNum = 57;BA.debugLine="loadDBcolours";
Debug.ShouldStop(16777216);
_loaddbcolours();
 BA.debugLineNum = 58;BA.debugLine="loadDBlogo";
Debug.ShouldStop(33554432);
_loaddblogo();
 BA.debugLineNum = 59;BA.debugLine="loadDBname";
Debug.ShouldStop(67108864);
_loaddbname();
 BA.debugLineNum = 60;BA.debugLine="loadStamp";
Debug.ShouldStop(134217728);
_loadstamp();
 BA.debugLineNum = 61;BA.debugLine="loadDBbuttonColours";
Debug.ShouldStop(268435456);
_loaddbbuttoncolours();
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,127);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 127;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,123);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 123;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnno_click() throws Exception{
try {
		Debug.PushSubsStack("btnno_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,209);
if (RapidSub.canDelegate("btnno_click")) return main.remoteMe.runUserSub(false, "main","btnno_click");
 BA.debugLineNum = 209;BA.debugLine="Sub btnno_Click ' you can also save and redeem lat";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Activity.LoadLayout(\"main\") 'will return to main";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnscan_click() throws Exception{
try {
		Debug.PushSubsStack("btnScan_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,200);
if (RapidSub.canDelegate("btnscan_click")) return main.remoteMe.runUserSub(false, "main","btnscan_click");
 BA.debugLineNum = 200;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="updateStamps";
Debug.ShouldStop(256);
_updatestamps();
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnscan_longclick() throws Exception{
try {
		Debug.PushSubsStack("btnScan_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,213);
if (RapidSub.canDelegate("btnscan_longclick")) return main.remoteMe.runUserSub(false, "main","btnscan_longclick");
 BA.debugLineNum = 213;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="qrscanner.isportrait = True";
Debug.ShouldStop(2097152);
main.mostCurrent._qrscanner.setField ("isportrait",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 215;BA.debugLine="qrscanner.useFrontCam = False";
Debug.ShouldStop(4194304);
main.mostCurrent._qrscanner.setField ("useFrontCam",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 218;BA.debugLine="qrscanner.timeoutDuration = 30";
Debug.ShouldStop(33554432);
main.mostCurrent._qrscanner.setField ("timeoutDuration",BA.numberCast(int.class, 30));
 BA.debugLineNum = 222;BA.debugLine="qrscanner.theViewFinderXfactor = 0.7";
Debug.ShouldStop(536870912);
main.mostCurrent._qrscanner.setField ("theViewFinderXfactor",BA.numberCast(double.class, 0.7));
 BA.debugLineNum = 223;BA.debugLine="qrscanner.theViewFinderYfactor = 0.5";
Debug.ShouldStop(1073741824);
main.mostCurrent._qrscanner.setField ("theViewFinderYfactor",BA.numberCast(double.class, 0.5));
 BA.debugLineNum = 225;BA.debugLine="qrscanner.theFrameColor = Colors.LightGray";
Debug.ShouldStop(1);
main.mostCurrent._qrscanner.setField ("theFrameColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 226;BA.debugLine="qrscanner.theLaserColor = Colors.Red";
Debug.ShouldStop(2);
main.mostCurrent._qrscanner.setField ("theLaserColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 227;BA.debugLine="qrscanner.theMaskColor = Colors.argb(95, 0, 0, 25";
Debug.ShouldStop(4);
main.mostCurrent._qrscanner.setField ("theMaskColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 95)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 228;BA.debugLine="qrscanner.theResultColor = Colors.Green";
Debug.ShouldStop(8);
main.mostCurrent._qrscanner.setField ("theResultColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 229;BA.debugLine="qrscanner.theResultPointColor = Colors.Red";
Debug.ShouldStop(16);
main.mostCurrent._qrscanner.setField ("theResultPointColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 231;BA.debugLine="qrscanner.theBottomPromptMessage = \"Scan Your Cof";
Debug.ShouldStop(64);
main.mostCurrent._qrscanner.setField ("theBottomPromptMessage",BA.ObjectToString("Scan Your Coffee Stamp."));
 BA.debugLineNum = 232;BA.debugLine="qrscanner.theBottomPromptTextSize = 5%y";
Debug.ShouldStop(128);
main.mostCurrent._qrscanner.setField ("theBottomPromptTextSize",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 233;BA.debugLine="qrscanner.bottomPromptColor = Colors.Yellow";
Debug.ShouldStop(256);
main.mostCurrent._qrscanner.setField ("bottomPromptColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 234;BA.debugLine="qrscanner.bottomPromptDistanceFromBottom = 5%y";
Debug.ShouldStop(512);
main.mostCurrent._qrscanner.setField ("bottomPromptDistanceFromBottom",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 236;BA.debugLine="scanSuccess = False";
Debug.ShouldStop(2048);
main._scansuccess = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 237;BA.debugLine="qrscanner.BeginScan(\"scanner\")	'This is the funct";
Debug.ShouldStop(4096);
main.mostCurrent._qrscanner.runVoidMethod ("BeginScan",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("scanner")));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnyes_click() throws Exception{
try {
		Debug.PushSubsStack("btnyes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,203);
if (RapidSub.canDelegate("btnyes_click")) return main.remoteMe.runUserSub(false, "main","btnyes_click");
 BA.debugLineNum = 203;BA.debugLine="Sub btnyes_Click 'to redeem your free coffee press";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="CoffeeCount = 0";
Debug.ShouldStop(2048);
main._coffeecount = BA.numberCast(int.class, 0);
 BA.debugLineNum = 205;BA.debugLine="updateStamps";
Debug.ShouldStop(4096);
_updatestamps();
 BA.debugLineNum = 206;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 36;BA.debugLine="Dim Card As Card";
main.mostCurrent._card = RemoteObject.createNew ("b4a.example.card");
 //BA.debugLineNum = 37;BA.debugLine="Private btnScan As Button";
main.mostCurrent._btnscan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private imgLogo As ImageView";
main.mostCurrent._imglogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private imgStamp1, imgStamp2, imgStamp3, imgStamp";
main.mostCurrent._imgstamp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblCompanyName As Label";
main.mostCurrent._lblcompanyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private pnlBG As Panel";
main.mostCurrent._pnlbg = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private pnlStamp1, pnlStamp2, pnlStamp3, pnlStamp";
main.mostCurrent._pnlstamp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim myTheme As CoffeeTheme";
main.mostCurrent._mytheme = RemoteObject.createNew ("b4a.example.coffeetheme");
 //BA.debugLineNum = 45;BA.debugLine="Dim scanSuccess As Boolean";
main._scansuccess = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 46;BA.debugLine="Dim qrscanner As JhsIceZxing1";
main.mostCurrent._qrscanner = RemoteObject.createNew ("ice.zxing.b4aZXingLib");
 //BA.debugLineNum = 47;BA.debugLine="Private No As Button";
main.mostCurrent._no = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private Yes As Button";
main.mostCurrent._yes = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loaddbbuttoncolours() throws Exception{
try {
		Debug.PushSubsStack("loadDBbuttonColours (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,110);
if (RapidSub.canDelegate("loaddbbuttoncolours")) return main.remoteMe.runUserSub(false, "main","loaddbbuttoncolours");
int _i = 0;
RemoteObject _btnrbg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _colours = RemoteObject.createImmutable(0);
 BA.debugLineNum = 110;BA.debugLine="Sub loadDBbuttonColours ' method to assign colours";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="myButtonColours =myTheme.loadBtnColours";
Debug.ShouldStop(16384);
main._mybuttoncolours = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadbtncolours");
 BA.debugLineNum = 112;BA.debugLine="For i = 0 To myButtonColours.RowCount - 1";
Debug.ShouldStop(32768);
{
final int step72 = 1;
final int limit72 = RemoteObject.solve(new RemoteObject[] {main._mybuttoncolours.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step72 > 0 && _i <= limit72) || (step72 < 0 && _i >= limit72); _i = ((int)(0 + _i + step72))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 113;BA.debugLine="myButtonColours.Position = i";
Debug.ShouldStop(65536);
main._mybuttoncolours.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 114;BA.debugLine="Dim btnRBG As ColorDrawable";
Debug.ShouldStop(131072);
_btnrbg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("btnRBG", _btnrbg);
 BA.debugLineNum = 115;BA.debugLine="Dim colours As Int";
Debug.ShouldStop(262144);
_colours = RemoteObject.createImmutable(0);Debug.locals.put("colours", _colours);
 BA.debugLineNum = 116;BA.debugLine="colours = Colors.RGB(myButtonColours.GetInt(\"Btn";
Debug.ShouldStop(524288);
_colours = main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._mybuttoncolours.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BtnRed")))),(Object)(main._mybuttoncolours.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BtnBlue")))),(Object)(main._mybuttoncolours.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BtnGreen")))));Debug.locals.put("colours", _colours);
 BA.debugLineNum = 117;BA.debugLine="btnRBG.Initialize(colours, 5)";
Debug.ShouldStop(1048576);
_btnrbg.runVoidMethod ("Initialize",(Object)(_colours),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 118;BA.debugLine="btnScan.background=btnRBG";
Debug.ShouldStop(2097152);
main.mostCurrent._btnscan.runMethod(false,"setBackground",(_btnrbg.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddbcolours() throws Exception{
try {
		Debug.PushSubsStack("loadDBcolours (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("loaddbcolours")) return main.remoteMe.runUserSub(false, "main","loaddbcolours");
int _i = 0;
RemoteObject _bggradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colours = null;
 BA.debugLineNum = 69;BA.debugLine="Sub loadDBcolours 'Assign background colours from";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="myColors = myTheme.loadColours";
Debug.ShouldStop(32);
main._mycolors = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadcolours");
 BA.debugLineNum = 71;BA.debugLine="For i = 0 To myColors.RowCount - 1 '";
Debug.ShouldStop(64);
{
final int step35 = 1;
final int limit35 = RemoteObject.solve(new RemoteObject[] {main._mycolors.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35); _i = ((int)(0 + _i + step35))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(128);
main._mycolors.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 73;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(256);
_bggradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 74;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(512);
_colours = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colours", _colours);
 BA.debugLineNum = 75;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(1024);
_colours.setArrayElement (main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Red")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Blue")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Green"))))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 76;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(2048);
_colours.setArrayElement (main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Red")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Blue")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Green"))))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 77;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(4096);
_bggradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(_colours));
 BA.debugLineNum = 78;BA.debugLine="pnlBG.Background=bgGradient";
Debug.ShouldStop(8192);
main.mostCurrent._pnlbg.runMethod(false,"setBackground",(_bggradient.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddblogo() throws Exception{
try {
		Debug.PushSubsStack("loadDBlogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,82);
if (RapidSub.canDelegate("loaddblogo")) return main.remoteMe.runUserSub(false, "main","loaddblogo");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 82;BA.debugLine="Sub loadDBlogo 'Assign Logo as string from databas";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="myLogo=myTheme.loadLogo";
Debug.ShouldStop(262144);
main._mylogo = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadlogo");
 BA.debugLineNum = 84;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
Debug.ShouldStop(524288);
{
final int step47 = 1;
final int limit47 = RemoteObject.solve(new RemoteObject[] {main._mylogo.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="myLogo.Position=i";
Debug.ShouldStop(1048576);
main._mylogo.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 86;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(2097152);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 87;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(4194304);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Logo")))));
 BA.debugLineNum = 88;BA.debugLine="imgLogo.Bitmap=image";
Debug.ShouldStop(8388608);
main.mostCurrent._imglogo.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddbname() throws Exception{
try {
		Debug.PushSubsStack("loadDBname (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("loaddbname")) return main.remoteMe.runUserSub(false, "main","loaddbname");
int _i = 0;
 BA.debugLineNum = 92;BA.debugLine="Sub loadDBname ' method to assign Company Name to";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="myCoName=myTheme.loadCompanyName";
Debug.ShouldStop(268435456);
main._myconame = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadcompanyname");
 BA.debugLineNum = 94;BA.debugLine="For i = 0 To myCoName.RowCount - 1";
Debug.ShouldStop(536870912);
{
final int step56 = 1;
final int limit56 = RemoteObject.solve(new RemoteObject[] {main._myconame.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56); _i = ((int)(0 + _i + step56))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 95;BA.debugLine="myCoName.Position=i";
Debug.ShouldStop(1073741824);
main._myconame.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 96;BA.debugLine="lblCompanyName.Text  =myCoName.GetString(\"Compan";
Debug.ShouldStop(-2147483648);
main.mostCurrent._lblcompanyname.runMethod(true,"setText",(main._myconame.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CompanyName")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadstamp() throws Exception{
try {
		Debug.PushSubsStack("loadStamp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,100);
if (RapidSub.canDelegate("loadstamp")) return main.remoteMe.runUserSub(false, "main","loadstamp");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 100;BA.debugLine="Sub loadStamp ' method to assign stamp image to St";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="myStamp=myTheme.loadStampIcon";
Debug.ShouldStop(16);
main._mystamp = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadstampicon");
 BA.debugLineNum = 102;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
Debug.ShouldStop(32);
{
final int step63 = 1;
final int limit63 = RemoteObject.solve(new RemoteObject[] {main._mystamp.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63); _i = ((int)(0 + _i + step63))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 103;BA.debugLine="myStamp.Position=i";
Debug.ShouldStop(64);
main._mystamp.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 104;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(128);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 105;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(256);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("StampIcon")))));
 BA.debugLineNum = 106;BA.debugLine="imgStamp1.Bitmap=image";
Debug.ShouldStop(512);
main.mostCurrent._imgstamp1.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
themecalc_subs_0._process_globals();
maplocator_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
coffeetheme.myClass = BA.getDeviceClass ("b4a.example.coffeetheme");
card.myClass = BA.getDeviceClass ("b4a.example.card");
coffeestamp.myClass = BA.getDeviceClass ("b4a.example.coffeestamp");
themecalc.myClass = BA.getDeviceClass ("b4a.example.themecalc");
data.myClass = BA.getDeviceClass ("b4a.example.data");
maplocator.myClass = BA.getDeviceClass ("b4a.example.maplocator");
address.myClass = BA.getDeviceClass ("b4a.example.address");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim myColors As Cursor";
main._mycolors = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim myLogo As Cursor";
main._mylogo = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim myCoName As Cursor";
main._myconame = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim myStamp As Cursor";
main._mystamp = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim Card As Card";
main.mostCurrent._card = RemoteObject.createNew ("b4a.example.card");
 //BA.debugLineNum = 26;BA.debugLine="Dim CoffeeCount As Int";
main._coffeecount = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="Dim myButtonColours As Cursor";
main._mybuttoncolours = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scanner_noscan(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("scanner_noscan (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,251);
if (RapidSub.canDelegate("scanner_noscan")) return main.remoteMe.runUserSub(false, "main","scanner_noscan", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 251;BA.debugLine="Sub scanner_noscan(atype As String,Values As Strin";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 252;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 BA.debugLineNum = 253;BA.debugLine="Msgbox(Values,\"Scan Failed\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(_values),(Object)(RemoteObject.createImmutable("Scan Failed")),main.mostCurrent.activityBA);
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scanner_result(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("scanner_result (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,242);
if (RapidSub.canDelegate("scanner_result")) return main.remoteMe.runUserSub(false, "main","scanner_result", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 242;BA.debugLine="Sub scanner_result(atype As String,Values As Strin";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="If Values <> \"Null\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_values,BA.ObjectToString("Null"))) { 
 BA.debugLineNum = 244;BA.debugLine="scanSuccess = True";
Debug.ShouldStop(524288);
main._scansuccess = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 245;BA.debugLine="CoffeeCount = CoffeeCount + 1";
Debug.ShouldStop(1048576);
main._coffeecount = RemoteObject.solve(new RemoteObject[] {main._coffeecount,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 246;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 };
 BA.debugLineNum = 248;BA.debugLine="updateStamps";
Debug.ShouldStop(8388608);
_updatestamps();
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatestamps() throws Exception{
try {
		Debug.PushSubsStack("updateStamps (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,131);
if (RapidSub.canDelegate("updatestamps")) return main.remoteMe.runUserSub(false, "main","updatestamps");
 BA.debugLineNum = 131;BA.debugLine="Private Sub updateStamps";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="If CoffeeCount = 6 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 133;BA.debugLine="ToastMessageShow(\" You Have Earned A free Coffee\"";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You Have Earned A free Coffee")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 134;BA.debugLine="Activity.LoadLayout(\"freecoffee\") 'will load 2 la";
Debug.ShouldStop(32);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("freecoffee")),main.mostCurrent.activityBA);
 BA.debugLineNum = 135;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(64);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 136;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(128);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(256);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 138;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(512);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 139;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(1024);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 140;BA.debugLine="imgStamp6.Visible = True";
Debug.ShouldStop(2048);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 143;BA.debugLine="If CoffeeCount = 5 Then 'from 5 to 1 will show ho";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 144;BA.debugLine="ToastMessageShow (\" You still need 1 more stamp i";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 1 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 145;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(65536);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 146;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(131072);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 147;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(262144);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 148;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(524288);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 149;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(1048576);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 150;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(2097152);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 153;BA.debugLine="If CoffeeCount = 4 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 154;BA.debugLine="ToastMessageShow (\" You still need 2 more stamp i";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 2 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 155;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(67108864);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 156;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(134217728);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 157;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(268435456);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 158;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(536870912);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 159;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(1073741824);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 160;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 162;BA.debugLine="If CoffeeCount = 3 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 163;BA.debugLine="ToastMessageShow (\" You still need 3 more stamp i";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 3 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 164;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(8);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 165;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(16);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 166;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(32);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 167;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(64);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 168;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(128);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 169;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(256);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 171;BA.debugLine="If CoffeeCount = 2 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 172;BA.debugLine="ToastMessageShow (\" you still need 4  more stamp";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" you still need 4  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 173;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(4096);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 174;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(8192);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 175;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 176;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(32768);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 177;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(65536);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 178;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 180;BA.debugLine="If CoffeeCount = 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 181;BA.debugLine="ToastMessageShow (\" You still need 5  more stamp";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 5  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 182;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(2097152);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 183;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(4194304);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 184;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(8388608);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 185;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(16777216);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 186;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 190;BA.debugLine="If CoffeeCount = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 191;BA.debugLine="ToastMessageShow (\" Don't Forget to use your Coff";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" Don't Forget to use your Coffe-E-Card when you buying  a coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 192;BA.debugLine="imgStamp1.Visible = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 193;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(1);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 194;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(2);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 195;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(4);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 196;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(8);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}