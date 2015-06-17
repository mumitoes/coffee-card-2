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
Dim myDrinkMenu As Cursor
Dim DrinkSelect As Cursor


End Sub

Sub Globals
	
	Dim myTheme As CoffeeTheme
	Private btnOrder As Button
	Private pgBackGround As Panel
	Private btnExtras As Button
	Private ListView1 As ListView
	Dim companyDetails As Address
	Dim myTheme As CoffeeTheme
	Dim myDB As CoffeeTheme
	Private Spinner1 As Spinner
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DrinksMenu")
	myDB.Initialize
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'========================================================= DRINK MENU Layout =================================================================================

Sub Menu_Layout
pgBackGround.Background = companyDetails.LoadBGColours() 'Background
	btnExtras.Background = companyDetails.loadDBbuttonColours() 'Button colors
	btnOrder.Background = companyDetails.loadDBbuttonColours() 'Button colors
	
End Sub
	

'Sends the sql to a web view that can be viewed on the design
Sub Drink_Menu
ListView1.Clear
myDrinkMenu = myDB.loadCoffeeMenu
For i = 0 To myDrinkMenu.RowCount -1
myDrinkMenu.Position = i
ListView1.AddSingleLine(myDrinkMenu.GetString("ID") & " : " & myDrinkMenu.GetString("Name") & " " & myDrinkMenu.GetString("Description") & " " & myDrinkMenu.GetString("Cost"))

ListView1.SingleLineLayout.ItemHeight = 350
ListView1.SingleLineLayout.Label.TextSize = 35
ListView1.SingleLineLayout.Label.TextColor = Colors.White
ListView1.SingleLineLayout.Label.Color = Colors.White
Next
myDrinkMenu.Close
End Sub

'shows a list of only drink names so they can be selected and added to the cart database
Sub Drink_Selector
Spinner1.Clear
DrinkSelect = myDB.SelectDrink
Spinner1.Add("Name")
If File.Exists(File.DirInternal, "customerthemes.sqlite") Then
Spinner1.SelectedIndex = Spinner1.IndexOf (File.ReadString(File.DirInternal,"customerthemes.sqlite"))
Else
Spinner1.SelectedIndex = 1
End If
	
End Sub

Sub btnOrder_Click

End Sub

Sub btnDrinkExtras_Click
	Activity.LoadLayout("Extras")
End Sub

