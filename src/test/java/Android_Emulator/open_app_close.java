	package Android_Emulator;

	import java.net.MalformedURLException;
	import java.net.URL;
	import java.sql.Driver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class open_app_close {
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
			driver.quit();
		}
		

	}


