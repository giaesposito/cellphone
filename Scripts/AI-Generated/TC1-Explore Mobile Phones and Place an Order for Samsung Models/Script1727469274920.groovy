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

"Step 2: Click on span phone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_phone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on span phone - Navigate to page category.png')

"Step 3: Click on link mobileBrands (samsung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName, 'link_mobileBrands_category_id': link_mobileBrands_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link mobileBrands samsung.png')

"Step 4: Click on div hot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_hot'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on div hot.png')

"Step 5: Click on link samsungGalaxyS23UltraHot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsungGalaxyS23UltraHot'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link samsungGalaxyS23UltraHot.png')

"Step 6: Click on link samsungGalaxyZfold5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_samsungGalaxyZfold5'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link samsungGalaxyZfold5.png')

"Step 7: Click on link mobileBrands (samsung2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_internalRoleLinkName': link_mobileBrands_internalRoleLinkName_1, 'link_mobileBrands_category_id': link_mobileBrands_category_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link mobileBrands samsung2.png')

"Step 8: Click on link mobileBrands (googlePixel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobileBrands', ['link_mobileBrands_category_id': link_mobileBrands_category_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link mobileBrands googlePixel.png')

"Step 9: Click on link googlePixel7Pro -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_googlePixel7Pro'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link googlePixel7Pro - Navigate to page product.png')

"Step 10: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button buy.png')

"Step 11: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link placeAnOrder - Navigate to page cart.png')

"Step 12: Click on link samsung -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link samsung - Navigate to page category.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Mobile Phones and Place an Order for Samsung Models_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}