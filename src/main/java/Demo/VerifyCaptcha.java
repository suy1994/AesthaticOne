package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by Mayur on 16/03/21, 4:09 PM.
 */

public class VerifyCaptcha {

    @Test
    public void verifyCaptcha() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.irctc.co.in/nget/train-search");
            driver.findElement(By.xpath("//button[text()='OK']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
            Thread.sleep(3000);
            WebElement imageElement = driver.findElement(By.id("nlpCaptchaImg"));
            File src = imageElement.getScreenshotAs(OutputType.FILE);
            String path = "/Users/Mayur/Documents/Automation/SeleniumWebFrameworkcopy/Images/Captcha.png";
            FileHandler.copy(src, new File(path));
            Thread.sleep(2000);
            ITesseract image = new Tesseract();
            String str = image.doOCR(new File(path));
            System.out.println("image OCR done");
            System.out.println(str);
            String Captcha = str.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
            driver.findElement(By.id("n1pAnswer")).sendKeys(Captcha);
        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());
        }
    }
}
