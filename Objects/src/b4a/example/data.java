package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class data extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.data");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.data",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.themecalc _themecalc = null;
public b4a.example.drinkmenu _drinkmenu = null;
public b4a.example.drinkextras _drinkextras = null;
  public Object[] GetGlobals() {
		return new Object[] {"DrinkExtras",Debug.moduleToString(b4a.example.drinkextras.class),"DrinkMenu",Debug.moduleToString(b4a.example.drinkmenu.class),"Main",Debug.moduleToString(b4a.example.main.class),"ThemeCalc",Debug.moduleToString(b4a.example.themecalc.class)};
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _createcard(String _cardname,int _stampcount,int _bonusnumber) throws Exception{
try {
		Debug.PushSubsStack("CreateCard (data) ","data",5,ba,this,40);
Debug.locals.put("CardName", _cardname);
Debug.locals.put("StampCount", _stampcount);
Debug.locals.put("BonusNumber", _bonusnumber);
 BA.debugLineNum = 40;BA.debugLine="Public Sub CreateCard(CardName As String, StampCou";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If(File.Exists(File.DirInternal, CardName) = F";
Debug.ShouldStop(256);
if ((__c.File.Exists(__c.File.getDirInternal(),_cardname)==__c.False)) { 
 BA.debugLineNum = 42;BA.debugLine="File.WriteString(File.DirInternal, CardName, Stam";
Debug.ShouldStop(512);
__c.File.WriteString(__c.File.getDirInternal(),_cardname,BA.NumberToString(_stampcount)+","+BA.NumberToString(_bonusnumber));
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (data) ","data",5,ba,this,8);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int[]  _loadcard(String _cardname) throws Exception{
try {
		Debug.PushSubsStack("LoadCard (data) ","data",5,ba,this,47);
int _bonusnumber = 0;
int _stampcount = 0;
String _carddata = "";
int _splitindex = 0;
int[] _intdata = null;
Debug.locals.put("CardName", _cardname);
 BA.debugLineNum = 47;BA.debugLine="Public Sub LoadCard(CardName As String) As Int()";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim BonusNumber As Int = 7 'defaults";
Debug.ShouldStop(32768);
_bonusnumber = (int) (7);Debug.locals.put("BonusNumber", _bonusnumber);Debug.locals.put("BonusNumber", _bonusnumber);
 BA.debugLineNum = 49;BA.debugLine="Dim StampCount As Int = 0";
Debug.ShouldStop(65536);
_stampcount = (int) (0);Debug.locals.put("StampCount", _stampcount);Debug.locals.put("StampCount", _stampcount);
 BA.debugLineNum = 50;BA.debugLine="Dim cardData As String";
Debug.ShouldStop(131072);
_carddata = "";Debug.locals.put("cardData", _carddata);
 BA.debugLineNum = 52;BA.debugLine="If File.Exists(File.DirInternal, CardName) = Fals";
Debug.ShouldStop(524288);
if (__c.File.Exists(__c.File.getDirInternal(),_cardname)==__c.False) { 
 BA.debugLineNum = 53;BA.debugLine="File.WriteString(File.DirInternal, CardName, \"0,7";
Debug.ShouldStop(1048576);
__c.File.WriteString(__c.File.getDirInternal(),_cardname,"0,7");
 };
 BA.debugLineNum = 56;BA.debugLine="If(File.Exists(File.DirInternal, CardName)) Then";
Debug.ShouldStop(8388608);
if ((__c.File.Exists(__c.File.getDirInternal(),_cardname))) { 
 BA.debugLineNum = 57;BA.debugLine="cardData = File.ReadString(File.DirInternal, Card";
Debug.ShouldStop(16777216);
_carddata = __c.File.ReadString(__c.File.getDirInternal(),_cardname);Debug.locals.put("cardData", _carddata);
 BA.debugLineNum = 58;BA.debugLine="Dim SplitIndex As Int = cardData.IndexOf(\",\")";
Debug.ShouldStop(33554432);
_splitindex = _carddata.indexOf(",");Debug.locals.put("SplitIndex", _splitindex);Debug.locals.put("SplitIndex", _splitindex);
 BA.debugLineNum = 60;BA.debugLine="ToastMessageShow(cardData, True)";
Debug.ShouldStop(134217728);
__c.ToastMessageShow(_carddata,__c.True);
 BA.debugLineNum = 61;BA.debugLine="StampCount = cardData.SubString2(0,SplitIndex)";
Debug.ShouldStop(268435456);
_stampcount = (int)(Double.parseDouble(_carddata.substring((int) (0),_splitindex)));Debug.locals.put("StampCount", _stampcount);
 BA.debugLineNum = 62;BA.debugLine="BonusNumber = cardData.SubString(SplitIndex+1)";
Debug.ShouldStop(536870912);
_bonusnumber = (int)(Double.parseDouble(_carddata.substring((int) (_splitindex+1))));Debug.locals.put("BonusNumber", _bonusnumber);
 };
 BA.debugLineNum = 65;BA.debugLine="Dim IntData(2) As Int";
Debug.ShouldStop(1);
_intdata = new int[(int) (2)];
;Debug.locals.put("IntData", _intdata);
 BA.debugLineNum = 66;BA.debugLine="IntData(0) = StampCount";
Debug.ShouldStop(2);
_intdata[(int) (0)] = _stampcount;Debug.locals.put("IntData", _intdata);
 BA.debugLineNum = 67;BA.debugLine="IntData(1) = BonusNumber";
Debug.ShouldStop(4);
_intdata[(int) (1)] = _bonusnumber;Debug.locals.put("IntData", _intdata);
 BA.debugLineNum = 68;BA.debugLine="Return IntData";
Debug.ShouldStop(8);
if (true) return _intdata;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _savecard(int _coffeecount,int _bonusnumber) throws Exception{
try {
		Debug.PushSubsStack("SaveCard (data) ","data",5,ba,this,13);
int _countfromcard = 0;
Debug.locals.put("CoffeeCount", _coffeecount);
Debug.locals.put("BonusNumber", _bonusnumber);
 BA.debugLineNum = 13;BA.debugLine="Sub SaveCard(CoffeeCount As Int, BonusNumber As In";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="CoffeeCount = 1";
Debug.ShouldStop(8192);
_coffeecount = (int) (1);Debug.locals.put("CoffeeCount", _coffeecount);
 BA.debugLineNum = 15;BA.debugLine="BonusNumber = 7";
Debug.ShouldStop(16384);
_bonusnumber = (int) (7);Debug.locals.put("BonusNumber", _bonusnumber);
 BA.debugLineNum = 16;BA.debugLine="Dim CountFromCard As Int";
Debug.ShouldStop(32768);
_countfromcard = 0;Debug.locals.put("CountFromCard", _countfromcard);
 BA.debugLineNum = 19;BA.debugLine="If File.Exists(File.DirInternal, \"CoffeeCount.txt\"";
Debug.ShouldStop(262144);
if (__c.File.Exists(__c.File.getDirInternal(),"CoffeeCount.txt")==__c.False) { 
 BA.debugLineNum = 20;BA.debugLine="File.WriteString(File.DirInternal, \"CoffeeCount.tx";
Debug.ShouldStop(524288);
__c.File.WriteString(__c.File.getDirInternal(),"CoffeeCount.txt",BA.NumberToString(_coffeecount));
 }else {
 BA.debugLineNum = 24;BA.debugLine="CountFromCard =    File.ReadString(File.DirInterna";
Debug.ShouldStop(8388608);
_countfromcard = (int)(Double.parseDouble(__c.File.ReadString(__c.File.getDirInternal(),"CoffeeCount.txt")));Debug.locals.put("CountFromCard", _countfromcard);
 BA.debugLineNum = 27;BA.debugLine="CountFromCard = CountFromCard + CoffeeCount";
Debug.ShouldStop(67108864);
_countfromcard = (int) (_countfromcard+_coffeecount);Debug.locals.put("CountFromCard", _countfromcard);
 BA.debugLineNum = 30;BA.debugLine="File.WriteString(File.DirInternal, \"CoffeeCount.tx";
Debug.ShouldStop(536870912);
__c.File.WriteString(__c.File.getDirInternal(),"CoffeeCount.txt",BA.NumberToString(_countfromcard));
 };
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
