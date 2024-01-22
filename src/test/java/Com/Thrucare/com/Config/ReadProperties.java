package Com.Thrucare.com.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
     public static Properties pro;
	
	 public static String GetParameterValue(String ParameterName) throws IOException
	{
		String filename="D:\\com.Thrucare\\Com.Thrucare.com\\properties_File\\data.properties";		// Filename contains Properties file name from Parameter folder
		File src=new File(filename);
		FileInputStream fis=new FileInputStream(src);		
		pro=new Properties();
		pro.load(fis);								// Read all test data
		String ParameterValue=pro.getProperty(ParameterName);
		return ParameterValue;	
		
		
		
		// Pass test data to required method
	}
	 
	 
	 public static void SaveValueToPropertyFile(String key, String value) 
		{
	        pro.setProperty(key, value);
	        try (FileOutputStream output = new FileOutputStream("D:\\\\com.Thrucare\\\\Com.Thrucare.com\\\\properties_File\\\\data.properties")) 
	        {
	            pro.store(output, "Generate values");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 
	 
	 
}
