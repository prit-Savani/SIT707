package sit707_week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;

/**
 * @author Ahsan Habib
 */
public class SeleniumOperations {
	
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void open_chrome_and_close() {
		// Step 1: Locate Firefox driver folder in the local drive.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe");
		
		// Step 2: Use above Firefox driver to open up a Firefox browser.
		System.out.println("Fire up Firefox browser.");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Driver info: " + driver);
		
		// Sleep a while
		sleep(5);
		
		/*
		 * We will use a lot of Selenium APIs here in future 
		 * including maximise window and open a URL in Firefox browser.
		 */
		
		// close Firefox driver. You can comment below line to keep the browser opened.
		driver.close();
		
	}
	

	public static void open_chrome_maximize_close() {
		// Step 1: Locate Firefox driver folder in the local drive.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe");
		
		// Step 2: Use above Firefox driver to open up a Firefox browser.
		System.out.println("Fire up Firefox browser.");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(5);
		
		// Maximize Firefox driver
		driver.manage().window().maximize();
		
		// Sleep a while
		sleep(5);
		
		// close Firefox driver. You can comment below line to keep the browser opened.
		driver.close();	
	}

	
	public static void load_web_page_close() {
		// Step 1: Locate Firefox driver folder in the local drive.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe");
		
		// Step 2: Use above Firefox driver to open up a Firefox browser.
		System.out.println("Fire up Firefox browser.");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(5);
		
		// Open the URL in Firefox browser.
		driver.get("https://selenium.dev");
		
		// Sleep a while
		sleep(5);
		
		// close Firefox driver. You can comment below line to keep the browser opened.
		driver.close();	
	}
	
	/*
	 * Function completed to use Firefox.
	 */
	public static void open_chrome_loadpage_resize_close() {
        // Fill your personal information.
        System.out.println("Hello from s224039433, Prit Savani");
        
        // Step 1: Locate Firefox driver folder in the local drive.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe");
        
        // Step 2: Use above Firefox driver to open up a Firefox browser.
        System.out.println("Fire up Firefox browser.");
        WebDriver driver = new FirefoxDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(2);
        
        /*
         * Load google page.
         */
        driver.get("https://www.google.com");
        
        /*
         * Set window size manually to 640x480 and wait 2 second.
         */
        driver.manage().window().setSize(new Dimension(640, 480));
        sleep(2);
        
        /*
         * Double window size manually to 1280x960 and wait 2 second.         
         */
        driver.manage().window().setSize(new Dimension(1280, 960));
        sleep(2);
        
        // Sleep a while
        sleep(2);
        
        // close Firefox driver. You can comment below line to keep the browser opened.
        driver.close(); 
    }
}