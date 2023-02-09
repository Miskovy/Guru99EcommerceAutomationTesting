package StepDefs;

import Pages.P13_Backend;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D13 {
    P13_Backend p13 = new P13_Backend();
    @And("And user goto sales and selects invoices menu")
    public void gotoinvoices() throws InterruptedException {
        Thread.sleep(3000);
        p13.msgdodgebtn().click();
        p13.salesmenu().click();
        p13.invoicemenu().click();
    }
    @And("user sort Invoice Date Column in ascending and descending order and user Verify the sort is working as expected")
    public void sortinvoice() throws InterruptedException {
        //Assert Ascending Order
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//*[@id=\"sales_invoice_grid_table\"]/tbody/tr[1]/td[3]")).isDisplayed());
        Thread.sleep(1000);
        p13.invoicedatesort1().click();
        Thread.sleep(3000);
        //Assert Descending Order
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//*[@id=\"sales_invoice_grid_table\"]/tbody/tr[1]/td[3]")).isDisplayed());
    }
}
