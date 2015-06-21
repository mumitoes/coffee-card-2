package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(8388608);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="myTheme.Initialize ' initialise theme database on";
Debug.ShouldStop(67108864);
main.mostCurrent._mytheme.runClassMethod (b4a.example.coffeetheme.class, "_initialize",main.processBA);
 BA.debugLineNum = 60;BA.debugLine="companyDetails.Initialize 'initialise methods to";
Debug.ShouldStop(134217728);
main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_initialize",main.processBA);
 BA.debugLineNum = 61;BA.debugLine="loadLayout";
Debug.ShouldStop(268435456);
_loadlayout();
 BA.debugLineNum = 64;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,90);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 90;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 86;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
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
public static RemoteObject  _btnno_click() throws Exception{
try {
		Debug.PushSubsStack("btnno_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,176);
if (RapidSub.canDelegate("btnno_click")) return main.remoteMe.runUserSub(false, "main","btnno_click");
 BA.debugLineNum = 176;BA.debugLine="Sub btnno_Click ' you can also save and redeem lat";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Activity.LoadLayout(\"main\") 'will return to main";
Debug.ShouldStop(65536);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
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
public static RemoteObject  _btnscan_click() throws Exception{
try {
		Debug.PushSubsStack("btnScan_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,163);
if (RapidSub.canDelegate("btnscan_click")) return main.remoteMe.runUserSub(false, "main","btnscan_click");
 BA.debugLineNum = 163;BA.debugLine="Sub btnScan_Click 'in order to bring information a";
Debug.ShouldStop(4);
 BA.debugLineNum = 165;BA.debugLine="StartActivity(DrinkExtras)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((main.mostCurrent._drinkextras.getObject())));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnScan_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,180);
if (RapidSub.canDelegate("btnscan_longclick")) return main.remoteMe.runUserSub(false, "main","btnscan_longclick");
 BA.debugLineNum = 180;BA.debugLine="Sub btnScan_LongClick ' in order to scan the barco";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="qrscanner.isportrait = True";
Debug.ShouldStop(1048576);
main.mostCurrent._qrscanner.setField ("isportrait",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 182;BA.debugLine="qrscanner.useFrontCam = False";
Debug.ShouldStop(2097152);
main.mostCurrent._qrscanner.setField ("useFrontCam",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 185;BA.debugLine="qrscanner.timeoutDuration = 30";
Debug.ShouldStop(16777216);
main.mostCurrent._qrscanner.setField ("timeoutDuration",BA.numberCast(int.class, 30));
 BA.debugLineNum = 189;BA.debugLine="qrscanner.theViewFinderXfactor = 0.7";
Debug.ShouldStop(268435456);
main.mostCurrent._qrscanner.setField ("theViewFinderXfactor",BA.numberCast(double.class, 0.7));
 BA.debugLineNum = 190;BA.debugLine="qrscanner.theViewFinderYfactor = 0.5";
Debug.ShouldStop(536870912);
main.mostCurrent._qrscanner.setField ("theViewFinderYfactor",BA.numberCast(double.class, 0.5));
 BA.debugLineNum = 192;BA.debugLine="qrscanner.theFrameColor = Colors.LightGray";
Debug.ShouldStop(-2147483648);
main.mostCurrent._qrscanner.setField ("theFrameColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 193;BA.debugLine="qrscanner.theLaserColor = Colors.Red";
Debug.ShouldStop(1);
main.mostCurrent._qrscanner.setField ("theLaserColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 194;BA.debugLine="qrscanner.theMaskColor = Colors.argb(95, 0, 0, 25";
Debug.ShouldStop(2);
main.mostCurrent._qrscanner.setField ("theMaskColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 95)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 195;BA.debugLine="qrscanner.theResultColor = Colors.Green";
Debug.ShouldStop(4);
main.mostCurrent._qrscanner.setField ("theResultColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 196;BA.debugLine="qrscanner.theResultPointColor = Colors.Red";
Debug.ShouldStop(8);
main.mostCurrent._qrscanner.setField ("theResultPointColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 198;BA.debugLine="qrscanner.theBottomPromptMessage = \"Scan Your Cof";
Debug.ShouldStop(32);
main.mostCurrent._qrscanner.setField ("theBottomPromptMessage",BA.ObjectToString("Scan Your Coffee Stamp."));
 BA.debugLineNum = 199;BA.debugLine="qrscanner.theBottomPromptTextSize = 5%y";
Debug.ShouldStop(64);
main.mostCurrent._qrscanner.setField ("theBottomPromptTextSize",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 200;BA.debugLine="qrscanner.bottomPromptColor = Colors.Yellow";
Debug.ShouldStop(128);
main.mostCurrent._qrscanner.setField ("bottomPromptColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 201;BA.debugLine="qrscanner.bottomPromptDistanceFromBottom = 5%y";
Debug.ShouldStop(256);
main.mostCurrent._qrscanner.setField ("bottomPromptDistanceFromBottom",main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA));
 BA.debugLineNum = 203;BA.debugLine="scanSuccess = False";
Debug.ShouldStop(1024);
main._scansuccess = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 204;BA.debugLine="qrscanner.BeginScan(\"scanner\")	'This is the funct";
Debug.ShouldStop(2048);
main.mostCurrent._qrscanner.runVoidMethod ("BeginScan",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("scanner")));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
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
public static RemoteObject  _btnyes_click() throws Exception{
try {
		Debug.PushSubsStack("btnyes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,170);
if (RapidSub.canDelegate("btnyes_click")) return main.remoteMe.runUserSub(false, "main","btnyes_click");
 BA.debugLineNum = 170;BA.debugLine="Sub btnyes_Click 'to redeem your free coffee press";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="CoffeeCount = 0";
Debug.ShouldStop(1024);
main._coffeecount = BA.numberCast(int.class, 0);
 BA.debugLineNum = 172;BA.debugLine="updateStamps";
Debug.ShouldStop(2048);
_updatestamps();
 BA.debugLineNum = 173;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 30;BA.debugLine="Dim Card As Card";
main.mostCurrent._card = RemoteObject.createNew ("b4a.example.card");
 //BA.debugLineNum = 31;BA.debugLine="Private btnScan As Button";
main.mostCurrent._btnscan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private imgLogo As ImageView";
main.mostCurrent._imglogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private imgStamp1, imgStamp2, imgStamp3, imgStamp";
main.mostCurrent._imgstamp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imgstamp6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblCompanyName As Label";
main.mostCurrent._lblcompanyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private pnlBG As Panel";
main.mostCurrent._pnlbg = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private pnlStamp1, pnlStamp2, pnlStamp3, pnlStamp";
main.mostCurrent._pnlstamp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pnlstamp6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim myTheme As CoffeeTheme";
main.mostCurrent._mytheme = RemoteObject.createNew ("b4a.example.coffeetheme");
 //BA.debugLineNum = 39;BA.debugLine="Dim scanSuccess As Boolean";
main._scansuccess = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 40;BA.debugLine="Dim qrscanner As JhsIceZxing1";
main.mostCurrent._qrscanner = RemoteObject.createNew ("ice.zxing.b4aZXingLib");
 //BA.debugLineNum = 41;BA.debugLine="Private No As Button";
main.mostCurrent._no = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Yes As Button";
main.mostCurrent._yes = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private btnBack As Button";
main.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private btnOrder As Button";
main.mostCurrent._btnorder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private pgBackGround As Panel";
main.mostCurrent._pgbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Spinner1 As Spinner";
main.mostCurrent._spinner1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private WebView1 As WebView";
main.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private btnExtras As Button";
main.mostCurrent._btnextras = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private ListView1 As ListView";
main.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Dim companyDetails As Address";
main.mostCurrent._companydetails = RemoteObject.createNew ("b4a.example.address");
 //BA.debugLineNum = 51;BA.debugLine="Dim myTheme As CoffeeTheme";
main.mostCurrent._mytheme = RemoteObject.createNew ("b4a.example.coffeetheme");
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loadlayout() throws Exception{
try {
		Debug.PushSubsStack("loadLayout (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("loadlayout")) return main.remoteMe.runUserSub(false, "main","loadlayout");
 BA.debugLineNum = 69;BA.debugLine="Sub loadLayout";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="pnlBG.Background = companyDetails.LoadBGColours()";
Debug.ShouldStop(64);
main.mostCurrent._pnlbg.runMethod(false,"setBackground",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadbgcolours").getObject()));
 BA.debugLineNum = 72;BA.debugLine="lblCompanyName.Text = companyDetails.loadName() '";
Debug.ShouldStop(128);
main.mostCurrent._lblcompanyname.runMethod(true,"setText",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadname")));
 BA.debugLineNum = 73;BA.debugLine="imgLogo.Bitmap = companyDetails.loadDBlogo() 'Log";
Debug.ShouldStop(256);
main.mostCurrent._imglogo.runMethod(false,"setBitmap",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loaddblogo").getObject()));
 BA.debugLineNum = 74;BA.debugLine="btnScan.Background = companyDetails.loadDBbuttonC";
Debug.ShouldStop(512);
main.mostCurrent._btnscan.runMethod(false,"setBackground",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loaddbbuttoncolours").getObject()));
 BA.debugLineNum = 75;BA.debugLine="imgStamp1.Bitmap = companyDetails.loadStamp()'loa";
Debug.ShouldStop(1024);
main.mostCurrent._imgstamp1.runMethod(false,"setBitmap",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadstamp").getObject()));
 BA.debugLineNum = 76;BA.debugLine="imgStamp2.Bitmap = companyDetails.loadStamp()'loa";
Debug.ShouldStop(2048);
main.mostCurrent._imgstamp2.runMethod(false,"setBitmap",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadstamp").getObject()));
 BA.debugLineNum = 77;BA.debugLine="imgStamp3.Bitmap = companyDetails.loadStamp()'loa";
Debug.ShouldStop(4096);
main.mostCurrent._imgstamp3.runMethod(false,"setBitmap",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadstamp").getObject()));
 BA.debugLineNum = 78;BA.debugLine="imgStamp4.Bitmap = companyDetails.loadStamp()'loa";
Debug.ShouldStop(8192);
main.mostCurrent._imgstamp4.runMethod(false,"setBitmap",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadstamp").getObject()));
 BA.debugLineNum = 79;BA.debugLine="imgStamp5.Bitmap = companyDetails.loadStamp()'loa";
Debug.ShouldStop(16384);
main.mostCurrent._imgstamp5.runMethod(false,"setBitmap",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadstamp").getObject()));
 BA.debugLineNum = 80;BA.debugLine="imgStamp6.Bitmap = companyDetails.loadStamp()'loa";
Debug.ShouldStop(32768);
main.mostCurrent._imgstamp6.runMethod(false,"setBitmap",(main.mostCurrent._companydetails.runClassMethod (b4a.example.address.class, "_loadstamp").getObject()));
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
drinkmenu_subs_0._process_globals();
drinkextras_subs_0._process_globals();
maplocator_subs_0._process_globals();
themecalc_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
coffeetheme.myClass = BA.getDeviceClass ("b4a.example.coffeetheme");
card.myClass = BA.getDeviceClass ("b4a.example.card");
data.myClass = BA.getDeviceClass ("b4a.example.data");
drinkmenu.myClass = BA.getDeviceClass ("b4a.example.drinkmenu");
drinkextras.myClass = BA.getDeviceClass ("b4a.example.drinkextras");
address.myClass = BA.getDeviceClass ("b4a.example.address");
maplocator.myClass = BA.getDeviceClass ("b4a.example.maplocator");
coffeestamp.myClass = BA.getDeviceClass ("b4a.example.coffeestamp");
themecalc.myClass = BA.getDeviceClass ("b4a.example.themecalc");
thememanager.myClass = BA.getDeviceClass ("b4a.example.thememanager");
databasemanager.myClass = BA.getDeviceClass ("b4a.example.databasemanager");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim Card As Card";
main.mostCurrent._card = RemoteObject.createNew ("b4a.example.card");
 //BA.debugLineNum = 21;BA.debugLine="Dim CoffeeCount As Int";
main._coffeecount = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scanner_noscan(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("scanner_noscan (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,218);
if (RapidSub.canDelegate("scanner_noscan")) return main.remoteMe.runUserSub(false, "main","scanner_noscan", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 218;BA.debugLine="Sub scanner_noscan(atype As String,Values As Strin";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 BA.debugLineNum = 220;BA.debugLine="Msgbox(Values,\"Scan Failed\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(_values),(Object)(RemoteObject.createImmutable("Scan Failed")),main.mostCurrent.activityBA);
 BA.debugLineNum = 222;BA.debugLine="End Sub";
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
public static RemoteObject  _scanner_result(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("scanner_result (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,209);
if (RapidSub.canDelegate("scanner_result")) return main.remoteMe.runUserSub(false, "main","scanner_result", _atype, _values);
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 209;BA.debugLine="Sub scanner_result(atype As String,Values As Strin";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="If Values <> \"Null\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_values,BA.ObjectToString("Null"))) { 
 BA.debugLineNum = 211;BA.debugLine="scanSuccess = True";
Debug.ShouldStop(262144);
main._scansuccess = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 212;BA.debugLine="CoffeeCount = CoffeeCount + 1";
Debug.ShouldStop(524288);
main._coffeecount = RemoteObject.solve(new RemoteObject[] {main._coffeecount,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 213;BA.debugLine="Log(\"type:\" & atype &  \"Values:\" & Values)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("Values:"),_values)));
 };
 BA.debugLineNum = 215;BA.debugLine="updateStamps";
Debug.ShouldStop(4194304);
_updatestamps();
 BA.debugLineNum = 216;BA.debugLine="End Sub";
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
public static RemoteObject  _updatestamps() throws Exception{
try {
		Debug.PushSubsStack("updateStamps (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,94);
if (RapidSub.canDelegate("updatestamps")) return main.remoteMe.runUserSub(false, "main","updatestamps");
 BA.debugLineNum = 94;BA.debugLine="Private Sub updateStamps";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If CoffeeCount = 6 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 96;BA.debugLine="ToastMessageShow(\" You Have Earned A free Coffee\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You Have Earned A free Coffee")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 97;BA.debugLine="Activity.LoadLayout(\"freecoffee\") 'will load 2 la";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("freecoffee")),main.mostCurrent.activityBA);
 BA.debugLineNum = 98;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(2);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(4);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 100;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(8);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(16);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(32);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 103;BA.debugLine="imgStamp6.Visible = True";
Debug.ShouldStop(64);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 106;BA.debugLine="If CoffeeCount = 5 Then 'from 5 to 1 will show ho";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 107;BA.debugLine="ToastMessageShow (\" You still need 1 more stamp i";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 1 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 108;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(2048);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 109;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(4096);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(8192);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(16384);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="imgStamp5.Visible = True";
Debug.ShouldStop(32768);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 113;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(65536);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 116;BA.debugLine="If CoffeeCount = 4 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 117;BA.debugLine="ToastMessageShow (\" You still need 2 more stamp i";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 2 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 118;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(2097152);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 119;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(4194304);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(8388608);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 121;BA.debugLine="imgStamp4.Visible = True";
Debug.ShouldStop(16777216);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 122;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 123;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 125;BA.debugLine="If CoffeeCount = 3 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 126;BA.debugLine="ToastMessageShow (\" You still need 3 more stamp i";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 3 more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 127;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 128;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 129;BA.debugLine="imgStamp3.Visible = True";
Debug.ShouldStop(1);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 130;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(2);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 131;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(4);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 132;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(8);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 134;BA.debugLine="If CoffeeCount = 2 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 135;BA.debugLine="ToastMessageShow (\" you still need 4  more stamp";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" you still need 4  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 136;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(128);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="imgStamp2.Visible = True";
Debug.ShouldStop(256);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 138;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(512);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 139;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(1024);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 140;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(2048);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 141;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(4096);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 143;BA.debugLine="If CoffeeCount = 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 144;BA.debugLine="ToastMessageShow (\" You still need 5  more stamp";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" You still need 5  more stamp in order to get a free coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 145;BA.debugLine="imgStamp1.Visible = True";
Debug.ShouldStop(65536);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 146;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(262144);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
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
 BA.debugLineNum = 153;BA.debugLine="If CoffeeCount = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._coffeecount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 154;BA.debugLine="ToastMessageShow (\" Don't Forget to use your Coff";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString(" Don't Forget to use your Coffe-E-Card when you buying  a coffee")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 155;BA.debugLine="imgStamp1.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._imgstamp1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 156;BA.debugLine="imgStamp2.Visible = False";
Debug.ShouldStop(134217728);
main.mostCurrent._imgstamp2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="imgStamp3.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._imgstamp3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 158;BA.debugLine="imgStamp4.Visible = False";
Debug.ShouldStop(536870912);
main.mostCurrent._imgstamp4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 159;BA.debugLine="imgStamp5.Visible = False";
Debug.ShouldStop(1073741824);
main.mostCurrent._imgstamp5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 160;BA.debugLine="imgStamp6.Visible = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imgstamp6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 162;BA.debugLine="End Sub";
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
}