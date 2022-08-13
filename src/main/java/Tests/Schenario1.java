package Tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Schenario1 extends TestAbstractClass {
    @Test(priority = 1)
    public void CheckoutItems() throws InterruptedException {
        By btnStarted = By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
        By btnBag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.ImageView");
        By btnCheckOut = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
        By radioDelivery = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
        By btnConfirm = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
        By btnProcess = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
        By txtAssert = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
        String Message = "Congratulations!";

        Thread.sleep(3000L);
        TouchAction touch = new TouchAction(driver);
        touch.longPress(PointOption.point(1000, 1000)).moveTo(PointOption.point(50, 1000)).release().perform();
        Thread.sleep(3000L);
        touch.longPress(PointOption.point(1000, 1000)).moveTo(PointOption.point(50, 1000)).release().perform();
        Thread.sleep(3000L);
        touch.longPress(PointOption.point(1000, 1000)).moveTo(PointOption.point(50, 1000)).release().perform();
        Thread.sleep(3000L);
        driver.findElement(btnStarted).click();
        Thread.sleep(3000L);
        driver.findElement(btnBag).click();
        Thread.sleep(3000L);
        driver.findElement(btnCheckOut).click();
        Thread.sleep(3000L);
        driver.findElement(radioDelivery).click();
        Thread.sleep(3000L);
        driver.findElement(btnConfirm).click();
        Thread.sleep(3000L);
        driver.findElement(btnProcess).click();
        Thread.sleep(3000L);
        Assert.assertEquals(driver.findElement(txtAssert).getText(), Message);
        Thread.sleep(5000L);
    }

}
