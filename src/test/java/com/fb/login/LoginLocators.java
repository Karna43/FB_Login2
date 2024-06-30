package com.fb.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	
	public LoginLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[contains(@class,'9ay7')]")
	private WebElement errorMessage;
	
	@FindBy(xpath = "//span[contains(text(),'approve the login')]")
	private WebElement authenticationMessage;
	
	@FindBy(xpath = "//span[text()='Try Another Way']")
	private WebElement otherWay;
	
	@FindBy(xpath = "//span[text()='Continue']/following::span[text()='Continue']")
	private WebElement approveNotification;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitButton() {
		return submit;
	}
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	
	public WebElement getAuthenticationMessage() {
		return authenticationMessage;
	}
	
	public WebElement getOtherWay() {
		return otherWay;
	}
	
	public WebElement getApproveNotification() {
		return approveNotification;
	}
	
	
}
