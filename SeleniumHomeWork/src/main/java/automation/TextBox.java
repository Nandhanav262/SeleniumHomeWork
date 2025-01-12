package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TextBox extends Begin {

	
	public void textBox()
	{
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement text=driver.findElement(By.cssSelector("input#userName"));
		text.sendKeys("Appu");
		WebElement button=driver.findElement(By.id("button-one"));
		button.click();

	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBox textbox=new TextBox();
		textbox.initialize_Browser();
		textbox.textBox();
//textbox.driver_QuitandClose();

	}

}