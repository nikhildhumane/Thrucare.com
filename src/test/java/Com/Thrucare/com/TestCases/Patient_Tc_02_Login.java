package Com.Thrucare.com.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Thrucare.com.BusinessLogic.GenericMethods;
import Com.Thrucare.com.BusinessLogic.Xpaths;
import Com.Thrucare.com.Config.ReadProperties;

public class Patient_Tc_02_Login
{
    @Test
	public void Patient_LoginDone_when_ClickON_SignIn_signUp() throws IOException, Exception
	{
    	GenericMethods.OpenBrowser();
    	GenericMethods.OpenURL(ReadProperties.GetParameterValue("d_ApplicationUrl"));
    	GenericMethods.Click_ON_signIn_signUp(Xpaths.or_signIn_or_SignUp);
    	GenericMethods.Click_ON_SelectButton(Xpaths.or_pa_selectButton);
    	GenericMethods.Enter_Username(Xpaths.or_username, ReadProperties.GetParameterValue("d_username"));
    	GenericMethods.Enter_Password(Xpaths.or_password, ReadProperties.GetParameterValue("d_password"));
    	GenericMethods.Click_ON_signIN(Xpaths.or_signIN);
    	
    	
    	
    	
    	
   	
//    	GenericMethods.OpenBrowser();
//    	GenericMethods.OpenURL(ReadProperties.GetParameterValue("d_ApplicationUrl"));
//    	Thread.sleep(5000);
//    	GenericMethods.Enter_Location(Xpaths.or_LocationField, ReadProperties.GetParameterValue("d_Location"));
//    	Thread.sleep(5000);
//    	GenericMethods.Click_on_SearchICON(Xpaths.or_SearchiconButton);
//    	Thread.sleep(5000);
//    	GenericMethods.Click_on_AnyProvider();
    	
    	
    	
    	
    	
    	
    	
    //	GenericMethods.Click_on_AnyProvider();
    	
		
	}
}
