package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC006_Upload_image {
@Test
public void tc006() throws Exception{
	DOMConfigurator.configure("log4j");

	General obj = new General();	
	obj.openApplication();
	obj.login();
	obj.Swich_in();
	obj.Upload_image();
	obj.Switch_out();
	obj.logout();
	obj.closeApplication();
	
	
}
}
