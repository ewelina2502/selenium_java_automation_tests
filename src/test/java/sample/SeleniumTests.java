package sample;
import org.testng.annotations.Test;


public class SeleniumTests extends SelectorsGoogle {

    @Test
    public void test_google() {
        google_search();
    }

    @Test
    public void test_testarena() {
        testarena();
    }
}

