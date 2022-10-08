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
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//Define random variable
def lowerBound = 1
def upperBound = 67
def randomString = RandomStringUtils.randomAlphabetic(7) 
def randomEmail= 'std' + randomString + '@mailinator.com'
def randomFname= randomString
def randomLname= 'std-auto'
def randomTimeZone= new Random().nextInt((upperBound - lowerBound) + 1) + lowerBound

//Execute
WebUI.openBrowser('')
//Navigate to registration url page
WebUI.navigateToUrl('https://' + GlobalVariable.registrationUrl + '/Registration/' )
//Waiting for Celpip general & Try Free button ready
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/span_CELPIP General'), 1)
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/a_Try for Free'), 1)
//Select the Celpip general course and click type of course wich is the free type
WebUI.click(findTestObject('Page_Regis_Celpip/span_CELPIP General'))
WebUI.click(findTestObject('Page_Regis_Celpip/a_Try for Free'))
//Put some delay function to load the next page properly
WebUI.delay(3)
//Waiting for Email address ready and type on it
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/input_Email'), 1)
WebUI.setText(findTestObject('Page_Regis_Celpip/input_Email'), randomEmail)
//Waiting for Firstname, lastname, password, and Next button ready to execute
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/input_FirstName'), 3)
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/input_LastName'), 1)
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/input_Password'), 1)
WebUI.waitForElementClickable(findTestObject('Page_Regis_Celpip/button_NEXT PERSONALISE'), 1)
//Type random string to Firstname, lastname, and password field
WebUI.setText(findTestObject('Page_Regis_Celpip/input_FirstName'), randomFname)
WebUI.setText(findTestObject('Page_Regis_Celpip/input_LastName'), randomLname)
WebUI.setText(findTestObject('Page_Regis_Celpip/input_Password'), GlobalVariable.passwordGeneral)
//Click the next button
WebUI.click(findTestObject('Page_Regis_Celpip/button_NEXT PERSONALISE'))
//Appears pop-up email confirmation and click Yes
WebUI.waitForElementClickable(findTestObject('Page_Regis_Celpip/button_YES, CORRECT'), 1)
WebUI.click(findTestObject('Page_Regis_Celpip/button_YES, CORRECT'))
//Put delay function to wait the next page load properly
WebUI.delay(3)
//Waiting timezone and next button to load properly
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/select_TimeZone'), 1)
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/a_NEXT'), 1)
//Select random value in TimeZone dropdown list and click next button
WebUI.selectOptionByIndex(findTestObject('Page_Regis_Celpip/select_TimeZone'), randomTimeZone)
WebUI.click(findTestObject('Page_Regis_Celpip/a_NEXT'))
//Put delay function to wait the next page load properly
WebUI.delay(3)
//Shows pop-up introduction and click skip button
WebUI.waitForElementPresent(findTestObject('Page_Regis_Celpip/button_Skip'), 1)
WebUI.click(findTestObject('Page_Regis_Celpip/button_Skip'))
//Verify Success register and automatically redirected to student dashboard
WebUI.verifyMatch(WebUI.getUrl(), 'https://' + GlobalVariable.instanceUrl + '/Student/Home', true, FailureHandling.STOP_ON_FAILURE)
