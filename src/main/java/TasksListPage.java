import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPage extends PageObject{

    public TasksListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(id = "com.jeffprod.todo:id/fab")
    MobileElement addTasksBtn;

    public void clicAddTask(){
        click(addTasksBtn);

    }
}
