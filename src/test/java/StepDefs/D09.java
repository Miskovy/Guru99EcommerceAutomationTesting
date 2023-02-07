package StepDefs;

import Pages.P01_Mainpage;
import Pages.P02_Mobilepage;
import Pages.P09_ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D09 {
    P01_Mainpage p01 = new P01_Mainpage();
    P02_Mobilepage p02 = new P02_Mobilepage();
    P09_ShoppingCart p09 = new P09_ShoppingCart();
    @When("user goto mobile and add IPHONE to cart")
    public void addiphone() throws InterruptedException {
        p01.mobilebtn().click();
        Thread.sleep(1000);
        p02.addtocartIPHONE().click();
        Thread.sleep(1000);
        Assert.assertTrue(p09.successMSGIphone().isDisplayed());
    }
    @And("user enter coupon code \\\"(.*)\\\"$")
    public void entercouponcode(String code) throws InterruptedException {
        p09.discountBox().clear();
        p09.discountBox().sendKeys(code);
        Thread.sleep(1000);
        System.out.println("The price before: "+p09.totalprice().getText());
        p09.applydiscountlink().click();
    }
    @Then("the price is discounted by \\\"(.*)\\\"$")
    public void assertthetotalprice(String amount){
        String beforediscountamount = Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tbody/tr[1]/td[2]/span")).getText();
        String beforediscountamount2 = beforediscountamount.replace("$", ""); // 500.00 STRING
        String discount = Hooks.driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tbody/tr[2]/td[2]/span")).getText();
        String discount2 = discount.replace("-", "");
        String discount3 = discount2.replace("$", "");
        float beforediscount = Float.parseFloat(beforediscountamount2); //500.00
        float discountamount = Float.parseFloat(discount3); //25.00
        String amount2 = amount.replace("%", "");
        float amountfloat = (Float.parseFloat(amount2))/100;
        // Assert that 25.00 = (5.0/100.00)*500.00 --> discountamount = amountfloat*beforediscount --> discountamount/beforediscount = amountfloat
        Assert.assertEquals(amountfloat, (discountamount / beforediscount));
        System.out.println("The price After: "+p09.totalprice().getText());
    }
}
