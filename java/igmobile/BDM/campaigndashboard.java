package igmobile.BDM;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class campaigndashboard {
	
	campaigndashboard(AppiumDriver<AndroidElement> driver){
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(xpath = "")
	public AndroidElement fghj;

}
