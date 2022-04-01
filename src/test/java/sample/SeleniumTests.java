package sample;
import org.testng.annotations.Test;


public class SeleniumTests extends Methods {

    @Test
    public void test_google() {
        googleSearch();
    }

    @Test
    public void test_automation_shop() {
        testAutomationShop();
    }

    @Test
    public void test_automation_shop_without_email() {
        testAutomationShopWithoutEmail();
    }

    @Test
    public void test_olx() throws InterruptedException {
        testOlx();
    }

    @Test
    public void test_negative_olx() throws InterruptedException {
        testNegativeOlxWithoutEmail();
    }

    @Test
    public void test_travel() throws InterruptedException {
        testTravel();
    }

    @Test
    public void test_checkboxes() {
        testCheckboxes();
    }

    @Test
    public void test_download_file(){
        testDownloadFile();
    }

    @Test
    public void test_log_Auth(){
        testLogAuth();
    }



}

