package test_case.ReportTestCase;

import Reports.ClickOnReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC03_MyReport extends ClickOnReport {

    @Test
    public void ClickOnMyReport(){
        // Click on My Report
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='My Reports']"));
        element.click();
    }




}
