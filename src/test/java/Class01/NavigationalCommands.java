package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        //goto the url
        driver.navigate().to("https://facebook.com");

        //slow down the code
        Thread.sleep(2000);

        //go to google.com back
        driver.navigate().back();

        //slow down code
        Thread.sleep(2000);

        //go forward to facebook
        driver.navigate().forward();

        //slow down code
        Thread.sleep(2000);

        //refresh
        driver.navigate().refresh();

        //slow down code
        Thread.sleep(2000);
        
        //close the browser
        driver.close();
    }
}
