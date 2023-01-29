package StepDefs;

import Pages.P02_Mobilepage;
import Pages.P03_SonyXperiapage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D02 {
P02_Mobilepage p02 = new P02_Mobilepage();
P03_SonyXperiapage p03 = new P03_SonyXperiapage();
String priceofsonyxperia = p02.costofSonyXperia().getText();
String priceofsnyxperiainpage = p03.priceinpage().getText();
@And("the cost of Sony Xperia shown is \\\"(.*)\\\"$")
    public void assertthepriceinlist(String priceinlist){
    Assert.assertEquals(p02.costofSonyXperia().getText(),priceinlist);
}
@Then("user click on Sony Xperia Mobile")
    public void clickonxperia() throws InterruptedException {
    p02.secondproducttitle().click();
    Thread.sleep(3000);
}
@Then("the price shown is \\\"(.*)\\\"$")
    public void asserttheshownprice(String shownprice){
    Assert.assertEquals(p03.priceinpage().getText(), shownprice);
}
@And("the two prices for both list and page are equal")
    public void assertthetwoprices(){
    Assert.assertEquals(priceofsnyxperiainpage , priceofsonyxperia);
}
}
