package igmobile.BDM;


import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class loginpage {	
		
private AndroidDriver<?> driver;

//	public loginpage(AppiumDriver<?> driver) {
//		PageFactory.initElements(driver, this);
//		
//	}
		public loginpage(AndroidDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'While using the app']") AndroidElement  camerapermission;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Allow']") AndroidElement  storagepermission;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Enter your email']") AndroidElement  email;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Enter your password']") AndroidElement  password;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'LOGIN']") AndroidElement  loginbutton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Play Store']") AndroidElement  forgetpassword;
	
	

}
