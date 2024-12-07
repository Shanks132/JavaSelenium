package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginShouldFail {

    WebDriver driver ;
    //this runs before the class
    @BeforeClass
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass // cleanup after testing
    public void tearDown(){
        // driver.quit();
        //driver.close();
    }
    //identifies test method
    @Test
    public void testLoginToApplication() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        var password = driver.findElement(By.name("password")); //type inferred
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";
        Assert.assertNotEquals(actualResult,expectedResult);

    }



}
