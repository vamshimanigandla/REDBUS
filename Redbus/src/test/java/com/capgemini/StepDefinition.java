package com.capgemini;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	
	WebDriver driver = null;

	

	@Before
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D://Users//vmanigan//Downloads//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^I have navigated to the Redbus Home page$")
	public void i_have_navigated_to_the_redbus_homepage_page()  {
		System.setProperty("webdriver.chrome.driver", "D://Users//vmanigan//Downloads//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
	}

	@When("^I enter the source,destination and date$")
	public void I_enter_the_source() throws Throwable {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		loginpage.passsource.sendKeys("Pune");;
		loginpage.passsource1.click();
		loginpage.passdestination.sendKeys("Bangalore Intl Airport");
		loginpage.passdestination1.click();;
		loginpage.passdate.click();
		loginpage.passdate1.click();
		loginpage.passsearch.click();
		
		

	}
	
	@When("^I select bus , select seat and enter the details$")
	public void i_enter_the_invalid_credentials() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		loginpage.passbus.click();
		loginpage.selectbus.click();
		
		
		Thread.sleep(4000);
		Actions builder=new Actions(driver);
		Action act=builder.moveToElement(loginpage.selectseat,60,30).click().build();
		act.perform();
		
		loginpage.selectbp.click();
		loginpage.selectdp.click();
		loginpage.proceed.click();
		loginpage.pname.sendKeys("VAMSHIM");
		Thread.sleep(2000);
		loginpage.pgender.click();
		Thread.sleep(2000);
		loginpage.pAge.sendKeys("22");
		Thread.sleep(2000);
		loginpage.pemail.sendKeys("vamshimanigandla@gmail.com");
		Thread.sleep(2000);
		loginpage.pno.sendKeys("9666011733");
		
	
		
	/*	Point point=loginpage.selectseat.getLocation();
		int xcord=point.getX();
		int ycord=point.getY();
		Thread.sleep(1000);
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		builder.moveToElement(loginpage.selectseat,xcord,ycord).click().build().perform();
		//action.perform();
		*/
		
	}

	@Then("^I should navigate to payment page$")
	public void I_should_navigate_to_payment_page() throws Throwable
	{
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		Thread.sleep(2000);
		loginpage.proceedtopay.click();
	}
}
