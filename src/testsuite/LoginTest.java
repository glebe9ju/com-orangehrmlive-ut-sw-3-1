package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Enter “Admin” username
        sendTexttoElement(By.name("txtUsername"),"Admin");
        //Enter “admin123 password
        sendTexttoElement(By.name("txtPassword"),"admin123");
        //Click on ‘LOGIN’ button
        clickOnElement(By.id("btnLogin"));
//        WebElement welcome = driver.findElement(By.id("welcome"));
        String welcome = getTextFromElement(By.id("welcome"));
        //Verify the ‘Welcome’ text is display
        Assert.assertEquals("Incorrect Login Detail","Welcome Admin",welcome);
    }
    @After
    public void tearDown() {
        closeBrowsers();
    }
}
