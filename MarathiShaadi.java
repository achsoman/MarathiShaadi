package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MarathiShaadi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akadachi\\eclipse-workspace\\My Project\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//**********************************************************************************************************//
		//*************************************PANEL 1 *************************************************************//
		//**********************************************************************************************************//
		
		
		// Launch the MarathiShaadi Website  
		
		driver.get("https://www.marathishaadi.com/");
		
		// Verify the Title of the Website 
		
		if (driver.getCurrentUrl().endsWith("marathishaadi.com")) {

					System.out.println("User is navigated to the Marathi Shaadi Website");

				}
		else {

					System.out.println("User is NOT navigated to the Marathi Shaadi Website");
				}

		
		// Click on Let's Begin Button 
		
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[1]/div[2]/div/div/form/div/div[3]/button")).click();
		System.out.println("User has Successfully Clicked on Let's Begin Button");
		
		
		// Enter Email ID
		
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div[1]/input")).sendKeys("aishwaryakadachi@gmail.com");
		System.out.println("User has Successfully Entered Email ID in the Textbox");
		
		// Enter Password 
		
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div[2]/input")).sendKeys("Aish@1234");
		System.out.println("User has Successfully Entered Password in the Textbox");
		
		
		// Select Value for "Create Profile For" Dropdown
		
	    WebElement CreateProfileFor = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div[3]/div/div/div[1]"));
	    
	    Select select = new Select(CreateProfileFor);
	    select.selectByVisibleText("Self");
	    
	    // Select Radio Button after Selecting Value from Dropdown 
	    
        driver.findElement(By.xpath("//*[@id=\"gender_female\"]")).click();
        System.out.println("User has Successfully Selected the Radio Button for Female Option");
	   
	    //Click on Next Button 
	    
	    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[3]/button")).click();
	    System.out.println("User has Successfully Clicked on Next Button");
	    
	  //**********************************************************************************************************//
	  //*************************************PANEL 2 *************************************************************//
	  //**********************************************************************************************************//
	  		
	  // Enter First Name 
	    
	    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div/div[1]/input")).sendKeys("Aishwarya");
	    System.out.println("User has Successfully Entered First Name in the Textbox");
	    
	  // Enter Last Name 
	    
	    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div/div[2]/input")).sendKeys("Kadachi");
	    System.out.println("User has Successfully Entered Last Name in the Textbox");
	    
	  // Select Date of Birth from DROPDOWN
	    
	  // Select Day from Dropdown 

	   
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[3]/div[1]/div/div"));
	    
	    Select select1 = new Select(element1);
	    select1.selectByVisibleText("02");
	    
	    System.out.println("User has Successfully Selected the Day from Day Dropdown");
	    
	 // Select Month from Dropdown 

		   
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[3]/div[2]/div/div"));
	    
	    Select select2 = new Select(element2);
	    select2.selectByVisibleText("Jan");
	    System.out.println("User has Successfully Selected the Month from Month Dropdown");
	    
	 // Select Year from Dropdown 

		   
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[3]/div[3]/div/div"));
	    
	    Select select3 = new Select(element3);
	    select3.selectByVisibleText("2002");
	    System.out.println("User has Successfully Selected the Year from Year Dropdown");
	       
	    
	  // Select Religion
	    
        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[4]/div/div/div"));
	    
	    Select select4 = new Select(element4);
	    select4.selectByVisibleText("Hindu");
	    System.out.println("User has Successfully Selected the Religion from Religion Dropdown");
	    
	    
	  // Verify that Marathi Mother Tongue is Selected by Default
	    
	   String Community = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[5]/label")).getText();
	   System.out.println(Community); 
	    
	   String Marathi = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[5]/div/div/div/div[1]")).getText();
	   System.out.println(Marathi); 
	   
	  // USing Actions Class to Double Click and Check if the Field is Selectable or Not
	   
	    Actions act = new Actions(driver);

	   //Double click on element
	   
	    WebElement wb2 = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[5]/div/div/div/div[1]"));
     	act.doubleClick(wb2).perform();
     	System.out.println("User is not able to Change the Community Value & Marathi Mother Tongue is Selected by Default");

	    
	  // Select Where Do You Live?
	    
        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[6]/div/div/div[1]/div[1]"));
	    
	    Select select5 = new Select(element5);
	    select5.selectByVisibleText("India");
	    System.out.println("User has Successfully Selected the Valu from Where Do You Live Dropdown");
	    
	    
	  // Click on Sign Up Button
	    
	    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[7]/button")).click();
	    
	    
	}
}