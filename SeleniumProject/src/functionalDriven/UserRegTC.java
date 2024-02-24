package functionalDriven;

import java.io.IOException;

public class UserRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		OrgHRMMaster om = new OrgHRMMaster();

		res = om.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application launch "+res);
		
		res = om.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application login "+res);
		
		res = om.orgUserReg("Selenium S", "AAAASeleniumS754546", "Test@852147963");
		System.out.println("User Registration "+res);
		
		res = om.orgLogout();
		System.out.println("Application logout "+res);
		
		om.orgClose();
		System.out.println("Application Closed Successfully");

	}

}
