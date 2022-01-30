package Konfiguracja;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Main01 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.bing.com/");
        WebElement nazwaElementu = driver.findElement(By.name("q"));
        nazwaElementu.clear();
        nazwaElementu.sendKeys("makumba");
        nazwaElementu.submit();
        driver.get("https://coderslab.pl/pl");
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.quit();
    }

}
