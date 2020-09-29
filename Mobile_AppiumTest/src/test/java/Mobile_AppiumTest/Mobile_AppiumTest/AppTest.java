package Mobile_AppiumTest.Mobile_AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class AppTest 
{
	DesiredCapabilities capability= new DesiredCapabilities();
	
	public AndroidDriver driver;
	@BeforeMethod 
		public void Beforemethod() throws MalformedURLException, InterruptedException {
			//DesiredCapabilities capability= new DesiredCapabilities();
	        capability.setCapability("deviceName", "Manzoor");
	        //capability.setCapability(MobileCapabilityType.NO_RESET, true);
	        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
	        capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
	        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        Thread.sleep(15000);
	        driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
	        
	}
    @Test
    public void SearchCareers() throws MalformedURLException, InterruptedException
    {
    	
    	//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
    	Thread.sleep(15000);
        driver.findElementByAccessibilityId("Search tab").click();
        Thread.sleep(5000);
        driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Life skills\")")).click();
        
        Assert.assertTrue (driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Careers\")")).isDisplayed());
        {
        Assert.assertTrue (driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Careers\")")).isEnabled());
        {
       System.out.println("User is able to search search careers details under life skill links");
        }
}
    }
    
}
