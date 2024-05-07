package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createNewAccount = driver.findElement(By.partialLinkText("new account"));
        createNewAccount.click();
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("James");
        Thread.sleep(500);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Bond");
        Thread.sleep(500);
        WebElement mobileNumberOREmail = driver.findElement(By.name("reg_email__"));
        mobileNumberOREmail.sendKeys("Bond@Gmail.com");
        Thread.sleep(500);
        WebElement reEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
        reEnterEmail.sendKeys("Bond@Gmail.com");
        Thread.sleep(500);
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("123ABC54OIT_2024");
        Thread.sleep(500);
        WebElement month = driver.findElement(By.id("month"));
        month.click();
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("10");
        Thread.sleep(500);
        WebElement day = driver.findElement(By.id("day"));
        day.click();
        Select selectDay = new Select(day);
        selectDay.selectByValue("17");
        Thread.sleep(500);
        WebElement year = driver.findElement(By.id("year"));
        year.click();
        Select selectYear = new Select(year);
        selectYear.selectByValue("1998");
        Thread.sleep(500);

    }
}
