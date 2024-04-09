package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003_Deleteemp {
	//public static void main(String[] args)  throws Exception{
@Test
public void tc003() throws Exception{
	DOMConfigurator.configure("log4j");

	General obj = new General();
		obj.openApplication();
		//Thread.sleep(2000);
		obj.login();
	//	Thread.sleep(2000);
		obj.Swich_in();
		obj.delete_emp();
	//	Thread.sleep(2000);
		obj.Switch_out();
		obj.logout();
		obj.closeApplication();
	}
}
