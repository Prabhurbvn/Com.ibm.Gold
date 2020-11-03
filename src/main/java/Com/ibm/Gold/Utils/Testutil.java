package Com.ibm.Gold.Utils;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


import Com.ibm.Gold.Base.Testbase;


public class Testutil extends Testbase
{
     public static void Maximize()
     {
    	 driver.manage().window().maximize();
     }
     
     public static void Implicit()
     {
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }
     
     public static void Dropdown_Day(WebElement day , int d)
     {
    	 Select sel =new Select(day);
    	 sel.selectByIndex(d);
     }
     
     public static void Dropdown_Month(WebElement month , String m)
     {
    	 Select sel =new Select(month);
    	 sel.selectByVisibleText(m);
     }
     
     public static void Dropdown_Year(WebElement year , String y)
     {
    	 Select sel =new Select(year);
    	 sel.selectByValue(y);
     }
     
     public static void Takesscreen()
     {
    	 try
    	 {
    	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 FileHandler.copy(src, new File(".//src//main//java//Com//ibm//Gold//Screen//fb"+System.currentTimeMillis()+".jpg"));
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e.getMessage());
    	 }
     }
     
    
}
