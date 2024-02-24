package functionalDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrgHRMMaster extends GenericMethods{

	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	//Launch
	public String orgLaunch(String br, String url) throws IOException{
		expval = "LOGIN";
		fi = new FileInputStream("D:\\SirishaRecordings\\Workspace1\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties");
		pr = new Properties();
		pr.load(fi);
		
		brlaunch(br, url);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		if(expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Login
	public String orgLogin(String u, String p) throws InterruptedException{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		Thread.sleep(5000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if(expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Logout
	public String orgLogout() throws InterruptedException{
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if(expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Close
	public void orgClose(){
		driver.close();
	}
	
	//Employee Registration
	public String orgEmpReg(String f, String l, String eid){
		expval = f + " " + l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		if(expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//User Registration
	public String orgUserReg(String ename, String uname, String pwd) throws InterruptedException{
		boolean flag = false;
		expval = uname;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
		for(int i = 0; i <= cols.size(); i++){
			actval = cols.get(i).getText();
			
			if (expval.equalsIgnoreCase(actval)) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			return "Pass";
		}else{
			return "Fail";
		}
		
	}
	
}
