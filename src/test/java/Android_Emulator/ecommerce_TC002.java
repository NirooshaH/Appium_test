package Android_Emulator;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_TC002 extends Base_test{
	@Test
	public void testcase2() throws MalformedURLException, InterruptedException {
	//2.Shop the items in the app by scrolling to specific product and add to cart
		AndroidDriver<AndroidElement> driver=capabality();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Niroosha");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/productName")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\")).instance(0)"));
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/productName\")"))
	}
}
