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
    public WebElement cataloguemenu(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]"));
    }
    public WebElement invoicemenu(){
    return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[2]/a"));
    }
    public WebElement reviewandratingslink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li"));
    }
    public WebElement customerreviews(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li/ul/li[1]"));
    }
    public WebElement pendingreviewslink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li/ul/li[1]/ul/li[1]/a"));
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
    //Pending Reviews Dashboard
    public WebElement sortbyIDlink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"reviwGrid_table\"]/thead/tr[1]/th[2]/span/a"));
    }
    public WebElement editlink1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"reviwGrid_table\"]/tbody/tr[1]/td[10]/a"));
    }
    public WebElement statusdropdown1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"status_id\"]"));
    }
    public WebElement saveReviewbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"save_button\"]"));
    }
    //Invoice Menu Dashboard
    public WebElement invoicedatesort1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"sales_invoice_grid_table\"]/thead/tr[1]/th[3]/span/a/span"));
    }
}
