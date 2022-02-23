package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By Username = By.id("ap_email");
    By Continue = By.id("continue");
    By Password = By.id("ap_password");
    By loginBtn = By.id("signInSubmit");


    public void enterUsername(String user) {
        driver.findElement(Username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(Password).sendKeys(pass);
    }
    public void clickContinue() {
        driver.findElement(Continue).click();
    }


    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

}