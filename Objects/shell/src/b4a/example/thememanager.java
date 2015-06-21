
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class thememanager implements IRemote{
	public static thememanager mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public thememanager() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, thememanager.class);
    private PCBA pcBA;
    public RemoteObject ba;
    public RemoteObject ref;
	public RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), RemoteObject.addItemToArray(ref, args));
	}
    public void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        ref = (RemoteObject) args[0];
        ba = (RemoteObject) args[2];
		pcBA = new PCBA(null, thememanager.class);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mycolors = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _mylogo = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _mycontactdeets = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _myaddress = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _mybuttoncolours = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _mystamp = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _mydata = RemoteObject.declareNull("b4a.example.databasemanager");
public static b4a.example.main _main = null;
public static b4a.example.drinkmenu _drinkmenu = null;
public static b4a.example.drinkextras _drinkextras = null;
public static b4a.example.maplocator _maplocator = null;
public static b4a.example.themecalc _themecalc = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"myAddress",_ref.getField(false, "_myaddress"),"myButtonColours",_ref.getField(false, "_mybuttoncolours"),"myColors",_ref.getField(false, "_mycolors"),"myContactDeets",_ref.getField(false, "_mycontactdeets"),"myData",_ref.getField(false, "_mydata"),"myLogo",_ref.getField(false, "_mylogo"),"myStamp",_ref.getField(false, "_mystamp")};
}
}