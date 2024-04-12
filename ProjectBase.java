package common;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectBase extends BaseTest {
	boolean result = false;

	public boolean waitforVisble(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			result = false;
		}

		catch (Exception e) {
			
			System.out.println("unable to find element" + locator);
			e.printStackTrace();
		}
		return result;
	}

	public void waitforAlerrtPresent() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			
			System.out.println("Unable to switch to Alert");
			e.printStackTrace();
		}
	}


}
