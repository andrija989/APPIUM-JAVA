package Tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class UIautomatorTesting extends Base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.findElement(AppiumBy.androidUIAutomator("text(\"Preference\")")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("text(\"9. Switch\")")).click();
		
		System.out.println(driver.findElements(AppiumBy.androidUIAutomator("checked(true)")).size());
		
		driver.quit();
	}
}
