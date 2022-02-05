package sample;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Locale;


public class SelectorsAndGenerators {

    static String webDriverChromeDriver = "webdriver.chrome.driver";
    static String chromeBrowserExePath = "C:\\Users\\Ewelina\\Downloads\\chromedriver.exe";

    static String website_google = "https://www.google.pl/";
    static String button_cookie = "//*[@id=\"L2AGLb\"]/div";
    static String button_search = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    static String button_temp = "wob_temp";

    static String testarena = "http://demo.testarena.pl/zaloguj";
    static String bar_testarena_email = "email";
    static String bar_testarena_password = "password";
    static String button_testarena_login = "login";
    static String button_testarena_admin = "//*[@id=\"head-top\"]/div[2]/div[1]/a/span";
    static String button_testarena_add = "//*[@id=\"content\"]/article/nav/ul/li[1]/a";
    static String button_testarena_project_name = "name";
    static String button_testarena_project_prefix = "prefix";
    static String button_testarena_project_desc = "description";
    static String button_testarena_save = "save";
    static String correct_adding = "//*[@id='j_info_box']";

    public static CharSequence printGenerator() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        return faker.dog().name();
    }

    public static String generatorRandom () {
        return RandomStringUtils.randomAlphabetic(7).substring(0, 6).toUpperCase() + RandomStringUtils.randomAlphabetic(5);
    }

    public static String emailGenerator() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        return faker.internet().emailAddress();
    }

    public static String myEmailGenerator () {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        return faker.name().firstName().substring(0, 4).toLowerCase() + "." + faker.name().lastName().substring(0,5).toLowerCase() + "@email.com";

    }

    static String webSiteShop = "http://automationpractice.com/index.php";
    static String button_contact_us = "//*[@id='contact-link']/a";
    static String subject_selector = "//*[@id='id_contact']";
    static String choice_one = "//*[@id='id_contact']/option[2]";
    static String email_selector = "email";
    static String message_selector = "message";
    static String submit_button_selector = "submitMessage";
    static String success_email_sent_selector = ".alert-success";
    static String alert_message_selector = ".alert-danger";

    static String webSiteOlx = "https://www.olx.pl/";
    static String acceptCookies = "//*[@id='onetrust-accept-btn-handler']";
    static String userEmail = "userEmail";
    static String userPassword = "userPass";
    static String myOlxButton = "//*[@id='topLoginLink']/span/strong";
    static String myOlxLogout = "//*[@id='topLoginLink']";
    static String zalogujSie = "se_userLogin";
    static String wylogujSie = "//*[@id='login-box-logout']";

    static String webSiteTravels = "https://phptravels.com/demo";
    static String productButton = "/html/body/header/div/nav/div[2]/span";
    static String howToStartButton = "/html/body/header/div/nav/div[2]/div/a[14]";

}
