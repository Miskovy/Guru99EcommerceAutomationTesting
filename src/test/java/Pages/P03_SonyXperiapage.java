package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_SonyXperiapage {
public WebElement priceinpage(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
}
// in the page : "http://live.techpanda.org/index.php/review/product/list/id/1/"
    public WebElement Rateproductradiobtn5star(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"Quality 1_5\"]"));
    }
    public WebElement letusknowyourthoughtsbox(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"review_field\"]"));
    }
    public WebElement summaryofreviewbox(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"summary_field\"]"));
    }
    public WebElement nicknamebox(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"nickname_field\"]"));
    }
    public WebElement submitreviewbtn(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"review-form\"]/div[2]/button"));
    }
    public WebElement reviewstab(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/span"));
    }
}
