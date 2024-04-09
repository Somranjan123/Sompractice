package com.hrms.lib;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Reporter;


import com.hrms.utility.Log;

public class General extends Global{
	public void openApplication() throws Exception{
		//	ChromeOptions options = new ChromeOptions();
		//	options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"); // Specify the path to Chrome executable
		//	driver = new ChromeDriver(options);

			driver = new FirefoxDriver();
			driver.navigate().to(url);
			System.out.println("Applocation Opened");  	//Printed in Console
			Reporter.log("Application Opened");  		//Printed in html Report
		//	Log.info("Application Opened");  			//Printed in logfile

		}
		public void closeApplication() {
			driver.quit();
			System.out.println("Application Closed");
			Reporter.log("Application Closed");  		//Printed in html Report
			//Log.info("Application Closed");  			//Printed in logfile
			//Thread.sleep(3000);
		}
		public void login() throws Exception {
	       // System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Workspace Testing\\Frame_work_practice/geckodriver");
			driver.findElement(By.name(username_textbox)).sendKeys(un);
			driver.findElement(By.name(password_textbox)).sendKeys(pw);
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
			//wait.until(ExpectedConditions. elementToBeClickable(By.name("Login_btn")));
			driver.findElement(By.name(Login_btn)).click();
			//Thread.sleep(3000);
			System.out.println("Login Completed");
			Reporter.log("Login Completed");  		//Printed in html Report
			//Log.info("Login Completed");  			//Printed in logfile
		}
		public void logout() throws Exception {
			driver.findElement(By.linkText(Logout_link)).click();
			System.out.println("Logout Completed");	
			System.out.println("Logout");
			Reporter.log("Logout Successful");  		//Printed in html Report
		//	Log.info("Logout Successful");  			//Printed in logfile
		
		}
		public void add_employee() throws Exception {
			driver.findElement(By.xpath(add_employee_btn)).click();
			System.out.println("Add employee btn clicked");
			driver.findElement(By.name(Firstname_Textbox)).sendKeys(Fname);
			driver.findElement(By.name(Lastname_Textbox)).sendKeys(LName);
			System.out.println("First & Last name entered");
			
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); 
		//	WebElement element = wait.until(ExpectedConditions. elementToBeClickable(By.id("Save_btn")));
			
			driver.findElement(By.id(Save_btn)).click();
			//Thread.sleep(3000);
			System.out.println("Employee details Saved");
			Reporter.log("Employee added");  		//Printed in html Report
			Log.info("Employee Added");  			//Printed in logfile
		
		}
		public void delete_emp() throws Exception {
			//driver.switchTo().frame("rightMenu");
			Select sel = new Select(driver.findElement(By.name(Search_by)));
			sel.selectByVisibleText("Emp. First Name");
			Thread.sleep(3000);
			System.out.println("Clicked on visivle text Emp. First Name ");
			driver.findElement(By.id("loc_name")).sendKeys(Fname);
			Thread.sleep(3000);
			driver.findElement(By.xpath(Search_for_search_btn)).click();
			System.out.println("Clicked on Search button");
			System.out.println("Employee name searched");
			Thread.sleep(3000);
			driver.findElement(By.name(Checkbox)).click();
			driver.findElement(By.xpath(Delete_btn)).click();
			Thread.sleep(3000);
			System.out.println("Employee detaild deleted");
			Reporter.log("Employee Details Deleted");  		//Printed in html Report
			Log.info("Employee Details Deleted");  			//Printed in logfile
		
		}
		public void Swich_in() {
			driver.switchTo().frame("rightMenu");

		}
		public void Switch_out() {
			driver.switchTo().defaultContent();

		}
		public void Edit_emp() throws Exception {
			Select sel = new Select(driver.findElement(By.name(Search_by)));
			sel.selectByVisibleText("Emp. First Name");
			System.out.println("Clicked on visivle text Emp. First Name ");
			Thread.sleep(3000);
			driver.findElement(By.id("loc_name")).sendKeys(Fname);
			driver.findElement(By.xpath(Search_for_search_btn)).click();
			System.out.println("Clicked on Search button");
			Thread.sleep(3000);
			System.out.println("Employee name searched");
			driver.findElement(By.xpath(Emp_name_click_for_edit)).click();
			driver.findElement(By.name(Edit_btn_emp)).click();
			driver.findElement(By.name(Midil_Name)).sendKeys(Mname);
			Thread.sleep(3000);
			driver.findElement(By.xpath(Save_edit_btn)).click();
			System.out.println("Employee name edited");
			Reporter.log("Employee Details Edited");  		//Printed in html Report
			Log.info("Employee Details Edited");  			//Printed in logfile
		}
		public void Upload_image() throws Exception {
			driver.findElement(By.xpath(add_employee_btn)).click();
			System.out.println("Add employee btn clicked");
			driver.findElement(By.name(Firstname_Textbox)).sendKeys(Fname);
			driver.findElement(By.name(Lastname_Textbox)).sendKeys(LName);
			System.out.println("First & Last name entered");
			WebElement fileInput = driver.findElement(By.id(select_image));
			System.out.println("clicked on browser txt box");
		    fileInput.sendKeys("E:\\\\Mypic.jpg"); 
		    System.out.println("Image uploaded");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath(btn_save_img)).click();
			Thread.sleep(3000);
			System.out.println("Employee details Saved");
			Reporter.log("Image Uploaded");  		//Printed in html Report
			Log.info("Image Uploaded");  			//Printed in logfile
		
		}
		
		public void mouseover_Admin()  throws Exception{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath(btn_Admin))).perform();
			Thread.sleep(3000);
			System.out.println("First mouse over done");
			Reporter.log("First Mouseover Done");  		//Printed in html Report
			Log.info("First Mouseover Done");  			//Printed in logfile
			
		}
		public void mouseover_Companyinfo() throws Exception {
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath(btn_Company_info))).perform();
			Thread.sleep(3000);
			System.out.println("second mouseover completed");
			Reporter.log("Second Mouseover Done");  		//Printed in html Report
			Log.info("Second Mouseover Done");  			//Printed in logfile
		}
		public void Click_on_Locations() throws Exception {
			driver.findElement(By.xpath(btn_Location)).click();
			Thread.sleep(3000);
			System.out.println("Clicked on location btn");
			Reporter.log("Clicked on Location Btn");  		//Printed in html Report
			Log.info("Clicked on Location Btn");  			//Printed in logfile
		}
		public void Location() throws Exception{
			driver.findElement(By.xpath(btn_Add_location)).click();
			Select st = new Select(driver.findElement(By.xpath(dropdown_country)));
			st.selectByVisibleText("India");
			Thread.sleep(3000);
			driver.findElement(By.xpath(txtbox_name_locationpage)).sendKeys(Location_Name);
			driver.findElement(By.xpath(txtbox_state_province)).sendKeys(State);
			driver.findElement(By.xpath(txtarea_Address)).sendKeys(Address_location);
			Thread.sleep(3000);
			driver.findElement(By.xpath(txtbox_zip)).sendKeys(Pincode);
			driver.findElement(By.xpath(txt_phone)).sendKeys(Phone_no);
			driver.findElement(By.xpath(txtarea_comments)).sendKeys(Comments);
			Thread.sleep(3000);
			driver.findElement(By.xpath(btn_save_Location)).click();
			Thread.sleep(3000);
			System.out.println("Location Saved");
			Reporter.log("Location Saved");  		//Printed in html Report
			Log.info("Location Saved");  			//Printed in logfile
	}
	}



