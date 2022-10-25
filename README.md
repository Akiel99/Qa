# Qa

< Webview 디버깅 >   
chrome://inspect  
  
< wireless 설치 방법 >  
cmd 실행  
//포트 추가  
adb tcpip 5555  
//와이파이ip주소:포트번호 연결  
adb connect 192.168.0.130:5555  
//자바 코드에 추가  
cap.setCapability("udid", "192.168.0.130:5555");  
  


< Device 갑자기 연결 되지 않을 때 >  
adb uninstall io.appium.uiautomator2.server  
adb uninstall io.appium.uiautomator2.server.test  


< 프로젝트 임포트 시, 자바 빌드 패스 없을 때 > 
1) Right click -> Properties
2) Project Facets -> Check Dyanmic Web Module and Java Version(java version만 추가해도 될 듯)
3) Apply Setting.


< AWS Device Farm >   
https://docs.aws.amazon.com/ko_kr/devicefarm/latest/developerguide/test-types-appium.html  
