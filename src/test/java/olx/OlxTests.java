package olx;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static olx.OlxMethods.testCookies;
import static olx.OlxMethods.testLogToOlx;

public class OlxTests {

    @Test
    public void test_positive_log_olx() throws InterruptedException {
        testLogToOlx();
    }

    @Test
    public void test_cookies_olx() throws InterruptedException {
        testCookies();
    }




}
