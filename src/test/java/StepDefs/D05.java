package StepDefs;

import Pages.P01_Mainpage;
import Pages.P06_Myaccountpage;
import Pages.P07_TVmenuPage;
import Pages.P08_MyWishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D05 {
    P01_Mainpage p01 = new P01_Mainpage();
    P06_Myaccountpage p06 = new P06_Myaccountpage();
    P07_TVmenuPage p07 = new P07_TVmenuPage();
    P08_MyWishlistPage p08 = new P08_MyWishlistPage();
    @When("user click on My account link")
    public void clickonmyacc() throws InterruptedException {
        p01.myaccmainlink().click();
        Thread.sleep(1000);
        p01.myacclink().click();
    }
    @And("user click Create account and fill new user information except Email ID")
    public void createaccandfill() throws InterruptedException {
        p06.createaccountbtn().click();
        Thread.sleep(3000);
        //Registration process
        p06.firstnamebox().sendKeys("Test");
        p06.middlenamebox().sendKeys("Test2");
        p06.lastnamebox().sendKeys("Test3");
        p06.emailaddressbox().sendKeys("mazenkhairy48@yahoo.com");
        p06.passwordbox().sendKeys("123456789");
        p06.passwordconfirmbox().sendKeys("123456789");
        Thread.sleep(1000);
    }
    @And("user click Register")
    public void clickregister(){
        p06.registerbtn().click();
    }
    @Then("Registration is done")
    public void assertregistration() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(p06.successcreationmsg().isDisplayed());
    }
    @Then("user goto TV menu")
    public void gotoTV(){
        p06.TVbtn().click();
    }
    @And("user add product to wishlist which is LG LCD")
    public void addproducttowishlist() throws InterruptedException {
        p07.wishlist1().click();
        Thread.sleep(1000);
        Assert.assertTrue(p08.successmsgwishlist().isDisplayed());
        Thread.sleep(1000);
    }
    @And("user click share whishlist")
    public void sharewishlist() throws InterruptedException {
        p08.sharewishlistbtn().click();
        Thread.sleep(1000);
    }
    @Then("In-next page user enter E-mail and a message and click share wishlist")
    public void sharewishlist2() throws InterruptedException {
        p08.emailaddressbigbox().sendKeys("mazenkhairy48@yahoo.com");
        p08.messagebigbox().sendKeys("A message Test");
        Thread.sleep(1000);
        p08.sharewishlistbtn2().click();
    }
    @Then("wishlist is shared")
    public void assertsharesuccessmsg(){
        Assert.assertTrue(p08.successmsgwishlistshare().isDisplayed());
    }
}
