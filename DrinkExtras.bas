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
	Private SelectExtra As Spinner
	Dim companyDetails As Address
	Dim myTheme As CoffeeTheme
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Extras")
	
	
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
For i = 0 To myDrinkExtras.RowCount -1
myDrinkExtras.Position = i
ListView2.AddSingleLine(myDrinkExtras.GetInt("ID") & " : " & myDrinkExtras.GetString("Description") & " " & myDrinkExtras.GetInt("Cost"))

ListView2.SingleLineLayout.ItemHeight = 350
ListView2.SingleLineLayout.Label.TextSize = 35
ListView2.SingleLineLayout.Label.TextColor = Colors.White
ListView2.SingleLineLayout.Label.Color = Colors.White

Next

End Sub

'shows a list of only drink names so they can be selected and added to the cart database
Sub Drink_Extra_Selector
SelectExtra.Clear
SelectExtra.Add("Description")
If File.Exists(File.DirInternal, "customerthemes.sqlite") Then
SelectExtra.SelectedIndex = SelectExtra.IndexOf (File.ReadString(File.DirInternal,"customerthemes.sqlite"))
Else
SelectExtra.SelectedIndex = 1
End If
	
End Sub

Sub btnOrder_Click

End Sub

Sub btnDrinkMenu_Click
	Activity.LoadLayout("DrinksMenu")
End Sub

