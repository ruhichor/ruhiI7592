package testscript;



import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Precondition;
import pom.Annotator_Login_Page;
import pom.Physician_Login_Page;

public class Annotator_TestCases extends Precondition {
	
@Test(invocationCount = 01 ,  priority=1)
public void Annotator_Valid_Login() throws InterruptedException {
	test=extent.createTest("Annotator Valid Login");
	test.log(Status.INFO, "Annotator Valid Login test script started executing");
	
	Annotator_Login_Page ALP = new Annotator_Login_Page(driver);
	ALP.clickEmail();
    ALP.setEmail("ruhi+99aa@siterx.com");
    ALP.setPassword("Ruhi@123456789");
    ALP.clickLogin();

     Thread.sleep(3000);
     String actualurl = driver.getCurrentUrl();
	 System.out.println(actualurl);
	 AssertJUnit.assertEquals(actualurl, "https://annotator-qa.siterx.com/files");
	 test.pass("Test script Passed");
	    
}
 @Test(invocationCount = 01 ,priority=2)
 public void Annotator_InValid_Login() throws InterruptedException {
		test=extent.createTest("Annotator Valid Login");
		test.log(Status.INFO, "Annotator Valid Login test script started executing");
		    
		Annotator_Login_Page ALP = new Annotator_Login_Page(driver);
		//AH.clickGet30DaysFreeButton();
		ALP.clickEmail();
		Thread.sleep(1000);
		ALP.setEmail("ruhi+99aa@siterx.com");
		test.pass("Entered Valid Email");
		ALP.clickPassword();
		Thread.sleep(1000);
		ALP.setPassword("Ruhi@1234567");
		test.pass("Entered InValid Password");
		Thread.sleep(1000);
		ALP.clickLogin();
		Thread.sleep(5000);
	    test.pass("Test script Passed");
		
	    
		
}
 @Test(invocationCount = 01 , priority=3)
 public void Annotator_InValid_4click1(String validemail2) throws InterruptedException {
		test=extent.createTest("Annotator InValid 4Click");
		test.log(Status.INFO, "Annotator InValid 4Click test script started executing");
		    
		Annotator_Login_Page ALP = new Annotator_Login_Page(driver);
		//AH.clickGet30DaysFreeButton();
		    ALP.clickEmail();
			Thread.sleep(1000);
			ALP.setEmail(validemail1);
			test.pass("Entered Valid Email");
			ALP.clickPassword();
			Thread.sleep(5000);
			ALP.setPassword(invalidpassword);
			ALP.clickLogin();
			Thread.sleep(5000);
			ALP.clickLogin();
			Thread.sleep(5000);
			ALP.clickLogin();
			Thread.sleep(5000);
			ALP.clickLogin();
			Thread.sleep(5000);
			ALP.clickLogin();
		   Thread.sleep(5000);
		    test.pass("Test script Passed");
			
}
//@Test(invocationCount = 01 ,priority=2)
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
	
}//
//@Test(invocationCount = 01 , priority=3)
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

}//
