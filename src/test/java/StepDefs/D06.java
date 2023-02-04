package StepDefs;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D06 {
    P06_Myaccountpage p06 = new P06_Myaccountpage();
    P08_MyWishlistPage p08 = new P08_MyWishlistPage();
    P09_ShoppingCart p09 = new P09_ShoppingCart();
    P10_CheckOutPage p10 = new P10_CheckOutPage();

    @And("user login with f05 credentials")
    public void loginwithcredits(){
        p06.emailadressboxlogin().sendKeys("mazenkhairy48@yahoo.com");
        p06.passwordboxlogin().sendKeys("123456789");
        p06.loginbtn().click();
    }
    @And("user click on my wishlist link")
    public void clickonmywishlist() throws InterruptedException {
        Thread.sleep(1000);
        p06.mywishlistlink().click();
    }
    @And("user next page click add to cart link")
    public void clickaddtocartlink() throws InterruptedException {
        Thread.sleep(1000);
        p08.addtocartbtn1().click();
        Assert.assertTrue(p09.successMSGCart().isDisplayed());
    }
    @And("user enter shipping information")
    public void entershippinginfo() throws InterruptedException {
        Select select1 = new Select(p09.countrydropdownbox());
        Select select2 = new Select(p09.stateprovincedropdownbox());
        select1.selectByVisibleText("United States");
        Thread.sleep(1000);
        select2.selectByVisibleText("New York");
        p09.ZIPbox().clear();
        p09.ZIPbox().sendKeys("542896");
    }
    @And("user click Estimate")
    public void clickEstimatebtn(){
        p09.Estimatelink().click();
    }
    @Then("the shipping cost is generated \\\"(.*)\\\"$")
    public void assertShippingCost(String price) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(p09.shippingflatrate().getText(),price);
    }
    @Then("user select shipping cost,Update Total")
    public void updatetotal() throws InterruptedException {
        p09.flatrateradiobtn().click();
        p09.updatetotalbtn().click();
        Thread.sleep(2000);
    }
    @Then("Shipping cost is added to total and the total is \\\"(.*)\\\"$")
    public void asserttotalprice(String totalprice){
        Assert.assertEquals(p09.totalprice().getText(), totalprice);
    }
    @When("user click proceed to checkout button")
    public void clickproceedtocheck() throws InterruptedException {
        p09.proceedtocheck().click();
        Thread.sleep(1000);
    }
    @And("user Enter billing information")
    public void enterbillinginfo() throws InterruptedException {
        Select select3 = new Select(p10.Stateprovincedropbox());
        Select select4 = new Select(p10.countrydropbox());
        p10.Addressbox().clear();
        p10.Addressbox().sendKeys("ABC");
        p10.cityBox().clear();
        p10.cityBox().sendKeys("New York");
        Thread.sleep(1000);
        select3.deselectAll();
        Thread.sleep(3000);
        select3.selectByVisibleText("New York");
        p10.Zipbox().clear();
        p10.Zipbox().sendKeys("542896");
        Thread.sleep(1000);
        select4.deselectAll();
        Thread.sleep(3000);
        select4.selectByVisibleText("United States");
        p10.telephonebox().clear();
        p10.telephonebox().sendKeys("12345678");
        Thread.sleep(1000);
    }
    @And("user click continue in shipping method")
    public void clickcontinuebtn() throws InterruptedException {
        p10.continuebtn().click();
        Thread.sleep(1000);
        Assert.assertEquals(p10.fixedshppingprice().getText(), "$5.00");
        p10.continuebtn2().click();
        Thread.sleep(1000);
    }
    @And("user select Check money order radio button,and clicks continue")
    public void clickcheckmoneyorder() throws InterruptedException {
        p10.checkmoneyorderradiobtn().click();
        p10.continuebtn3().click();
        Thread.sleep(1000);
    }
    @Then("user click Place Order button")
    public void placeorderbtnclick() throws InterruptedException {
        p10.placeorderbtn().click();
        Thread.sleep(1000);
    }
    @Then("The order is generated with an order number")
    public void asserttheorder(){
        Assert.assertTrue(p10.successmsgplaceorder().isDisplayed());
        String orderNum = Hooks.driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/p[1]/a")).getText();
        System.out.println("*** Your order number for your record = " + orderNum);
    }
}
