package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Begin {
	
		public void radioButton() {
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement choose=driver.findElement(By.cssSelector("label[for=impressiveRadio]"));
		choose.click();
		
	}
	
	public void select()
	{
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement choose=driver.findElement(By.cssSelector("label[for=impressiveRadio]"));
		choose.click();
		if(choose.isSelected()) {
			System.out.println("Already selected");
		}
		else {
			choose.click();
			System.out.println("selected");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton radiobutton=new RadioButton();
		radiobutton.initialize_Browser();
		radiobutton.radioButton();
		//radiobutton.driver_QuitandClose();
	}

}
