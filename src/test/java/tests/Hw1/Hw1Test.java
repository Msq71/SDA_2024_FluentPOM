package tests.Hw1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListLogInPage;
import pages.Hw1.AccountRegisterPage;

import java.time.Duration;

public class Hw1Test {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

        AccountRegisterPage registerPage = new AccountRegisterPage(driver);

        registerPage
                .enterFirstName("Mohammmed")
                .enterLastName("alqahtani")
                .enterEmail("Mohammed@omg.com")
                .enterTelephone("0555999999")
                .enterPassword("tester@123")
                .enterPassConf("tester@123")
                .ClickCheckBox()
                .clickContinue()
                .verifyWlcMsg();
    }
}
