import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    public static void AndroidSetUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        //caps.setCapability("automationName", "Uiautomator2");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "Automation");
        caps.setCapability("app",System.getProperty("user.dir")+"/apps/ToDo.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public static void down(){
        if (driver!=null){
            driver.quit();
        }
    }
}
