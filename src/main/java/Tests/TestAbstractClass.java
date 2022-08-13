package Tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class TestAbstractClass {
    /**
     * @throws MalformedURLException
     */

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeSuite
    public void setup() throws MalformedURLException {
        String PROJECT_ROOT = System.getProperty("user.dir");
        System.out.println(PROJECT_ROOT);
        String APK_PATH = PROJECT_ROOT + "/resources/ecommerce-test.apk";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", new File(APK_PATH).getAbsolutePath());
        capabilities.setCapability("appPackage", "com.ecommerce.service");
        capabilities.setCapability("appActivity", "com.ecommerce.service.Activity.SplashActivity");
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", true);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 20);
    }
}
