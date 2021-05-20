package generic;

import java.util.Set;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base_Page {
	
	WebDriver driver;
	
	public Base_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyUrl(String Eurl,int time) {
		try {
			WebDriverWait wait =new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.urlContains(Eurl));
			System.out.println("valid url");
			
		} catch (Exception e) {
			System.out.println("invalid url");
		}
		
		
	}
	
	
	public void verifyElement(WebElement Element,int time) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOf(Element));
			System.out.println("element visible");
		} catch (Exception e) {
			System.out.println("element not visible");
		}
	}
	
	public void getText(WebElement Element,int time,String expected ) {
		
		try {
			String actual = Element.getText();
			Assert.assertEquals(actual, expected);
			System.out.println("The Error Message is--->"+actual);
			System.out.println("Proper  message  DISPLAYED");
		} catch (Exception e) {
			String actual2 = Element.getText();
			System.out.println("Proper  message not  DISPLAYED");
			Assert.fail("Proper Error message not displayed");
			System.out.println("The Error Message is--->"+actual2);
		}
	}
	
	public void switchTowindow() {
		
		try {
			
			Set<String> allwindow = driver.getWindowHandles();
			for (String window : allwindow) {
				driver.switchTo().window(window);
			}
			System.out.println("Switched to window");
		} catch (Exception e) {
			Assert.fail("Failed to switch");
		}
	}
	
	public void scrollToSpecifivLocation(WebElement Element) {
		JavascriptExecutor JS=(JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView()",Element);
	}
	
	
	public void selectTheValueFromDropDown(WebElement dropdown,String VisibleText) {
		try {
			Select s=new Select(dropdown);
			s.selectByVisibleText( VisibleText);
		} catch (Exception e) {
			Assert.fail("Failed to select from drop down");
		}
	}
	
	public void moveToElement(WebElement Element) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(Element);
		} catch (Exception e) {
			Assert.fail("Failed to smove to the element");
		}
	}
}
