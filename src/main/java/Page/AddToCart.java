package Page;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class AddToCart {
    WebDriver driver;
    public AddToCart(WebDriver driver) {
        this.driver=driver;
    }

    By Item = By.linkText("Fujifilm Instax Mini 11 Instant Camera Blush Pink + Custom Case + Fuji Instax Film Value Pack (50 Sheets) Flamingo Designer Photo Album for Fuji instax Mini 11 Photos");
    public void cart(){
           driver.findElement(Item).click();
}
   
}

