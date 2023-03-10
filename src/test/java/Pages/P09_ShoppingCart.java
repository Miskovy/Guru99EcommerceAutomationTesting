package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_ShoppingCart {
    public WebElement successMSGCart(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li"));
    }
    public WebElement successMSGIphone(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li"));
    }
    public WebElement proceedtocheck(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button"));
    }
    public WebElement countrydropdownbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"country\"]"));
    }
    public WebElement stateprovincedropdownbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"region_id\"]"));
    }
    public WebElement ZIPbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
    }
    public WebElement Estimatelink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shipping-zip-form\"]/div/button"));
    }
    public WebElement shippingflatrate(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"co-shipping-method-form\"]/dl/dd/ul/li/label/span"));
    }
    public WebElement flatrateradiobtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"s_method_flatrate_flatrate\"]"));
    }
    public WebElement updatetotalbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"co-shipping-method-form\"]/div/button"));
    }
    public WebElement totalprice(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span"));
    }
    public WebElement QTYBox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input"));
    }
    public WebElement updatebtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button"));
    }
    public WebElement discountBox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"coupon_code\"]"));
    }
    public WebElement applydiscountlink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"discount-coupon-form\"]/div/div/div/div/button"));
    }
}
