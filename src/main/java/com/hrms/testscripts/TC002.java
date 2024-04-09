package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	//public static void main(String[] args)  throws Exception{
@Test
public void tc002() throws Exception{
	DOMConfigurator.configure("log4j");

	General obj = new General();
		obj.openApplication();
	//	Thread.sleep(2000);
		obj.login();
	//	Thread.sleep(2000);
		obj.Swich_in();
		obj.add_employee();
		obj.Switch_out();
		//Thread.sleep(2000);

		obj.logout();
		obj.closeApplication();
		
}
}
