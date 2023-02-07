package Pages;


import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P13_Backend {
    public WebElement msgdodgebtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"message-popup-window\"]/div[1]/a"));
    }
    public WebElement salesmenu(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]"));
    }
    public WebElement ordersextendsales(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[1]/a"));
    }
    // Sales/orders Dashboard
    public WebElement exporttodropdown(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"sales_order_grid_export\"]"));
    }
    public WebElement exportbtn(){
        return Hooks.driver.findElement(By.xpath("//button[@title = 'Export']"));
    }
    public WebElement statusdropdownbox(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"sales_order_grid_filter_status\"]"));
    }
    public WebElement searchbtn(){
        return Hooks.driver.findElement(By.xpath("//button[@title = 'Search']"));
    }
    public WebElement actionsdropdown(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"sales_order_grid_massaction-select\"]"));
    }
    public WebElement submitbtn(){
        return Hooks.driver.findElement(By.xpath("//button[@title = 'Submit']"));
    }
    public WebElement errormsg1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"messages\"]/ul/li/ul/li/span"));
    }
}
