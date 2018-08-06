package com.capgemini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	//private static WebElement element=null;
	//WebDriver driver;
	@FindBy(how=How.ID,using="src")
	 WebElement passsource;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	 WebElement passsource1;
	@FindBy(how=How.ID,using="dest")
	 WebElement passdestination;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[2]/div/ul/li")
	 WebElement passdestination1;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[3]/div/label")
	 WebElement passdate;
	@FindBy(how=How.XPATH,using="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[6]")
	 WebElement passdate1;
	@FindBy(how=How.XPATH,using="//*[@id=\"search_btn\"]")
	 WebElement passsearch;
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/ul/li[3]/div/div[4]/div")
	 WebElement passbus;
	@FindBy(how=How.XPATH,using="//*[@id=\"8846913\"]/div/div[2]/div[1]")
	 WebElement selectbus;
	@FindBy(how=How.XPATH,using="//*[@id=\"rt_8846913\"]/div/div/div/div[3]/div[2]/div[2]/canvas")
	 WebElement selectseat;
	@FindBy(how=How.XPATH,using="//*[@id=\"8846913\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[1]")
	 WebElement selectbp;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"8846913\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[2]/span[2]/div")
	 WebElement selectdp;
	@FindBy(how=How.XPATH,using="//*[@id=\"8846913\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	 WebElement proceed;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-04\"]")
	 WebElement pname;
	@FindBy(how=How.XPATH,using="//*[@id=\"22_0\"]")
	 WebElement pgender;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-01\"]")
	 WebElement pAge;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-05\"]")
	 WebElement pemail;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-06\"]")
	 WebElement pno;
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")
	 WebElement proceedtopay;
	
	
	
	/*public  void builder(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		Action act=builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"rt_8846913\"]/div/div/div/div[3]/div[2]/div[2]/canvas")),60,30).click().build();
		act.perform();
	}*/
	
	
	
	
	
	
	/* public static WebElement destination(WebDriver driver){
		 
       element = driver.findElement(By.id("dest"));

       return element;
       

       }*/
	
	
}

//#rb-calendar_onward_cal > table > tbody > tr:nth-child(5) > td.current.day
