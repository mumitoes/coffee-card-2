
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class storepurchase implements IRemote{
	public static storepurchase mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public storepurchase() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("b4a.example.storepurchase", "b4a.example.storepurchase");
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
		pcBA = new PCBA(this, storepurchase.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sqlstorecart = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _csrstorecart = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _alarmhours = RemoteObject.createImmutable(0);
public static RemoteObject _alarmminutes = RemoteObject.createImmutable(0);
public static RemoteObject _btnplaceorder = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnremove = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnpickup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imgbasket = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imglogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _edtqtytotal = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edtcosttotal = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _pnlcart = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mytheme = RemoteObject.declareNull("b4a.example.coffeetheme");
public static RemoteObject _scvmain = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _lblcompliment = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblitemname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblitemdesc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblitemcost = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edtitemqty = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",storepurchase.mostCurrent._activity,"alarmHours",storepurchase._alarmhours,"alarmMinutes",storepurchase._alarmminutes,"btnPickUp",storepurchase.mostCurrent._btnpickup,"btnPlaceOrder",storepurchase.mostCurrent._btnplaceorder,"btnRemove",storepurchase.mostCurrent._btnremove,"csrStoreCart",storepurchase._csrstorecart,"edtCostTotal",storepurchase.mostCurrent._edtcosttotal,"edtItemQty",storepurchase.mostCurrent._edtitemqty,"edtQtyTotal",storepurchase.mostCurrent._edtqtytotal,"imgBasket",storepurchase.mostCurrent._imgbasket,"imgItem",storepurchase.mostCurrent._imgitem,"imgLogo",storepurchase.mostCurrent._imglogo,"lblCompliment",storepurchase.mostCurrent._lblcompliment,"lblItemCost",storepurchase.mostCurrent._lblitemcost,"lblItemDesc",storepurchase.mostCurrent._lblitemdesc,"lblItemName",storepurchase.mostCurrent._lblitemname,"Main",Debug.moduleToString(b4a.example.main.class),"myTheme",storepurchase.mostCurrent._mytheme,"pnlCart",storepurchase.mostCurrent._pnlcart,"pnlItem",storepurchase.mostCurrent._pnlitem,"scvMain",storepurchase.mostCurrent._scvmain,"SQLstoreCart",storepurchase._sqlstorecart,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
}