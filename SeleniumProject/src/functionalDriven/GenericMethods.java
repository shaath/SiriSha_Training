package functionalDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethods {

	public WebDriver driver = null;
	
	public void brlaunch(String br, String url){
		
		if(br.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SirishaRecordings\\Jars\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (br.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\SirishaRecordings\\Jars\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(url);
	}
}
