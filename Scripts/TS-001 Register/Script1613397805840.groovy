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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/%e0%b8%ad.%e0%b8%99%e0%b8%b8%e0%b9%89%e0%b8%a2/workweb/')

WebUI.navigateToUrl('http://localhost/%e0%b8%ad.%e0%b8%99%e0%b8%b8%e0%b9%89%e0%b8%a2/workweb/register.php')

WebUI.setText(findTestObject('Object Repository/Page_Jone shirt/input_Register_fname'), 'BewKung')

WebUI.setText(findTestObject('Object Repository/Page_Jone shirt/input_Username_User'), 'Tawat')

WebUI.setText(findTestObject('Object Repository/Page_Jone shirt/input_Firtname - Lastname_Email'), 'Bewkung013@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Jone shirt/input_Email_passwords'), '9qW+5HlKALwXWAKuVF+BLQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Jone shirt/input_Password_aginpasswords'), '9qW+5HlKALwXWAKuVF+BLQ==')

WebUI.click(findTestObject('Object Repository/Page_Jone shirt/input_Confirm Password_submit'))

