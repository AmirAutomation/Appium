package tests;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import org.junit.Test;

import java.net.MalformedURLException;

public class ToDoAndroid extends TestBase{

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Test
    public void test_AddTask() throws MalformedURLException, InterruptedException {
        AndroidSetUp();
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage = new TasksListPage(driver);

        tasksListPage.clicAddTask();
        createTaskPage.enterTitle("Finish Amir");
        createTaskPage.enterDescription("My course AMIR");

        //Oculatar el teclado
        driver.hideKeyboard();
        Thread.sleep(2000);

        createTaskPage.clickButtonSave();

        Thread.sleep(5000);
        down();

    }
}
