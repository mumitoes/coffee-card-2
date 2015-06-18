Type=Class
Version=5.02
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
'"THEME METHODS" - loads all methods to calculate theme
Sub Class_Globals
	Dim myColors, myLogo, myContactDeets, myAddress, myButtonColours, myStamp As Cursor
	Dim myData As DatabaseManager
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	myData.Initialize
End Sub

'Load background panel color
Sub LoadBGColours() As GradientDrawable
	myColors = myData.loadColours
	Dim bgGradient As GradientDrawable
	For i = 0 To myColors.RowCount - 1 
		myColors.Position = i 
		Dim colours(2) As Int
		colours(0) = Colors.RGB(myColors.GetInt("BG1Red"),myColors.GetInt("BG1Blue"),myColors.GetInt("BG1Green"))
		colours(1) = Colors.RGB(myColors.GetInt("BG2Red"),myColors.GetInt("BG2Blue"),myColors.GetInt("BG2Green"))
		bgGradient.Initialize("TR_BL", colours)
	Next
		Return bgGradient
End Sub

Sub loadPhone() As String ' method to assign Phone number
	myContactDeets=myData.loadCompanyDetails
	Dim phone As String
	For i = 0 To myContactDeets.RowCount - 1
		myContactDeets.Position=i	
		phone  = myContactDeets.GetString("PhoneCode") & " " & myContactDeets.GetString("PhoneNo")
	Next
		Return phone 
End Sub

Sub loadName() As String ' method to assign company name
	myContactDeets=myData.loadCompanyDetails
	Dim name As String
	For i = 0 To myContactDeets.RowCount - 1
		myContactDeets.Position=i	
		name  = myContactDeets.GetString("Name")
	Next
		Return name 
End Sub


Sub loadDBlogo() As Bitmap 'Assign Logo as string from database to Logo Image
	myLogo=myData.loadLogo
	Dim logo As Bitmap
	For i = 0 To myLogo.RowCount - 1
		myLogo.Position=i
		logo.Initialize(File.DirAssets, myLogo.GetString("Logo"))
	Next
	Return logo
End Sub

Sub loadDBbuttonColours() As ColorDrawable ' method to assign colours to Scan Button
	myButtonColours = myData.loadBtnColours
		Dim btnRBG As ColorDrawable
		Dim colours As Int
	For i = 0 To myButtonColours.RowCount - 1 
		myButtonColours.Position = i 
		colours = Colors.RGB(myButtonColours.GetInt("BtnRed"),myButtonColours.GetInt("BtnBlue"),myButtonColours.GetInt("BtnGreen"))
		btnRBG.Initialize(colours, 10)
	Next
	Return btnRBG
End Sub

Sub loadStamp() As Bitmap ' method to assign stamp image to Stamp Images
	myStamp=myData.loadStampIcon
	For i = 0 To myStamp.RowCount - 1
		myStamp.Position=i
		Dim stamp As Bitmap
		stamp.Initialize(File.DirAssets, myLogo.GetString("StampIcon"))
	Next
	Return stamp
End Sub

Sub loadMap() As String
	myAddress = myData.loadCompanyDetails
	Dim address As String
	Dim url As String
	For i = 0 To myAddress.RowCount - 1
		myAddress.Position = i
		Dim address2 As String
		address2 = myAddress.GetString("Address2")
			If address2 <> Null Then
				address = myAddress.Getstring("Address1") & "+" & myAddress.GetString("Address2") & "+" & myAddress.GetString("Suburb") & "+" & myAddress.GetString("City") 
							Else
				address = myAddress.Getstring("Address1") & "+" & myAddress.GetString("Suburb") & "+" & myAddress.GetString("City") 
			End If
			address = address.Replace(" ", "+")
			url = "https://www.google.com/maps?q=" & address
	Next
	'LogColor(url, Colors.Green)
	Return url
End Sub
