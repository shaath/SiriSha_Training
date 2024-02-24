package functionalDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingEg {

	public static void main(String[] args) throws IOException {
		String f = "D:\\SirishaRecordings\\Workspace1\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties";
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		
		System.out.println(pr.getProperty("login"));
		

	}

}
