package Android_Emulator;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class emergency_call extends Base_test{
	@Test
	public void emergency() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=capabality();
		driver.findElement(By.id("com.android.phone:id/nine")).click(); //9
		driver.findElementByXPath("//*[@text='MNO']").click(); //6
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"3,DEF\"]/android.widget.LinearLayout")).click(); //3
		driver.findElementById("com.android.phone:id/two").click(); //2
		driver.findElement(By.id("com.android.phone:id/nine")).click(); //9
		driver.findElement(By.id("com.android.phone:id/five")).click(); //5
		driver.findElementById("com.android.phone:id/eight").click(); //8
		//Thread.sleep(2000);
		driver.findElementById("com.android.phone:id/zero").click(); //0
		//Thread.sleep(2000);
		driver.findElementById("com.android.phone:id/six").click(); //6
		//Thread.sleep(2000);		
		driver.findElementById("com.android.phone:id/five").click();//5
		Thread.sleep(1000);
		driver.findElementById("com.android.phone:id/floating_action_button_container").click();
		driver.findElementById("android:id/button1").click();
		String number=driver.findElementById("com.android.phone:id/digits").getText();
		if(number.equals("9632958065")) {
			System.out.println("its not a emergency number");
		}
		else {
			System.out.println("its is a emergency number");
		}	
	}
}
