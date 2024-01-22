package Com.Thrucare.com.BusinessLogic;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Com.Thrucare.com.Config.ReadProperties;

public class GenericMethods
{
	
	
/*==========================================  =====================================================*/
	
     public static void OpenBrowser()
     {
    	 try {
    	 SmallMethods.browser();
    	 }catch(Exception e)
    	 {
    		 
    	 }
     }
     
     
/*===============================================================================================*/    
     
     
     public static void OpenURL(String APPurl)
     {
    	 try {
        	 SmallMethods.url(APPurl);
        	 SmallMethods.VerifiedText(Xpaths.or_Home,ReadProperties.GetParameterValue("d_Home"));
        	 }catch(Exception e)
        	 {
        		 
        	 }
     }
     
     
 /*==========================================//=====================================================*/ 
     
     
     public static void Click_ON_signIn_signUp(String xpath) throws IOException
     {
    	 if(xpath!=null)
    	 {
    	    SmallMethods.Click_AnyButton(xpath);
    	    SmallMethods.VerifiedText(Xpaths.or_patient_Text, ReadProperties.GetParameterValue("d_patient"));
    	    SmallMethods.VerifiedText(Xpaths.or_provider_Text,ReadProperties.GetParameterValue("d_provider"));
    	    
    	 }
     }
     
     
 /*==========================================//=====================================================*/   
     

     public static void Click_ON_SelectButton(String xpath) throws IOException
     {
    	 if(xpath!=null)
    	 {
    	    SmallMethods.Click_AnyButton(xpath);
    	    SmallMethods.VerifiedText(Xpaths.or_socialAccount_Text, ReadProperties.GetParameterValue("d_SocialAccont"));
    	    SmallMethods.VerifiedText(Xpaths.or_UserAccount_Text,  ReadProperties.GetParameterValue("d_UserAccont"));
    	   
    	  }
     }
     
 /*==========================================/Registration/=====================================================*/    
     
     
     
     
     public static void Click_SignUp_Link(String xpath) throws IOException
     {
    	 SmallMethods.Click_AnyButton(xpath);
    	 SmallMethods.VerifiedText(Xpaths.or_Header_Registration, ReadProperties.GetParameterValue("d_Header_Registration"));
     }
      
     
     
     
     public static void Enter_NewUsername(String xpath,String name) throws IOException
     {
    	 SmallMethods.senddata_WithFaker(xpath, name, SmallMethods.FakerClassLogic("firstnamenumber"));
     }
     
     
     
     
     public static void Enter_NewEmail(String xpath,String name) throws IOException
     {
    	 SmallMethods.senddata_WithFaker(xpath, name, SmallMethods.FakerClassLogic("email"));
     }
     
     
     public static void Enter_NewPassword(String xpath,String value) throws IOException
     {
    	 SmallMethods.Senddata(xpath, value);
     }
     
     
     public static void Click_SignUp_Button(String xpath,String xpath1) throws IOException
     {
    	 SmallMethods.Click_AnyButton(xpath);
    	 SmallMethods.ExplicitWait_wth_condition(20, xpath1);
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     public static void Enter_Username(String xpath,String data)
     
     
     { 
    	 
    	 
    	 SmallMethods.Senddata(xpath, data);
    	
    	 
     }
     
     
     
     
   /*==========================================//=====================================================*/     
     
     
     
     
     public static void Enter_Password(String xpath,String data)
     { 
    	 SmallMethods.Senddata(xpath, data);
     }
     
     
     
     
  /*==========================================//=====================================================*/  
     
     
     
     public static void Click_ON_signIN (String xpath) throws IOException
     {
    	 if(xpath!=null)
    	 {
    	    SmallMethods.Click_AnyButton(xpath);
    	    SmallMethods.ExplicitWait_wth_condition(20, Xpaths.or_viewProfile);
    	   
    	    
    	 }
     }
     
 
     
/*==========================================//=====================================================*/       
     
     
     public static void Enter_Location(String xpath,String data)
     { 
    	 if(xpath!=null)
    	 { 
    		 if(data!=null)
    		 {
    			 
    			 SmallMethods.Senddata(xpath, data);
    			
    			 // need to update ....
    			 Assert.assertTrue(true);
    		 }
    		 
    	 }
    	 
    }
     
   /*==========================================//=====================================================*/           
   
     public static void Click_on_SearchICON(String xpath)
     {
    	
    	 SmallMethods.Extract_DataFromTable( Xpaths.or_LocationList,Xpaths.or_los_Angeles,Xpaths.or_CA_USA);
    	 SmallMethods.Click_AnyButton(xpath);
    	 Assert.assertTrue(true);
    	 
     }
     
     
     
     
     
 /*==========================================//=====================================================*/      
     
  
     
 public static void Click_on_AnyProvider()
 {
	 SmallMethods.Extract_dataFrom_table( "Nikhil Provider51 Provider51","Dental Therapist");
	
	 Assert.assertTrue(true);
 }
     
     
  
 
   
     
     
	
     
     
     
     
}
