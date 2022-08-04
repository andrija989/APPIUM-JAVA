package Tutorial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class Test extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver = capabilities();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Search']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Invoke Search\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/txt_query_prefill")).sendKeys("Hello");
		

	}

}
