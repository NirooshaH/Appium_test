package Android_Emulator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base_test {
	public static AndroidDriver<AndroidElement> driver; 
	
	@BeforeClass
    public static AndroidDriver<AndroidElement> capabality() throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities  dc=new DesiredCapabilities();
	
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");	
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	//Demo Api
//	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
//	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
 
	//Phone Dial-emergency
//	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.phone");
//	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.phone.EmergencyDialer");

	//General store-shopping app
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
	
	//Calculator
//	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
//	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2.Calculator");
		
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);	
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
	
	dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:/Users/User/eclipse-workspace/Appium_test/driver/chromedriver.exe");	
	driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
	}
}
////	@BeforeClass 
//	public  AndroidDriver<AndroidElement> phonecall() throws MalformedURLException{
//		
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//		
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		
//		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.phone");
//		
//		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.phone.EmergencyDialer");
//		
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//		
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
//		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
//		return driver;
//	}
//	@BeforeClass
//	public AndroidDriver<AndroidElement> General_store() throws MalformedURLException{
//		dc=new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//		
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		
//		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
//		
//		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
//		
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//		
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
//		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
//		return driver;
//	}
	
	
//	@AfterClass 
//	void close(){
//		driver.quit();
//	}
//}
