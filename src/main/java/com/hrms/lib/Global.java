package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	WebDriver driver;
	//Provide Test Data and objects related to whole application.
	//*********  Test Data
	public String url = "http://183.82.103.245/nareshit/index.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String LName = "Meher";
	public String Fname = "Som";
	public String Mname = "Ranjan";
	public String Location_Name = "Som";
	public String State = "Telangana";
	public String Address_location  = "Madhapur, Hi-Tech City, Vitthal Rao Nagar";
	public String Pincode      =  "500081";
	public String Phone_no     = "9937245381";
	public String Comments     = "Let's Create a whatsapp group for batch 043, Here is my whatsApp & contact No";
	
	
	
	
	
	//*********  Objects
	public String username_textbox = "txtUserName";
	public String password_textbox = "txtPassword";
	public String Login_btn        = "Submit";
	public String Logout_link      = "Logout";
	public String add_employee_btn = "/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
	public String Lastname_Textbox = "txtEmpLastName";
	public String Firstname_Textbox = "txtEmpFirstName";
	public String Save_btn         = "btnEdit";
	public String Search_by        = "loc_code";
	public String Search_For       = "loc_name";
	public String Search_for_search_btn = "/html/body/div/div[2]/form/div[2]/input[2]";
	public String Checkbox         = "chkLocID[]";
	public String Delete_btn       = "/html/body/div/div[2]/form/div[3]/div[1]/input[2]";
	public String Emp_name_click_for_edit = "/html/body/div/div[2]/form/table/tbody/tr[1]/td[3]/a";
	public String Edit_btn_emp    = "EditMain";
	public String Midil_Name              = "txtEmpMiddleName";
	public String Save_edit_btn           = "//*[@id=\"btnEditPers\"]";
	public String btn_Admin               = "/html/body/div[4]/ul/li[1]/a/span";
	public String btn_Company_info        = "/html/body/div[4]/ul/li[1]/ul/li[1]/a/span";
	public String btn_Location            = "/html/body/div[4]/ul/li[1]/ul/li[1]/ul/li[2]/a/span";
	public String btn_Add_location        = "/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
	public String txtbox_name_locationpage  = "//*[@id=\"txtLocDescription\"]";
	public String dropdown_country        = "//*[@id=\"cmbCountry\"]";
	public String txtbox_state_province   = "//*[@id=\"txtState\"]";
	public String txtarea_Address         = "//*[@id=\"txtAddress\"]";
	public String txtbox_zip              = "//*[@id=\"txtZIP\"]";
	public String txt_phone               = "//*[@id=\"txtPhone\"]";
	public String txtarea_comments        = "//*[@id=\"txtComments\"]";
	public String btn_save_Location       = "//*[@id=\"editBtn\"]";
	public String select_image            = "photofile";
	public String btn_save_img            = "//*[@id=\"btnEdit\"]";
}


