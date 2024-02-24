package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFlaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9632587415");
		
//		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
//		driver.findElement(By.id("//div[@id='close']")).click();
//		driver.findElement(By.xpath("//span[text()='Create account']")).click();
//		Thread.sleep(15000);
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("firstName")).sendKeys("Sirisha");
//		driver.findElement(By.xpath("//input[@id='newsLetter']/following-sibling::span")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("09618475379");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
	}
}
