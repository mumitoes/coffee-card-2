
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class drinkextras implements IRemote{
	public static drinkextras mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public drinkextras() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("b4a.example.drinkextras", "b4a.example.drinkextras");
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
		pcBA = new PCBA(this, drinkextras.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mydrinkextras = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _extraselect = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _btnorder = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pgbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btndrinkmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listview2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _spinner2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _companydetails = RemoteObject.declareNull("b4a.example.thememanager");
public static RemoteObject _mytheme = RemoteObject.declareNull("b4a.example.databasemanager");
public static b4a.example.main _main = null;
public static b4a.example.drinkmenu _drinkmenu = null;
public static b4a.example.maplocator _maplocator = null;
public static b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",drinkextras.mostCurrent._activity,"btnDrinkMenu",drinkextras.mostCurrent._btndrinkmenu,"btnOrder",drinkextras.mostCurrent._btnorder,"companyDetails",drinkextras.mostCurrent._companydetails,"DrinkMenu",Debug.moduleToString(b4a.example.drinkmenu.class),"ExtraSelect",drinkextras._extraselect,"ListView2",drinkextras.mostCurrent._listview2,"Main",Debug.moduleToString(b4a.example.main.class),"MapLocator",Debug.moduleToString(b4a.example.maplocator.class),"myDrinkExtras",drinkextras._mydrinkextras,"myTheme",drinkextras.mostCurrent._mytheme,"pgBackGround",drinkextras.mostCurrent._pgbackground,"Spinner2",drinkextras.mostCurrent._spinner2,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
}