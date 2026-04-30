package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import testBase.BaseClass;

public class loginTestCases extends BaseClass {
	
	@Test()
     public void loginTestCases()
     {
		
		
		try {		
	HomePage hp = new HomePage(driver);
    hp.clickLogin();
    
    
    Loginpage lp=new Loginpage(driver);
    lp.setEmail("dipti.biswal@amussoft.com");
    lp.setPassword("12345678");
    lp. clickSignin() ;
     }
		
		
		catch(Exception e)
    	{
  
//    		logger.debug("Debug logs..");
    		Assert.fail();
    	}
    } 
}
