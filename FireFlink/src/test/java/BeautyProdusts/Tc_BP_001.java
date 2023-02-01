package BeautyProdusts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_BP_001{
	
	@Parameters("browserName")
	@Test(groups = "integration",dependsOnGroups = "smoke")
	public void TC_Dress_001(@Optional("chrome") String bname){
		WebDriver driver=null;
		if(bname.equalsIgnoreCase("Chrome")){
			 driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("Firefox")){
			 driver=new FirefoxDriver();
		}
		else {
			Reporter.log("please enter validbrowser name"+true);
		}
		
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zudio.com/");
		driver.quit();
	}


}
