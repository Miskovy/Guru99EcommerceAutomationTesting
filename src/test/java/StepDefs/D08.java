package StepDefs;

import Pages.P06_Myaccountpage;
import Pages.P09_ShoppingCart;
import Pages.P10_CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D08 {
    P06_Myaccountpage p06 = new P06_Myaccountpage();
    P09_ShoppingCart p09 = new P09_ShoppingCart();
    P10_CheckOutPage p10 = new P10_CheckOutPage();
    @And("user click REORDER link , change QTY to \\\"(.*)\\\" and click update$")
    public void reorder(String qty){
        p06.reorderlink().click();
        p09.QTYBox().click();
        p09.QTYBox().clear();
        p09.QTYBox().sendKeys(qty);
        p09.updatebtn().click();
    }
    @Then("Grand Total is changed to \\\"(.*)\\\"$")
    public void assertgrandtotal(String totalprice){
        Assert.assertEquals(p09.totalprice().getText(),totalprice);
    }
    @Then("user complete Billing and Shipping Information")
    public void completebilling() throws InterruptedException {
        p09.proceedtocheck().click();
        Thread.sleep(1000);
        p10.continuebtn1().click();
        p10.continuebtn().click();
        Thread.sleep(1000);
        Assert.assertEquals(p10.fixedshppingprice().getText(), "$50.00");
        p10.continuebtn2().click();
        Thread.sleep(1000);
        p10.checkmoneyorderradiobtn().click();
        p10.continuebtn3().click();
        Thread.sleep(1000);
        p10.placeorderbtn().click();
        Thread.sleep(1000);
    }
}
