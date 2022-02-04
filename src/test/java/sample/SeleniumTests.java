package sample;
import org.testng.annotations.Test;


public class SeleniumTests extends SelectorsAndMethods {

    @Test
    public void test_google() {
        googleSearch();
    }

    @Test
    public void test_testarena() {
        testarena();
    }

    @Test
    public void test_automation_shop() {
        testAutomationShop();

    }
}

