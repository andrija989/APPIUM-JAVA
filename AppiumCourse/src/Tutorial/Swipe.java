package Tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipe extends Base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		driver.findElement(AppiumBy.androidUIAutomator("text(\"2. Inline\")")).click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		WebElement clockPosition1 = driver.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement clockPosition2 = driver.findElement(By.xpath("//*[@content-desc='45']"));
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) clockPosition1).getId(),
			    "endX", 200,
			    "endY", 800
			));
		
		
	}

}
