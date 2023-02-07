package StepDefs;

import Pages.P13_Backend;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class D11 {
    P13_Backend p13 = new P13_Backend();
    @And("user select \\\"(.*)\\\" in status dropdown$")
    public void selectcancelled(String status){
        Select select1 = new Select(p13.statusdropdownbox());
        select1.selectByVisibleText(status);
        p13.searchbtn().click();
    }
    @And("user select the checkbox next to first order")
    public void selectfirstorder() throws InterruptedException {
        Thread.sleep(3000);
        Hooks.driver.findElement(By.xpath("//*[@id=\"sales_order_grid_table\"]/tbody/tr[1]/td[1]/input")).click();
    }
    @And("In Actions, user select Print Invoices and Click Submit")
    public void actionsprint() throws InterruptedException {
        Select select2 = new Select(p13.actionsdropdown());
        select2.selectByVisibleText("Print Invoices");
        Thread.sleep(1000);
        p13.submitbtn().click();
    }
    @Then("Error message \\\"(.*)\\\" is shown$")
    public void asserttheerrormsg(String error){
        Assert.assertEquals(p13.errormsg1().getText(),error);
    }
    @Then("In the status field user select \\\"(.*)\\\" and Click Search$")
    public void selectcomplete(String status2) throws InterruptedException {
        Select select3 = new Select(p13.statusdropdownbox());
        select3.selectByVisibleText(status2);
        Thread.sleep(1000);
        p13.searchbtn().click();
    }
    @And("the user Select the checkbox next to first order")
    public void selectfirstorder2() throws InterruptedException {
        Thread.sleep(3000);
        Hooks.driver.findElement(By.xpath("//*[@id=\"sales_order_grid_table\"]/tbody/tr/td[1]/input")).click();
    }
    @Then("Invoice is downloaded")
    public void downloadinvoice() throws InterruptedException, AWTException {
        Thread.sleep(10000);
        Robot object = new Robot();
        object.keyPress(KeyEvent.VK_ENTER);
        object.keyRelease(KeyEvent.VK_ENTER);
    }
}
