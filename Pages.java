package common;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Pages extends ProjectBase  {

	WebDriver driver;

	@FindBy(xpath = "//button[text()='Log in']")	WebElement login;
	/*@FindBy(xpath = "//button[@class='btn btn-tool']") WebElement orders;
	@FindBy(xpath="//a[@class='configuration-step-link theme-step']") WebElement storelink;
	@FindBy(linkText = "Next") WebElement next;*/
	
	//@FindBy(xpath = "(//div[@class='card-body'][1]//following-sibling::a[1])[1]") WebElement license;
	@FindBy(linkText  = "here") WebElement license;
	@FindBy(className = "textbox") WebElement url;
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]") WebElement cart;
	@FindBy(xpath = "//input[@value='Apply discount code']") WebElement discount;
	@FindBy(name = "discountcouponcode")WebElement code;
	@FindBy(name = "applydiscountcouponcode") WebElement codeenter;
	@FindBy(className = "qty-input")WebElement quantity;
	@FindBy(name = "updatecart") WebElement update;
	@FindBy(id = "checkout")WebElement checkout;
	
	
	public void log() {
		login.click();
		
	}
/*	public void acceptorders() {
		orders.click();
	//	driver.findElement(By.className("//button[text()='Log in']")).click();
	}
	
	public void personaliz_your_store() {
		storelink.click();
	}
	
	public void next_click() {
		next.click();
	}*/
	public void site_license() {
		wait.until(ExpectedConditions.elementToBeClickable(license));
		license.click();
	}
	
	public void Enter_Url() {
		url.sendKeys("www.facebook.coom");
	}
	public void AddtoCart() {
		cart.click();
		
	}
	public void Discount_click() {
		
		
		discount.click();
		
	}
	public void Discount_code_enter() {
		
		code.click();
		code.sendKeys("WELCOME200");
		
	}
	
	public void Discount_code_apply()
	{
		codeenter.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	public void quantityenter() {
		act.sendKeys(Keys.PAGE_UP).build().perform();
		quantity.clear();
		quantity.sendKeys("3");
	}
	/*public void updatecart()  {
		
		update.click();
	}*/
	
	public void checkoutitems() {
		checkout.click();
	}
	
	
	Pages(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}


	
}
