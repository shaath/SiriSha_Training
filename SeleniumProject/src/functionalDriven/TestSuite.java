package functionalDriven;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		OrgHRMMaster om = new OrgHRMMaster();

		//Login
		res = om.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application launch "+res);
		
		res = om.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application login "+res);
		
		res = om.orgLogout();
		System.out.println("Application logout "+res);
		
		om.orgClose();
		System.out.println("Application Closed Successfully");

		//EmpReg
		res = om.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application launch "+res);
		
		res = om.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application login "+res);
		
		res = om.orgEmpReg("Selenium", "S", "SS780821");
		System.out.println("Employee Registration "+res);
		
		res = om.orgLogout();
		System.out.println("Application logout "+res);
		
		om.orgClose();
		System.out.println("Application Closed Successfully");

		//User Reg
		res = om.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application launch "+res);
		
		res = om.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application login "+res);
		
		res = om.orgUserReg("Selenium S", "AAAASeleniumS7546", "Test@852147963");
		System.out.println("User Registration "+res);
		
		res = om.orgLogout();
		System.out.println("Application logout "+res);
		
		om.orgClose();
		System.out.println("Application Closed Successfully");

		//User Login
		res = om.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application launch "+res);
		
		res = om.orgLogin("AAAASeleniumS7546", "Test@852147963");
		System.out.println("Application login "+res);
		
		res = om.orgLogout();
		System.out.println("Application logout "+res);
		
		om.orgClose();
		System.out.println("Application Closed Successfully");

	}

}
