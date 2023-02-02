import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\# dev\\# tools\\chromeDriver 105\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));

        input.click();

    }
}
