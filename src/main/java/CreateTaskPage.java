import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageObject{
    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextTitre")
    MobileElement titleText;

    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextNote")
    MobileElement descriptionText;

    @AndroidFindBy(id = "action_save")
    MobileElement saveButton;

    public void enterTitle(String title){
        clear(titleText);
        sendText(titleText, title);
    }

    public void enterDescription(String description){
        clear(descriptionText);
        sendText(descriptionText, description);
    }

    public void clickButtonSave(){
        click(saveButton);
    }
}
