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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils


WebUI.callTestCase(findTestCase('Registration (RGS)/Manual Registration/RGS0001 - Register free package'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://' + GlobalVariable.emailUrl)

WebUI.waitForElementPresent(findTestObject('Page_Mailinator/input_Search'), 3)
WebUI.waitForElementClickable(findTestObject('Page_Mailinator/button_GO'), 1)

WebUI.setText(findTestObject('Page_Mailinator/input_Search'), GlobalVariable.randomMail)
WebUI.click(findTestObject('Page_Mailinator/button_GO'))

WebUI.waitForElementPresent(findTestObject('Page_Mailinator/td_InboxEmail'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Page_Mailinator/td_InboxEmail'))
WebUI.waitForElementPresent(findTestObject('Page_Mailinator/iframe_EmailBody'), 1)
WebUI.waitForElementPresent(findTestObject('Page_Mailinator/a_VERIFY'), 1)
WebUI.click(findTestObject('Page_Mailinator/a_VERIFY'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Page_Mailinator/button_Login'), 1, FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://' + GlobalVariable.instanceUrl)
//WebUI.click(findTestObject('Page_Mailinator/button_Login'), FailureHandling.OPTIONAL)
WebUI.delay(3)

WebUI.delay(3)
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

WebUI.closeBrowser()