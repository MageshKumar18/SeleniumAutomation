package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping extends BasePage{

	public Shopping(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenpage;
	
	@FindBy(css="a.product-name[title='Blouse'][href*='id_product=2']")
	private WebElement blouse;
	
	@FindBy(xpath="//a[@name='White']")
	private WebElement color;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addItems;
	
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement continueShopping;
	
	@FindBy(css="span[itemprop='title']")
	private WebElement womenMainPage;
	
	@FindBy(css="a.product-name[title='Printed Dress'][href*='id_product=4']")
	private WebElement printedDress;
	
	@FindBy(css="a[name='Pink']")
	private WebElement printedDressColor;
	
	@FindBy(css="select[class='form-control attribute_select no-print']")
	private WebElement sizeChange;
	
	//Re-used the navigating to womenMainPage and addItems, ContinueShopping which is already declared above.
	
	@FindBy(css="a.product-name[itemprop='url'][href*='id_product=7']")
	private WebElement printedChiffonDress;

	@FindBy(css="[name='Green']")
	private WebElement chiffonColor;
	
	@FindBy(css="[class='btn btn-default button-plus product_quantity_up']")
	private WebElement chiffonQuantity;
	
	public WebElement getWomenpage() {
		return womenpage;
	}

	public WebElement getBlouse() {
		return blouse;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddItems() {
		return addItems;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getWomenMainPage() {
		return womenMainPage;
	}

	public WebElement getPrintedDress() {
		return printedDress;
	}

	public WebElement getPrintedDressColor() {
		return printedDressColor;
	}

	public WebElement getSizeChange() {
		return sizeChange;
	}

	public WebElement getPrintedChiffonDress() {
		return printedChiffonDress;
	}

	public WebElement getChiffonColor() {
		return chiffonColor;
	}

	public WebElement getChiffonQuantity() {
		return chiffonQuantity;
	}

	
}
