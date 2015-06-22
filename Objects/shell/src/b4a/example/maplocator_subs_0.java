package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class maplocator_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (maplocator) ","maplocator",7,maplocator.mostCurrent.activityBA,maplocator.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) return maplocator.remoteMe.runUserSub(false, "maplocator","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"MapLocation2\")";
Debug.ShouldStop(8388608);
maplocator.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapLocation2")),maplocator.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="companyDetails.Initialize";
Debug.ShouldStop(33554432);
maplocator.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_initialize",maplocator.processBA);
 BA.debugLineNum = 28;BA.debugLine="loadLayout";
Debug.ShouldStop(134217728);
_loadlayout();
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (maplocator) ","maplocator",7,maplocator.mostCurrent.activityBA,maplocator.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) return maplocator.remoteMe.runUserSub(false, "maplocator","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (maplocator) ","maplocator",7,maplocator.mostCurrent.activityBA,maplocator.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) return maplocator.remoteMe.runUserSub(false, "maplocator","activity_resume");
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private lblCompanyName, lblPhone As Label";
maplocator.mostCurrent._lblcompanyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
maplocator.mostCurrent._lblphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PnlBg As Panel";
maplocator.mostCurrent._pnlbg = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private imgLogo As ImageView";
maplocator.mostCurrent._imglogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim companyDetails As ThemeManager";
maplocator.mostCurrent._companydetails = RemoteObject.createNew ("b4a.example.thememanager");
 //BA.debugLineNum = 19;BA.debugLine="Private WebView1 As WebView";
maplocator.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loadlayout() throws Exception{
try {
		Debug.PushSubsStack("loadLayout (maplocator) ","maplocator",7,maplocator.mostCurrent.activityBA,maplocator.mostCurrent,40);
if (RapidSub.canDelegate("loadlayout")) return maplocator.remoteMe.runUserSub(false, "maplocator","loadlayout");
 BA.debugLineNum = 40;BA.debugLine="Sub loadLayout";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="PnlBg.Background = companyDetails.LoadBGColours()";
Debug.ShouldStop(512);
maplocator.mostCurrent._pnlbg.runMethod(false,"setBackground",(maplocator.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loadbgcolours").getObject()));
 BA.debugLineNum = 43;BA.debugLine="lblPhone.Text = companyDetails.loadPhone() 'Phone";
Debug.ShouldStop(1024);
maplocator.mostCurrent._lblphone.runMethod(true,"setText",(maplocator.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loadphone")));
 BA.debugLineNum = 44;BA.debugLine="lblCompanyName.Text = companyDetails.loadName() '";
Debug.ShouldStop(2048);
maplocator.mostCurrent._lblcompanyname.runMethod(true,"setText",(maplocator.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loadname")));
 BA.debugLineNum = 45;BA.debugLine="imgLogo.Bitmap = companyDetails.loadDBlogo() 'Log";
Debug.ShouldStop(4096);
maplocator.mostCurrent._imglogo.runMethod(false,"setBitmap",(maplocator.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loaddblogo").getObject()));
 BA.debugLineNum = 46;BA.debugLine="WebView1.Loadurl(companyDetails.loadMap())";
Debug.ShouldStop(8192);
maplocator.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(maplocator.mostCurrent._companydetails.runClassMethod (b4a.example.thememanager.class, "_loadmap")));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}