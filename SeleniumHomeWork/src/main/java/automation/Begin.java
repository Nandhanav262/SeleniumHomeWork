package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Begin {

		WebDriver driver;
		public void initialize_Browser()
		{
		driver= new ChromeDriver();//loading the driver
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();

		}
		public void driver_QuitandClose()
		{
			//driver.close();
			driver.quit();
		}

		public static void main(String[] args) {
Begin begin =new Begin();
	begin.initialize_Browser();
	}
}


