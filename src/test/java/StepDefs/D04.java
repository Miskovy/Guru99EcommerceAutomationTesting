package StepDefs;

import Pages.P02_Mobilepage;
import Pages.P05_PopupCompare;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D04 {
    P05_PopupCompare p05 = new P05_PopupCompare();
    P02_Mobilepage p02 = new P02_Mobilepage();
    @Then("user click on compare for both Sony Xperia and Iphone")
    public void clickoncomparebtn() throws InterruptedException {
        p02.addtocomparelist1().click();
        Thread.sleep(1000);
        p02.addtocomparelist2().click();
        Thread.sleep(1000);
    }
    @When("user click on Compare btn")
    public void clickoncomparebothbtn() throws InterruptedException {
        p02.comparebtn().click();
        Thread.sleep(1000);
    }
    @Then("A Popup window opens with heading \\\"(.*)\\\" and the selected products are in it$")
    public void assertthepopupwindow(String headingtitle) throws InterruptedException {
        for (String handle : Hooks.driver.getWindowHandles()) {
            Hooks.driver.switchTo().window(handle);
        }
        Assert.assertEquals(p05.pobupHeading().getText(),headingtitle);
        Assert.assertTrue(p05.comparetable().isDisplayed());
    }
    @Then("Close the popup window")
    public void closethepopupwindow() throws InterruptedException {
        Thread.sleep(2000);
        p05.closeWindowbtn().click();
        for (String handle : Hooks.driver.getWindowHandles()) {
            Hooks.driver.switchTo().window(handle);
        }
    }
}
