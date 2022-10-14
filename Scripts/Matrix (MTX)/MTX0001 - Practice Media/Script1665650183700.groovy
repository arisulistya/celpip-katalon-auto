import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*---------------------------------------------
 * SUMMARY : Success completed activity practice media
 *
 * STEPS :
 * - Login Student
 * - navigate to Course Pro Include
 * - Click Lesson
 * _ Do activity Practice media
 *
 * --------------------------------------------
 */

//Login Student
WebUI.openBrowser('')
WebUI.navigateToUrl('https://' + GlobalVariable.instanceUrl )
WebUI.waitForElementPresent(findTestObject('Page_Login/inputPassword'), 5)
WebUI.waitForElementPresent(findTestObject('Page_Login/inputUsername'), 5)
WebUI.waitForElementPresent(findTestObject('Page_Login/buttonLogin'), 5)
WebUI.setText(findTestObject('Page_Login/inputUsername'), GlobalVariable.student1 )
WebUI.setText(findTestObject('Page_Login/inputPassword'), GlobalVariable.passwordGeneral )
WebUI.click(findTestObject('Page_Login/buttonLogin'))
def count = 0
while(count<5) {
	if(count<4) {
		if(!WebUI.verifyMatch(WebUI.getUrl(), 'https://' + GlobalVariable.instanceUrl + '/Student/Home', true, FailureHandling.OPTIONAL)) {
			WebUI.delay(3)
			count++
		}
		else {
			break
		}
	}
	else {
		WebUI.verifyMatch(WebUI.getUrl(), 'https://' + GlobalVariable.instanceUrl + '/Student/Home', true, FailureHandling.STOP_ON_FAILURE)
	}
}

//Click Course (Package Pro include type)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_NonAcademic/a_CourseProInclude'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_NonAcademic/a_CourseProInclude'))
WebUI.delay(3)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_NonAcademic/a_MediaStandard'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_NonAcademic/a_MediaStandard'))

//Complete Activity Media Text Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Boxed Text Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media2'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Image Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media3'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Video Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media4'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Audio Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media5'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Document Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media6'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Collapsible Text Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media7'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Multiple Image Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media9'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Multiple Screen Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media10'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Media Checklist Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Media/div_Media11'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_ce1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_ce1'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Save1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Save1'))
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_ce2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_ce2'))
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_ce3'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_ce3'))
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_ce4'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_ce4'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Save2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Save2'))
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)