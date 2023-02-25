package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

import static tests.TestBase.AndroidSetUp;
import static tests.TestBase.driver;

public class CreateNewTaskStepExample {
    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Given("Click add new Tassk")
    public void click_add_new_tassk() throws MalformedURLException {
        AndroidSetUp();

        createTaskPage = new CreateTaskPage(driver);
        tasksListPage = new TasksListPage(driver);

        tasksListPage.clicAddTask();
    }
    @Given("Enter {string} and {string}")
    public void enter_and(String string, String string2) {
        createTaskPage.enterTitle(string);
        createTaskPage.enterDescription(string2);
        createTaskPage.clickButtonSave();
    }

    @Then("Task added successfully")
    public void task_added_successfully() {

    }

}
