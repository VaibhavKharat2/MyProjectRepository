

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.openqa.selenium.chrome.ChromeOptions;
	public class jdsdbah {
	    public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	      //  System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	        // Initialize ChromeOptions
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(options);

	        try {
	            // Navigate to Facebook login page
	            driver.get("https://www.facebook.com/login");

	            // Find email/phone input and enter value
	            WebElement emailInput = driver.findElement(By.id("email"));
	            emailInput.sendKeys("your-email@example.com");

	            // Find password input and enter value
	            WebElement passwordInput = driver.findElement(By.id("pass"));
	            passwordInput.sendKeys("your-password");

	            // Find login button and click it
	            WebElement loginButton = driver.findElement(By.name("login"));
	            loginButton.click();

	            // Add any additional actions or validations here if needed

	        } finally {
	            // Close the driver
	            driver.quit();
	        }
	    }
	}

