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
 * SUMMARY : Success Login as Super admin
 * 
 * STEPS :
 * - Open login page
 * - Input username & password
 * - Verify success login as super admin
 * 
 * --------------------------------------------
 */

//Open browser
WebUI.openBrowser('')
//redirected to specific url
WebUI.navigateToUrl('https://' + GlobalVariable.instanceUrl )
//wait for the element to load first
WebUI.waitForElementPresent(findTestObject('Page_Login/inputPassword'), 5)
WebUI.waitForElementPresent(findTestObject('Page_Login/inputUsername'), 5)
WebUI.waitForElementPresent(findTestObject('Page_Login/buttonLogin'), 5)
//input username and password
WebUI.setText(findTestObject('Page_Login/inputUsername'), GlobalVariable.student1 )
WebUI.setText(findTestObject('Page_Login/inputPassword'), GlobalVariable.passwordGeneral )
//click login button
WebUI.click(findTestObject('Page_Login/buttonLogin'))
//Verify the web url of super admin is correct (First Method)
//WebUI.delay(5)
//WebUI.verifyMatch(WebUI.getUrl(), 'https://' + GlobalVariable.instanceUrl + '/Administrator/Home' , true, FailureHandling.STOP_ON_FAILURE)

//Verify the web url of super admin is correct (Second Method)
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
