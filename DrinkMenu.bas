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
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
Dim myColors As Cursor
Dim myLogo As Cursor
Dim myCoName As Cursor
Dim myStamp As Cursor
Dim Card As Card
Dim CoffeeCount As Int
Dim myButtonColours As Cursor
Dim myDrinkMenu As Cursor
Dim DrinkSelect As Cursor


End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

'Design members generated for the Coffee Theme Layout (Stamp images, Logo Image, Company Name label, Scan button)
	Dim Card As Card 
	Private btnScan As Button
	Private imgLogo As ImageView
	Private imgStamp1, imgStamp2, imgStamp3, imgStamp4, imgStamp5, imgStamp6 As ImageView
	Private lblCompanyName As Label
	Private pnlBG As Panel
	Private pnlStamp1, pnlStamp2, pnlStamp3, pnlStamp4, pnlStamp5, pnlStamp6 As Panel
	
	Dim myTheme As CoffeeTheme
	Dim scanSuccess As Boolean
	Dim qrscanner As JhsIceZxing1
	Private No As Button
	Private Yes As Button
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

