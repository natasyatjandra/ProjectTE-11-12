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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList')

WebUI.setText(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/a_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input__firstName'), firstName)

WebUI.setText(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input_Middle Name_middleName'), middleName)

WebUI.setText(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input__lastName'), lastName)

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/a_Employee List'))

WebUI.setText(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input_Employee Name_empsearchemployee_nameempName'), 
    fullName)

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/input_Sub Unit__search'))

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/a_Welcome Nikhil'))

WebUI.click(findTestObject('Object Repository/Add_failed/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

