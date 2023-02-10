package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Mainpage {
    public WebElement titleofpage(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div/h2"));
    }
    public WebElement mobilebtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
    }
    public WebElement myaccmainlink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]"));
    }
    public WebElement myacclink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[1]/a"));
    }
    public WebElement advancedSearchlink(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[3]/div/div[3]/ul/li[3]/a"));
    }
}
