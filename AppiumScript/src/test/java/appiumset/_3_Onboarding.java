package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;

public class _3_Onboarding extends Appstarter { 
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		
System.out.println("_3_Onboarding Start");
		
		System.out.println("_3_Onboarding Start");
		
		
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		System.out.println("온보딩 버튼 클릭 완료 ");
		
		
	}
}
