import katalon.common.proceedToCheckoutAndEnterEmail
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.selectIphone15PlusAndPlaceOrder
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Select iPhone 15 Plus and place an order"

selectIphone15PlusAndPlaceOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button removeItem (remove)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_removeItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_nth': button_removeItem_nth]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on button removeItem remove.png')

"Step 4: Proceed to checkout and enter email for shipping"

proceedToCheckoutAndEnterEmail.execute()

"Step 5: Click on div paymentMethodCashOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/div_paymentMethodCashOn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on div paymentMethodCashOn.png')

"Step 6: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on button completeOrder - Navigate to page thank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Complete Order with iPhone 15 Plus and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}