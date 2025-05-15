package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;

	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement login;
	
	@FindBy(css="h1.page-heading")
	private WebElement title;
	
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getTitle() {
		return title;
	}
}
