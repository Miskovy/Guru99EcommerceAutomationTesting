package StepDefs;

import Pages.P06_Myaccountpage;
import Pages.P11_MyOrdersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class D07 {
    P06_Myaccountpage p06 = new P06_Myaccountpage();
    P11_MyOrdersPage p11 = new P11_MyOrdersPage();
    @And("user click on my orders link")
    public void clickonmyorders(){
        p06.myorderslink().click();
    }
    @And("user click on view order button")
    public void clickonvieworder(){
        p11.vieworderlink1().click();
    }
    @And("the previously created order is displayed with a pending state")
    public void asserttheproductorder() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]")).getText(),"ORDER #100017852 - PENDING\n" +
                "Reorder | Print Order");
    }
    @Then("user click on print order link")
    public void clickonprintorder(){
        Hooks.driver.findElement(By.linkText("Print Order")).click();
    }
    @Then("order is saved as a PDF")
    public void saveorderpdf() throws InterruptedException, AWTException {
        // Create object of Robot class<br>
        Robot object=new Robot();
        // Press Enter<br>
        object.keyPress(KeyEvent.VK_ENTER);
        // Release Enter<br>
        object.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        object.keyPress(KeyEvent.VK_ENTER);
        object.keyRelease(KeyEvent.VK_ENTER);
    }
}
