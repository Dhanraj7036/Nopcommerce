package common;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests  extends ProjectBase {
	
	@Test
 public void dhanraj() throws Exception {
		Pages k= new Pages(driver );
	 k.log();
	/* k.acceptorders();
	k.personaliz_your_store();
	 k.next_click();*/
	 k.site_license();
	 k.Enter_Url();
	 k.AddtoCart();
	 k.Discount_click();
	 k.Discount_code_enter();
	 k.Discount_code_apply();
	 k.quantityenter();
//	 k.updatecart();
	 k.checkoutitems();
	 
	
 }
	@BeforeTest
	public void Setup() throws Exception {
		setup();
	}
	@AfterTest
	public void Quit() throws Exception {
		quit();
	}
}
