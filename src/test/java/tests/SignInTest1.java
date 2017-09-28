package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import Page.SignInPage;
import base.BaseTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInTest1 extends BaseTest{
	

	
	   //@Test
	   /*public static void testSignIn() */public static void main(String[] args) throws InterruptedException{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\SavleenB\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dev.123loadboard.com/signup/");
		//Thread.sleep(3000L);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1200)", "");
		 int timeout = 30;
	        WebElement locator = driver.findElement(By.xpath("//*[@id=\"emailVerification\"]"));
	        try {
	            new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
	         
	            System.out.println("true");
	        } catch (Exception te) {
	        	System.out.println("false");
	        }
		
	    
	    
		/*driver.get("https://www.dev.123loadboard.com/login/");
		SignInPage sp = PageFactory.initElements(driver, SignInPage.class);
		Thread.sleep(3000L);//*[@id="signin"]/input[1]
		sp.typeUsername("greg@123");
		sp.typePassword("wasthesame1");
		sp.clickSignIn();*/
	}

}
