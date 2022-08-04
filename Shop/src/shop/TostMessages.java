package shop;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class TostMessages extends Base1 {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities("General-Store.apk");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120,1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastMessage);
	}

}
