package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
//		driver.findElement(By.linkText("Home")).click();
		
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
//		System.out.println(links.size());
//
//		for(int i = 0; i < links.size(); i++){
//			String name = links.get(i).getText();
//			System.out.println(name);
//			if(name.equalsIgnoreCase("Home")){
//				links.get(i).click();
//				break;
//			}
//			
//		}
		
		driver.findElement(By.xpath("//table[@id='Table_011']")).findElement(By.linkText("Home")).click();
	}

}
