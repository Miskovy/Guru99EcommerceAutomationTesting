package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_PopupCompare {
    public WebElement pobupHeading(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[1]/h1"));
    }
    public WebElement closeWindowbtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/button"));
    }
    public WebElement comparetable(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product_comparison\"]/colgroup"));
    }
}
