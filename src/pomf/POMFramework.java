package pomf;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepack.AutoConstants;
import basepack.BasePage;
import basepack.ExcelLibrary;

public class POMFramework extends BasePage implements AutoConstants
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextfield;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobileNoTextfield;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement dateDropDownList;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement monthDropDownList;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement yearDropDownList;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="(//button[.='Sign Up'])[1]")
	private WebElement signUpButton;
	
	public POMFramework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newacc() throws IOException
	{
		firstNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 0));
		lastNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 1));
		mobileNoTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 5));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 3));
		selectbyvisibletext(dateDropDownList, "8");
		selectbyvisibletext(monthDropDownList, "Jan");
		selectbyvisibletext(yearDropDownList, "1997");
		maleRadioButton.click();
		signUpButton.click();
	}
}
