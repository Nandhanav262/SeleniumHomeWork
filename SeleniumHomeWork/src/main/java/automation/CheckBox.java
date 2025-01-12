package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Begin{
	public void checkBox()
	{
		driver.navigate().to("https://demoqa.com/checkbox");
		WebElement choose=driver.findElement(By.className("rct-icon rct-icon-uncheck"));
		choose.click();
		WebElement tick=driver.findElement(By.cssSelector("svg[class=rct-icon rct-icon-uncheck]"));
		tick.click();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkbox=new CheckBox();
		checkbox.initialize_Browser();
		checkbox.checkBox();
		//checkboxdemo.driver_QuitandClose();
	}

}
