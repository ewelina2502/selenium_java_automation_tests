package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectorsAndMethods {

    public static void start() {
        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);

    }

    static String webDriverChromeDriver = "webdriver.chrome.driver";
    static String chromeBrowserExePath = "C:\\Users\\Ewelina\\Downloads\\chromedriver.exe";

    static String website_google = "https://www.google.pl/";
    static String button_cookie = "//*[@id=\"L2AGLb\"]/div";
    static String button_search = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    static String button_temp = "wob_temp";

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

    static String testarena = "http://demo.testarena.pl/zaloguj";
    static String bar_testarena_email = "email";
    static String bar_testarena_password = "password";
    static String button_testarena_login = "login";
    static String button_testarena_admin = "//*[@id=\"head-top\"]/div[2]/div[1]/a/span";
    static String button_testarena_add = "//*[@id=\"content\"]/article/nav/ul/li[1]/a";
    static String button_testarena_project_name = "name";

    public static void testarena() {
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testarena);
        driver.findElement(By.id(bar_testarena_email)).sendKeys("administrator@testarena.pl");
        driver.findElement(By.id(bar_testarena_password)).sendKeys("sumXQQ72$L");
        driver.findElement(By.id(button_testarena_login)).click();
        assert driver.findElement(By.xpath(button_testarena_admin)).isEnabled();
        driver.findElement(By.xpath(button_testarena_admin)).click();
        driver.findElement(By.xpath(button_testarena_add)).click();
        driver.quit();

    }

    static String webSiteShop = "http://automationpractice.com/index.php";
    static String button_contact_us = "//*[@id='contact-link']/a";
    static String subject_selector = "//*[@id='id_contact']";
    static String choice_one = "//*[@id='id_contact']/option[2]";
    static String email_selector = "email";
    static String message_selector = "message";
    static String submit_button_selector = "submitMessage";
    static String success_email_sent_selector = ".alert-success";
//    static String alert_message_selector = ".alert-danger";

    public static void testAutomationShop(){
        start();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteShop);
        driver.findElement(By.xpath(button_contact_us)).click();
        driver.findElement(By.xpath(subject_selector)).click();
        driver.findElement(By.xpath(choice_one)).click();
        driver.findElement(By.id(email_selector)).sendKeys("seleniumwsh@gmail.com");
        driver.findElement(By.id(message_selector)).sendKeys("text message");
        driver.findElement(By.id(submit_button_selector)).click();
        assert driver.findElement(By.cssSelector(success_email_sent_selector)).isEnabled();
        driver.quit();

    }

}
