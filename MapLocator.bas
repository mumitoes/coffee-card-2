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
	Dim compDetails As Cursor

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private lblAddress, lblCompanyName As Label
	Private lblPhone As Label
	
	Dim companyDetails As Address

	Private PnlBg As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MapLocation")
	
	companyDetails.Initialize
	loadPhone
	loadAddress
	
	'=========================set default layout==========================
	PnlBg.Background = companyDetails.LoadBGColours() 'Background

	End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub loadPhone ' method to assign Phone number
	compDetails=companyDetails.loadCompanyDetails
	For i = 0 To compDetails.RowCount - 1
		compDetails.Position=i	
		lblPhone.Text  = compDetails.GetString("PhoneCode") & " " & compDetails.GetString("PhoneNo")
		lblCompanyName.Text = compDetails.GetString("Name")
	Next
End Sub

Sub loadAddress
	compDetails = companyDetails.loadCompanyDetails
	For i = 0 To compDetails.RowCount - 1
		compDetails.Position = i
		Dim address2 As String
		address2 = compDetails.GetString("Address2")
			If address2 <> Null Then
		lblAddress.Text = compDetails.Getstring("Address1") & CRLF & compDetails.GetString("Address2") & ", " & compDetails.GetString("Suburb") & CRLF & compDetails.GetString("City") 
			Else
		lblAddress.Text = compDetails.Getstring("Address1") & CRLF & compDetails.GetString("Suburb") & CRLF & compDetails.GetString("City") 
			End If
	Next
End Sub





