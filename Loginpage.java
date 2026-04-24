package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage  extends BasePage {
           public Loginpage(WebDriver driver)
           {
        	   super(driver);
           }
           
           
        @FindBy(id="email")WebElement txtEmail;
        
   		@FindBy(id="password")WebElement txtPassword;
   		
   	    @FindBy(xpath="//button[normalize-space()='Sign In']")WebElement btnSignin;
   	    
//   	    mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept']"))).click();

   	    
   	    public void setEmail(String Email)
   	    {
   	    	txtEmail.sendKeys("");
   	    }
   	    
   	   public void setPassword(String Password)
   	    {
   	    	txtPassword.sendKeys("");
   	    }
   	    
   	      	public void clickSignin()
    	{
		  btnSignin.click();
		
			}
}
