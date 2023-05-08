package util;

/**
 * Created by Mayur on 11/04/18.
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import static util.TestUtil.sleep;


public class ImageComparison extends TestBase
{
    static SoftAssert sa=new SoftAssert();

    @Test
    public static void imageComparision(WebElement actualElement, String expectedImageName) throws IOException
    {

        BufferedImage expectedImage = ImageIO.read(new File(System.getProperty("user.dir") +"/Images/"+expectedImageName+".png"));
        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, actualElement);
        BufferedImage actualImage = logoImageScreenshot.getImage();

        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
        if (diff.hasDiff()==false)
            sa.assertFalse(diff.hasDiff(),"Images are Same...");
        else
            sa.assertFalse(diff.hasDiff(),"Images are Different...");
        sleep(1000);
        sa.assertAll();
    }

    @Test
    public static void webElementImageComparision(WebElement actualElement, WebElement expectedElement) throws IOException
    {
        Screenshot actualImageScreenshot = new AShot().takeScreenshot(driver, actualElement);
        BufferedImage actualImage = actualImageScreenshot.getImage();

        Screenshot expectedImageScreenshot = new AShot().takeScreenshot(driver, expectedElement);
        BufferedImage expectedImage = expectedImageScreenshot.getImage();

        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
        if (diff.hasDiff()==false)
            sa.assertFalse(diff.hasDiff(),"Images are Same...");
        else
            sa.assertFalse(diff.hasDiff(),"Images are Different...");
        sleep(1000);
        sa.assertAll();
    }
}
