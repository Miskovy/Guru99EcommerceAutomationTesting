package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_CartPage {
    public WebElement QTYSonyXperia(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input"));
    }
    public WebElement UpdatebtnSonyXperia(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button"));
    }
    public WebElement errormessage1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p"));
    }
    public WebElement errormessage2(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span"));
    }
    public WebElement clearcartbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]"));
    }
    public WebElement clearmessage(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1"));
    }
}
