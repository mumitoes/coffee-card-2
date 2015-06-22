Type=Class
Version=5.02
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private SQL1 As SQL
	Private cursor1 As Cursor
	Dim myColors As Cursor
	Dim myData As CoffeeTheme
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

	myData.Initialize
	
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
	cursor1=SQL1.ExecQuery("SELECT Name, Address1 , Address2 , Suburb , City , PhoneCode , PhoneNo FROM CompanyDetails")
	Return cursor1
End Sub

'Sub loadColours As Cursor
'	cursor1=SQL1.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")
'	Return cursor1
'End Sub

Sub LoadBGColours() As GradientDrawable
	myColors = myData.loadColours
	For i = 0 To myColors.RowCount - 1 
		myColors.Position = i 
		Dim bgGradient As GradientDrawable
		Dim colours(2) As Int
		colours(0) = Colors.RGB(myColors.GetInt("BG1Red"),myColors.GetInt("BG1Blue"),myColors.GetInt("BG1Green"))
		colours(1) = Colors.RGB(myColors.GetInt("BG2Red"),myColors.GetInt("BG2Blue"),myColors.GetInt("BG2Green"))
		bgGradient.Initialize("TR_BL", colours)
	Next
		Return bgGradient
End Sub