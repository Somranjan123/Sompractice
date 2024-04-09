package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
	//public static void main(String[] args) throws Exception{
	
	@Test
	public void tc001() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		//Thread.sleep(3000);
		obj.openApplication();
	//	Thread.sleep(3000);
		obj.login();
	//	Thread.sleep(3000);
		obj.logout();
		//obj.closeApplication();
	}

}
