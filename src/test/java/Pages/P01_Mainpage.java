package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Mainpage {
    public WebElement titleofpage(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div/h2"));
    }
    public WebElement mobilebtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
    }
}
