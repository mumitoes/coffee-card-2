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

Dim HtmlCSS As String
HtmlCSS = "table {width: 100%;border: 1px solid #cef;text-align: left; }" _
		& " th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }" _ 
		& "td,th {	padding: 4px 5px; }" _
		& ".odd {background-color: #def; } .odd td {border-bottom: 1px solid #cef; }" _
		& "a { text-decoration:none; color: #000;}"

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
	Private WebView1 As WebView
	Private btnExtras As Button
	Private ScrollView1 As ScrollView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DrinksMenu")
	
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'========================================================= DRINK MENU Layout =================================================================================

Sub loadBackGroundcolours 'Sets backgrouns colours
	myColors = myTheme.loadColours
	For i = 0 To myColors.RowCount - 1 '
		myColors.Position = i 
		Dim bgGradient As GradientDrawable
		Dim colours(2) As Int
		colours(0) = Colors.RGB(myColors.GetInt("BG1Red"),myColors.GetInt("BG1Blue"),myColors.GetInt("BG1Green"))
		colours(1) = Colors.RGB(myColors.GetInt("BG2Red"),myColors.GetInt("BG2Blue"),myColors.GetInt("BG2Green"))
		bgGradient.Initialize("TR_BL", colours)
		pgBackGround.Background=bgGradient
	Next
End Sub

Sub DrinkMenubuttonColours 'Sets button colours
	myButtonColours =myTheme.loadBtnColours
	For i = 0 To myButtonColours.RowCount - 1 
		myButtonColours.Position = i 
		Dim btnRBG As ColorDrawable
		Dim colours As Int
		colours = Colors.RGB(myButtonColours.GetInt("BtnRed"),myButtonColours.GetInt("BtnBlue"),myButtonColours.GetInt("BtnGreen"))
		btnRBG.Initialize(colours, 5)
		btnExtras.background=btnRBG
		btnOrder.background=btnRBG
	Next
End Sub

'Sends the sql to a web view that can be viewed on the design
Sub Drinks_Menu
ListView1.

End Sub

'Sets the sql into a memory table then passes it to the spinner
Sub MemoryTable(SQL As SQL, Query As String, StringArgs() As String, Limit As Int) As List
	Dim cur As Cursor
	If StringArgs <> Null Then 
		cur = SQL.ExecQuery2(Query, StringArgs)
	Else
		cur = SQL.ExecQuery(Query)
	End If
	Log("MemoryTable: " & Query)
	Dim table As List
	table.Initialize
	If Limit > 0 Then Limit = Min(Limit, cur.RowCount) Else Limit = cur.RowCount
	For row = 0 To Limit - 1
		cur.Position = row
		Dim values(cur.ColumnCount) As String
		For col = 0 To cur.ColumnCount - 1
			values(col) = cur.GetString2(col)
		Next
		table.Add(values)
	Next
	cur.Close
	Return table
End Sub
'shows a list of only drink names so they can be selected and added to the cart database
Sub DrinkSpinner(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, Spinner1 As Spinner)
	Spinner1.Clear
	Dim Table As List
	Table = MemoryTable(SQL, Query, StringArgs, Limit)
	Dim Cols() As String
	For i = 0 To Table.Size - 1
		Cols = Table.Get(i)
		Spinner1.Add(Cols(1))
	Next
End Sub

Sub Spinner1_ItemClick (Position As Int, Value As Object)
End Sub

Sub btnOrder_Click

End Sub

Sub btnExtras_Click
	
End Sub

