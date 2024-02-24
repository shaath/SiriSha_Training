package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWaitEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/ProgressBar.html");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		driver.findElement(By.id("cricle-btn")).click();
//		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='100']")));
		System.out.println(driver.findElement(By.xpath("//div[text()='100']")).isDisplayed());

	}

}
