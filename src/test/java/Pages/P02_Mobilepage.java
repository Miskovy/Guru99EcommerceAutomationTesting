package Pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Mobilepage {
    public WebElement titleofpagemobile(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[1]/h1"));
    }
    public WebElement sortbybtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
    }
    public WebElement firstproduct(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]"));
    }
    public WebElement secondproduct(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]"));
    }
    public WebElement thirdproduct(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]"));
    }
    public WebElement firsproducttitle(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a")); //Samsung Galaxy
    }
    public WebElement secondproducttitle(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a")); //Sony Xperia
    }
    public WebElement thirdproducttitle(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/h2/a")); //Iphone
    }
    public WebElement costofSonyXperia(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
    }
    public WebElement addtocartbtnsonyxperia(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button"));
    }
    public WebElement addtocartIPHONE(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button"));
    }
    public WebElement addtocomparelist1(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a"));//Sony Xperia
    }
    public WebElement addtocomparelist2(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a"));//Iphone
    }
    public WebElement comparebtn(){
        return Hooks.driver.findElement(By.xpath("//button[@title='Compare']"));
    }
    public WebElement sonyXperiaImg(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-collection-image-1\"]"));
    }
}
