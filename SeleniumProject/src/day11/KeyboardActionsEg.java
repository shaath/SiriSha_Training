package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		act.click(email).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.chord("Test")).perform();
		Thread.sleep(5000);
		act.doubleClick(email).perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("c")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.id("pass"));
	
		act.click(pass).perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("v")).keyUp(Keys.CONTROL).build().perform();
		
	}

}
