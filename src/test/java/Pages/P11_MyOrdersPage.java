package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_MyOrdersPage {
    public WebElement vieworderlink1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/span/a[1]"));
    }

}
