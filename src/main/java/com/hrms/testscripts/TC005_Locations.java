package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC005_Locations {
//public static void main(String[] args) throws Exception {
@Test
public void tc005 () throws Exception{
	DOMConfigurator.configure("log4j");

	General obj = new General();
	obj.openApplication();
	obj.login();
	//Thread.sleep(2000);
	obj.mouseover_Admin();
	//Thread.sleep(2000);
	obj.mouseover_Companyinfo();
//	Thread.sleep(2000);
	obj.Click_on_Locations();
//	Thread.sleep(2000);
	obj.Swich_in();
	obj.Location();
//	Thread.sleep(2000);
	obj.Switch_out();
	obj.logout();
	obj.closeApplication();
}
}
