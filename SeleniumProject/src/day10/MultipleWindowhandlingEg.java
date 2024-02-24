package day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowhandlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com/");
		
		String gmail = driver.getWindowHandle();
		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s = driver.getWindowHandles();
		
		for(String wid: s){
//			System.out.println(wid);
			driver.switchTo().window(wid);
			Thread.sleep(5000);
			
			if(driver.getTitle().contains("Privacy Policy")){
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			}
		}
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
