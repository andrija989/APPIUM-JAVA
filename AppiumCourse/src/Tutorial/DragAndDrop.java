package Tutorial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
		
		WebElement firstDot = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement secondDot = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		
		TouchAction touch = new TouchAction(driver);
		
//		touch.longPress(element(firstDot)).moveTo(element(secondDot)).release().perform();
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	    "elementId", ((RemoteWebElement) firstDot).getId(),
	    "endX", 1000,
	    "endY", 1000,
	    "speed", 1
	));
	}

}
