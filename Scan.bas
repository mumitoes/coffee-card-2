Type=Class
Version=4.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Dim LastStampScanned As String
    Dim zx As JhsIceZxing1
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

End Sub
Sub Scanqr
	zx.isportrait = True
	zx.useFrontCam = False
	'set the timeoutDuration to a very high value (such as 2000000000) if you dont want it to time out
	'2000000000 = 63 years
	zx.timeoutDuration = 30
	
	'change these factors between 0 and 1 to change the size of the viewfinder rectangle
	'the library will limit the minimum size to 240 x 240 pixels and the maximum to (screen width) x (screen height pixels)
    zx.theViewFinderXfactor = 0.7
	zx.theViewFinderYfactor = 0.5
	
	zx.theFrameColor = Colors.LightGray
	zx.theLaserColor = Colors.Red
	
	'set the prompt messages
	zx.theTopPromptMessage = "This was done......"
	zx.theTopPromptTextSize = 5%y                            'text size in pixels
	zx.topPromptColor = Colors.Red
	zx.topPromptDistanceFromTop = 1%y                        'pixel distance from top
	
	zx.theBottomPromptMessage = "Just for fun......"
	zx.theBottomPromptTextSize = 5%y                         'text size in pixels
	zx.bottomPromptColor = Colors.Blue
	zx.bottomPromptDistanceFromBottom = 5%y                  'pixel distance from top
	
	zx.BeginScan("StampScan")
End Sub

Sub StampScan_result(atype As String,Values As String)
	LastStampScanned = Values
End Sub

Sub StampScan_noscan(atype As String,Values As String)
	Msgbox(Values, "type:" & atype & "Scan Failed")
End Sub