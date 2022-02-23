package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By search = By.id("twotabsearchtextbox");
    By searchBtn = By.id("nav-search-submit-button");

    public void searchIteam() {
        driver.findElement(search).sendKeys("Intax 11 Camera");
    }

    public void searchclick() {
        driver.findElement(searchBtn).click();
    }


    //getElement(By.xpath(sViewCartXPath)).click();

}
