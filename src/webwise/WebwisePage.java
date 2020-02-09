package webwise;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import scanners.*;
import java.util.concurrent.TimeUnit;
import static javafx.beans.binding.Bindings.select;
//import static scanners.Selenium.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static scanners.Scanners.wd;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author User
 */
public class WebwisePage {
    private String actualTitle;
    
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\W7134551\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
        wd = new ChromeDriver();
    }
    
    public void navigateToUrl(String Url){
        System.out.println("Launching chrome browser");
        wd.get(Url);
        wd.manage().window().maximize();
    }
    
    public void tearDown(){
    wd.quit();
    }
    

    
    WebDriver wait = new WebDriver() {

        @Override
        public void get(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getCurrentUrl() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getTitle() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<WebElement> findElements(By by) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public WebElement findElement(By by) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getPageSource() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void quit() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Set<String> getWindowHandles() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getWindowHandle() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public WebDriver.TargetLocator switchTo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public WebDriver.Navigation navigate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public WebDriver.Options manage() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
        
     public void waitForElementToBePresent(String Xpath){
         
        WebDriverWait wait = new WebDriverWait(wd, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
     }
     
     
    
    public void ViewOrderProcessing () {

        ClickElementByXpath("//a[contains(.,'Orders')]");
        ClickElementByXpath("//a[contains(.,'View Order Reports')]");
        ClickElementByXpath("//a[contains(.,'View Order Processing')]");
        
        waitForElementToBePresent("//a[contains(.,'View Order Processing')]");
        System.out.println("Landed on Order Processing Page!!");
        
//        wd.findElements(By.xpath("//span[@class='k-widget k-dropdown k-header' and contains(.,'ANY')]")).get(0).click();
        
        
        

        
//            driver.findElement(By.xpath("//div[@class='k-animation-container']/descendant::li[contains(.,'Workspace Authentication')]"));
//             driver.findElement(By.xpath("//select//option[@value=2]")).click();
//             driver.findElement(By.xpath("//li[contains(.,'Workspace Authentication')]")).click();
//            List<WebElement> dropdown_items = new ArrayList<>();
//            dropdown_items = driver.findElements(By.xpath("//div[@class='nav-wrap']//nav//ul//li//a//i"));
//            dropdown_items.get(2).click();
// 


            
////		Selecting Items in a Multiple SELECT elements
//		
	 
//           Select oSelect = new Select(driver.findElements(By.cssSelector("//span[@class='k-widget k-dropdown k-header']//select[option[@value='2']]")));
//           oSelect.selectByVisibleText("Workspace Authentication");
//          driver.findElement(By.xpath("//input[@value='Submit']")).click();
//          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            
//            Loop
//                    List<WebElement> links = driver.findElements(By.className("search-results"));
//            for( int i = 0; i < links.size(); i++)
//            {
//                //The stop below is necessary to store all links in a list to access later.  
//                links = driver.findElements(By.className("search-results")); 
//                links.get(i).click();
//                // Your code here
//                driver.navigate().back();
//}

    }
    
    public void navigateToOrders(){
        
        ClickElementByXpath("//i[@class='fa fa-bars fa-fw']");
        waitForElementToBePresent("//a[contains(.,'Supply Chain Advantage')]");
        ClickElementByXpath("//a[contains(.,'Supply Chain Advantage')]");
        ClickElementByXpath("//a[contains(.,'Retail Advantage Dashboard')]");
    }
    public void Login(){
        
        wd.findElement(By.xpath("//hj-dropdownlist[@data-hj-test-id='authenticationMode']")).click();
        System.out.println("About to Select Workspace Authentication As An Option!");

        wd.findElement(By.xpath("//div[@class='k-animation-container']/descendant::li[contains(.,'Workspace Authentication')]")).click();
        System.out.println("Workspace Authentication Option Selected!");
        sendKeys("//input[@class='k-textbox' and @placeholder='User Name']", "Yonela");
        sendKeys("//input[@class='k-textbox' and @placeholder='Password']", "YON");

        ClickElementByXpath("//button[@class='k-button']");
        waitForElementToBePresent("//h4[contains(.,'Loading Applications')]");
        waitForElementToBePresent("//div[@class='thread-title' and contains(.,'Home Page')]");

        System.out.println("Logged in successfully!");
        
    }
    public void Logout(String Nname){
      
        ClickElementByXpath("//a[contains(.,'"+Nname+"')]");
        ClickElementByXpath("//a[contains(.,'Logout')]");
        ClickElementByXpath("//div[@data-hj-test-id='flex-container']/descendant::button[contains(.,'Logout')]");
        System.out.println("System logged out!!");
    }
    
    public void sendKeys(String Xpath, String Value){
        wd.findElement(By.xpath(Xpath)).sendKeys(Value);
    }
    
    public void ClickElementByXpath(String Xpath){
    wd.findElement(By.xpath(Xpath)).click();
    }
    
   public void ClickElementById(String id){
    wd.findElement(By.id(id)).click();
    }
   
  public void ClickElementByName(String name){
    wd.findElement(By.xpath(name)).click();
    }
   
    public void menu (){
        
//         driver.findElement(By.xpath("//a[@id='menuButtonToggle']")).click();
//         List<WebElement> ddmenu = driver.findElements(By.xpath("//div//nav[@class='quick-nav']//ul//li//a"));
//           driver.findElement(By.xpath("//div//li[@data-bind='if: $parent.isMenuVisible() && $parent.quickLinksBar.isMenuVisible()']")).click();
//         for (int i=0; i<ddmenu.size(); i++)
//         {
//             WebElement element=ddmenu.get(2);
//             
//             String innerhtml=element.getAttribute("InnerHTML");
//             
//             if(innerhtml.contentEquals("JavaScript"))
//             {
//                 element.click();
//                 
//             }
//         }

}

    }


