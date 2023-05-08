package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;

import static util.TestUtil.*;

public class CommonPage extends TestBase {



    @FindBy(xpath = "//div[@class='ann-dashboard__searchbar']/input")
    WebElement globallyNameSearch;

    public void selectPatient(String PatientNameDetailEnter) {
        sendKeys(globallyNameSearch,PatientNameDetailEnter,"Send keys in globally search bar");
        globallyNameSearch.sendKeys(Keys.ENTER);
        sleep(2000);
        WebElement selectPatient = driver.findElement(By.xpath("//div[.='"+PatientNameDetailEnter+"']"));
        waitForElementToBeDisplayed(selectPatient);
        click(selectPatient,"Click On Patient Name");
    }

    public void selectSurgeonTab(String TabName) {
        WebElement selectTab = driver.findElement(By.xpath("//ul[@class='srgntab']/li[.='" + TabName + "']"));
        click(selectTab, "Click On Tabs In Header");
    }

    public void selectPatientTab() {
        WebElement selectTab = driver.findElement(By.xpath("//li[.='Forms']"));
        click(selectTab, "Click On Implant Label");

    }


}
