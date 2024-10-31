import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.proceedToCheckoutAndEnterEmail
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link apple - Navigate to page category.png')

"Step 3: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on button addToCart.png')

"Step 4: Click on label productModelColor (iphone15ProMax)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productModelColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productModelColor', ['label_productModelColor_internalText': label_productModelColor_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on label productModelColor iphone15ProMax.png')

"Step 5: Click on label productModelColor (winterBlue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productModelColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productModelColor', ['label_productModelColor_internalText': label_productModelColor_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on label productModelColor winterBlue.png')

"Step 6: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button increased.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button buy.png')

"Step 8: Click on link placeAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on link placeAnOrder.png')

"Step 9: Proceed to checkout and enter email for shipping"

proceedToCheckoutAndEnterEmail.execute()

"Step 10: Click on link backToTheCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_backToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on link backToTheCart - Navigate to page cart.png')

"Step 11: Click on button removeItem (remove2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_removeItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_nth': button_removeItem_nth]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on button removeItem remove2.png')

"Step 12: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Add and Remove Items from Cart while Checking Out_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}