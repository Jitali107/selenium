package Testcases;

import Page.AddToCart;
import Page.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.HomePage;
import Page.LoginPage;

public class Start{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/imac/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        home.clickLogin();

        login.enterUsername("6354406931");
        login.clickContinue();
        login.enterPassword("Harsha@29");

        login.clickLogin();
       // Thread.sleep(3000);

        SearchPage s = new SearchPage(driver);
        s.searchIteam();
        s.searchclick();
        AddToCart c = new AddToCart(driver);
        c.cart();
        driver.quit();
    }

}