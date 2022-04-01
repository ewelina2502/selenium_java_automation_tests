package tests;

import org.testng.annotations.Test;
import sample.AutomationShopMethods;

public class AutomationShopTests extends AutomationShopMethods {

    @Test
    public void test_automation_shop() {
        testAutomationShop();
    }

    @Test
    public void test_automation_shop_without_email() {
        testAutomationShopWithoutEmail();
    }

}
