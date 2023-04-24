package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utilities extends BaseTest {
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement1(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        WebElement text1 = driver.findElement(by);
        WebElement text2 = driver.findElement(by);
        actions.moveToElement(text1).moveToElement(text2).build().perform();
    }
    public void tearDown() {
        closeBrowser();
    }
}
