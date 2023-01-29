package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_SonyXperiapage {
public WebElement priceinpage(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
}

}
