package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumBase {
    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");

        capabilities.setCapability("appPackage", "vn.tiki.app.tikiandroid");
        capabilities.setCapability("appActivity", "vn.tiki.app.tikiandroid.ui.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        System.out.println("this is steps : setup");

    }
    public void tearDown(){
        System.out.println("this is steps : tearDown");
        // close the app
        driver.closeApp();
    }
}
