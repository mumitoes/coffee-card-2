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
	Private SQLstoreCart As SQL
	Private csrStoreCart As Cursor
	Dim alarmHours, alarmMinutes As Int

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private btnPlaceOrder,btnRemove,btnPickUp As Button
	Private imgBasket, imgLogo, imgItem As ImageView
	Private edtQtyTotal, edtCostTotal As EditText
	Dim pnlCart, pnlItem As Panel
	Dim myTheme As CoffeeTheme
	Dim myDrinkMenu As DrinkMenu
    Dim myDrinkExtra As DrinkExtras
	Dim scvMain As ScrollView 'the scrollview for the shopping cart
	Dim lblCompliment, lblItemName, lblItemDesc, lblItemCost, lblItemsCostSubtotal As Label
	Dim edtItemQty As EditText
		
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("cart")
	scvMain.Initialize(200dip)
	FillScrollView
	myTheme.loadLogo
	myTheme.Initialize
	loadDBlogo
	RunningTotals
	
	End Sub

Public Sub Initialize

'up to date database initialised
	File.Copy(File.DirAssets, "customerthemes.sqlite",File.DirInternal,"customerthemes.sqlite")
	
	If SQLstoreCart.IsInitialized=False Then
	SQLstoreCart.Initialize(File.DirInternal, "customerthemes.sqlite", False)
	End If
End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

Sub loadDBlogo 'Assign Logo as string from database to Logo Image
	csrStoreCart=myTheme.loadLogo
	For i = 0 To csrStoreCart.RowCount - 1
		csrStoreCart.Position=i
		Dim image As Bitmap
		image.Initialize(File.DirAssets, csrStoreCart.GetString("Logo"))
		imgLogo.Bitmap=image
	Next
End Sub


'pulls theme colours in from SQL database for the Scroll View panels
Sub loadPanelColours As Cursor
csrStoreCart=SQLstoreCart.ExecQuery("SELECT BG1Red, BG1Blue, BG1Green, BG2Red, BG2Blue, BG2Green FROM themes")
	For i = 0 To csrStoreCart.RowCount - 1 
		csrStoreCart.Position = i 
		Dim gd1 As GradientDrawable
		Dim colours(2) As Int
		colours(0) = Colors.RGB(csrStoreCart.GetInt("BG1Red"),csrStoreCart.GetInt("BG1Blue"),csrStoreCart.GetInt("BG1Green"))
		colours(1) = Colors.RGB(csrStoreCart.GetInt("BG2Red"),csrStoreCart.GetInt("BG2Blue"),csrStoreCart.GetInt("BG2Green"))
		gd1.Initialize("TOP_BOTTOM",colours)
		pnlItem.background=gd1		
	Next
	Return loadPanelColours
	End Sub
	
	
Sub CoffeePurchasesDB	
	'pulls in database items for purchases from the Coffee Menu
csrStoreCart=SQLstoreCart.ExecQuery("SELECT ID,Name,Description,Cost,picture FROM CoffeeMenu INNER JOIN SELECT ID, CompanyName FROM themes ON CoffeeMenu.ID=themes.ID")
'pulls in database items for purchases from the Extra Menu
csrStoreCart=SQLstoreCart.ExecQuery("SELECT ID,Name,Description,Cost,picture FROM CoffeeExtra INNER JOIN SELECT ID, CompanyName FROM themes ON CoffeeExtras.ID=themes.ID")
End Sub

Sub FillScrollView 'fills the scroll view which contains a panel for each item purchase (each panel has pic, name, desc, qty, cost)
	CoffeePurchasesDB 'databsae call
	loadPanelColours
	 'check through each row in the database to assign a company to the purchase
	For i=0 To csrStoreCart.RowCount-1
		csrStoreCart.Position=i	
	'check through coffee menu spinner index to assign items
	Next		
	
	If myDrinkMenu.spinner1.SelectedIndex=True And myDrinkExtras.spinner1.SelectedIndex=True	Then
		
	'assign NAME, DESCRIPTION, PIC, QTY, COST to each panel
	Dim bitmap As Bitmap
	bitmap.Initialize(File.DirAssets,csrStoreCart .GetString("picture"))'IMAGE - add image of item purchased to panel
	
	lblItemName.Text=csrStoreCart.GetString("Name")'NAME - add name of item purchased to panel
	lblItemDesc.Text=csrStoreCart.GetString("Description")'DESCRIPTION - add description of item purchased to panel
	edtItemQty.Text=csrStoreCart.GetString("Qty")'QTY - add qty of item purchased to panel
	lblItemCost.Text=csrStoreCart.GetString("Cost")'COST - add cost of item purchased to panel
	lblItemsCostSubtotal.Text=costCalc
	End If
	
	csrStoreCart.Close
End Sub

Sub RunningTotals

Dim quantity As String
Dim cost As String

	For Each myDrinkMenu.spinner1.SelectedIndex And myDrinkExtras.spinner1.SelectedIndex
	
	If edtItemQty.Text <> "0" Or lblItemCost.Text <> "0" Then
	quantity=edtItemQty.Text
	cost=lblItemsCostSubtotal.Text
	
	edtQtyTotal.Text=quantity
	edtCostTotal.Text=cost
		
	End If
	Next
	
End Sub

Sub costCalc
If edtItemQty.Text >1 Then
lblItemsCostSubtotal.Text = edtItemQty.Text * lblItemCost.Text
End If
End Sub


Sub btnPickUp_Click
Dim td As TimeDialog 'the dialog from the dialog library
td.Hour = alarmHours
td.Minute = alarmMinutes
'set the display text and buttons
If td.Show("Select time to activate alarm", "", "Ok", "Cancel", "", Null) = DialogResponse.POSITIVE Then
alarmHours = td.Hour
alarmMinutes = td.Minute
End If
End Sub

Sub btnPlaceOrder_Click
 'Activity.LoadLayout("confirmation") 'will take user to confirmation screen
 UpdateOrderDatabase
End Sub

Sub btnRemove_Click
scvMain.Panel.RemoveView
End Sub

Sub UpdateOrderDatabase
	'Inserts new order into database
	csrStoreCart=SQLstoreCart.ExecQuery("INSERT INTO CoffeePurchases (CustomerID,Picture,Description,Qty,Cost,PickUpTime)" & "VALUES (@CustID,@picture,@name,@desc,@Qty@,@Cost,@PickUp")
End Sub