package StepDefs;

import Pages.P01_Mainpage;
import Pages.P14_AdvancedSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class D14 {
    P01_Mainpage p01 = new P01_Mainpage();
    P14_AdvancedSearchPage p14 = new P14_AdvancedSearchPage();
    @When("user click on Advanced Search")
    public void clickadvancedsearch(){
        p01.advancedSearchlink().click();
    }
    @And("In Price field user enter range 0-150 and Click Search")
    public void enterrange1(){
        p14.minrangebox().clear();
        p14.minrangebox().sendKeys("0");
        p14.maxrangebox().clear();
        p14.maxrangebox().sendKeys("150");
        p14.searchadvancedbtn().click();
    }
    @And("user Note the Price and Product Name in the result and Print on console")
    public void printconsole1(){
        System.out.println("*********Available Phone(s) ranging from 0-150*******\n");
        System.out.println(p14.phone1title().getText()+ "  " +p14.phone1price().getText()+"\n");
        System.out.println(p14.phone2title().getText()+ "  " +p14.phone2price().getText()+"\n");
    }
    @And("Again, In Price field user enter range 151-1000 and Click Search")
    public void enterrange2() throws InterruptedException {
        Thread.sleep(3000);
        Hooks.driver.navigate().back();
        p14.minrangebox().clear();
        p14.minrangebox().sendKeys("151");
        p14.maxrangebox().clear();
        p14.maxrangebox().sendKeys("1000");
        p14.searchadvancedbtn().click();
    }
    @And("user Note again the Price and Product Name in the result and Print on console")
    public void printconsole2(){
        System.out.println("*********Available Phone(s) ranging from 151-1000*******\n");
        System.out.println(p14.phone3title().getText()+ "  " +p14.phone3price().getText()+"\n");
        System.out.println(p14.tv1title().getText()+ "  " +p14.tv1price().getText()+"\n");
        System.out.println(p14.tv2title().getText()+ "  " +p14.tv2price().getText()+"\n");
    }
}
