package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://orangehrm.qedgetech.com");

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(5000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i = 0; i < rows.size(); i++){
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
//			String id = cols.get(1).getText();
//			System.out.println(id);
			
//			if(id.equalsIgnoreCase("3407")){
//				cols.get(0).click();
//				Thread.sleep(5000);
//				driver.findElement(By.id("btnDelete")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.id("dialogDeleteBtn")).click();
//				Thread.sleep(5000);
//				break;
//			}
			cols.get(0).findElement(By.tagName("input")).click();
		}
	}

}
