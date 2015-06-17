Type=Class
Version=5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private SQLstoreCart As SQL
	Private csrStoreCart As Cursor
	
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize


'update database to menu items database
File.Copy(File.DirAssets, "customerthemes.sqlite",File.DirInternal,"customerthemes.sqlite")
	
	If SQLstoreCart.IsInitialized=False Then
	SQLstoreCart.Initialize(File.DirInternal, "customerthemes.sqlite", False)
	End If

imgPurchase.Initialize(File.DirAssets, "menuItem.jpg")  'loads image purchased


End Sub

'pulls theme colours in from SQL database
Sub loadSCVColours As Cursor
csrStoreCart=SQLstoreCart.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")
Return 
End Sub


'pulls in Sql query from database
Sub LoadPurchase As Cursor

csrStoreCart=SQLstoreCart.ExecQuery("   ") 'enter SQL query here from joint query
Return
End Sub


