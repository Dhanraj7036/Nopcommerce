package common;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;

public class TakeScreenshot extends ProjectBase {
	
public void screenshot() throws Exception {
	 TakesScreenshot pa1 = (TakesScreenshot)driver;
     File fi = pa1.getScreenshotAs(OutputType.FILE);
     Files.copy(fi, new File("C:\\Users\\priya\\Downloads\\failed test case.jpg"));
     /*WebElement ele =driver.findElement(By.xpath("//img[@alt='Facebook']")) ;		
		File fi = ele.getScreenshotAs(OutputType.FILE);
		Files.copy(fi, new File("C:\\Users\\dhara\\OneDrive\\Desktop\\sc\\shravan1.jpg"));		
	    driver.quit();*/
    
}
}
