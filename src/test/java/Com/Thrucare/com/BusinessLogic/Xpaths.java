package Com.Thrucare.com.BusinessLogic;

public class Xpaths
{
	
/*======================================= Home page ===================================================================*/	
	
    public static String or_Home="(//a[normalize-space()='Home'])[1]";
    public static String or_signIn_or_SignUp="//a[normalize-space()='Sign-in/Sign-up']";
    public static String or_patient_Text="//h5[normalize-space()='Patient']";
    public static String or_provider_Text="//h5[normalize-space()='Provider']";
    public static String or_pa_selectButton="(//button[normalize-space()='Select'])[1]";
    public static String or_LocationField="//input[@id='autocompleteTxt']";
    public static String or_LocationList="//div[@class='pac-item']";
    public static String or_los_Angeles="(//span[contains(text(),'Los Angeles')])";
    public static String or_CA_USA="//span[contains(text(),'CA, USA')]";
    public static String or_SearchiconButton="//button[@class='btn btn-primary']";
    public static String or_dataResult="//div[@class='col-lg-9 col-md-9 col-sm-8 col-12']";
    
    public static String or_ProviderEntryResult="//div[@class='searched-provider-div']";
    public static String or_providername="//h6[@class='mb-0']";
    
    public static String or_providerSpeciality="//div[@class='col-9']";
    public static String or_bookButton="//span[contains(text(),'Book')]";
    
    
    
/*======================================= Login page ===================================================================*/	    
    public static String or_socialAccount_Text="(//span[normalize-space()='Sign In with your social account'])[2]";
    public static String or_UserAccount_Text="(//span[normalize-space()='Sign in with your username and password'])[2]";
    public static String or_username="(//input[@id='signInFormUsername'])[2]";
    public static String or_password="(//input[@id='signInFormPassword'])[2]";
    public static String or_signIN="(//input[@name='signInSubmitButton'])[2]";
    public static String or_SignUp_Link="(//a[contains(text(),'Sign up')])[2]";
    
/*================================ RegiStration page ===================================================================*/	        
    
    public static String or_Header_Registration="(//span[normalize-space()='Sign up with a new account'])[1]";
    public static String or_Registration_username="(//input[@placeholder='Username'])[1]";
    public static String or_Registration_Email="(//input[@placeholder='name@host.com'])[1]";
    public static String or_Registration_password="(//input[@placeholder='Password'])[1]";
    public static String or_SignUpButton="(//button[@name='signUpButton'][normalize-space()='Sign up'])[1]";
    
    
    
    
    
    
    
    
/*================================ Verification page ===================================================================*/	        
        
   public static String or_Header_CodeVerification="//h3[normalize-space()='Confirm your account']" ;
   
    
    
   
   
   
   
   
 /*=============================== yopmail page ========================================================================*/
   
   public static String or_InputYopmailField="//input[@id='login']";
   public static String or_NextButton="//i[@class='material-icons-outlined f36']";
   
    
 /*=========================================Dashboard===================================================================*/
    
    
    
    public static String or_viewProfile="(//span[normalize-space()='View Profile'])";
      
    
}
