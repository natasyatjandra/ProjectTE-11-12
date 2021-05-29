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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://orangehrm-demo-6x.orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM Demo_Submit'))

WebUI.click(findTestObject('Page_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Job'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Job Titles'))

WebUI.click(findTestObject('Object Repository/Page_Job Titles/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job Titles/input__jobTitleName'), 'testing aja')

WebUI.setText(findTestObject('Object Repository/Page_Job Titles/textarea_Job Description_jobDescription'), 'Test aja sih')

WebUI.setText(findTestObject('Object Repository/Page_Job Titles/textarea_Note_note'), 'Sukses')

WebUI.click(findTestObject('Object Repository/Page_Job Titles/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Job Titles/span_Global HR Managerkeyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_Job Titles/a_Logout'))

WebUI.closeBrowser()

