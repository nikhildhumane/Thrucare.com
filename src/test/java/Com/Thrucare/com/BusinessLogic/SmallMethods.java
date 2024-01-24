package Com.Thrucare.com.BusinessLogic;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

import Com.Thrucare.com.Config.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SmallMethods 
{
	public static WebDriver driver;
	public static Faker faker=new Faker();
	public static String verificationCode;
	
	
	
	
	
	 public static void browser()
	 {  
		  Calendar cal = Calendar.getInstance();
	      int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	      cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
          
	      
	      switch(dayOfWeek) 
	        {
	            case Calendar.MONDAY:
	            	
	            	WebDriverManager.chromedriver().setup();
	            	  driver = new ChromeDriver(); 		
                  break;
	                
	            case Calendar.TUESDAY:
	            
	            	WebDriverManager.chromedriver().setup();
	            	  driver = new ChromeDriver();
	                break;
	                
	            case Calendar.WEDNESDAY:
	            	WebDriverManager.chromedriver().setup();
	            	  driver = new ChromeDriver();
	            
	            	break;
	            	
	            case Calendar.THURSDAY:
	            	WebDriverManager.chromedriver().setup();
	            	  driver = new ChromeDriver();
	            	break; 
	            	
	            case Calendar.FRIDAY:
	            	WebDriverManager.chromedriver().setup();
	            	  driver = new ChromeDriver();
	        		
	                break;
	                
	                
	            case Calendar.SATURDAY:
		            
	            	WebDriverManager.chromedriver().setup();
	            	  driver = new ChromeDriver();
	            	
	                break;    
	                
               case Calendar.SUNDAY:
            	  
	            	 
           	        WebDriverManager.firefoxdriver().setup();
	            	driver = new FirefoxDriver();
	            	
	                break;     
	                
	            	
	            default:
	                System.out.println("Unsupported day of the week: " + dayOfWeek);
	                return;
	        }
		 
	 }
	 
	 
	 
/*============================================//========================================================*/	 
	 
	 
	 
	 public static void url(String url)
	 {
		 if(url!=null)
		 {
		     driver.get(url);
		     driver.manage().window().maximize();
		     Assert.assertTrue(true);
		 }
	 }
	 
	 
	 
	 
/*============================================//========================================================*/
	 
	 
	 
	public static void VerifiedText(String xpath,String exptitle)
	{
		if(xpath!=null)
		{
		     String actuText=driver.findElement(By.xpath(xpath)).getText();
		     if(actuText!=null)
		     {
		        Assert.assertEquals(actuText, exptitle);
		     }
		    
	    }
	
	}
	 
	 
	 
	 
/*============================================//========================================================*/	
	
	
	
	
	public static void Click_AnyButton(String xpath)
	{
		if(xpath!=null)
		{
		   driver.findElement(By.xpath(xpath)).click();
		   
		   Assert.assertTrue(true);
		}
	}
	
	/*============================================//========================================================*/
	
	
	
	
	
	
	
	
	
	
	
	public static void Senddata(String xpath,String data)
	{
		if(xpath!=null)
		{
			if(xpath!=null)
			{
		       WebElement e=driver.findElement(By.xpath(xpath));
		       e.clear();
		       e.sendKeys(data);
		       Assert.assertTrue(true);
			}
		}
	}
	
	
	 public static void senddata_WithFaker(String xpath,String key,String value)
	 {
		 
		 if(xpath!=null)
		 { 
			 
			driver.findElement(By.xpath(xpath)).sendKeys(value);
			ReadProperties.SaveValueToPropertyFile(key, value);
			Assert.assertTrue(true);
			
		 }
	}
	 
	
	
	
	
	
	
	
	
	

	
	
	/*============================================//========================================================*/	
	
	
	/*====
	 * alertIsPresent()
    elementSelectionStateToBe()
    elementToBeClickable()
    elementToBeSelected()
    frameToBeAvaliableAndSwitchToIt()
    invisibilityOfTheElementLocated()
    invisibilityOfElementWithText()
    presenceOfAllElementsLocatedBy()
    presenceOfElementLocated()
    textToBePresentInElement()
    textToBePresentInElementLocated()
    textToBePresentInElementValue()
   titleIs()
   titleContains()
    visibilityOf()
    visibilityOfAllElements()
   visibilityOfAllElementsLocatedBy()
   visibilityOfElementLocated()
	 */ 
     
     
     
     public static void ExplicitWait_wth_condition(int t,String xpath)
     {
    	 if(xpath!=null) 
    	 {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(t));
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    	 Assert.assertTrue(true);
    	 }
     }
	 
     
     
     
     
     
 	
 	/*============================================//========================================================*/	
 	  
     
     
    
     public static void Extract_DataFromTable(String xpath,String xpath1,String xpath2)
     {
    	if(xpath!=null)
    	{
    		if(xpath1!=null)
    		{
    			if(xpath1!=null)
    			{
    	            driver.findElements(By.xpath(xpath));
    	            driver.findElements(By.xpath(xpath1));
    	       	    WebElement location=driver.findElement(By.xpath(xpath2));
    	       	    location.click();
    			}
    		}
    	} 
     }	 
    	 
    	 
    	 
     
     
     
     
     
