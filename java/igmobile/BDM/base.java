package igmobile.BDM;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class base extends desire{

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader(System.getProperty("user.dir") + "\\src\\main\\java\\igmobile\\BDM\\prop.properties");
		Properties properties = new Properties();
		properties.load(reader);
		
		AndroidDriver<AndroidElement> driver = desired();
//		loginpage login = new loginpage(driver); 
//		login.camerapermission.click();
//		login.storagepermission.click();
//		login.email.sendKeys(properties.getProperty("email"));
//		login.password.sendKeys(properties.getProperty("password"));
//		TouchAction <?> action = new TouchAction<> (driver);
//		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(login.loginbutton))).perform();
//		
		driver.findElement(By.xpath("//android.widget.Button[@text = 'While using the app']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Allow']")).click();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'Enter your email']")).sendKeys(properties.getProperty("email"));
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'Enter your password']")).sendKeys(properties.getProperty("password"));
		//driver.findElement(By.xpath("//android.widget.TextView[@text = 'LOGIN']")).
		
		
		AndroidElement loginbutton  = driver.findElement(By.xpath("//android.widget.TextView[@text = 'LOGIN']"));
		TouchAction <?> action = new TouchAction<> (driver);
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(loginbutton))).perform();
		
	
		
		
//		login.email.sendKeys("rajiv,jena@impactguru.com");
//		login.password.sendKeys("Rajivjena4");
//		login.loginbutton.click();
//		
		
		
	}

}
