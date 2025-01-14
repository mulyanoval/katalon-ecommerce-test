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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Page_Home Page/span_Jackets'))

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Men/a_Montana Wind Jacket'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/div_XL'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/divoption-label-color-93-item-58'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/button_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_username'), 'mulyanoval@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_firstname'), 'Mulya')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_lastname'), 'Noval')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_street0'), 'Semanggi')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_city'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    'Please select a region, state or province.', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Afghanistanland IslandsAlbaniaAlgeri_87ca51'), 
    'ID', true)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_postcode'), '12930')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_telephone'), '081212345678')

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

WebUI.click(findTestObject('Object Repository/Page_Success Page/span_Continue Shopping'))

WebUI.closeBrowser()

