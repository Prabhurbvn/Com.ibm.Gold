package Com.ibm.Gold.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ibm.Gold.Base.Testbase;

public class LoginPage extends Testbase
{
   @FindBy(xpath="//input[@id='email']")
   WebElement Emailaddress;
   
   @FindBy(xpath="//input[@id='pass']")
   WebElement Password;
   
   @FindBy(xpath="//a[@role='button']")
   WebElement Createnewaccount;
   
   @FindBy(name="firstname")
   WebElement Firstname;
   
   @FindBy(name="lastname")
   WebElement Lastname;
   
   @FindBy(xpath="//label[text()='Female']")
   WebElement FemaleRadio;
   
   @FindBy(xpath="//select[@name='birthday_day']")
  public  WebElement Drop_downDay;
   
   @FindBy(xpath="//select[@name='birthday_month']")
  public WebElement Drop_downMonth;
   
   @FindBy(xpath="//select[@name='birthday_year']")
  public WebElement Drop_downYear;
   
   
   public LoginPage()
   {
	   super();
	   PageFactory.initElements(driver, this);
   }
   
   public String VerifyTitle()
   {
	  String str= driver.getTitle(); 
	  return str;
   }
   
   public String VerifyUrl()
   {
	  String s= driver.getCurrentUrl(); 
	  return s;
   }
   
   public void VerifyEmail(String username)
   {
	   Emailaddress.sendKeys(username);
   }
   
   public void VerifyPass(String password)
   {
	  Password.sendKeys(password);
   }
   
   public void VerifyCreatenewaacount()
   {
	   Createnewaccount.click();
   }
   
   public String VerifyCreate()
   {
	   String t= Createnewaccount.getText();
	   return t;
   }
   
   public void VerifyName(String name)
   {
	   Firstname.sendKeys(name);
   }
   
   
   public void VerifyLastname(String name)
   {
	  Lastname.sendKeys(name);
   }
   
   public boolean VerifyRadio()
   {
	  return FemaleRadio.isDisplayed();
   }
   
   public void VerifyTest(String username,String password) throws InterruptedException
   {
	   Emailaddress.clear();
	   Emailaddress.sendKeys(username);
	   Thread.sleep(2000);
	   Password.clear();
	   Password.sendKeys(password);
	   Thread.sleep(2000);
   }
   
  
}
