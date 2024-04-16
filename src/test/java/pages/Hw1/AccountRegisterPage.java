package pages.Hw1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ContactListHomePage;
import pages.ContactListLogInPage;

public class AccountRegisterPage {
    WebDriver ldriver;

    By fnameById = By.id("input-firstname");
    By lnameById = By.id("input-lastname");
    By emailById = By.id("input-email");
    By telById = By.id("input-telephone");
    By passwordById = By.id("input-password");
    By passConfById = By.id("input-confirm");
    By buttonByXpath = By.xpath("//input[@value='Continue']");

    By checkBoxByXpath = By.xpath("//label[@for='input-agree']");


    public AccountRegisterPage(WebDriver gdriver) {
        ldriver = gdriver;  //or this.driver = driver;
    }

    public AccountRegisterPage enterFirstName(String fname) {
        ldriver.findElement(fnameById).sendKeys(fname);
        return this;
    }

    public AccountRegisterPage enterLastName(String lname) {
        ldriver.findElement(lnameById).sendKeys(lname);
        return this;
    }

    public AccountRegisterPage enterTelephone(String tel) {
        ldriver.findElement(telById).sendKeys(tel);
        return this;
    }


    public AccountRegisterPage enterEmail(String email) {
        ldriver.findElement(emailById).sendKeys(email);
        return this;
    }

    public AccountRegisterPage enterPassword(String password) {
        ldriver.findElement(passwordById).sendKeys(password);
        return this;
    }

    public AccountRegisterPage enterPassConf(String passCon) {
        ldriver.findElement(passConfById).sendKeys(passCon);
        return this;
    }

    public AccountRegisterPage ClickCheckBox() {
        ldriver.findElement(checkBoxByXpath).click();
        return this;
    }

    public HomePage clickContinue() {
        ldriver.findElement(buttonByXpath).click();
        return new HomePage(ldriver);
    }


}
