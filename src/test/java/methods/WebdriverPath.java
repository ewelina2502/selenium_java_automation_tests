package methods;

public class WebdriverPath {

    public static void startMethod() {
        String webDriverChromeDriver = "webdriver.chrome.driver";
        String chromeBrowserExePath = "C:\\Users\\Ewelina\\Downloads\\chromedriver.exe";
        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);

    }
}