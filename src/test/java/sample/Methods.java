package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Methods extends SelectorsAndGenerators {

    public static void start() {
        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);
    }

    public static void googleSearch() {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website_google);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(button_cookie)).click();
        driver.findElement(By.xpath(button_search)).sendKeys("pogoda", Keys.ENTER);
        assert driver.findElement(By.id(button_temp)).isEnabled();
        driver.quit();
    }

    public static void testAutomationShop(){
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteShop);
        driver.findElement(By.xpath(button_contact_us)).click();
        driver.findElement(By.xpath(subject_selector)).click();
        driver.findElement(By.xpath(choice_one)).click();
        driver.findElement(By.id(email_selector)).sendKeys(emailGenerator());
        driver.findElement(By.id(message_selector)).sendKeys(printGenerator());
        driver.findElement(By.id(submit_button_selector)).click();
        assert driver.findElement(By.cssSelector(success_email_sent_selector)).isEnabled();
        driver.quit();
    }

    public static void testAutomationShopWithoutEmail(){
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteShop);
        driver.findElement(By.xpath(button_contact_us)).click();
        driver.findElement(By.xpath(subject_selector)).click();
        driver.findElement(By.xpath(choice_one)).click();
        driver.findElement(By.id(message_selector)).sendKeys(printGenerator());
        driver.findElement(By.id(submit_button_selector)).click();
        assert driver.findElement(By.cssSelector(alert_message_selector)).isEnabled();
        driver.quit();
    }

    public static void testOlx() throws InterruptedException {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteOlx);
        driver.findElement(By.xpath(acceptCookies)).click();
        driver.findElement(By.xpath(myOlxButton)).click();
        driver.findElement(By.id(userEmail)).sendKeys("ewelina2502@o2.pl");
        Thread.sleep(1000);
        driver.findElement(By.id(userPassword)).sendKeys("Testowy123");
        Thread.sleep(1000);
        driver.findElement(By.id(zalogujSie)).click();

        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        WebElement menuOption = driver.findElement(By.xpath(myOlxLogout));
        actions.moveToElement(menuOption).perform();
        WebElement subMenuOption = driver.findElement(By.xpath(wylogujSie));
        actions.moveToElement(subMenuOption).click().perform();
        driver.quit();
    }

    public static void testNegativeOlxWithoutEmail() throws InterruptedException {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteOlx);
        driver.findElement(By.xpath(acceptCookies)).click();
        driver.findElement(By.xpath(myOlxButton)).click();
        Thread.sleep(1000);
        driver.findElement(By.id(userPassword)).sendKeys("Testowy123");
        driver.findElement(By.id(zalogujSie)).click();
        assert driver.findElement(By.xpath(allertError)).isEnabled();
        driver.quit();

    }

    public static void testTravel() throws InterruptedException {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteTravels);

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        WebElement productMenu = driver.findElement(By.xpath(productButton));
        actions.moveToElement(productMenu).perform();
        WebElement startButton = driver.findElement(By.xpath(howToStartButton));
        actions.moveToElement(startButton).click().perform();
        driver.quit();
    }

    public static void testCheckboxes() {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(websiteCheckbox);
        driver.findElement(By.xpath(checkboxes)).click();
        driver.findElement(By.xpath(checkboxesOut)).click();
        driver.quit();
    }

    public static void testDownloadFile(){
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteDownload);
        WebElement addFile = driver.findElement(By.xpath(downloadFile));
        addFile.sendKeys("/Users/Ewelina/Desktop/2021-11-02_15-13.png");
        driver.findElement(By.xpath(downloadFile)).click();
    }

    public static void testLogAuth(){
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteAuth);
        driver.quit();
    }




}
