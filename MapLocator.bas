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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private lblCompanyName, lblPhone As Label
	Private PnlBg As Panel
	Private imgLogo As ImageView
	Dim companyDetails As ThemeManager
	Private WebView1 As WebView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MapLocation2")
	
	companyDetails.Initialize
	
	loadLayout
	
	End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub loadLayout
 	'=========================set default layout and details==========================
	PnlBg.Background = companyDetails.LoadBGColours() 'Background
	lblPhone.Text = companyDetails.loadPhone() 'Phone
	lblCompanyName.Text = companyDetails.loadName() 'Company name
	imgLogo.Bitmap = companyDetails.loadDBlogo() 'Logo
	WebView1.Loadurl(companyDetails.loadMap())
End Sub