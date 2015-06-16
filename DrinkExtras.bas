Type=Activity
Version=5.02
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
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
Dim myDrinkExtras As Cursor
Dim ExtraSelect As Cursor

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

Sub ExtrasLayout
pgBackGround.Background = companyDetails.LoadBGColours() 'Background
	btnDrinkMenu.Background = companyDetails.loadDBbuttonColours() 'Button colors
	btnOrder.Background = companyDetails.loadDBbuttonColours() 'Button colors

'Sends the sql to a web view that can be viewed on the design
Sub Drinks_Menu
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

