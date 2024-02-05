package Android_Emulator;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mobile_hybrid extends Base_test{
	
	@Test
	public void test1()  throws IOException, InterruptedException {
		//AndroidDriver<AndroidElement> driver= General_store();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))"));
		driver.findElement(By.xpath("//*[@text='Algeria']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("niroosha");
				
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		
		//toast message
//		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getText();
//		System.out.println(toast);
//		
//		//TakeScreeshot of toast msg
//		TakesScreenshot tc = (TakesScreenshot)driver;
//		File scr=tc.getScreenshotAs(OutputType.FILE);
//		FileUtil.copyFile(scr, new File("./Mobile_Hybrid/screenshot.png")); //we are giving this path so it will created in our project
		
		driver.findElement(By.xpath("(//*[@text='ADD TO CART'])[1]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    Set<String> id=	driver.getContextHandles(); //here we are swithcing from native (general store) to hybrid i.e (google)
		for(String str:id) {
			System.out.println(str);
		}
		//driver.findElementById("tsf").sendKeys("moolya");
	}
}