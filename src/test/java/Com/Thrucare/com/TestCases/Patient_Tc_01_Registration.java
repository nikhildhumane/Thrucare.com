package Com.Thrucare.com.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Thrucare.com.BusinessLogic.GenericMethods;
import Com.Thrucare.com.BusinessLogic.Xpaths;
import Com.Thrucare.com.Config.ReadProperties;

public class Patient_Tc_01_Registration 
{
     @Test
	public void RegistrationDone_when_clickOn_signIn_SignUp() throws IOException
	{
    	 GenericMethods.OpenBrowser();
     	 GenericMethods.OpenURL(ReadProperties.GetParameterValue("d_ApplicationUrl"));
     	 GenericMethods.Click_ON_signIn_signUp(Xpaths.or_signIn_or_SignUp);
     	 GenericMethods.Click_ON_SelectButton(Xpaths.or_pa_selectButton);
     	 GenericMethods.Click_SignUp_Link(Xpaths.or_SignUp_Link);
     	 GenericMethods.Enter_NewUsername(Xpaths.or_Registration_username, "F_NewUsername");
     	 GenericMethods.Enter_NewEmail(Xpaths.or_Registration_Email, "F_NewEmail");
     	 GenericMethods.Enter_NewPassword(Xpaths.or_Registration_password, ReadProperties.GetParameterValue("d_password"));
     	 GenericMethods.Click_SignUp_Button(Xpaths.or_SignUpButton, Xpaths.or_Header_CodeVerification);
     	 
     	 
     	 
	}
	
	
}
