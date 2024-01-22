package Com.Thrucare.com.BusinessLogic;

import java.io.IOException;

import org.testng.Assert;

import Com.Thrucare.com.Config.ReadProperties;

public class ScenarioMethods
{
  
	
	
	// patient login done successfully _click on SignIn OR sIGN Up button
	public static void Patient_whenpatientClickon_signInOrSignUP() throws IOException
	{
    	GenericMethods.OpenBrowser();
    	GenericMethods.OpenURL(ReadProperties.GetParameterValue("d_ApplicationUrl"));
    	GenericMethods.Click_ON_signIn_signUp(Xpaths.or_signIn_or_SignUp);
    	GenericMethods.Click_ON_SelectButton(Xpaths.or_pa_selectButton);
    	GenericMethods.Enter_Username(Xpaths.or_username, ReadProperties.GetParameterValue("d_username"));
    	GenericMethods.Enter_Password(Xpaths.or_password, ReadProperties.GetParameterValue("d_password"));
    	GenericMethods.Click_ON_signIN(Xpaths.or_signIN);
    	
    	
    	
		
	}
	
	
	
	
	
	
	
	
	
}
