Type=Class
Version=5.02
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private SQL1 As SQL
	Private cursor1 As Cursor
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	'  Removed below line as after we made changes to our database they weren't initialised
		'If File.Exists(File.DirInternal, "customerthemes.sqlite")=False Then
	File.Copy(File.DirAssets, "customerthemes.sqlite",File.DirInternal,"customerthemes.sqlite")
	'End If
	
	'if not already initialised then action.
	If SQL1.IsInitialized=False Then
	SQL1.Initialize(File.DirInternal, "customerthemes.sqlite", False)
	End If
End Sub

Sub loadCompanyDetails As Cursor
cursor1=SQL1.ExecQuery("SELECT Address1 , Address2 , Suburb , City , PhoneCode , PhoneNo FROM CompanyDetails")
Return cursor1
End Sub