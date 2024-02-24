package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FullPageScreenshotEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://bing.com");
		
		Thread.sleep(25000);
		
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File src = driver.getFullPageScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\SirishaRecordings\\Workspace1\\SeleniumProject\\src\\screenshots\\bing_full_page.png"));
		
		src.renameTo(new File("D:\\SirishaRecordings\\Workspace1\\SeleniumProject\\src\\screenshots\\bing_full_page3.png"));

	}

}
