package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectorsGoogle {

    public static void start() {
        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);

    }

    static String webDriverChromeDriver = "webdriver.chrome.driver";
    static String chromeBrowserExePath = "C:\\Users\\Ewelina\\Downloads\\chromedriver.exe";
    static String website_google = "https://www.google.pl/";
    static String testarena = "http://demo.testarena.pl/zaloguj";
    static String button_cookie = "//*[@id=\"L2AGLb\"]/div";
    static String button_search = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    static String button_temp = "wob_temp";
    static String bar_testarena_email = "email";
    static String bar_testarena_password = "password";
    static String button_testarena_login = "login";
    static String button_testarena_admin = "//*[@id=\"head-top\"]/div[2]/div[1]/a/span";
    static String button_testarena_add = "//*[@id=\"content\"]/article/nav/ul/li[1]/a";
    static String button_testarena_project_name = "name";


    public static void google_search() {
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

}
