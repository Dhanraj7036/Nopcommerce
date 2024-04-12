package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	public static Properties prop;
	public File file;
	public FileInputStream f1;
public void setup() throws Exception {
	prop= new Properties();
	file=new File("C:\\Users\\priya\\eclipse-workspace\\NopCommerce_Backend\\src\\test\\java\\config\\Project.properties");
	try {
		f1 = new FileInputStream(file);
		prop.load(f1);
	} catch (FileNotFoundException e) {

		System.out.println("File not found in the given path");
		e.printStackTrace();
	}
	String browser= prop.getProperty("browser");
	if (browser.equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();}
	
	else if (browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		}
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver();
		driver=new FirefoxDriver();
	}
	else if(browser.equals("safari")) {
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
	}
	else if(browser.equals("opera")) {
	WebDriverManager.operadriver().setup();

	}
	else{
		System.out.println("Invalid browser");
	}
	
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	act = new Actions(driver);
}


public void quit() throws Exception {
	driver.quit();
	f1.close();
}

}

