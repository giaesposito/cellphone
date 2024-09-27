package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectIphone15PlusAndPlaceOrder {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link iphone15PlusNew -> Navigate to page 'product/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iphone15PlusNew'))
        
        "Step 2: Click on label storageColor (128Gb)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColor"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColor', ['label_storageColor_internalText': data['label_storageColor_internalText']]))
        
        "Step 3: Click on label storageColor (blue)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColor"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColor', ['label_storageColor_internalText': data['label_storageColor_internalText_1']]))
        
        "Step 4: Click on button buy3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy3'))
        
        "Step 5: Click on link placeAnOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['label_storageColor_internalText'] = testData.getValue('label_storageColor_internalText', rowIndex)
        data['label_storageColor_internalText_1'] = testData.getValue('label_storageColor_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['label_storageColor_internalText'] = 'default_data'
        data['label_storageColor_internalText_1'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

