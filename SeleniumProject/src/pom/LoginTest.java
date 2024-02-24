package pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginTest{

	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(loginpage.url);
		
		loginpage.orgLogin(loginpage.u, loginpage.p);
		Thread.sleep(5000);
		AdminPage ap = PageFactory.initElements(driver, AdminPage.class);
		
		ap.welcomeclick();
		Thread.sleep(2000);
		ap.logoutclick();
		
		driver.close();
	}
}
