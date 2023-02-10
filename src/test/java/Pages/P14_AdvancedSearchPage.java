package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P14_AdvancedSearchPage {
    public WebElement minrangebox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"price\"]"));
    }
    public WebElement maxrangebox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"price_to\"]"));
    }
    public WebElement searchadvancedbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button"));
    }
    //0-150 page price range
    public WebElement phone1title(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[3]/ul/li[1]/div/h2/a"));
    }
    public WebElement phone1price(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
    }
    public WebElement phone2title(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[3]/ul/li[2]/div/h2/a"));
    }
    public WebElement phone2price(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-3\"]"));
    }
    // 151-1000 Page price range
    public WebElement phone3title(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[3]/ul/li[1]/div/h2/a"));
    }
    public WebElement phone3price(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-2\"]/span"));
    }
    public WebElement tv1title(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[3]/ul/li[2]/div/h2/a"));
    }
    public WebElement tv1price(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-4\"]"));
    }
    public WebElement tv2title(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[3]/ul/li[3]/div/h2/a"));
    }
    public WebElement tv2price(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-5\"]/span"));
    }
}
