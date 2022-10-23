package appiumset;


import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;




public class _1_Appstart extends _2_Deviceinfo {
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void Appstart() throws InterruptedException, NullPointerException, NoSuchElementException, StaleElementReferenceException {
	
		
		
		_3_Onboarding a03 = new _3_Onboarding();
		_4_Tribeslist a04 = new _4_Tribeslist();
		_5_Tribesdetail a05 = new _5_Tribesdetail();
		_6_Tribeshome a06 = new _6_Tribeshome();
		_7_Settings a07 = new _7_Settings();
		_8_Eventtribes a08 = new _8_Eventtribes();
		_9_Logout a09 = new _9_Logout();

		
		
		
		try {
			a03.onboarding();
			
			
			for(int i=1; i<=100; i++) {

				
				
				if(i <= 100) {
					System.out.println(" <<<<< " + i + " 번째 반복 시작합니다.>>>> ");
				
				}else if(i > 100) {
					System.out.println( i + "번째 반복 완료 후 종료합니다.");
				}
				a04.tribeslist();
				a05.tribesdetail();
				a06.tribeshome();
				a07.settings();
				a08.Eventtribes();
				a09.Logout();
			}
			
			
		
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();	
		}
	}

		
		
		
}
		 
		
		
		