package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListHomePage;
import pages.ContactListLogInPage;

import java.time.Duration;

public class LogInTest {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        ContactListLogInPage logInPage = new ContactListLogInPage(driver);
        //logInPage.enterEmail("sdatest@tester.com");
        //logInPage.enterPassword("tester.123");
        //logInPage.clickSubmit();

       /*
       ContactListHomePage homePage = logInPage
                .enterEmail("sdatest@tester.com")
                .enterPassword("tester.123")
                .clickSubmit();

        homePage.clickLogOut();
        */

        logInPage
                .enterEmail("sdatest@tester.com")
                .enterPassword("tester.123")
                .clickSubmit()
                .clickLogOut();
    }
}
