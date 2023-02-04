package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_MyWishlistPage {
    public WebElement successmsgwishlist(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li"));
    }
    public WebElement sharewishlistbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]"));
    }
    public WebElement successmsgwishlistshare(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li"));
    }
    //Sharing Wish list page
    public WebElement emailaddressbigbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
    }
    public WebElement messagebigbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"message\"]"));
    }
    public WebElement sharewishlistbtn2(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button"));
    }
    //Dashboard
    public WebElement addtocartbtn1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"item_61775\"]/td[5]/div/button"));
    }
}
