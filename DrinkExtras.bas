Type=Activity
Version=5.02
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
Dim myDrinkExtras As Cursor
Dim ExtraSelect As Cursor
End Sub

Sub Globals
	Private btnOrder As Button
	Private pgBackGround As Panel
	Private btnDrinkMenu As Button
	Private ListView2 As ListView
	Dim Spinner2 As Spinner
	Dim companyDetails As ThemeManager
	Dim myTheme As DatabaseManager
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Extras")
	myTheme.Initialize
	companyDetails.Initialize
	Extras_Layout
	Drink_Extras
	Drink_Extra_Selector
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Extras_Layout
pgBackGround.Background = companyDetails.LoadBGColours() 'Background
	btnDrinkMenu.Background = companyDetails.loadDBbuttonColours() 'Button colors
	btnOrder.Background = companyDetails.loadDBbuttonColours() 'Button colors
End Sub	

'Sends the sql to a web view that can be viewed on the design
Sub Drink_Extras
ListView2.Clear
myDrinkExtras = myTheme.LoadDrinkExtras
For i = 0 To myDrinkExtras.RowCount -1
myDrinkExtras.Position = i
ListView2.AddSingleLine(myDrinkExtras.GetInt("ID") & " : " & myDrinkExtras.GetString("Description") & CRLF & "$" & myDrinkExtras.Getstring("Cost") & "0")

ListView2.SingleLineLayout.ItemHeight = 150
ListView2.SingleLineLayout.Label.TextSize = 15
ListView2.SingleLineLayout.Label.TextColor = Colors.Black
ListView2.SingleLineLayout.Label.Color = Colors.White

Next
myDrinkExtras.Close
End Sub

'shows a list of only drink names so they can be selected and added to the cart database
Sub Drink_Extra_Selector
Spinner2.Clear
ExtraSelect = myTheme.LoadExtraSelect
For i = 0 To ExtraSelect.RowCount -1
ExtraSelect.Position = i
Spinner2.Add(ExtraSelect.GetString("Description"))
If File.Exists(File.DirInternal, "customerthemes.sqlite") Then
Spinner2.SelectedIndex = Spinner2.IndexOf (File.ReadString(File.DirInternal,"customerthemes.sqlite"))
Else
Spinner2.SelectedIndex = 1
End If

Next
	
End Sub

Sub btnOrder_Click

End Sub

Sub btnDrinkMenu_Click
	Activity.LoadLayout("DrinksMenu")
End Sub

