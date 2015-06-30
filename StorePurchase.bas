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
	
	Private csrStoreCart As Cursor
	'Private csrCoffeePurchase As Cursor
'	Private csrCoffeeExtra As Cursor
	Dim alarmHours, alarmMinutes As Int

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private btnPlaceOrder,btnRemove,btnPickUp, btnBack As Button
	Private imgBasket, imgLogo, imgItem As ImageView
	Private edtQtyTotal, edtCostTotal As EditText
	Dim pnlCart, pnlItem As Panel
	Dim scvMain As ScrollView 'the scrollview for the shopping cart
	Dim lblCompliment, lblItemName, lblItemCost, lblItemsCostSubtotal As Label
	Dim edtItemQty As EditText
	Dim myTheme As ThemeManager
	Dim myDB As DatabaseManager
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("cart")
	'scvMain.Initialize(200dip)
	myTheme.Initialize
	myDB.Initialize
	myDB.loadLogo
	cartLayout
	FillScrollView
	End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

Sub cartLayout
	pnlCart.Background=myTheme.LoadBGColours()
	imgLogo.Bitmap=myTheme.loadDBlogo() 'Logo called in from database
	btnPickUp.Background=myTheme.loadDBbuttonColours()
	btnPlaceOrder.Background=myTheme.loadDBbuttonColours()
	btnBack.Background=myTheme.loadDBbuttonColours()

End Sub	
	

Sub FillScrollView 'fills the scroll view which contains a panel for each item purchase (each panel has pic, name, desc, qty, cost)
 		
	
	'check through coffee menu spinner index to assign items
	'assign NAME, PIC, COST to each panel - qty manually entered

	'selectedCoffee=csrStoreCart=myDB.SelectDrinkValue
	Dim purchase As Bitmap
	Dim drink As String =  DrinkMenu.selecteddrink
	LogColor(drink,Colors.Green)
	
	csrStoreCart=myDB.SelectDrinkValue
	For i =0 To csrStoreCart.RowCount-1
	csrStoreCart.Position=i
	
	purchase.Initialize(File.DirAssets,csrStoreCart.GetString("picture"))'IMAGE - add image of item purchased to panel	
	lblItemName.Text=csrStoreCart.GetString("CoffeeName")'NAME - add name of item purchased to panel
	lblItemCost.Text=csrStoreCart.GetDouble ("Cost")'COST - add cost of item purchased to panel
	imgItem.Bitmap=purchase
	
	Next
	
	
	'check through coffee extras spinner index to assign items
	'csrCoffeeExtra=myDB.CoffeeExtrasPurchaseDB
'	Dim extra As String =  DrinkExtras.selectedextras
'	LogColor(extra,Colors.Green)
'	csrStoreCart=myDB.SelectExtrasValue
'	For i =0 To csrStoreCart.RowCount-1
'	csrStoreCart.Position=i
'	'If csrStoreCart.GetString("Description")=DrinkExtras.selectedextras Then
'	
''	purchase.Initialize(File.DirAssets,csrStoreCart.GetString("picture"))'IMAGE - add image of item purchased to panel	
''	lblItemName.Text=csrStoreCart.GetString("Name")'NAME - add name of item purchased to panel
'	lblItemDesc.Text=csrStoreCart.GetString("Description")'DESCRIPTION - add description of item purchased to panel
'	lblItemCost.Text=csrStoreCart.GetString("Cost")'COST - add cost of item purchased to panel
'	LogColor(lblItemCost.Text,Colors.Green)
'	'lblItemsCostSubtotal.Text=costCalc
''	imgItem.Bitmap=purchase
''	End If
'	Next
'	csrCoffeeExtra.Close
'	csrCoffeePurchase.Close
	csrStoreCart.Close
End Sub

'when qty manually entered the total cost is cacluated on the panel
Sub edtItemQty_TextChanged(Old As String, New As String)
	Dim qty As Int=0
	Dim Cost As Float=0
	Dim CostSubtotal As Float =0 
		
	qty=edtItemQty.Text
	Cost=lblItemCost.Text
	CostSubtotal = qty * Cost
lblItemsCostSubtotal.Text=CostSubtotal 'qty times by item cost

edtQtyTotal.Text=(qty)
'lvQtyTotal.AddSingleLine(qty=qty+1)
LogColor(qty,Colors.Blue)
edtCostTotal.Text=(CostSubtotal)
'lvCostTotal.AddSingleLine(CostSubtotal=CostSubtotal+1)
LogColor(CostSubtotal,Colors.Blue)


End Sub


Sub btnRemove_Click
pnlItem.RemoveView
End Sub

Sub btnBack_Click' add more to cart
'If btnBack_Click=True Then 'save existing panel item values to temporary text file

StartActivity("DrinkMenu")
'If btnPlaceOrder_Click=True Then 'clear temporary text file when place order is confirmed

End Sub

Sub btnPickUp_Click

Dim td As TimeDialog 'the dialog from the dialog library
td.Hour = alarmHours
td.Minute = alarmMinutes
'set the display text and buttons
If td.Show("Convenient Pick Up Time", "", "Ok", "Cancel", "", Null) = DialogResponse.POSITIVE Then
alarmHours = td.Hour
alarmMinutes = td.Minute
'add pick up time to the temporary text file
End If
End Sub

Sub btnPlaceOrder_Click

 'Activity.LoadLayout("confirmation") 'will take user to confirmation screen
myDB.UpdateOrderDatabase
End Sub

