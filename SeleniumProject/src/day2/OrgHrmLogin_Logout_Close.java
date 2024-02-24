package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHrmLogin_Logout_Close {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\SirishaRecordings\\Jars\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "D:\\SirishaRecordings\\Jars\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		
//		userName.click();
//		Thread.sleep(5000);
		userName.sendKeys("Admin");
//		Thread.sleep(5000);
//		userName.clear();
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
//		driver.close();
		driver.quit();
	}

}
