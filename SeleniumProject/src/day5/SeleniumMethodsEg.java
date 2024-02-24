package day5;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethodsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SirishaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		Thread.sleep(5000);
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

}
