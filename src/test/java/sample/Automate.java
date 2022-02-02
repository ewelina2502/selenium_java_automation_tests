package sample;

import org.openqa.selenium.chrome.ChromeDriver;


public class Automate {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.pl/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
