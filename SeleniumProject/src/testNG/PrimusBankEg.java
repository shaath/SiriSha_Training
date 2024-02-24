package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import functionalDriven.GenericMethods;

public class PrimusBankEg extends GenericMethods{

	@BeforeClass
	public void prLaunch(){
		brlaunch("Firefox", "http://primusbank.qedgetech.com");
	}
	
	@BeforeMethod
	public void prLogin(){
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@Test
	public void prBranch(){
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
	}
	
	
	
	@AfterMethod
	public void prLogout(){
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	}
	
	@AfterClass
	public void prClose(){
		driver.close();
	}
}
