package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement drop = driver.findElement(By.name("country"));
		
		Select s = new Select(drop);
		
//		s.selectByIndex(3);
//		s.selectByValue("ANGOLA");
		s.selectByVisibleText("INDIA");
		
//		List<WebElement> c = s.getOptions();
//		System.out.println(c.size());
//		
//		for(int i = 0; i < c.size(); i++)
//		{
////			s.selectByIndex(i);
//			String txt = c.get(i).getText();
//			System.out.println(txt);
//			s.selectByVisibleText(txt);
//		}
	}

}
