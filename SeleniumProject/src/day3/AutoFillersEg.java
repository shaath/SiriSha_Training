package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("src")).sendKeys("hyd");
		Thread.sleep(10000);
		
		List<WebElement> links = driver.findElements(By.xpath("//li//text[1]"));
		System.out.println(links.size());
		
		for(int i = 0; i < links.size(); i++){
			String lName = links.get(i).getText();
			System.out.println(lName);
			
			if (lName.equalsIgnoreCase("Ameerpet")) {
				links.get(i).click();
				break;
			}
		}
	}

}
