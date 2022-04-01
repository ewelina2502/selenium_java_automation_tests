package automationShop;
import org.testng.annotations.Test;


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
