package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_Myaccountpage {
    public WebElement createaccountbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div[2]/a"));
    }
    // Create Account Section
    public WebElement firstnamebox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
    }
    public WebElement middlenamebox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"middlename\"]"));
    }
    public WebElement lastnamebox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
    }
    public WebElement emailaddressbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
    }
    public WebElement passwordbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    }
    public WebElement passwordconfirmbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"confirmation\"]"));
    }
    public WebElement registerbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button"));
    }
    //Dashboard
    public WebElement successcreationmsg(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li"));
    }
    public WebElement TVbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a"));
    }
}
