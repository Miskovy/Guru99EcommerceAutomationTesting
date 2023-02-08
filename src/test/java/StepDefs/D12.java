package StepDefs;

import Pages.P02_Mobilepage;
import Pages.P03_SonyXperiapage;
import Pages.P13_Backend;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D12 {
    P02_Mobilepage p02 = new P02_Mobilepage();
    P03_SonyXperiapage p03 = new P03_SonyXperiapage();
    P13_Backend p13 = new P13_Backend();
    @When("user fill the required review and submit it")
    public void fillreview(){
        p03.Rateproductradiobtn5star().click();
        p03.letusknowyourthoughtsbox().clear();
        p03.letusknowyourthoughtsbox().sendKeys("It's very good smartphone");
        p03.summaryofreviewbox().clear();
        p03.summaryofreviewbox().sendKeys("It's very good smartphone");
        p03.nicknamebox().clear();
        p03.nicknamebox().sendKeys("Test1*");
        p03.submitreviewbtn().click();
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/ul/li/ul/li/span")).isDisplayed());
    }
    @And("user goto Catalogue,Reviews and Ratings,Customer Reviews,Pending Reviews Menu")
    public void gotopendingreviews() throws InterruptedException {
        Thread.sleep(3000);
        p13.msgdodgebtn().click();
        p13.cataloguemenu().click();
        p13.reviewandratingslink().click();
        p13.customerreviews().click();
        p13.pendingreviewslink().click();
    }
    @And("user sort table by Id and select comment then click on Edit link")
    public void sorttable() throws InterruptedException {
        Thread.sleep(3000);
        p13.sortbyIDlink().click();
        Thread.sleep(3000);
        p13.editlink1().click();
    }
    @And("user Change status to \\\"(.*)\\\" and click Save Review$")
    public void publishthecomment(String choice) throws InterruptedException {
        Thread.sleep(1000);
        Select select1 = new Select(p13.statusdropdown1());
        select1.selectByVisibleText(choice);
        Thread.sleep(1000);
        p13.saveReviewbtn().click();
    }
    @And("user click on Sony Xperia Image")
    public void clickonsonyxperiaimg(){
        p02.sonyXperiaImg().click();
    }
    @And("In detail page, user click on Review tab at bottom of page")
    public void reviewstab() throws InterruptedException {
        Thread.sleep(1000);
        p03.reviewstab().click();
    }
    @Then("user Verify the review comment is shown")
    public void verifycomment(){
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//*[@id=\"customer-reviews\"]/dl/dd[14]")).isDisplayed());
    }
}
