package Tutorial;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
 
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
@SuppressWarnings("deprecation")
public class Gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		WebElement expandList = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]"));
		
		new TouchAction(driver).tap(tapOptions().withElement(element(expandList))).waitAction(waitOptions(Duration.ofMillis(250))).perform();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		WebElement pn = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		new TouchAction(driver).longPress(longPressOptions().withElement(element(pn)).withDuration(Duration.ofMillis(2))).release()
.perform();		
		
		System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
	}
}
