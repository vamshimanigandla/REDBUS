package com.cg.amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver = null;

	@Given("^amazon link$")
	public void goToRedbus() {
		System.setProperty("webdriver.chrome.driver", "D://Users//vmanigan//Downloads//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@When("^product is searched$")
	public void goToDetails() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
	
		
		
	}
	@And("^select five products$")
	public void selectpro() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div[2]/div/a/img")).click();
	
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"upsell_0_1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"upsell_3_1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"upsell_0_1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"upsell_2_0\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9640999226");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Vamc@572");
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(Keys.ENTER);
	
	}
	@Then("^proceed to the cart$")
	public void search() 
	{
			
		driver.findElement(By.xpath("//*[@id=\"enterAddressFullName\"]")).sendKeys(" VAMSHI MANIGANDLA");
		driver.findElement(By.xpath("//*[@id=\"enterAddressPhoneNumber\"]")).sendKeys("9640999226");
		driver.findElement(By.xpath("//*[@id=\"enterAddressPostalCode\"]")).sendKeys("411057");
		driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine1\"]")).sendKeys("ERC");
		driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine2\"]")).sendKeys("Capgemini Hinjewadi phase 3");
		
		driver.findElement(By.xpath("//*[@id=\"enterAddressLandmark\"]")).sendKeys("Cognizant");
		driver.findElement(By.xpath("//*[@id=\"enterAddressCity\"]")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"enterAddressStateOrRegion\"]")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//*[@id=\"newShippingAddressFormFromIdentity\"]/div[1]/div[1]/form/div[5]/span/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")).click();	
	}
}
