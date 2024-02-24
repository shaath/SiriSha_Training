package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> l = driver.findElements(By.xpath("//input[contains(@name,'option')]"));
		System.out.println(l.size());
		
		for(int i = 0; i < l.size(); i++){
			System.out.println(l.get(i).getAttribute("value"));
			
			if(!l.get(i).isSelected()){
				l.get(i).click();
			}
		}

	}

}