/*============================================//========================================================*/	 
     
     // extract data from table ... and select particular entry by using name of provider and services and click on book button
     
     public static void Extract_dataFrom_table(String providername,String specialityname)
     {
    	 WebElement result=driver.findElement(By.xpath("//div[@class='col-lg-9 col-md-9 col-sm-8 col-12']"));
    	 System.out.println("result= "+result);
    	 
    	 List<WebElement> ProviderList = result.findElements(By.xpath("//div[@class='searched-provider-div']"));
    	 
    	  System.out.println("providerList= "+ProviderList.size());
    	 
    	 
    	 
    	
    	 
    	 for (WebElement provider : ProviderList)
    	 {
    		 String providerr=provider.findElement(By.xpath("//div[@class='searched-provider-div']//h6[normalize-space()='" +providername+"']")).getText();
    		 System.out.println("providerr= "+providerr);
    		 if (providerr.equals(providername)) 
    		 {
    			   System.out.println("provider name is verified");
    			  
    		 }
    		 
    		 List<WebElement> ServiceList = result.findElements(By.xpath("//div[@class='col-6']"));
        	 
        	 System.out.println("ServiceList= "+ServiceList.size());
        	 
    		 for (WebElement service : ServiceList)
        	 {
        		 String speciality = service.findElement(By.xpath("//div[@class='col-6']//span[contains(text(),'"+specialityname+"')]")).getText();
        		 System.out.println("speciality= "+speciality);
        		 if (speciality.equals(specialityname)) 
        		 {
        			   System.out.println("service name is verified");
        			   List<WebElement> BookButtonList = result.findElements(By.xpath("//span[contains(text(),'Book')]"));
                  	   System.out.println("BookButtonList= "+BookButtonList.size());
              		 
              		 for (WebElement BookButton : BookButtonList)
                  	 {
              			 
              			 
                  		 List<WebElement> Book = BookButton.findElements(By.xpath("//span[@class='appointment-btn'][normalize-space()='Book']"));
                  		 System.out.println("Book= "+Book.size());
                  		 break;
                  		 
                  	 }
              		 
              		 break;
              		
        			   
        		 }
        		 
        		
        		 
        	 }
    		 break;
        	 
    	 }
    	 
    	 
     }	 
    	 
    	 
    	 
    	
   
     
     
     public static String FakerClassLogic(String Actiontype)
	 {
		//launch browser
	 		switch(Actiontype.toLowerCase())
	 		{
	 		
	 		    case "firstname":
	 			String Fname=faker.name().firstName();
	 			Assert.assertTrue(true);
	 			return Fname;
	 	    	
	 		
	 		
	 		
	 		
	 	        case "firstnamenumber":
	 			String Firstname=faker.name().firstName();
	 			Assert.assertTrue(true);
	 			int randomNumber1 = faker.number().numberBetween(1, 100); 
	 	        return Firstname + randomNumber1;
	 	        
	 	        
	 	       case "middlename":
			 	String mname=faker.name().nameWithMiddle();
			    Assert.assertTrue(true);
			 	return mname;
	 	        
	 	    	
	 	    	
	 	    	
	 	        case "lastname":
		 	    String Lname=faker.name().lastName();
		 		Assert.assertTrue(true);
		 		return Lname;
		 	   
	 	    	
	 	    	
	 	    	
	 	    	
	 	       case "lastnamenumber":
		 	   String lastname=faker.name().lastName();
		 	   Assert.assertTrue(true);
		 	   int randomNumber2 = faker.number().numberBetween(1, 100); 
		 	   return lastname + randomNumber2;
		 	   
		 	   
		 	   
	 	      case "cityname":
			 	   String cname=faker.address().cityName();
			 	   Assert.assertTrue(true);
			 	   return cname ;
			 	   
		 	   
	 	     case "statename":
			 	   String Sname=faker.address().state();
			 	   Assert.assertTrue(true);
			 	   return Sname ;
			 	   
			 	   
			 
	 	    case "password":
			 	   String pname=faker.name().firstName();
			 	   pname = Character.toUpperCase(pname.charAt(0)) + pname.substring(1);
			 	  int randomNumber3 = faker.number().numberBetween(1, 100); 
			 	  String symbol="$";
			 	   Assert.assertTrue(true);
			 	  return pname+randomNumber3+symbol ;	   
			 	   
			 	   
	 	     case "email":
		 	   String Ename=faker.name().firstName();
		 	    Ename = Character.toUpperCase(Ename.charAt(0)) + Ename.substring(1);
		 	   int randomNumber4 = faker.number().numberBetween(1, 100); 
		 	   String domain="@yopmail.com";
		 	   
		 	   Assert.assertTrue(true);
		 	  return Ename+randomNumber4+domain ;
		 	  
	 	  
			 	  
		 	  
		 	  
		 	  
	 	    case "number":
	 	    	 String number=faker.phoneNumber().cellPhone();
	 	    	 return number;
		 	 
		 	  
		 	  
	 	     case "dob":
	 	    	 Date dob1=faker.date().birthday();
	 	    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 	        String Dob = sdf.format(dob1);
	 	    	return Dob;
			 	   
			 	   
		 	   
		 	   default:
	 			throw new IllegalArgumentException("Unsupported action type: " +Actiontype);

	 		}

	 }

     
     
     
    	 
    	
     
     public static void switchwindow()
     {
     	((ChromeDriver) driver).executeScript("window.open()");

         
         String secondTab = driver.getWindowHandles().toArray()[1].toString();
         driver.switchTo().window(secondTab);
     }
     
     
     public static void switchBack()
     {
     	String firstTab = driver.getWindowHandles().toArray()[0].toString();
         driver.switchTo().window(firstTab);
     }
     
     
     
     
     
     
     

	 public static void Getcode()
	 {
		
		     
            driver.switchTo().frame("ifinbox");
		    List<WebElement> yopmailElements = driver.findElements(By.xpath(Xpaths.or_mailList));
		    int size=yopmailElements.size();
		   

		    for (int i = size - 1; i >= 0; i--) 
		    {
		        WebElement yopmailElement = yopmailElements.get(i);
		        String yopmailAddress = yopmailElement.getText();

		        // Check for the specific email name
		        if (yopmailAddress.contains("no-reply@verificationemail.com")) {
		            yopmailElement.click(); 
		            
		            driver.switchTo().defaultContent();
		            
		            driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		            driver.switchTo().frame("ifmail");
                     
		            WebElement emailContentElement = driver.findElement(By.xpath(Xpaths.or_mailContent));
		            String emailContent = emailContentElement.getText();

		            
		           
		           
		            verificationCode = emailContent.replaceAll("[^\\d]", "");
		          
		            
		            ReadProperties.SaveValueToPropertyFile("verificationCode", verificationCode);
		            Assert.assertTrue(true);

		            break;
		        }
		    }
	 }
    	
    	 
    	 
    		   
    		  
    			   
    			 
    		         
    			   
    			      
    			 
    	    			
    	    			
    			
    	 
	     	 
    	 
    	
    	 
  	 
    			
 }   
     
     
   
     
     
     
     
     
     
     
     
     
     
     
    	    
	 

