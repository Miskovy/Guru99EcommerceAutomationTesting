package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P12_BackendLoginPage {
    public WebElement username(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    }
    public WebElement password(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"login\"]"));
    }
    public WebElement loginbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[5]/input"));
    }
}
