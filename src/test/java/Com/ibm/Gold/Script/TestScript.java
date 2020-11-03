package Com.ibm.Gold.Script;
import org.testng.Assert;




import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.ibm.Gold.Base.Testbase;
import Com.ibm.Gold.Pages.LoginPage;
import Com.ibm.Gold.Utils.Testutil;

public class TestScript extends Testbase
{
   LoginPage log;
   
   @BeforeTest(alwaysRun=true)
   public void Setup()
   {
	   Open();
	   log =new LoginPage();
	  
   }
   
   @Test
   public void  ValidateTitle()
   {
	   String str = log.VerifyTitle();
	   Assert.assertEquals(str, "Facebook – log in or sign up");
   }
   
   @Test
   public void  ValidateUrl()
   {
	   String s = log.VerifyUrl();
	   Assert.assertEquals(s, "https://www.facebook.com/");
   }
   
    @Test
   public void ValidateCreate()
   {
	   log.VerifyCreatenewaacount();
   }
   
 
   @Test
   public void  ValidateCreatenew()
   {
	   String l = log.VerifyCreate();
	   Assert.assertEquals(l, "Create New Account");
   }
   
   
   @Test
   public void  ValidateName()
   {
	  log.VerifyName("selenium");
   }
   
   @Test
   public void ValidateLastname()
   {
	   log.VerifyLastname("Java");
   }
   
   @Test
   public void  ValidateRadio()
   {
	   boolean d= log.VerifyRadio();
	   Assert.assertTrue(d);
   }
   
   @Test
   public void ValidateDay()
   {
	  Testutil.Dropdown_Day(log.Drop_downDay, 5); 
   }
   
   @Test
   public void ValidateMonth()
   {
	  Testutil.Dropdown_Month(log.Drop_downMonth, "Feb"); 
   }
   
   @Test
   public void ValidateYear()
   {
	  Testutil.Dropdown_Year(log.Drop_downYear, "1910");
   }
   
 
   @AfterTest
   public void Teardown()
   {
	   
	driver.close();
   }
   
   
}
