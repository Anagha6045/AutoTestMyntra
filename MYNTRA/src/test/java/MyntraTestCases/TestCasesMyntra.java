package MyntraTestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import automationCoreMyntra.BaseClassMyntra;

public class TestCasesMyntra extends BaseClassMyntra
{
 WebDriver driver;
 @BeforeMethod
 public void initialize() throws Exception
 {
	 driver = browserIntialize("Chrome");
	// driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php/");
	 
 }
 
 //Navigation Commands
 @Test
 public void testCase01()
 {
	 driver.navigate().to("https://www.amazon.in/");
	 System.out.println(driver.getTitle());
	WebElement dropdown1= driver.findElement(By.id("searchDropdownBox"));
	 
	Select se1=new Select(dropdown1);
    se1.selectByVisibleText("Amazon Pharmacy");
    
	WebElement ele=driver.findElement(By.id("twotabsearchtextbox")); 
   ele.click();
   ele.sendKeys("Clear Gel");
   driver.findElement(By.id("nav-search-submit-button")).submit();
 }
 @Test
 //Browser commands
 public void testcases02()
 {
	 //get command
	 driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
	 //get title command
	 String title =driver.getTitle();//returns strings
	 System.out.println(title);
	 System.out.println(title.length());
	 
	 //get url command
	 String url=driver.getCurrentUrl();//return string
	 System.out.println(url);
	
	 // get page source command
	 String pge_src=driver.getPageSource();//returns string
	  //System.out.println(pge_src);
	System.out.println(pge_src.length());
	 //close command
	 driver.close();
 }
 //navigation commands
 //@Test
  public void testcases03()
  {
	  driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-alert.php");
	  driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
  }
 //web element commands
 @Test
 public void testcases04()
 {
	 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	 
	 WebElement element1=driver.findElement(By.id("single-input-field"));
	 element1.click(); // allows to click on a web element
	 element1.sendKeys("Hai this is a demo message");
	  
	WebElement element2= driver.findElement(By.xpath("//button[text()='Show Message']"));
	 element1.clear();
	System.out.println(element2.isDisplayed()); 
	System.out.println(element2.isEnabled());
	 System.out.println(element2.isSelected());
	 
	 System.out.println(element2.getText());
	 System.out.println(element2.getTagName());
	 System.out.println(element2.getClass());
	 System.out.println(element2.getAttribute("class"));
	 
 }
 
}
