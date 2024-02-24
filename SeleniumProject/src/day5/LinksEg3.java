package day5;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		System.out.println(links.size());

		for(int i = 0; i < links.size(); i++){
			String name = links.get(i).getText();
			System.out.println(name);
			
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
			
			File src = driver.getFullPageScreenshotAs(OutputType.FILE);
			src.renameTo(new File("D:\\SirishaRecordings\\Workspace1\\SeleniumProject\\src\\screenshots\\"+name+".png"));
			
			driver.navigate().back();
			Thread.sleep(5000);
			links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		}

	}

}
