
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("b4a.example.main", "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _card = RemoteObject.declareNull("b4a.example.card");
public static RemoteObject _coffeecount = RemoteObject.createImmutable(0);
public static RemoteObject _btnscan = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imglogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgstamp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgstamp2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgstamp3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgstamp4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgstamp5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgstamp6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblcompanyname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlbg = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlstamp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlstamp2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlstamp3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlstamp4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlstamp5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlstamp6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mytheme = RemoteObject.declareNull("b4a.example.coffeetheme");
public static RemoteObject _scansuccess = RemoteObject.createImmutable(false);
public static RemoteObject _qrscanner = RemoteObject.declareNull("ice.zxing.b4aZXingLib");
public static RemoteObject _no = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _yes = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnorder = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pgbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _spinner1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _btnextras = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _companydetails = RemoteObject.declareNull("b4a.example.address");
public static b4a.example.drinkmenu _drinkmenu = null;
public static b4a.example.drinkextras _drinkextras = null;
public static b4a.example.maplocator _maplocator = null;
public static b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"btnBack",main.mostCurrent._btnback,"btnExtras",main.mostCurrent._btnextras,"btnOrder",main.mostCurrent._btnorder,"btnScan",main.mostCurrent._btnscan,"Card",Debug.moduleToString(b4a.example.card.class),"CoffeeCount",main._coffeecount,"companyDetails",main.mostCurrent._companydetails,"DrinkExtras",Debug.moduleToString(b4a.example.drinkextras.class),"DrinkMenu",Debug.moduleToString(b4a.example.drinkmenu.class),"imgLogo",main.mostCurrent._imglogo,"imgStamp1",main.mostCurrent._imgstamp1,"imgStamp2",main.mostCurrent._imgstamp2,"imgStamp3",main.mostCurrent._imgstamp3,"imgStamp4",main.mostCurrent._imgstamp4,"imgStamp5",main.mostCurrent._imgstamp5,"imgStamp6",main.mostCurrent._imgstamp6,"lblCompanyName",main.mostCurrent._lblcompanyname,"ListView1",main.mostCurrent._listview1,"MapLocator",Debug.moduleToString(b4a.example.maplocator.class),"myTheme",main.mostCurrent._mytheme,"No",main.mostCurrent._no,"pgBackGround",main.mostCurrent._pgbackground,"pnlBG",main.mostCurrent._pnlbg,"pnlStamp1",main.mostCurrent._pnlstamp1,"pnlStamp2",main.mostCurrent._pnlstamp2,"pnlStamp3",main.mostCurrent._pnlstamp3,"pnlStamp4",main.mostCurrent._pnlstamp4,"pnlStamp5",main.mostCurrent._pnlstamp5,"pnlStamp6",main.mostCurrent._pnlstamp6,"qrscanner",main.mostCurrent._qrscanner,"scanSuccess",main._scansuccess,"Spinner1",main.mostCurrent._spinner1,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class),"WebView1",main.mostCurrent._webview1,"Yes",main.mostCurrent._yes};
}
}