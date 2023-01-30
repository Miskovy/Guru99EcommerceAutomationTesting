package StepDefs;

import Pages.P02_Mobilepage;
import Pages.P04_CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D03 {
P02_Mobilepage p02 = new P02_Mobilepage();
P04_CartPage p04 = new P04_CartPage();
    @Then("user click on add to cart for Sony Xperia")
    public void addtocartclick() throws InterruptedException {
        p02.addtocartbtnsonyxperia().click();
        Thread.sleep(2000);
    }
    @When("user change QTY value to \\\"(.*)\\\" and click update button$")
    public void changeQTY(String value) throws InterruptedException {
        p04.QTYSonyXperia().click();
        p04.QTYSonyXperia().sendKeys(value);
        p04.UpdatebtnSonyXperia().click();
        Thread.sleep(3000);
    }
    @Then("the error message shown is \\\"(.*)\\\" and another message is \\\"(.*)\\\"$")
    public void asserterrormessages(String message1, String message2){
        Assert.assertEquals(p04.errormessage1().getText(),message1);
        Assert.assertEquals(p04.errormessage2().getText(),message2);
    }
    @Then("user click on empty cart link in the footer of list of all mobiles")
    public void clickclearcart() throws InterruptedException {
        p04.clearcartbtn().click();
        Thread.sleep(2000);
    }
    @Then("a message shown is \\\"(.*)\\\"$")
    public void assertclearmessage(String clearmessage){
        Assert.assertEquals(p04.clearmessage().getText(),clearmessage);
    }
}
