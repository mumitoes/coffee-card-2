package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="myTheme.Initialize ' initialise theme database on";
Debug.ShouldStop(524288);
main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",main.processBA);
 BA.debugLineNum = 53;BA.debugLine="loadDBcolours";
Debug.ShouldStop(1048576);
_loaddbcolours();
 BA.debugLineNum = 54;BA.debugLine="loadDBlogo";
Debug.ShouldStop(2097152);
_loaddblogo();
 BA.debugLineNum = 55;BA.debugLine="loadDBname";
Debug.ShouldStop(4194304);
_loaddbname();
 BA.debugLineNum = 56;BA.debugLine="loadStamp";
Debug.ShouldStop(8388608);
_loadstamp();
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,105);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 105;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,101);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 101;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
public static RemoteObject  _btnno_click() throws Exception{
try {
		Debug.PushSubsStack("btnNo_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,191);
if (RapidSub.canDelegate("btnno_click")) return main.remoteMe.runUserSub(false, "main","btnno_click");
 BA.debugLineNum = 191;BA.debugLine="Sub btnNo_Click ' you can also save and redeem lat";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Activity.LoadLayout(\"main\")'will return to main l";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 193;BA.debugLine="myTheme.Initialize ' initialise theme database on";
Debug.ShouldStop(1);
main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",main.processBA);
 BA.debugLineNum = 194;BA.debugLine="loadDBcolours";
Debug.ShouldStop(2);
_loaddbcolours();
 BA.debugLineNum = 195;BA.debugLine="loadDBlogo";
Debug.ShouldStop(4);
_loaddblogo();
 BA.debugLineNum = 196;BA.debugLine="loadDBname";
Debug.ShouldStop(8);
_loaddbname();
 BA.debugLineNum = 197;BA.debugLine="Card.CoffeeCount = 6";
Debug.ShouldStop(16);
main.mostCurrent._card.setField ("_coffeecount",BA.numberCast(int.class, 6));
 BA.debugLineNum = 198;BA.debugLine="loadStamp";
Debug.ShouldStop(32);
_loadstamp();
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
public static RemoteObject  _btnscan_click() throws Exception{
try {
		Debug.PushSubsStack("btnScan_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,178);
if (RapidSub.canDelegate("btnscan_click")) return main.remoteMe.runUserSub(false, "main","btnscan_click");
 BA.debugLineNum = 178;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="updateStamps";
Debug.ShouldStop(262144);
_updatestamps();
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btnScan_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,201);
if (RapidSub.canDelegate("btnscan_longclick")) return main.remoteMe.runUserSub(false, "main","btnscan_longclick");
 BA.debugLineNum = 201;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="qrscanner.isportrait = True";
Debug.ShouldStop(512);
main.mostCurrent._qrscanner.setField ("isportrait",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 203;BA.debugLine="qrscanner.useFrontCam = False";
Debug.ShouldStop(1024);
main.mostCurrent._qrscanner.setField ("useFrontCam",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 206;BA.debugLine="qrscanner.timeoutDuration = 30";
Debug.ShouldStop(8192);
main.mostCurrent._qrscanner.setField ("timeoutDuration",BA.numberCast(int.class, 30));
 BA.debugLineNum = 210;BA.debugLine="qrscanner.theViewFinderXfactor = 0.7";
Debug.ShouldStop(131072);
main.mostCurrent._qrscanner.setField ("theViewFinderXfactor",BA.numberCast(double.class, 0.7));
 BA.debugLineNum = 211;BA.debugLine="qrscanner.theViewFinderYfactor = 0.5";
Debug.ShouldStop(262144);
main.mostCurrent._qrscanner.setField ("theViewFinderYfactor",BA.numberCast(double.class, 0.5));
 BA.debugLineNum = 213;BA.debugLine="qrscanner.theFrameColor = Colors.LightGray";
Debug.ShouldStop(1048576);
main.mostCurrent._qrscanner.setField ("theFrameColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 214;BA.debugLine="qrscanner.theLaserColor = Colors.Red";
Debug.ShouldStop(2097152);
main.mostCurrent._qrscanner.setField ("theLaserColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 215;BA.debugLine="qrscanner.theMaskColor = Colors.argb(95, 0, 0, 25";
Debug.ShouldStop(4194304);
main.mostCurrent._qrscanner.setField ("theMaskColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 95)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 216;BA.debugLine="qrscanner.theResultColor = Colors.Green";
Debug.ShouldStop(8388608);
main.mostCurrent._qrscanner.setField ("theResultColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 217;BA.debugLine="qrscanner.theResultPointColor = Colors.Red";
Debug.ShouldStop(16777216);
main.mostCurrent._qrscanner.setField ("theResultPointColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 219;BA.debugLine="qrscanner.theBottomPromptMessage = \"Scan Your Cof";
Debug.ShouldStop(67108864);
main.mostCurrent._qrscanner.setField ("theBottomPromptMessage",BA.ObjectToString("Scan Your Coffee Stamp."));
 BA.debugLineNum = 220;BA.debugLine="qrscanner.theBottomPromptTextSize = 5%y";
Debug.ShouldStop(134217728);
main.mostCurrent._qrscanner.setField ("theBottomPromptTextSize",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 221;BA.debugLine="qrscanner.bottomPromptColor = Colors.Black";
Debug.ShouldStop(268435456);
main.mostCurrent._qrscanner.setField ("bottomPromptColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 222;BA.debugLine="qrscanner.bottomPromptDistanceFromBottom = 5%y";
Debug.ShouldStop(536870912);
main.mostCurrent._qrscanner.setField ("bottomPromptDistanceFromBottom",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 224;BA.debugLine="qrscanner.BeginScan(\"scanner\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._qrscanner.runVoidMethod ("BeginScan",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("scanner")));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
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
public static RemoteObject  _btnyes_click() throws Exception{
try {
		Debug.PushSubsStack("btnyes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,181);
if (RapidSub.canDelegate("btnyes_click")) return main.remoteMe.runUserSub(false, "main","btnyes_click");
 BA.debugLineNum = 181;BA.debugLine="Sub btnyes_Click 'to redeem your free coffee press";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Activity.LoadLayout(\"main\")'will return to main l";
Debug.ShouldStop(2097152);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 183;BA.debugLine="myTheme.Initialize ' initialise theme database on";
Debug.ShouldStop(4194304);
main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",main.processBA);
 BA.debugLineNum = 184;BA.debugLine="loadDBcolours";
Debug.ShouldStop(8388608);
_loaddbcolours();
 BA.debugLineNum = 185;BA.debugLine="loadDBlogo";
Debug.ShouldStop(16777216);
_loaddblogo();
 BA.debugLineNum = 186;BA.debugLine="loadDBname";
Debug.ShouldStop(33554432);
_loaddbname();
 BA.debugLineNum = 187;BA.debugLine="Card.CoffeeCount = 0";
Debug.ShouldStop(67108864);
main.mostCurrent._card.setField ("_coffeecount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 188;BA.debugLine="loadStamp";
Debug.ShouldStop(134217728);
_loadstamp();
 BA.debugLineNum = 190;BA.debugLine="End Sub";
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
themecalc_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
coffeetheme.myClass = BA.getDeviceClass ("b4a.example.coffeetheme");
card.myClass = BA.getDeviceClass ("b4a.example.card");
coffeestamp.myClass = BA.getDeviceClass ("b4a.example.coffeestamp");
themecalc.myClass = BA.getDeviceClass ("b4a.example.themecalc");
data.myClass = BA.getDeviceClass ("b4a.example.data");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 35;BA.debugLine="Dim Card As Card";
main.mostCurrent._card = RemoteObject.createNew ("b4a.example.card");
 //BA.debugLineNum = 36;BA.debugLine="Private btnScan As Button";
main.mostCurrent._btnscan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private imgLogo As ImageView";
main.mostCurrent._imglogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private imgStamp1, imgStamp2, imgStamp3, imgStamp";
main.mostCurrent._imgstamp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblCompanyName As Label";
main.mostCurrent._lblcompanyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private pnlBG As Panel";
main.mostCurrent._pnlbg = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private pnlStamp1, pnlStamp2, pnlStamp3, pnlStamp";
main.mostCurrent._pnlstamp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim myTheme As CoffeeTheme";
main.mostCurrent._mytheme = RemoteObject.createNew ("b4a.example.coffeetheme");
 //BA.debugLineNum = 44;BA.debugLine="Dim scanSuccess As Boolean";
main._scansuccess = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 45;BA.debugLine="Dim qrscanner As JhsIceZxing1";
main.mostCurrent._qrscanner = RemoteObject.createNew ("ice.zxing.b4aZXingLib");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loaddbcolours() throws Exception{
try {
		Debug.PushSubsStack("loadDBcolours (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("loaddbcolours")) return main.remoteMe.runUserSub(false, "main","loaddbcolours");
int _i = 0;
RemoteObject _bggradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colours = null;
 BA.debugLineNum = 60;BA.debugLine="Sub loadDBcolours 'Load background colours from da";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="myColors = myTheme.loadColours";
Debug.ShouldStop(268435456);
main._mycolors = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadcolours");
 BA.debugLineNum = 62;BA.debugLine="For i = 0 To myColors.RowCount - 1 '";
Debug.ShouldStop(536870912);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {main._mycolors.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30); _i = ((int)(0 + _i + step30))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 63;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(1073741824);
main._mycolors.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 64;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(-2147483648);
_bggradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 65;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(1);
_colours = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colours", _colours);
 BA.debugLineNum = 66;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(2);
_colours.setArrayElement (main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Red")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Blue")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Green"))))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 67;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(4);
_colours.setArrayElement (main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Red")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Blue")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Green"))))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 68;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(8);
_bggradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(_colours));
 BA.debugLineNum = 69;BA.debugLine="pnlBG.Background=bgGradient";
Debug.ShouldStop(16);
main.mostCurrent._pnlbg.runMethod(false,"setBackground",(_bggradient.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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
public static RemoteObject  _loaddblogo() throws Exception{
try {
		Debug.PushSubsStack("loadDBlogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("loaddblogo")) return main.remoteMe.runUserSub(false, "main","loaddblogo");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 73;BA.debugLine="Sub loadDBlogo 'Load Logo as string from database";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="myLogo=myTheme.loadLogo";
Debug.ShouldStop(512);
main._mylogo = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadlogo");
 BA.debugLineNum = 75;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
Debug.ShouldStop(1024);
{
final int step42 = 1;
final int limit42 = RemoteObject.solve(new RemoteObject[] {main._mylogo.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42); _i = ((int)(0 + _i + step42))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="myLogo.Position=i";
Debug.ShouldStop(2048);
main._mylogo.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 77;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(4096);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 78;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(8192);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Logo")))));
 BA.debugLineNum = 79;BA.debugLine="imgLogo.Bitmap=image";
Debug.ShouldStop(16384);
main.mostCurrent._imglogo.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("loadDBname (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,83);
if (RapidSub.canDelegate("loaddbname")) return main.remoteMe.runUserSub(false, "main","loaddbname");
int _i = 0;
 BA.debugLineNum = 83;BA.debugLine="Sub loadDBname 'Load company name from database";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="myCoName=myTheme.loadCompanyName";
Debug.ShouldStop(524288);
main._myconame = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadcompanyname");
 BA.debugLineNum = 85;BA.debugLine="For i = 0 To myCoName.RowCount - 1";
Debug.ShouldStop(1048576);
{
final int step51 = 1;
final int limit51 = RemoteObject.solve(new RemoteObject[] {main._myconame.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51); _i = ((int)(0 + _i + step51))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="myCoName.Position=i";
Debug.ShouldStop(2097152);
main._myconame.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 87;BA.debugLine="lblCompanyName.Text  =myCoName.GetString(\"Compan";
Debug.ShouldStop(4194304);
main.mostCurrent._lblcompanyname.runMethod(true,"setText",(main._myconame.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CompanyName")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 89;BA.debugLine="End Sub";
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
public static RemoteObject  _loadstamp() throws Exception{
try {
		Debug.PushSubsStack("loadStamp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,91);
if (RapidSub.canDelegate("loadstamp")) return main.remoteMe.runUserSub(false, "main","loadstamp");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 91;BA.debugLine="Sub loadStamp 'load stamp from database";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="myStamp=myTheme.loadStampIcon";
Debug.ShouldStop(134217728);
main._mystamp = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadstampicon");
 BA.debugLineNum = 93;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
Debug.ShouldStop(268435456);
{
final int step58 = 1;
final int limit58 = RemoteObject.solve(new RemoteObject[] {main._mystamp.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step58 > 0 && _i <= limit58) || (step58 < 0 && _i >= limit58); _i = ((int)(0 + _i + step58))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 94;BA.debugLine="myStamp.Position=i";
Debug.ShouldStop(536870912);
main._mystamp.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 95;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(1073741824);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 96;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(-2147483648);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("StampIcon")))));
 BA.debugLineNum = 97;BA.debugLine="imgStamp1.Bitmap=image";
Debug.ShouldStop(1);
main.mostCurrent._imgstamp1.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
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
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scanner_noscan(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("scanner_noscan (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,234);
if (RapidSub.canDelegate("scanner_noscan")) return main.remoteMe.runUserSub(false, "main","scanner_noscan", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 234;BA.debugLine="Sub scanner_noscan(atype As String,Values As Strin";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="scanSuccess = False";
Debug.ShouldStop(1024);
main._scansuccess = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 236;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 BA.debugLineNum = 237;BA.debugLine="Msgbox(Values,\"Scan Failed\")";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(_values),(Object)(RemoteObject.createImmutable("Scan Failed")),main.mostCurrent.activityBA);
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("scanner_result (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,227);
if (RapidSub.canDelegate("scanner_result")) return main.remoteMe.runUserSub(false, "main","scanner_result", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 227;BA.debugLine="Sub scanner_result(atype As String,Values As Strin";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="scanSuccess = True";
Debug.ShouldStop(8);
main._scansuccess = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 229;BA.debugLine="CoffeeCount = CoffeeCount + 1";
Debug.ShouldStop(16);
main._coffeecount = RemoteObject.solve(new RemoteObject[] {main._coffeecount,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 230;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 BA.debugLineNum = 231;BA.debugLine="updateStamps";
Debug.ShouldStop(64);
_updatestamps();
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("updateStamps (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,109);
if (RapidSub.canDelegate("updatestamps")) return main.remoteMe.runUserSub(false, "main","updatestamps");
 BA.debugLineNum = 109;BA.debugLine="Private Sub updateStamps";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="If CoffeeCount = 6 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 111;BA.debugLine="ToastMessageShow(\" You Have Earned A free Coffee\"";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You Have Earned A free Coffee")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="Activity.LoadLayout(\"freecoffee\") 'will load 2 la";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("freecoffee")),main.mostCurrent.activityBA);
 BA.debugLineNum = 113;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(65536);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 114;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(131072);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(262144);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(524288);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(1048576);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 118;BA.debugLine="imgStamp6.Visible = True";
Debug.ShouldStop(2097152);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 121;BA.debugLine="If CoffeeCount = 5 Then 'from 5 to 1 will show ho";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 122;BA.debugLine="ToastMessageShow (\" You still need 1 more stamp i";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 1 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 123;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(67108864);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 124;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(134217728);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 125;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(268435456);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 126;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(536870912);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 128;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 131;BA.debugLine="If CoffeeCount = 4 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 132;BA.debugLine="ToastMessageShow (\" You still need 2 more stamp i";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 2 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 133;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(16);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 134;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(32);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 135;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(64);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 136;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(128);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(256);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 138;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(512);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 140;BA.debugLine="If CoffeeCount = 3 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 141;BA.debugLine="ToastMessageShow (\" You still need 3 more stamp i";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 3 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 142;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(8192);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 143;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(16384);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 144;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(32768);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(65536);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 146;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(262144);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 149;BA.debugLine="If CoffeeCount = 2 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 150;BA.debugLine="ToastMessageShow (\" you still need 4  more stamp";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" you still need 4  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 151;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(4194304);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 152;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(8388608);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 153;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(16777216);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 154;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 155;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 156;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(134217728);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 158;BA.debugLine="If CoffeeCount = 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 159;BA.debugLine="ToastMessageShow (\" You still need 5  more stamp";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 5  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 160;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 161;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(1);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 162;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(2);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 163;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(4);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 164;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(8);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 165;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 168;BA.debugLine="If CoffeeCount = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 169;BA.debugLine="ToastMessageShow (\" Don't Forget to use your Coff";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" Don't Forget to use your Coffe-E-Card when you buying  a coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 170;BA.debugLine="imgStamp1.Visible = False";
Debug.ShouldStop(512);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 171;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(1024);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 172;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(2048);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 173;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(4096);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 174;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(8192);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 175;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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