package Tutorial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollingDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ScrollBars\"))"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='ScrollBars']")).click();
	}

}
