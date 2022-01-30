package TaskCheckConfig;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class GoogleSearch {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement zgadzamSie = driver.findElement(By.id("L2AGLb"));
        zgadzamSie.click();
        WebElement googleInput = driver.findElement(By.name("q"));
        googleInput.clear();
        googleInput.sendKeys("Coderslab");
        googleInput.submit();
        WebElement zaloguj = driver.findElement(By.className("gb_1 gb_2 gb_2d gb_2c"));
        zaloguj.click();

        //driver.quit();
    }

}
