package Android_Emulator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class generalstore {
	public static AndroidDriver<AndroidElement> driver; 
	@BeforeClass
	public AndroidDriver<AndroidElement> General_store() throws MalformedURLException{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;		
	}
	@Test
	public void general_store() {
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))"))
		driver.findElement(MobileBy.AccessibilityId("new UiScrollable(new Uiselector()).scrollntoView(text(\"India\"))"));
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).click();
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String tost = driver.findElement(By.xpath("//android.widget.tost[1]")).getText();
		System.out.println(tost);
	}
}





