package testscript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Precondition;
import pom.Physician_Login_Page;


public class Physician_Login_page extends Precondition{


	 @Test(invocationCount = 01 ,  priority=1)
    public void Physician_Valid_Login() throws InterruptedException {
		test=extent.createTest("Physician Valid Login");
		test.log(Status.INFO, "Physician Valid Login test script started executing");
		    
		 Physician_Login_Page PLP = new Physician_Login_Page(driver);
		//AH.clickGet30DaysFreeButton();
		PLP.clickEmail();
		Thread.sleep(1000);
		PLP.setEmail(validemail1);
		test.pass("Entered Valid Email");
		PLP.clickPassword();
		Thread.sleep(1000);
		PLP.setPassword(validpassword1);
		test.pass("Entered Valid Password");
		Thread.sleep(1000);
		PLP.clickLogin();
		
		Thread.sleep(5000);
	    test.pass("Test script Passed");
		
		
}
	 @Test(invocationCount = 01 ,priority=2)
	    public void Physician_InValid_Login() throws InterruptedException {
			test=extent.createTest("Physician InValid Login");
			test.log(Status.INFO, "Physician InValid Login test script started executing");
			    
			Physician_Login_Page PLP = new Physician_Login_Page(driver);
			//AH.clickGet30DaysFreeButton();
			PLP.clickEmail();
			Thread.sleep(1000);
			PLP.setEmail(validemail1);
			test.pass("Entered Valid Email");
			PLP.clickPassword();
			Thread.sleep(1000);
			PLP.setPassword(invalidpassword);
			test.pass("Entered InValid Password");
			Thread.sleep(1000);
			PLP.clickLogin();
			
			Thread.sleep(5000);
		    test.pass("Test script Passed");
			
	}
	 @Test(invocationCount = 01 , priority=3)
	    public void Physician_InValid_4click() throws InterruptedException {
			test=extent.createTest("Physician InValid 4Click");
			test.log(Status.INFO, "Physician Valid Login test script started executing");
			    
			Physician_Login_Page PLP = new Physician_Login_Page(driver);
			//AH.clickGet30DaysFreeButton();
			 PLP.clickEmail();
			Thread.sleep(1000);
			PLP.setEmail(validemail1);
			test.pass("Entered Valid Email");
			PLP.clickPassword();
			Thread.sleep(5000);
			PLP.setPassword(invalidpassword);
			PLP.clickLogin();
			Thread.sleep(5000);
			PLP.clickLogin();
			Thread.sleep(5000);
			PLP.clickLogin();
			Thread.sleep(5000);
			PLP.clickLogin();
			Thread.sleep(5000);
			PLP.clickLogin();
           Thread.sleep(5000);
		    test.pass("Test script Passed");
			
	}



}