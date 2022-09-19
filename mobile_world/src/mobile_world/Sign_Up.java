package mobile_world;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sign_Up {
    
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
    	 System.setProperty("webdriver.chrome.driver","C:/Users/sanandh.sajith/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         LandingPage landingpage2 = new LandingPage(driver);
         landingpage2.goTo();
         Thread.sleep(1000);
         landingpage2.signupapplication("Sanandh","Sajith","sanandhsajith@gmail.com","san25//789" ,"01/11/2001","8453984539","Welcome to Qualitest");
         Thread.sleep(1000);
         landingpage2.signupapplication("San","Sajith","sanandhsajith@gmail.com","san25//789" ,"01/11/2001","8453984539","Welcome to Qualitest");
    }



}