package Tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Schenario3 extends TestAbstractClass {
    @Test(priority = 3)
    public void SignUpwithWrongPassword() throws InterruptedException {
        By btnStarted = By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
        By btnAccount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]");
        By btnSignIn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView");
        By txtUserName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText[1]");
        By txtEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText[2]");
        By txtPass1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText[3]");
        By txtPass2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText[4]");
        By txtAssert = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
        By btnSignUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button");
        String Message = "Fashion";

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
        driver.findElement(btnAccount).click();
        Thread.sleep(3000L);
        driver.findElement(btnSignIn).click();
        Thread.sleep(3000L);
        touch.longPress(PointOption.point(1000, 1000)).moveTo(PointOption.point(50, 1000)).release().perform();
        Thread.sleep(3000L);
        driver.findElement(txtUserName).sendKeys("Erik Estrada");
        Thread.sleep(3000L);
        driver.findElement(txtEmail).sendKeys("Erik@gmail.com");
        Thread.sleep(3000L);
        driver.findElement(txtPass1).sendKeys("123");
        Thread.sleep(3000L);
        driver.findElement(txtPass2).sendKeys("123");
        Thread.sleep(3000L);
        driver.findElement(btnSignUp).click();
        Thread.sleep(1500L);
        Assert.assertEquals(driver.findElement(txtAssert).getText(), Message);
        Thread.sleep(5000L);
    }

}