
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class drinkmenu implements IRemote{
	public static drinkmenu mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public drinkmenu() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("b4a.example.drinkmenu", "b4a.example.drinkmenu");
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
		pcBA = new PCBA(this, drinkmenu.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mydrinkmenu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _drinkselect = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _btnorder = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pgbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnextras = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _companydetails = RemoteObject.declareNull("b4a.example.thememanager");
public static RemoteObject _mydb = RemoteObject.declareNull("b4a.example.databasemanager");
public static RemoteObject _spinner1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static b4a.example.main _main = null;
public static b4a.example.drinkextras _drinkextras = null;
public static b4a.example.maplocator _maplocator = null;
public static b4a.example.themecalc _themecalc = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",drinkmenu.mostCurrent._activity,"btnExtras",drinkmenu.mostCurrent._btnextras,"btnOrder",drinkmenu.mostCurrent._btnorder,"companyDetails",drinkmenu.mostCurrent._companydetails,"DrinkExtras",Debug.moduleToString(b4a.example.drinkextras.class),"DrinkSelect",drinkmenu._drinkselect,"ListView1",drinkmenu.mostCurrent._listview1,"Main",Debug.moduleToString(b4a.example.main.class),"MapLocator",Debug.moduleToString(b4a.example.maplocator.class),"myDB",drinkmenu.mostCurrent._mydb,"myDrinkMenu",drinkmenu._mydrinkmenu,"pgBackGround",drinkmenu.mostCurrent._pgbackground,"Spinner1",drinkmenu.mostCurrent._spinner1,"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
}