package test_case.ReportTestCase;
import Reports.ClickOnReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC02_NewReport extends ClickOnReport {

    @Test
    public void clickonNewReport(){

        // Click on NewReport
        WebElement clickOnReport = driver.findElement(By.xpath("//a[normalize-space()='New Reports']"));

        clickOnReport.click();
    }

    @Test
    public void elementIsPresentOrNOtCheck(){
        // Element
        WebElement ActualElement = driver.findElement(By.xpath("/html/body[@class='app aside-menu-fixed sidebar-lg-show']//a[@title='MediusWare']"));

        if(ActualElement != null){

            System.out.println("Element is Present");

        }else {

            System.out.println("Element is Absent");

        }


    }




}
