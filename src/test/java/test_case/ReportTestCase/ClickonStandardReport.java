package test_case.ReportTestCase;

import Reports.ClickOnReport;
import base_class.DriverSetup;
import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickonStandardReport extends ClickOnReport {

    @Test
    public void clickStandardReport() {
        // Standard Report Element
        WebElement standardReport = driver.findElement(By.xpath("/html//div[@class='app-body']/div/nav/ul[@class='nav']/li[2]/ul[@class='nav-dropdown-items']//a[@href='http://18.209.122.163/admin/standard-report']"));
        standardReport.click();
    }
}
// Hello...this is for github testing.