package Android_Emulator;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class Scriptclass extends Base_test {
 
		@Test
	public void run() throws MalformedURLException, InterruptedException {
					
	//public static void main(String[] args) throws MalformedURLException {
	
			
//Demo apis	
//Description : in demo APIs preferences > Preference dependiencies > click wifi check box > click on wifi setting pass the data
		AndroidDriver<AndroidElement> driver=capabality();
		driver.findElement(By.xpath("(//android.widget.TextView)[11]")).click();
		driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();//accessibility Id
		driver.findElement(By.id("android:id/checkbox")).click();
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();	
		String pop = driver.findElement(By.xpath("android:id/alertTitle")).getText();
		Assert.assertEquals(pop, "WiFi settings");
		Thread.sleep(3000);		
		//android:id/edit
		driver.findElement(By.id("android:id/edit")).sendKeys("Niro");
		driver.findElement(By.id("android:id/button1")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));		
	}
	
	
	@Test	
	public void Alert_dilog() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabality();
		//1//
		driver.findElementByXPath("(//android.widget.TextView)[5]").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]").click();
		driver.findElementById("io.appium.android.apis:id/two_buttons").click();
		
		//2//
		driver.findElementByAccessibilityId("OK Cancel dialog with a long message").click();
		driver.findElementById("android:id/button1").click();
		driver.findElementsByAccessibilityId("OK Cancel dialog with a long message").
		
		driver.findElementById("android:id/button1").click();
		driver.findElementByXPath("//android.widget.Button[@ resource-id='android:id/button1']").click();
		driver.findElement(B)
		
	}
	
	@Test (enabled = false)
	public void longpress() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=capabality();
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Expandable Lists").click();
		driver.findElementByAccessibilityId("1. Custom Adapter").click();
		WebElement ele=driver.findElement(By.xpath("//*[@text='People Names']"));
		TouchAction action=new TouchAction(driver);
		action.longPress(LongPressOptions.longPressOptions().withElement(new ElementOption().
				withElement(ele)).withDuration(Duration.ofSeconds(10))).release().perform();
		String pop=driver.findElementByXPath("//*[@text='Sample menu']").getText();
		Assert.assertEquals("Sample menu", pop);		
	}
	@Test (enabled = false)
	public void scrolling() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
	}
	@Test 
	public void swip() {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		driver.findElement(MobileBy.AccessibilityId("Gallery")).click();
		driver.findElement(MobileBy.AccessibilityId("1. Photos")).click();
		WebElement img1=driver.findElement(By.xpath("//android.widget.ImageView[1]"));
        //System.out.println(img1);
		Dimension dim=driver.manage().window().getSize();
		int x=img1.getLocation().getX()+img1.getSize().getWidth()/2;
		int y=img1.getLocation().getY()+img1.getSize().getHeight()/2;
		int target_x=(int)(dim.width*0.40);
		TouchAction act=new TouchAction(driver);
		act.press(PointOption.point(x,y)).waitAction().moveTo(PointOption.point(target_x,y)).release().perform();		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.rotate(ScreenOrientation.PORTRAIT);
	}
	@Test 
	
	public void mobile_app() throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver= capabality();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))"));
		driver.findElement(By.xpath("//*[@text='Angola']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("niroosha");
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		//toast message
//		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getText();
//		System.out.println(toast);
//		
//		//TakeScreeshot of toast msg
//		TakesScreenshot tc = (TakesScreenshot)driver;
//		File scr=tc.getScreenshotAs(OutputType.FILE);
//		FileUtil.copyFile(scr, new File("./Mobile_Hybrid/screenshot.png"));
		
		driver.findElement(By.xpath("(//*[@text='ADD TO CART'])[1]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(2000);
	    Set<String> id=	driver.getContextHandles();
		for(String str:id) {
			System.out.println(str);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.id("XSqSsc")).sendKeys("Moolya");
	}
} 




















