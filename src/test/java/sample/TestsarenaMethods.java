package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestsarenaMethods extends SelectorsAndGenerators {
    public static void start() {
        System.setProperty(webDriverChromeDriver, chromeBrowserExePath);
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
        String nameProject = generatorRandom();
        String prefixProject = generatorRandom();
        driver.findElement(By.id(button_testarena_project_name)).sendKeys(nameProject);
        driver.findElement(By.id(button_testarena_project_prefix)).sendKeys(prefixProject);
        driver.findElement(By.id(button_testarena_project_desc)).sendKeys(printGenerator());

        driver.findElement(By.id(button_testarena_save)).click();
        driver.findElement(By.xpath(correct_adding));
        driver.findElement(By.xpath(projectsButton)).click();
        driver.findElement(By.xpath(searchField)).sendKeys(nameProject);
        driver.findElement(By.xpath(searchButton)).click();
        assert driver.findElement(By.xpath(statusActive)).isEnabled();
        System.out.println("TEST PASSED");
        driver.quit();
    }

}
