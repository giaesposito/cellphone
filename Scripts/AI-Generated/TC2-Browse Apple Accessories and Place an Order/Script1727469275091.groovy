import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on div object.png')

"Step 3: Click on link accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link accessories.png')

"Step 4: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link apple - Navigate to page category.png')

"Step 5: Click on link sale -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link sale - Navigate to page product.png')

"Step 6: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button buy.png')

"Step 7: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link placeAnOrder - Navigate to page cart.png')

"Step 8: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button proceedToCheckout - Navigate to page checkout.png')

"Step 9: Click on link policyDocuments (refundPolicy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout/link_policyDocuments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout/link_policyDocuments', ['link_policyDocuments_internalRoleLinkName': link_policyDocuments_internalRoleLinkName, 'link_policyDocuments_page_id': link_policyDocuments_page_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link policyDocuments refundPolicy.png')

"Step 10: Click on link policyDocuments (privacyPolicy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout/link_policyDocuments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout/link_policyDocuments', ['link_policyDocuments_internalRoleLinkName': link_policyDocuments_internalRoleLinkName_1, 'link_policyDocuments_page_id': link_policyDocuments_page_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on link policyDocuments privacyPolicy.png')

"Step 11: Click on link policyDocuments (termsOfService) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout/link_policyDocuments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout/link_policyDocuments', ['link_policyDocuments_internalRoleLinkName': link_policyDocuments_internalRoleLinkName_2, 'link_policyDocuments_page_id': link_policyDocuments_page_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link policyDocuments termsOfService - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Browse Apple Accessories and Place an Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}