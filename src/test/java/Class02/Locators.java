package Class02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        //find the element email address and send email address to it
        WebElement email =driver.findElement(By.id("email"));
        //send text
        email.sendKeys("fabricioortuno@hotmail.com");

        //pass the password
        WebElement password=driver.findElement(By.name("pass"));
        //send text
        password.sendKeys("abracadabra");

        //find the button
        WebElement button=driver.findElement(By.name("login"));
        //click on button
        //button.click();

        //go to facebook and click on create new account
        WebElement createAccount=driver.findElement(By.linkText("Create new account"));
        createAccount.click();

    }
}