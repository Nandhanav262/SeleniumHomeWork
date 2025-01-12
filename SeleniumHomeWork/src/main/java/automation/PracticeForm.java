package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticeForm extends Begin {
	public void formFill()
	{
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement name=driver.findElement(By.id("firstName"));
		name.sendKeys("Raha");
		WebElement mail=driver.findElement(By.id("userEmail"));
		mail.sendKeys("Raha@gmail.com");
		WebElement num=driver.findElement(By.id("userNumber"));
		num.sendKeys("9633358695");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeForm formfill=new PracticeForm();
		formfill.initialize_Browser();
		formfill.formFill();
//formfill.driver_QuitandClose();
	}

}
