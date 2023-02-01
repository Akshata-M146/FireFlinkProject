package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsofSel4Test {
	
	@Test
	public void emptyChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facescanada.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.lorealparis.co.in/");
		driver.manage().window().minimize();
	}

}
