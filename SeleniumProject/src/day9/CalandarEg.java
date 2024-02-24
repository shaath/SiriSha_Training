package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalandarEg {

	public static void main(String[] args) throws InterruptedException {
		
		String d = "10/December/2024";
		String[] sArray = d.split("/");
		String expMY = sArray[1]+" "+sArray[2];
		String expD = sArray[0];
		
		System.out.println(expMY+"-----"+expD);
		
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");

		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//div[@class='d-flex']//*[local-name()='svg']/*[local-name()='path']")).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button/*[local-name()='svg']/*[local-name()='g' and contains(@mask, 'url')]/*[local-name()='path']/../.."));
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
//		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		je.executeScript("window.scrollBy(0, 250)", ele);
		Thread.sleep(10000);
		
		ele.click();
//		je.executeScript("arguments[0].Click();", ele);
		
		String actMY = driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div[@class='DayPicker-Caption']/div")).getText();
		
		while(!expMY.equalsIgnoreCase(actMY)){
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			actMY = driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div[@class='DayPicker-Caption']/div")).getText();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day')]/div/.."));
		for(int i = 0; i < days.size(); i++){
			String day = days.get(i).getAttribute("aria-label");
			System.out.println(day);
			if (day.contains(expD)) {
				days.get(i).click();
				break;
			}
		}
	}

}
