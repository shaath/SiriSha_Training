package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriven.OrgHRMMaster;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat format = new SimpleDateFormat("ddMMYYYYHHmmss");
		String date = format.format(d);
		
		OrgHRMMaster om = new OrgHRMMaster();
		String res = "";
		String xlPath = System.getProperty("user.dir") + "\\src\\testData\\Keyword.xlsx";
		String xlOut =  System.getProperty("user.dir") + "\\src\\results\\Keyres"+date+".xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet tcSht = wb.getSheet("Testcase");
		XSSFSheet tsSht = wb.getSheet("Teststeps");
		XSSFSheet tdSht = wb.getSheet("TestData");
		
		int tcRc = tcSht.getLastRowNum();
		int tsRc = tsSht.getLastRowNum();
		
		for(int i = 1; i <= tcRc; i++){
			tcSht.getRow(i).createCell(3);
			String exe = tcSht.getRow(i).getCell(2).getStringCellValue();
			
			if(exe.equalsIgnoreCase("Y")){
				String tcShtTcId = tcSht.getRow(i).getCell(0).getStringCellValue();
				
				for(int j = 1; j <= tsRc; j++){
					String tsShtTcId = tsSht.getRow(j).getCell(0).getStringCellValue();
					
					if(tcShtTcId.equalsIgnoreCase(tsShtTcId)){
						String key = tsSht.getRow(j).getCell(3).getStringCellValue();
						
						switch(key){
						case "Launch":
							String br = tdSht.getRow(1).getCell(0).getStringCellValue();
							String url = tdSht.getRow(1).getCell(1).getStringCellValue();
							
							res = om.orgLaunch(br, url);
							break;
						case "login":
							String u = tdSht.getRow(1).getCell(2).getStringCellValue();
							String p = tdSht.getRow(1).getCell(3).getStringCellValue();
							
							res = om.orgLogin(u, p);
							break;
						case "logout":
							res = om.orgLogout();
							om.orgClose();
							break;
						case "Empreg":
							String f = tdSht.getRow(1).getCell(4).getStringCellValue();
							String l = tdSht.getRow(1).getCell(5).getStringCellValue();
							String eid = tdSht.getRow(1).getCell(6).getStringCellValue();
							
							res = om.orgEmpReg(f, l, eid);
							break;
						case "Usereg":
							String ename = tdSht.getRow(1).getCell(7).getStringCellValue();
							String uname = tdSht.getRow(1).getCell(8).getStringCellValue();
							String pwd = tdSht.getRow(1).getCell(9).getStringCellValue();
							
							res = om.orgUserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = tdSht.getRow(1).getCell(8).getStringCellValue();
							String pd = tdSht.getRow(1).getCell(9).getStringCellValue();
							res = om.orgLogin(un, pd);
							break;
						}
						
						tsSht.getRow(j).createCell(4).setCellValue(res);
						
						if(!tcSht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")){
							tcSht.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
				
			}else{
				tcSht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();

	}

}
