package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utilities;

public class LoginTest extends Utilities {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

@Test
public void userShouldLoginSuccessfullyWithValidCredentials(){
    WebElement UsernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
    // Type the Username field element
    UsernameField.sendKeys("standard_user");
    WebElement PasswordField = driver.findElement(By.xpath("//input[@id='password']"));
    PasswordField.sendKeys("secret_sauce");
    WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
    loginbutton.click();
    String expectedText = "Products";
    WebElement actualTextElement = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
    String actualTextElementText = actualTextElement.getText();
    Assert.assertEquals("Displayed text ie not matching.",expectedText,actualTextElementText);

}
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        WebElement UsernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        // Type the Username field element
        UsernameField.sendKeys("standard_user");
        WebElement PasswordField = driver.findElement(By.xpath("//input[@id='password']"));
        PasswordField.sendKeys("secret_sauce");
        WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbutton.click();
        int expectedNumberOfProducts = 6;
        int actualNumberOfProducts = driver.findElements(By.xpath("//div[@class='inventory_list']")).size();
        Assert.assertEquals("Different number of products are displayed",expectedNumberOfProducts,actualNumberOfProducts);
    }

@After
public void tearDown() {
    closeBrowser();
}
}




