package Tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Schenario2 extends TestAbstractClass {
    @Test(priority = 2)
    public void CheckoutWhenUserDeleteAllItems() throws InterruptedException {
        By btnStarted = By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
        By btnBag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.ImageView");
        By btnCheckOut = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
        By btnArrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView");
        By txtTotalItems = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]");
        String Message = "0";

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
        for (int i = 1; i <= 7; i++) {
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView[1]")).click();
            Thread.sleep(5000L);
        }
        driver.findElement(btnCheckOut).click();
        Thread.sleep(3000L);
        driver.findElement(btnArrow).click();
        Thread.sleep(3000L);
        Assert.assertEquals(driver.findElement(txtTotalItems).getText(), Message);
        Thread.sleep(5000L);
    }

}
