package StepDefs;
import Pages.P01_Mainpage;
import Pages.P02_Mobilepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;

public class D01 {
    public int scc = 0;
    P01_Mainpage p01 = new P01_Mainpage();
    P02_Mobilepage p02 = new P02_Mobilepage();
    @Given("user goto \\\"(.*)\\\"$")
    public void gotowebpage(String url){
        Hooks.driver.get(url);
    }
    @And("the title of the page shown is \\\"(.*)\\\"$")
    public void assertTitleofpage(String title){
        Assert.assertTrue(p01.titleofpage().isDisplayed());
        Assert.assertEquals(p01.titleofpage().getText(), title);
    }
    @And("user click on MOBILE button")
    public void clickmobilebtn() throws InterruptedException {
        Thread.sleep(1000);
        p01.mobilebtn().click();
    }
    @And("the title of the second page shown is \\\"(.*)\\\"$")
    public void assertTitleofpage2(String title2){
        Assert.assertTrue(p02.titleofpagemobile().isDisplayed());
        Assert.assertEquals(p02.titleofpagemobile().getText(), title2);
    }
    @Then("user click on sort by dropdown button and choose \\\"(.*)\\\"$")
    public void sortitemsbyname(String dropdowntxt) throws InterruptedException {
        Select select = new Select(p02.sortbybtn());
        select.selectByVisibleText(dropdowntxt);
        Thread.sleep(3000);
    }
    @Then("all 3 products are sorted by name")
    public void assertall3products() throws IOException {
        boolean firstprod = p02.firstproduct().isDisplayed();
        boolean secondprod = p02.secondproduct().isDisplayed();
        boolean thirdprod = p02.thirdproduct().isDisplayed();
        boolean total = firstprod && secondprod && thirdprod;
        Assert.assertTrue(total);
        File scrFile = ((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.FILE);
        String png = ("C:\\" + scc + ".png");
        FileUtils.copyFile(scrFile, new File(png));
        // Extra: Check if they are alphabetically sorted
        /*char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String nameoffirstprod = p02.firsproducttitle().getText();
        String nameofsecondprod = p02.secondproducttitle().getText();
        String nameofthirdprod = p02.thirdproducttitle().getText();
        System.out.println(nameoffirstprod.charAt(0) + nameofsecondprod.charAt(0) + nameofthirdprod.charAt(0));
        int indexoffirst = 0;
        int indexofsecond = 0;
        int indexofthird = 0;
        for (int i = 0; i < 26 ; i++){
            if (nameoffirstprod.charAt(0) == alphabet[i]){
                indexoffirst += i;
            } else if (nameofsecondprod.charAt(0) == alphabet[i]) {
                indexofsecond += i;
            } else if (nameofthirdprod.charAt(0) == alphabet[i]) {
                indexofthird += i;
            }
            Assert.assertTrue(indexoffirst < indexofsecond && indexoffirst < indexofthird && indexofsecond < indexofthird);
        } */
    }
}