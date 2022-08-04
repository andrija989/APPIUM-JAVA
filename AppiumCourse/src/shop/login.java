package shop;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class login extends Base1 {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120,1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));

	}

}
