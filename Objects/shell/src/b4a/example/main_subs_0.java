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
 BA.debugLineNum = 55;BA.debugLine="myTheme.Initialize ' initialise theme database on";
Debug.ShouldStop(4194304);
main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",main.processBA);
 BA.debugLineNum = 56;BA.debugLine="loadDBcolours";
Debug.ShouldStop(8388608);
_loaddbcolours();
 BA.debugLineNum = 57;BA.debugLine="loadDBlogo";
Debug.ShouldStop(16777216);
_loaddblogo();
 BA.debugLineNum = 58;BA.debugLine="loadDBname";
Debug.ShouldStop(33554432);
_loaddbname();
 BA.debugLineNum = 59;BA.debugLine="loadStamp";
Debug.ShouldStop(67108864);
_loadstamp();
 BA.debugLineNum = 61;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,108);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 108;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,104);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 104;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
public static RemoteObject  _btnscan_click() throws Exception{
try {
		Debug.PushSubsStack("btnScan_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,181);
if (RapidSub.canDelegate("btnscan_click")) return main.remoteMe.runUserSub(false, "main","btnscan_click");
 BA.debugLineNum = 181;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="updateStamps";
Debug.ShouldStop(2097152);
_updatestamps();
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btnScan_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,194);
if (RapidSub.canDelegate("btnscan_longclick")) return main.remoteMe.runUserSub(false, "main","btnscan_longclick");
 BA.debugLineNum = 194;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="qrscanner.isportrait = True";
Debug.ShouldStop(4);
main.mostCurrent._qrscanner.setField ("isportrait",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 196;BA.debugLine="qrscanner.useFrontCam = False";
Debug.ShouldStop(8);
main.mostCurrent._qrscanner.setField ("useFrontCam",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 199;BA.debugLine="qrscanner.timeoutDuration = 30";
Debug.ShouldStop(64);
main.mostCurrent._qrscanner.setField ("timeoutDuration",BA.numberCast(int.class, 30));
 BA.debugLineNum = 203;BA.debugLine="qrscanner.theViewFinderXfactor = 0.7";
Debug.ShouldStop(1024);
main.mostCurrent._qrscanner.setField ("theViewFinderXfactor",BA.numberCast(double.class, 0.7));
 BA.debugLineNum = 204;BA.debugLine="qrscanner.theViewFinderYfactor = 0.5";
Debug.ShouldStop(2048);
main.mostCurrent._qrscanner.setField ("theViewFinderYfactor",BA.numberCast(double.class, 0.5));
 BA.debugLineNum = 206;BA.debugLine="qrscanner.theFrameColor = Colors.LightGray";
Debug.ShouldStop(8192);
main.mostCurrent._qrscanner.setField ("theFrameColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 207;BA.debugLine="qrscanner.theLaserColor = Colors.Red";
Debug.ShouldStop(16384);
main.mostCurrent._qrscanner.setField ("theLaserColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 208;BA.debugLine="qrscanner.theMaskColor = Colors.argb(95, 0, 0, 25";
Debug.ShouldStop(32768);
main.mostCurrent._qrscanner.setField ("theMaskColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 95)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 209;BA.debugLine="qrscanner.theResultColor = Colors.Green";
Debug.ShouldStop(65536);
main.mostCurrent._qrscanner.setField ("theResultColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 210;BA.debugLine="qrscanner.theResultPointColor = Colors.Red";
Debug.ShouldStop(131072);
main.mostCurrent._qrscanner.setField ("theResultPointColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 212;BA.debugLine="qrscanner.theBottomPromptMessage = \"Scan Your Cof";
Debug.ShouldStop(524288);
main.mostCurrent._qrscanner.setField ("theBottomPromptMessage",BA.ObjectToString("Scan Your Coffee Stamp."));
 BA.debugLineNum = 213;BA.debugLine="qrscanner.theBottomPromptTextSize = 5%y";
Debug.ShouldStop(1048576);
main.mostCurrent._qrscanner.setField ("theBottomPromptTextSize",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 214;BA.debugLine="qrscanner.bottomPromptColor = Colors.Black";
Debug.ShouldStop(2097152);
main.mostCurrent._qrscanner.setField ("bottomPromptColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 215;BA.debugLine="qrscanner.bottomPromptDistanceFromBottom = 5%y";
Debug.ShouldStop(4194304);
main.mostCurrent._qrscanner.setField ("bottomPromptDistanceFromBottom",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 217;BA.debugLine="qrscanner.BeginScan(\"scanner\")";
Debug.ShouldStop(16777216);
main.mostCurrent._qrscanner.runVoidMethod ("BeginScan",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("scanner")));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 47;BA.debugLine="Dim myABBarcode As ABZxing";
main.mostCurrent._myabbarcode = RemoteObject.createNew ("com.AB.ABZxing.ABZxing");
 //BA.debugLineNum = 48;BA.debugLine="Dim Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loaddbcolours() throws Exception{
try {
		Debug.PushSubsStack("loadDBcolours (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("loaddbcolours")) return main.remoteMe.runUserSub(false, "main","loaddbcolours");
int _i = 0;
RemoteObject _bggradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colours = null;
 BA.debugLineNum = 63;BA.debugLine="Sub loadDBcolours 'Load background colours from da";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="myColors = myTheme.loadColours";
Debug.ShouldStop(-2147483648);
main._mycolors = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadcolours");
 BA.debugLineNum = 65;BA.debugLine="For i = 0 To myColors.RowCount - 1 '";
Debug.ShouldStop(1);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {main._mycolors.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33); _i = ((int)(0 + _i + step33))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="myColors.Position = i";
Debug.ShouldStop(2);
main._mycolors.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 67;BA.debugLine="Dim bgGradient As GradientDrawable";
Debug.ShouldStop(4);
_bggradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("bgGradient", _bggradient);
 BA.debugLineNum = 68;BA.debugLine="Dim colours(2) As Int";
Debug.ShouldStop(8);
_colours = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colours", _colours);
 BA.debugLineNum = 69;BA.debugLine="colours(0) = Colors.RGB(myColors.GetInt(\"BG1Red\"";
Debug.ShouldStop(16);
_colours.setArrayElement (main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Red")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Blue")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG1Green"))))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 70;BA.debugLine="colours(1) = Colors.RGB(myColors.GetInt(\"BG2Red\"";
Debug.ShouldStop(32);
_colours.setArrayElement (main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Red")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Blue")))),(Object)(main._mycolors.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("BG2Green"))))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 71;BA.debugLine="bgGradient.Initialize(\"TR_BL\", colours)";
Debug.ShouldStop(64);
_bggradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(_colours));
 BA.debugLineNum = 72;BA.debugLine="pnlBG.Background=bgGradient";
Debug.ShouldStop(128);
main.mostCurrent._pnlbg.runMethod(false,"setBackground",(_bggradient.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
public static RemoteObject  _loaddblogo() throws Exception{
try {
		Debug.PushSubsStack("loadDBlogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,76);
if (RapidSub.canDelegate("loaddblogo")) return main.remoteMe.runUserSub(false, "main","loaddblogo");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 76;BA.debugLine="Sub loadDBlogo 'Load Logo as string from database";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="myLogo=myTheme.loadLogo";
Debug.ShouldStop(4096);
main._mylogo = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadlogo");
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
Debug.ShouldStop(8192);
{
final int step45 = 1;
final int limit45 = RemoteObject.solve(new RemoteObject[] {main._mylogo.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45); _i = ((int)(0 + _i + step45))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="myLogo.Position=i";
Debug.ShouldStop(16384);
main._mylogo.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 80;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(32768);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 81;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(65536);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Logo")))));
 BA.debugLineNum = 82;BA.debugLine="imgLogo.Bitmap=image";
Debug.ShouldStop(131072);
main.mostCurrent._imglogo.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
public static RemoteObject  _loaddbname() throws Exception{
try {
		Debug.PushSubsStack("loadDBname (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("loaddbname")) return main.remoteMe.runUserSub(false, "main","loaddbname");
int _i = 0;
 BA.debugLineNum = 86;BA.debugLine="Sub loadDBname 'Load company name from database";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="myCoName=myTheme.loadCompanyName";
Debug.ShouldStop(4194304);
main._myconame = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadcompanyname");
 BA.debugLineNum = 88;BA.debugLine="For i = 0 To myCoName.RowCount - 1";
Debug.ShouldStop(8388608);
{
final int step54 = 1;
final int limit54 = RemoteObject.solve(new RemoteObject[] {main._myconame.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step54 > 0 && _i <= limit54) || (step54 < 0 && _i >= limit54); _i = ((int)(0 + _i + step54))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 89;BA.debugLine="myCoName.Position=i";
Debug.ShouldStop(16777216);
main._myconame.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 90;BA.debugLine="lblCompanyName.Text  =myCoName.GetString(\"Compan";
Debug.ShouldStop(33554432);
main.mostCurrent._lblcompanyname.runMethod(true,"setText",(main._myconame.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CompanyName")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("loadStamp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,94);
if (RapidSub.canDelegate("loadstamp")) return main.remoteMe.runUserSub(false, "main","loadstamp");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 94;BA.debugLine="Sub loadStamp 'load stamp from database";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="myStamp=myTheme.loadStampIcon";
Debug.ShouldStop(1073741824);
main._mystamp = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadstampicon");
 BA.debugLineNum = 96;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
Debug.ShouldStop(-2147483648);
{
final int step61 = 1;
final int limit61 = RemoteObject.solve(new RemoteObject[] {main._mystamp.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step61 > 0 && _i <= limit61) || (step61 < 0 && _i >= limit61); _i = ((int)(0 + _i + step61))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 97;BA.debugLine="myStamp.Position=i";
Debug.ShouldStop(1);
main._mystamp.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 98;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(2);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 99;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(4);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("StampIcon")))));
 BA.debugLineNum = 100;BA.debugLine="imgStamp1.Bitmap=image";
Debug.ShouldStop(8);
main.mostCurrent._imgstamp1.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myabbarcode_barcodefound(RemoteObject _barcode,RemoteObject _formatname) throws Exception{
try {
		Debug.PushSubsStack("myABBarcode_BarcodeFound (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,233);
if (RapidSub.canDelegate("myabbarcode_barcodefound")) return main.remoteMe.runUserSub(false, "main","myabbarcode_barcodefound", _barcode, _formatname);
Debug.locals.put("barCode", _barcode);
Debug.locals.put("formatName", _formatname);
 BA.debugLineNum = 233;BA.debugLine="Sub myABBarcode_BarcodeFound (barCode As String, f";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Label1.Text = barCode";
Debug.ShouldStop(512);
main.mostCurrent._label1.runMethod(true,"setText",(_barcode));
 BA.debugLineNum = 235;BA.debugLine="mResult = barCode";
Debug.ShouldStop(1024);
main._mresult = _barcode;
 BA.debugLineNum = 236;BA.debugLine="End Sub";
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
public static RemoteObject  _no_click() throws Exception{
try {
		Debug.PushSubsStack("No_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,190);
if (RapidSub.canDelegate("no_click")) return main.remoteMe.runUserSub(false, "main","no_click");
 BA.debugLineNum = 190;BA.debugLine="Sub No_Click ' you can also save and redeem later";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="activity.LoadLayout(\"main\") 'will return to main";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
 //BA.debugLineNum = 27;BA.debugLine="Dim mResult As String";
main._mresult = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scanner_noscan(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("scanner_noscan (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,227);
if (RapidSub.canDelegate("scanner_noscan")) return main.remoteMe.runUserSub(false, "main","scanner_noscan", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 227;BA.debugLine="Sub scanner_noscan(atype As String,Values As Strin";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="scanSuccess = False";
Debug.ShouldStop(8);
main._scansuccess = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 229;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 BA.debugLineNum = 230;BA.debugLine="Msgbox(Values,\"Scan Failed\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(_values),(Object)(RemoteObject.createImmutable("Scan Failed")),main.mostCurrent.activityBA);
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
public static RemoteObject  _scanner_result(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("scanner_result (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,220);
if (RapidSub.canDelegate("scanner_result")) return main.remoteMe.runUserSub(false, "main","scanner_result", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 220;BA.debugLine="Sub scanner_result(atype As String,Values As Strin";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="scanSuccess = True";
Debug.ShouldStop(268435456);
main._scansuccess = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 222;BA.debugLine="CoffeeCount = CoffeeCount + 1";
Debug.ShouldStop(536870912);
main._coffeecount = RemoteObject.solve(new RemoteObject[] {main._coffeecount,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 223;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 BA.debugLineNum = 224;BA.debugLine="updateStamps";
Debug.ShouldStop(-2147483648);
_updatestamps();
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
public static RemoteObject  _updatestamps() throws Exception{
try {
		Debug.PushSubsStack("updateStamps (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,112);
if (RapidSub.canDelegate("updatestamps")) return main.remoteMe.runUserSub(false, "main","updatestamps");
 BA.debugLineNum = 112;BA.debugLine="Private Sub updateStamps";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If CoffeeCount = 6 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 114;BA.debugLine="ToastMessageShow(\" You Have Earned A free Coffee\"";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You Have Earned A free Coffee")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 115;BA.debugLine="Activity.LoadLayout(\"freecoffee\") 'will load 2 la";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("freecoffee")),main.mostCurrent.activityBA);
 BA.debugLineNum = 116;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(524288);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(1048576);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 118;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(2097152);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 119;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(4194304);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(8388608);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 121;BA.debugLine="imgStamp6.Visible = True";
Debug.ShouldStop(16777216);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 124;BA.debugLine="If CoffeeCount = 5 Then 'from 5 to 1 will show ho";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 125;BA.debugLine="ToastMessageShow (\" You still need 1 more stamp i";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 1 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 126;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(536870912);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 128;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 129;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(1);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 130;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(2);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 131;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(4);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 134;BA.debugLine="If CoffeeCount = 4 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 135;BA.debugLine="ToastMessageShow (\" You still need 2 more stamp i";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 2 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 136;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(128);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(256);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 138;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(512);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 139;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(1024);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 140;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(2048);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 141;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(4096);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 143;BA.debugLine="If CoffeeCount = 3 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 144;BA.debugLine="ToastMessageShow (\" You still need 3 more stamp i";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 3 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 145;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(65536);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 146;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(131072);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 147;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(262144);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 148;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(524288);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(1048576);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 150;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(2097152);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 152;BA.debugLine="If CoffeeCount = 2 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 153;BA.debugLine="ToastMessageShow (\" you still need 4  more stamp";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" you still need 4  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 154;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(33554432);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 155;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(67108864);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 156;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(134217728);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 158;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(536870912);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 159;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(1073741824);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 161;BA.debugLine="If CoffeeCount = 1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 162;BA.debugLine="ToastMessageShow (\" You still need 5  more stamp";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 5  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 163;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(4);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 164;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(8);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 165;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 166;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(32);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 167;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(64);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 168;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(128);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 171;BA.debugLine="If CoffeeCount = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 172;BA.debugLine="ToastMessageShow (\" Don't Forget to use your Coff";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" Don't Forget to use your Coffe-E-Card when you buying  a coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 173;BA.debugLine="imgStamp1.Visible = False";
Debug.ShouldStop(4096);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 174;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(8192);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _yes_click() throws Exception{
try {
		Debug.PushSubsStack("yes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,184);
if (RapidSub.canDelegate("yes_click")) return main.remoteMe.runUserSub(false, "main","yes_click");
 BA.debugLineNum = 184;BA.debugLine="Sub yes_Click 'to redeem your free coffee press Ye";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Activity.LoadLayout(\"ABBarcodeTest\")";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ABBarcodeTest")),main.mostCurrent.activityBA);
 BA.debugLineNum = 186;BA.debugLine="Label1.Text = mResult";
Debug.ShouldStop(33554432);
main.mostCurrent._label1.runMethod(true,"setText",(main._mresult));
 BA.debugLineNum = 187;BA.debugLine="myABBarcode.ABGetBarcode(\"myabbarcode\", \"\")";
Debug.ShouldStop(67108864);
main.mostCurrent._myabbarcode.runVoidMethod ("ABGetBarcode",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("myabbarcode")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
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
}