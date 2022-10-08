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
/*---------------------------------------------------------
 * SUMMARY : Success Logout Deputy admin
 * 
 * STEPS : 
 * - Execute login super admin test case
 * - Click Profile picture
 * - Click Logout button
 * - Verify redirected link when success logout
 * 
 * ---------------------------------------------------------
 */

//Execute Login Deputy Admin test case
WebUI.callTestCase(findTestCase('Login (LGN)/LGN0002 - Login Deputy Admin'), [:], FailureHandling.STOP_ON_FAILURE)
//Waiting profile picture element ready and click it
WebUI.waitForElementClickable(findTestObject('Page_Dashboard/profilePicture'), 3)
WebUI.click(findTestObject('Page_Dashboard/profilePicture'))
//add delay statement for dropdown menu to appear
WebUI.delay(1)
//Waiting Logout button element ready and click it
WebUI.waitForElementClickable(findTestObject('Page_Dashboard/buttonLogout'), 3)
WebUI.click(findTestObject('Page_Dashboard/buttonLogout'))
//Verify super admin success logout by identified their url link
WebUI.verifyMatch(WebUI.getUrl(), 'https://' + GlobalVariable.instanceUrl + '/Account/PostLogout', true, FailureHandling.STOP_ON_FAILURE)