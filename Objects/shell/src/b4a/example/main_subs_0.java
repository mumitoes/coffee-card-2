package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="myTheme.Initialize ' initialise theme database on";
Debug.ShouldStop(1048576);
main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",main.processBA);
 BA.debugLineNum = 55;BA.debugLine="loadDBlogo";
Debug.ShouldStop(4194304);
_loaddblogo();
 BA.debugLineNum = 56;BA.debugLine="loadDBname";
Debug.ShouldStop(8388608);
_loaddbname();
 BA.debugLineNum = 57;BA.debugLine="loadStamp";
Debug.ShouldStop(16777216);
_loadstamp();
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,106);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 106;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
public static RemoteObject  _btnscan_click() throws Exception{
try {
		Debug.PushSubsStack("btnScan_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,109);
if (RapidSub.canDelegate("btnscan_click")) return main.remoteMe.runUserSub(false, "main","btnscan_click");
 BA.debugLineNum = 109;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
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
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("btnScan_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,188);
if (RapidSub.canDelegate("btnscan_longclick")) return main.remoteMe.runUserSub(false, "main","btnscan_longclick");
 BA.debugLineNum = 188;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="Scanner.Scanqr()";
Debug.ShouldStop(268435456);
main.mostCurrent._scanner.runClassMethod (b4a.example.scan.class, "_scanqr");
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
qrscanner.myClass = BA.getDeviceClass ("b4a.example.qrscanner");
themecalc.myClass = BA.getDeviceClass ("b4a.example.themecalc");
scan.myClass = BA.getDeviceClass ("b4a.example.scan");
data.myClass = BA.getDeviceClass ("b4a.example.data");
qrgenerator.myClass = BA.getDeviceClass ("b4a.example.qrgenerator");
		
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
 //BA.debugLineNum = 44;BA.debugLine="Dim Scanner As Scan";
main.mostCurrent._scanner = RemoteObject.createNew ("b4a.example.scan");
 //BA.debugLineNum = 45;BA.debugLine="Dim myABBarcode As ABZxing";
main.mostCurrent._myabbarcode = RemoteObject.createNew ("com.AB.ABZxing.ABZxing");
 //BA.debugLineNum = 46;BA.debugLine="Dim Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loaddblogo() throws Exception{
try {
		Debug.PushSubsStack("loadDBlogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("loaddblogo")) return main.remoteMe.runUserSub(false, "main","loaddblogo");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 74;BA.debugLine="Sub loadDBlogo 'Load Logo as string from database";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="myLogo=myTheme.loadLogo";
Debug.ShouldStop(1024);
main._mylogo = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadlogo");
 BA.debugLineNum = 76;BA.debugLine="For i = 0 To myLogo.RowCount - 1";
Debug.ShouldStop(2048);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {main._mylogo.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 77;BA.debugLine="myLogo.Position=i";
Debug.ShouldStop(4096);
main._mylogo.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 78;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(8192);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 79;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(16384);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Logo")))));
 BA.debugLineNum = 80;BA.debugLine="imgLogo.Bitmap=image";
Debug.ShouldStop(32768);
main.mostCurrent._imglogo.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("loadDBname (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,84);
if (RapidSub.canDelegate("loaddbname")) return main.remoteMe.runUserSub(false, "main","loaddbname");
int _i = 0;
 BA.debugLineNum = 84;BA.debugLine="Sub loadDBname 'Load company name from database";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="myCoName=myTheme.loadCompanyName";
Debug.ShouldStop(1048576);
main._myconame = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadcompanyname");
 BA.debugLineNum = 86;BA.debugLine="For i = 0 To myCoName.RowCount - 1";
Debug.ShouldStop(2097152);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {main._myconame.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 87;BA.debugLine="myCoName.Position=i";
Debug.ShouldStop(4194304);
main._myconame.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 88;BA.debugLine="lblCompanyName.Text  =myCoName.GetString(\"Compan";
Debug.ShouldStop(8388608);
main.mostCurrent._lblcompanyname.runMethod(true,"setText",(main._myconame.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CompanyName")))));
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
public static RemoteObject  _loadstamp() throws Exception{
try {
		Debug.PushSubsStack("loadStamp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("loadstamp")) return main.remoteMe.runUserSub(false, "main","loadstamp");
int _i = 0;
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 92;BA.debugLine="Sub loadStamp 'load stamp from database";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="myStamp=myTheme.loadStampIcon";
Debug.ShouldStop(268435456);
main._mystamp = main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_loadstampicon");
 BA.debugLineNum = 94;BA.debugLine="For i = 0 To myStamp.RowCount - 1";
Debug.ShouldStop(536870912);
{
final int step47 = 1;
final int limit47 = RemoteObject.solve(new RemoteObject[] {main._mystamp.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 95;BA.debugLine="myStamp.Position=i";
Debug.ShouldStop(1073741824);
main._mystamp.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 96;BA.debugLine="Dim image As Bitmap";
Debug.ShouldStop(-2147483648);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("image", _image);
 BA.debugLineNum = 97;BA.debugLine="image.Initialize(File.DirAssets, myLogo.GetStrin";
Debug.ShouldStop(1);
_image.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._mylogo.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("StampIcon")))));
 BA.debugLineNum = 98;BA.debugLine="imgStamp1.Bitmap=image";
Debug.ShouldStop(2);
main.mostCurrent._imgstamp1.runMethod(false,"setBitmap",(_image.getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("myABBarcode_BarcodeFound (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,191);
if (RapidSub.canDelegate("myabbarcode_barcodefound")) return main.remoteMe.runUserSub(false, "main","myabbarcode_barcodefound", _barcode, _formatname);
Debug.locals.put("barCode", _barcode);
Debug.locals.put("formatName", _formatname);
 BA.debugLineNum = 191;BA.debugLine="Sub myABBarcode_BarcodeFound (barCode As String, f";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Label1.Text = barCode";
Debug.ShouldStop(-2147483648);
main.mostCurrent._label1.runMethod(true,"setText",(_barcode));
 BA.debugLineNum = 193;BA.debugLine="mResult = barCode";
Debug.ShouldStop(1);
main._mresult = _barcode;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
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
public static RemoteObject  _no_click() throws Exception{
try {
		Debug.PushSubsStack("No_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,185);
if (RapidSub.canDelegate("no_click")) return main.remoteMe.runUserSub(false, "main","no_click");
 BA.debugLineNum = 185;BA.debugLine="Sub No_Click ' you can also save and redeem later";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="activity.LoadLayout(\"main\") 'will return to main";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _yes_click() throws Exception{
try {
		Debug.PushSubsStack("yes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,179);
if (RapidSub.canDelegate("yes_click")) return main.remoteMe.runUserSub(false, "main","yes_click");
 BA.debugLineNum = 179;BA.debugLine="Sub yes_Click 'to redeem your free coffee press Ye";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Activity.LoadLayout(\"ABBarcodeTest\")";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ABBarcodeTest")),main.mostCurrent.activityBA);
 BA.debugLineNum = 181;BA.debugLine="Label1.Text = mResult";
Debug.ShouldStop(1048576);
main.mostCurrent._label1.runMethod(true,"setText",(main._mresult));
 BA.debugLineNum = 182;BA.debugLine="myABBarcode.ABGetBarcode(\"myabbarcode\", \"\")";
Debug.ShouldStop(2097152);
main.mostCurrent._myabbarcode.runVoidMethod ("ABGetBarcode",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("myabbarcode")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
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
}