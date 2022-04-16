package automationShop;
import org.testng.annotations.Test;

import java.io.IOException;


public class AutomationShopTests extends AutomationShopMethods {

    @Test
    public void test_automation_shop() throws IOException {
        testAutomationShop();
    }

    @Test
    public void test_automation_shop_without_email() {
        testAutomationShopWithoutEmail();
    }

}
