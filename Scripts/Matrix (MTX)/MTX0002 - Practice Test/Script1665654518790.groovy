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

//Click Course (Package Pro include type) and Scoreable expand
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_NonAcademic/a_CourseProInclude'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_NonAcademic/a_CourseProInclude'))
WebUI.delay(3)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_NonAcademic/a_ScoreableStandard'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_NonAcademic/a_ScoreableStandard'))

//Complete Activity Scoreable Multi-choice-single Widget
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable1'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_mc1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_mc1'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_mc2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_mc2'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit1'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_mc3'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_mc3'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit2'))
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Scoreable Multi-choice-multiple Widget
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable2'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_mcm1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_mcm1'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_mcm2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_mcm2'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_mcm3'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_mcm3'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit1'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_mcm4'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_mcm4'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit2'))
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Scoreable Choose Correct Audio Widget
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable3'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable3'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_cca1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_cca1'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_cca2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_cca2'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit1'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/input_cca3'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/input_cca3'))
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit2'))
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Scoreable reorder paragraph Widget
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable4'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable4'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit1'))
WebUI.delay(3)
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit2'))
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Scoreable Short Answer Widget
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable5'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable5'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_sa1'), 2)
WebUI.setText(findTestObject('Page_Matrix/Page_Activity/input_sa1'), 'True')
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_sa2'), 2)
WebUI.setText(findTestObject('Page_Matrix/Page_Activity/input_sa2'), 'True')
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit1'))
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_sa3'), 2)
WebUI.setText(findTestObject('Page_Matrix/Page_Activity/input_sa3'), 'True')
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/input_sa4'), 2)
WebUI.setText(findTestObject('Page_Matrix/Page_Activity/input_sa4'), 'True')
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit2'))
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)

//Complete Activity Scoreable gap fill dropdown Widget
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable6'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/Page_Scoreable/div_Scoreable6'))
WebUI.switchToWindowIndex(1)
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/span_cca1'), 2)
WebUI.selectOptionByIndex(findTestObject('Page_Matrix/Page_Activity/span_cca1'), 0, true)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/span_cca2'), 2)
WebUI.selectOptionByIndex(findTestObject('Page_Matrix/Page_Activity/span_cca2'), 1, true)
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit1'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit1'))
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/span_cca3'), 2)
WebUI.selectOptionByIndex(findTestObject('Page_Matrix/Page_Activity/span_cca3'), 0, true)
WebUI.waitForElementClickable(findTestObject('Page_Matrix/Page_Activity/button_Submit2'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Submit2'))
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Page_Matrix/Page_Activity/button_Close'), 2)
WebUI.click(findTestObject('Page_Matrix/Page_Activity/button_Close'))
WebUI.delay(5)
WebUI.switchToWindowIndex(0)