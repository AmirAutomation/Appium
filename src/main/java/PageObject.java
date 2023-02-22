import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

    AppiumDriver driver;
    public static final long WAIT=10;

    public PageObject(AppiumDriver appiumDriver){
        //AppiumFieldDecorator es el metodo encargado de visualizar los finedelemente de androud
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void waitForVisibility(MobileElement element){
        //WebDriverWait wait = new WebDriverWait(driver, WAIT);
        //wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }
    public void sendText(MobileElement element, String texto){
        waitForVisibility(element);
        element.sendKeys(texto);
    }
    public String getAttribute(MobileElement element, String attribute){
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }
}
