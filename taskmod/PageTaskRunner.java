package com.taskmod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class PageTaskRunner extends Base_class {

	public static WebDriver driver = getbrowser("edge");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {
	@Test(priority = 0)

	public void Login() throws InterruptedException {

		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report3/Task.html");

		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		System.out.println("CAPMINDS");
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);

		// Step4: Create a test cases and assign test details
		// testName //testDescription
		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

		test.assignCategory("VOZO");
		test.assignAuthor("Capminds");

		// Launch browser
		geturl("https://test.vozo.xyz/");

		System.out.println("Broser Launched Successfully ");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Enter User name
		sendkeys(pom.getPageTask().getUsername(), "Admin3");

		// Enter Password
		sendkeys(pom.getPageTask().getPassword(), "Admin@123");

		// Click Sign In Button '
		Clickonelement(pom.getPageTask().getSigninbtn());

		// Click On Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//		    // Click Task button
		Clickonelement(pom.getPageTask().getClickTaskButton());

		System.out.println("Login Successfully ");

		test.pass("Login Successfully ");
	}

//	@Ignore

	@Test(priority = 1)

	public void TaskCategories() throws InterruptedException {

		///////// Task Categories//////////

		// Click Edit button
		Clickonelement(pom.getPageTask().getClickEditButton());

		// EnterNew category name
		sendkeys(pom.getPageTask().getEnterNewCategory(), "Testing");

		// Click Task button
		Clickonelement(pom.getPageTask().getClickNewCategory());

		Thread.sleep(2000);
		Clickonelement(pom.getPageTask().getclickClose());

		System.out.println("Edit Categories Tested Successfully");

	}

//	@Ignore

	@Test(priority = 2)

	public void CreateTaskStatues() throws InterruptedException {

		////// Create Task Statues ////

		Thread.sleep(3000);

		// Click staues edit button
		Clickonelement(pom.getPageTask().getclickStatusEdit());

		// EnterNew Status Name
		sendkeys(pom.getPageTask().getEnterStausName(), "Arrived");

		// Click status
		Clickonelement(pom.getPageTask().getClickStatus());

		// select In progress
		Clickonelement(pom.getPageTask().getSelectInProgress());

		// Click Category
		Clickonelement(pom.getPageTask().getClickCategory());

		// select Fever
		Selectone(pom.getPageTask().getSelectFever(), "Testing");

		// Click New Statuses button
		Clickonelement(pom.getPageTask().getClickNewsStatses());

		// close th edialogue box
		Clickonelement(pom.getPageTask().getClickClose());

		System.out.println("Task Statuses Tested Successfully ");

		// test.pass("Task Statuses Tested Successfully ");

	}

//	@Ignore

	@Test(priority = 3)

	public void TaskTemplate() throws InterruptedException {

//
		/////// Task Template ////

		// Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Click Edit Task Templates
		// Clickonelement(pom.getPageTask().getClickEditTaskTemplate());
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Task Template')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
		// Click Create New Templates
		Clickonelement(pom.getPageTask().getClickCreateNewTemplate());

		// Enter Title
		Thread.sleep(4000);
		sendkeys(pom.getPageTask().getEnterTitle(), "Capminds");

		// Click Assignee
		// Selectone(pom.getPageTask().getCickAssignee(),"Martin Edward");

		// Select Tech1 Test
		Thread.sleep(4000);
		Selectone(pom.getPageTask().getselectTech1Test(), "James Marry");

		// EnterTemplate Name
		sendkeys(pom.getPageTask().getEnterTemplateName(), "Capminds");

		// Enter Day
		sendkeys(pom.getPageTask().getEnterDay(), "2");

		// Enter Hour
		sendkeys(pom.getPageTask().getEnterHour(), "2");

		// Enter Minute
		sendkeys(pom.getPageTask().getEnterMin(), "2");

		// Click Category
		Selectone(pom.getPageTask().getSelectcategory(), "Testing");

		// click priority
		Selectone(pom.getPageTask().getClickPriority(), "Medium");

		// Select Medium
		Selectone(pom.getPageTask().getSelectmedium(), "Arrived");

		// click Status
//		Clickonelement(pom.getPageTask().getClickStatus1());
//
//		// Select Arrived
//		Clickonelement(pom.getPageTask().getSelectArrived());

		// Enter Notes
		sendkeys(pom.getPageTask().getEnterNotes(), "WELCOME");

		// click SAVE
		Clickonelement(pom.getPageTask().getSelectSave());

		// click CANCEL
		Clickonelement(pom.getPageTask().getSelectCancel());

		// Back Option

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement Back = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Back'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Back);

		Thread.sleep(8000);

		// click back
//		Clickonelement(pom.getPageTask().getClickBack());

		System.out.println("Task Template Tested Successfully");

		// test.pass("Task Template Tested Successfully");

	}
//	@Ignore

	@Test(priority = 4)

	public void TaskFiltes() throws InterruptedException {

//////////////TASK FILTERS ///////////////
// get Task

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Thread.sleep(3000);
		Clickonelement(pom.getPageTask().getTaskcli());

// sele assign

		// Clickonelement(pom.getPageTask().getTask());
		Thread.sleep(3000);

		Selectone(pom.getPageTask().getseleassign(), "James Marry");

		// sele assign

		// Clickonelement(pom.getPageTask().getseleprio());

		Selectone(pom.getPageTask().getseleprio(), "Medium");

		// sele due date

		Clickonelement(pom.getPageTask().getduedate());

		// sele archive

		Clickonelement(pom.getPageTask().getarchi());

		Clickonelement(pom.getPageTask().getarchi());

		// sele task

		// Selectone(pom.getPageTask().getseletask(), "Test");

		// cli res fil

		Clickonelement(pom.getPageTask().getresfil());

		System.out.println("Task Filters Tested Successfully");

		// test.pass("Task Filters Tested Successfully");
	}

//	@Ignore
	@Test(priority = 5)

	public void AddnewTask() throws InterruptedException {

////////////////ADD NEW TASK  ///////////////

		// add task
		Thread.sleep(2000);

		Clickonelement(pom.getPageTask().getaddnewtas());

		// sele temp

		Selectone(pom.getPageTask().getseletem(), "Capminds");

		// get tak ti

		Thread.sleep(4000);

		Selectone(pom.getPageTask().getcatsele(), "Testing");

		// get ass ti

		Selectone(pom.getPageTask().getstatse(), "Arrived");

//			// get ass ti
//
//			gettext(pom.getPageTask().getcate());
//
//			// get ass ti
//
//			gettext(pom.getPageTask().getstat());

// Note

// sendkeys(pom.getPageTask().getseletem(), "New 123");

		// sele asso
		Thread.sleep(2000);

		Selectone(pom.getPageTask().getaddass(), "Patient");

		// sele temp

		// selectone(pom.getPageTask().getseletem(), "Dem02");

		// sele ass its
		Thread.sleep(6000);

		Selectone(pom.getPageTask().getaddass(), "Appointment");

		// sele ass it
		try {
			Thread.sleep(8000);

			Clickonelement(pom.getPageTask().getpatna1());

			sendkeys(pom.getPageTask().getpatna(), "ravi");

			Clickonelement(pom.getPageTask().getselepat());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Patient Name Select");
		}

		Thread.sleep(5000);

// cli sav

		Clickonelement(pom.getPageTask().getclisav());

		System.out.println("Add Tasks Tested Successfully ");

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement viewall = wait4.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='View All Tasks'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewall);

		// select View all task
		Thread.sleep(3000);

//		Clickonelement(pom.getPageTask().getselectviewall());

//////////CLICK EDIT ///////////////
//cli edit

		Thread.sleep(7000);

		Clickonelement(pom.getPageTask().getclied());

//cli clo

		Clickonelement(pom.getPageTask().getcliclo());

		// select back
		Thread.sleep(3000);

		Clickonelement(pom.getPageTask().getselectback());

		// test.pass("Add Tasks Tested Successfully ");

		System.out.println("Edit Created Task Tested Successfully");

		// test.pass("Edit Created Task Tested Successfully");

		// step6: Mandatory step
		// extent.flush();

//		sdriver.close();

	}

}
