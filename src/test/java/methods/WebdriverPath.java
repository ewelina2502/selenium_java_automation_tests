package methods;

public class WebdriverPath {

    public static void startMethod() {

        String webDriverChromeDriver = "webdriver.chrome.driver";
        String chromeBrowserExePath = "C:\\Users\\ewelina\\Downloads\\chromedriver.exe";

        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);

    }
}
