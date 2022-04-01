package olx;

import methods.WebdriverPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.io.*;
import java.util.Date;
import java.util.StringTokenizer;


public class OlxMethods extends OlxSelectors {

    public static void testLogToOlx() throws InterruptedException {

        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(webSiteOlx);
        driver.findElement(By.xpath(acceptCookies)).click();
        driver.findElement(By.xpath(myOlxButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(userEmail)).sendKeys("admin");
        driver.findElement(By.id(userPassword)).sendKeys("admin");
        driver.findElement(By.id(zalogujSie)).click();
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        WebElement menuOption = driver.findElement(By.xpath(myOlxLogout));
        actions.moveToElement(menuOption).perform();
        WebElement subMenuOption = driver.findElement(By.xpath(wylogujSie));
        actions.moveToElement(subMenuOption).click().perform();

        driver.quit();
    }

    public static void testCookies() throws InterruptedException {

        WebdriverPath.startMethod();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(webSiteOlx);
        driver.findElement(By.xpath(acceptCookies)).click();
        driver.findElement(By.xpath(myOlxButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(userEmail)).sendKeys("admin");
        driver.findElement(By.id(userPassword)).sendKeys("admin");
        driver.findElement(By.id(zalogujSie)).click();


        try{
        File file = new File("Cookiefile.data");
        FileReader fileReader = new FileReader(file);
        BufferedReader Buffreader = new BufferedReader(fileReader);
        String strline;
        while((strline=Buffreader.readLine())!=null){
            StringTokenizer token = new StringTokenizer(strline,";");
            while(token.hasMoreTokens()){
                String name = token.nextToken();
                String value = token.nextToken();
                String domain = token.nextToken();
                String path = token.nextToken();
                Date expiry = null;

                String val;
                if(!(val=token.nextToken()).equals("null"))
                {
                    expiry = new Date(val);
                }
                Boolean isSecure = Boolean.parseBoolean(token.nextToken());
                Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);

                System.out.println(ck);
                driver.manage().addCookie(ck);
            }
        }
    } catch (Exception ex){
        ex.printStackTrace();
    }
        driver.get(webSiteOlx);
}








	}




