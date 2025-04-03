package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void officeworks_registration_page(String url) {
        // Step 1: Locate firefox driver folder in the local drive.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe");
        
        // Step 2: Use above firefox driver to open up a firefox browser.
        System.out.println("Fire up firefox browser.");
        WebDriver driver = new FirefoxDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(2);
    
        // Load a webpage in firefox browser.
        driver.get(url);
        
        // Find first input field which is firstname
        WebElement element = driver.findElement(By.id("firstname"));
        System.out.println("Found element: " + element);
        // Send first name
        element.sendKeys("Prit");
        
        /*
         * Find following input fields and populate with values
         */
        // Assuming typical registration fields for Officeworks
        WebElement lastname = driver.findElement(By.id("lastname"));
        lastname.sendKeys("Savani");
        
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("pritsavani06@gmail.com");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Sit@707!");
        WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
        phoneNumber.sendKeys("0434505185");
        
        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("Sit@707!");
        
        /*
         * Identify button 'Create account' and click to submit using Selenium API.
         */
        WebElement createAccountButton = driver.findElement(By.xpath("//button[contains(text(), 'Create account')]"));
        createAccountButton.click();
        
        /*
         * Take screenshot using selenium API.
         */
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("registration_screenshot.png"));
            System.out.println("Screenshot saved as registration_screenshot.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Sleep a while
        sleep(2);
        
        // close firefox driver
        driver.close();    
    }
    
    
    public static void Office_choice_registration_page(String url) {
        // Step 1: Locate firefox driver folder in the local drive.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe");
        
        // Step 2: Use above firefox driver to open up a firefox browser.
        System.out.println("Fire up firefox browser.");
        WebDriver driver = new FirefoxDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(2);
    
        // Load a webpage in firefox browser.
        driver.get(url);
        
        // Find first input field which is firstname
        WebElement element = driver.findElement(By.id("guid-1"));
        System.out.println("Found element: " + element);
        // Send first name
        element.sendKeys("Prit");
        
        /*
         * Find following input fields and populate with values
         */
        // Assuming typical registration fields for Officeworks
        WebElement lastname = driver.findElement(By.id("guid-2"));
        lastname.sendKeys("Savani");
        
        WebElement email = driver.findElement(By.id("guid-3"));
        email.sendKeys("pritsavani06@gmail.com");
        
        WebElement confirm_email = driver.findElement(By.id("guid-0"));
        confirm_email.sendKeys("pritsavani06@gmail.com");
        
        
        WebElement password = driver.findElement(By.id("guid-5"));
        password.sendKeys("Sit@707!");
        WebElement confirm_password = driver.findElement(By.id("guid-6"));
        confirm_password.sendKeys("Sit@707!");
        WebElement phoneNumber = driver.findElement(By.id("guid-4"));
        phoneNumber.sendKeys("0434505185");
        
        
        WebElement ValidCode = driver.findElement(By.id("guid-8"));
        ValidCode.sendKeys("Sit@707!");
        
        /*
         * Identify button 'Create account' and click to submit using Selenium API.
         */
        WebElement createAccountButton = driver.findElement(By.xpath("//button[contains(text(), 'Register')]"));
        createAccountButton.click();
        
        /*
         * Take screenshot using selenium API.
         */
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("Office_choice_registration_screenshot.png"));
            System.out.println("Screenshot saved as Office_choice_registration_screenshot.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Sleep a while
        sleep(2);
        
        // close firefox driver
        driver.close();    
    }
}