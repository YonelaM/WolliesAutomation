
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static scanners.Scanners.wd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W7134551
 */
public class Page {
    WebDriver wd;

    public Page() {
        this.wd = wd;
    }
    
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\W7134551\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
        wd = new ChromeDriver();
        System.out.println("Launching chrome browser");
        wd.get("https://hjqa02.woolworths.co.za/core/Default.html");
        wd.manage().window().maximize();
    }
    
    public void navigateToUrl() {
        System.out.println("Launching chrome browser");
        wd.get("https://hjqa02.woolworths.co.za/core/Default.html");
        wd.manage().window().maximize();
    }

    public void waitForElementToBePresent(String Xpath) {

        WebDriverWait wait = new WebDriverWait(wd, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
    }
   
    
    
    public void sendKeys(String Xpath, String Value) {
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
    
    public void Authentication() {

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
}
