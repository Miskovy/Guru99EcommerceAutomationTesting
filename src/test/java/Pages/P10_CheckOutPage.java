package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_CheckOutPage {
    public WebElement Addressbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing:street1\"]"));
    }
    public WebElement cityBox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing:city\"]"));
    }
    public WebElement Stateprovincedropbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing:region_id\"]"));
    }
    public WebElement Zipbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing:postcode\"]"));
    }
    public WebElement countrydropbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing:country_id\"]"));
    }
    public WebElement telephonebox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing:telephone\"]"));
    }
    public WebElement continuebtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button"));
    }
    public WebElement fixedshppingprice(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/dl/dd/ul/li/label/span"));
    }
    public WebElement continuebtn2(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
    }
    public WebElement checkmoneyorderradiobtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"p_method_checkmo\"]"));
    }
    public WebElement continuebtn3(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button"));
    }
    public WebElement placeorderbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button"));
    }
    public WebElement successmsgplaceorder(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/h2"));
    }
    public WebElement ordernumber(){
        return Hooks.driver.findElement(By.id("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a"));
    }
}
