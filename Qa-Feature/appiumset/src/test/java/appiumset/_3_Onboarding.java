package appiumset;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _3_Onboarding extends _1_Appstart { 
	
	
	@Test
	public void onboarding() throws MalformedURLException, InterruptedException  {
		
		System.out.println("_3_Onboarding Start");
		
//		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver().get();
		AppiumDriver<MobileElement> driver = AppiumDriverManager.appiumDriver.get();
		
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		
		/*
		while(arrow.isEnabled()) {
			arrow.click();
			Thread.sleep(3000);
		} 
		*/
		arrow.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		arrow.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		arrow.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("온보딩 버튼 클릭 완료 ");
	}
	
}
