package appiumset;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _8_Eventtribes extends _1_Appstart {
	
	@Test
	public void Eventtribes() throws MalformedURLException, InterruptedException  {

//		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver().get();
		AppiumDriver<MobileElement> driver = AppiumDriverManager.appiumDriver.get();
		
		driver.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]")
		.click(); 
		System.out.println("이벤트 탭");
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.TextView")
		.click();
		System.out.println("진행 예정");
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.TextView")
		.click();
		System.out.println("종료");
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
		.click(); 
		System.out.println("트라이브 홈 탭 ");
	
	}

}
