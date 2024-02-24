package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import functionalDriven.GenericMethods;

public class TestNGMaster extends GenericMethods {

	public String br = "Firefox", url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String f = "Sirisha", l = "P", eid= "SP8547";
	public String ename = f+" "+l, uname="AAAA"+f+l+"Polisetti", pwd = "Test@852147963";
	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	
	@BeforeClass
	public void orgLaunch() throws IOException{
		expval = "LOGIN";
		fi = new FileInputStream("D:\\SirishaRecordings\\Workspace1\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties");
		pr = new Properties();
		pr.load(fi);
		
		brlaunch(br, url);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		Assert.assertEquals(expval, actval, "Launch Failed");
		
	}
	
	@BeforeMethod
	public void orgLogin() throws InterruptedException{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		Thread.sleep(5000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(expval, actval, "Login Failed");
	}
	
	@AfterMethod
	public void orgLogout() throws InterruptedException{
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(expval, actval, "Logout Failed");
	}
	
	@AfterClass
	public void orgClose(){
		driver.close();
	}
}
