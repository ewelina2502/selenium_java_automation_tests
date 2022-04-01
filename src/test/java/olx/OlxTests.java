package olx;

import org.testng.annotations.Test;

import static olx.OlxMethods.testLogToOlx;

public class OlxTests {

    @Test
    public void test_positive_log_olx() throws InterruptedException {
        testLogToOlx();
    }



}
