package StepDefinitions;

import org.junit.Assert;
import PageObjects.LoginPage;
import PageObjects.Shopping;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndToEnd extends BaseClass{
	
	//WebDriver driver = Hooks.driver;
	LoginPage lp = new LoginPage(driver);
	Shopping sh = new Shopping(driver);
	
	@Given("User is on login page {string}")
	public void user_is_on_login_page(String url) {
		runURL(url);
	}

	@When("The user clicks on the sign in")
	public void the_user_clicks_on_the_sign_in() {
	    onClick(lp.getSignIn());
	}

	@When("User enters his email id {string}")
	public void user_enters_his_email_id(String email) {
	    sendValues(lp.getUname(), email);
	}

	@When("User enters his password {string}")
	public void user_enters_his_password(String password) {
		sendValues(lp.getPassword(), password);
	}

	@When("User clicks the sign in button")
	public void user_clicks_the_sign_in_button() {
	    onClick(lp.getLogin());
	}

	@Then("User has successfully logged in and validated the page title as {string}")
	public void user_has_successfully_logged_in_and_validated_the_page_title_as(String expectedTitle) {
		String actualTitle = getText(lp.getTitle());
	    Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Given("User is already logged in")
	public void user_is_already_logged_in() {
	    System.out.println("User is already logged in");
	}

	@When("User navigates to the Womens section")
	public void user_navigates_to_the_womens_section() {
		 onClick(sh.getWomenpage());
	}

	@When("User selects the product blouse and adds it to cart")
	public void user_selects_the_product_blouse_and_adds_it_to_cart() {
		javaScriptExecutorScrollAndClick(sh.getBlouse());
		onClick(sh.getColor());
		onClick(sh.getAddItems());
		explicitElementWait(sh.getContinueShopping());
		onClick(sh.getWomenMainPage());
	}

	@When("User selects the product printed dress and adds it to cart")
	public void user_selects_the_product_printed_dress_and_adds_it_to_cart() {
		javaScriptExecutorScrollAndClick(sh.getPrintedDress());
		onClick(sh.getPrintedDressColor());
		dDown(sh.getSizeChange(), "2");
		explicitVisibleWait(sh.getAddItems());
		explicitElementWait(sh.getContinueShopping());
		onClick(sh.getWomenMainPage());
	}
	
	@When("User selects the product printed chiffon dress and adds it to cart")
	public void user_selects_the_product_printed_chiffon_dress_and_adds_it_to_cart() {
		javaScriptExecutorScrollAndClick(sh.getPrintedChiffonDress());
		dDown(sh.getSizeChange(),"3");
		explicitElementWait(sh.getChiffonColor());
		explicitElementWait(sh.getChiffonQuantity());
		explicitElementWait(sh.getAddItems());
		explicitElementWait(sh.getContinueShopping());
		
	}

	@Then("User sees the confirmation message {string}")
	public void user_sees_the_confirmation_message(String string) {
		System.out.println("User is already logged in");
	}
}
