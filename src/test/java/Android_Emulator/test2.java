package Android_Emulator;

import java.net.MalformedURLException;import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class test2 extends Base_test{
	@Test
	public void run1() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=capabality();
		driver.findElement(MobileBy.AccessibilityId("Animation")).click();
		driver.findElement(MobileBy.AccessibilityId("Bouncing Balls")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AccessibilityId("Cloning")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("(android:id/text1)[4]")).click();
		driver.findElement(MobileBy.AccessibilityId("Default Layout Animations")).click();
		//driver.findElement(By.xpath("//[@text='Cloning']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[2]")).click();
		//android.widget.TextView
	}

}
