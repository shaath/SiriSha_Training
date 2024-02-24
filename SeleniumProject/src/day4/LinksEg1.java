package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {
		public static void main(String[] args) {
	
			System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();

			driver.get("https://www.bing.com/");

			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			System.out.println(links.size());
			for(int i = 0; i < links.size(); i++){
				String name = links.get(i).getText();
				System.out.println(name);
				
//				if(name.equalsIgnoreCase("Images")){
//					links.get(i).click();
//					break;
//				}
			}
		}
}
