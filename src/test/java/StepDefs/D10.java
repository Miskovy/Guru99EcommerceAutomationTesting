package StepDefs;

import Pages.P12_BackendLoginPage;
import Pages.P13_Backend;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;

public class D10 {
    P12_BackendLoginPage p12 = new P12_BackendLoginPage();
    P13_Backend p13 = new P13_Backend();
    @When("user login with \\\"(.*)\\\" and \\\"(.*)\\\"$")
    public void loginbackend(String user, String pass) throws InterruptedException {
        p12.username().sendKeys(user);
        p12.password().sendKeys(pass);
        Thread.sleep(1000);
        p12.loginbtn().click();
    }
    @And("user goto sales and selects orders menu")
    public void selectordersmenu() throws InterruptedException {
        Thread.sleep(3000);
        p13.msgdodgebtn().click();
        p13.salesmenu().click();
        p13.ordersextendsales().click();
    }
    @And("user select CSV in export to dropdown and click export button")
    public void exportCSV() throws InterruptedException, AWTException {
        Select select = new Select(p13.exporttodropdown());
        select.selectByVisibleText("CSV");
        Thread.sleep(1000);
        p13.exportbtn().click();
        Thread.sleep(3000);
        Robot object=new Robot();
        object.keyPress(KeyEvent.VK_ENTER);
        object.keyRelease(KeyEvent.VK_ENTER);
    }
    @Then("the downloaded file is read and displayed all order information in console windows")
    public void assertCSVFile(){
        // You can Change the file path or like this String filePath = System.getProperty("user.home")+"/Downloads/orders.csv";
        String filePath = "orders.csv";
        File f = new File(filePath);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
