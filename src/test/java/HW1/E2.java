package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Fabricio");
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Ortuno");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Lol@gmail.com");
        Thread.sleep(1000);
        WebElement clickSubmit = driver.findElement(By.id("submit_button"));
        clickSubmit.click();
        Thread.sleep(1000);
        WebElement clickHere = driver.findElement(By.partialLinkText("Click Here"));
        clickHere.click();
        Thread.sleep(1000);
        WebElement clickLink = driver.findElement(By.partialLinkText("Link"));
        clickHere.click();
    }
}
