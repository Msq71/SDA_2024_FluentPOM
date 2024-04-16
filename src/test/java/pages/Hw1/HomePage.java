package pages.Hw1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver ldriver;

    By welcomeMsgByXpath = By.xpath("//*[text()=' Your Account Has Been Created!']");

    HomePage(WebDriver gdriver) {
        ldriver = gdriver;
    }

    public void verifyWlcMsg() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(ldriver.findElement(welcomeMsgByXpath).getText());
        Assert.assertTrue(ldriver.findElement(welcomeMsgByXpath).isDisplayed());
    }
}
