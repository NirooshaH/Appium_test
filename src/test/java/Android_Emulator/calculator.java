package Android_Emulator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculator {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
	dc.setCapability("appPackage","com.android.calculator2");
	dc.setCapability("appActivity","com.android.calculator2.Calculator");
	URL url=new URL("http://0.0.0.0:4723/wd/hub");
	AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
	Thread.sleep(2000);
	driver.findElementById("com.android.calculator2:id/digit_1").click();
	driver.findElementById("com.android.calculator2:id/op_add").click();
	driver.findElementById("com.android.calculator2:id/digit_6").click();
	driver.findElementById("com.android.calculator2:id/eq").click();//7
	driver.findElementById("com.android.calculator2:id/op_mul").click();
	driver.findElementById("com.android.calculator2:id/digit_8").click();
	driver.findElementById("com.android.calculator2:id/eq").click();
	String result=driver.findElementById("com.android.calculator2:id/result").getText();
	System.out.println(result);
	if(result.equals(56)) {
		System.out.println("test is pass");
	}
	else {
		System.out.println("test is fail");
	}
	
}
}
