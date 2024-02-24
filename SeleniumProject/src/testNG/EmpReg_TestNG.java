package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster{

	@Test(dataProvider="data")
	public void orgEmpReg(String f, String l, String eid){
		expval = f + " " + l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(expval, actval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data(){
		
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Rama";
		x[0][1] = "S";
		x[0][2] = "RS001";
		
		x[1][0] = "Siva";
		x[1][1] = "P";
		x[1][2] = "SP002";
		
		x[2][0] = "Brahma";
		x[2][1] = "S";
		x[2][2] = "BS002";
		
		x[3][0] = "Ganesh";
		x[3][1] = "V";
		x[3][2] = "GV002";
		
		return x;
	}
}
