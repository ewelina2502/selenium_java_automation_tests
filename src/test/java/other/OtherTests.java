package other;

import org.testng.annotations.Test;

import java.io.IOException;

public class OtherTests extends OtherMethods {


    @Test
    public void test_google() throws IOException, InterruptedException {
        googleSearch();
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

}
