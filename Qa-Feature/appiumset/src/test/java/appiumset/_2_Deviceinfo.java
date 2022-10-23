package appiumset;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class _2_Deviceinfo extends AppiumDriverManager {
	



	
	
	@Parameters({"device", "apppackage", "activity","version","appiumServer" , "systemPort", "platformName"})
	@BeforeMethod
	public synchronized void deviceSetUp(String device, String apppackage, String activity, String version, String appiumServer, String systemPort, String platformName) throws InterruptedException, MalformedURLException, InterruptedException {
		System.out.println("****************************************");
		System.out.println("Setting up device and desired capabilities");
		
		
		
//		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver().get();
		AppiumDriver<MobileElement> driver = AppiumDriverManager.appiumDriver.get();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		URL url = new URL(appiumServer);
		

		driver = new AppiumDriver<MobileElement>(url, cap);
		
//		AppiumDriverManager.setDriver(new AppiumDriver<MobileElement>(url, cap));
		

		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability(MobileCapabilityType.UDID, device);
		cap.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		//cap.setCapability(MobileCapabilityType., BrowserType.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
		
	
		//"com.hanwha.lifeplus.tribes.app.qa"
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, apppackage);
		//"com.hanwha.lifeplus.presentation.ui.HomeActivity"
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, activity);
	
		cap.setCapability("automationName", "UiAutomator2");

		cap.setCapability("noReset","false");
		cap.setCapability("FullReset","true");
	
		cap.setCapability("APP_WAIT_ACTIVITY", "*");
		cap.setCapability("autowebview","false");
		
		
		
	} 
	
	


	@AfterMethod
	public void tearDown() throws Exception
	{
		 if (AppiumDriverManager.appiumDriver.get() != null) {
			 AppiumDriverManager.appiumDriver.get().quit(); 
			 appiumDriver.remove();
			 
		 }
	}
}
