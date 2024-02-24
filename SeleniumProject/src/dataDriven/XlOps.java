package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriven.OrgHRMMaster;

public class XlOps {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat format = new SimpleDateFormat("ddMMYYYYHHmmss");
		String date = format.format(d);
		System.out.println(date);
		
		OrgHRMMaster om = new OrgHRMMaster();
		String res = null;
		String xlPath = System.getProperty("user.dir") + "\\src\\testData\\TestData.xlsx";
		String xlOut = System.getProperty("user.dir") + "\\src\\results\\EmpRes"+date+".xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(7);
//		XSSFCell c = r.getCell(2);
//		
//		System.out.println(c.getStringCellValue());
		
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		
		om.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		om.orgLogin("Admin", "Qedge123!@#");
		
		for(int i = 1; i <= rc; i++){
			XSSFRow r = ws.getRow(i);
			XSSFCell c = r.getCell(0);
			XSSFCell c1= r.getCell(1);
			XSSFCell c2 = r.getCell(2);
			XSSFCell c3 = r.createCell(3);
			
			String f = c.getStringCellValue();
			String l = c1.getStringCellValue();
			String eid = c2.getStringCellValue();
			
			System.out.println(f+"----"+l+"----"+eid);
			
			res = om.orgEmpReg(f, l, eid);
			
			c3.setCellValue(res);
		}
		
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();
		
		om.orgLogout();
		om.orgClose();
		
	}

}
