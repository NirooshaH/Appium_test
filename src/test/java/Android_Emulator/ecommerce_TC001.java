package Android_Emulator;

import java.io.File;
import java.io.IOException;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;



public class ecommerce_TC001 extends Base_test{
	@Test(priority = 0)
	public void testcase1() throws InterruptedException, IOException {
		
		//Testcase: Fill the form details and verify are you able to login
	
		AndroidDriver<AndroidElement> driver=capabality();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Niroosha");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
}
	@Test(priority = 1)
	public void testcase2() throws IOException {
		//Testcase 2: verifying for Toast meaasage dispalyed appropriatly for wrong inputs
		
		//driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Niroosha");
		//driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		System.out.println(toast);
		Assert.assertEquals("Please enter your name", toast);
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File scr=tc.getScreenshotAs(OutputType.FILE);
		FileUtil.copyFile(scr, new File("./Mobile_Hybrid/screenshot1.png")); 
	
	}
}