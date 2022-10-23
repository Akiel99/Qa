package appiumset;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumDriverManager {
	
	
//	public static final ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal<>();
	
	
//	private static ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal<>();
	protected static ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal<>();
	
	public static void setDriver(AppiumDriver<MobileElement> driver) { 
		appiumDriver.set(driver);
	}
	   
   
    
    
    
   
     
}
