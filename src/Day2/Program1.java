package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Pattern program
public class Program1 {
	
	public static void main(String[] args)
	{        
	        int n=4;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<=i;j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        } 
	} 
	
	

//    public static void main(String[] args) {
//            System.setProperty("webdriver.chrome.driver","C:\\Users\\vitha\\Desktop\\selenium\\chromedriver.exe");
//                      WebDriver driver = new ChromeDriver();
//                      driver.manage().window().maximize();
//                      driver.get("https://www.facebook.com");
//                      driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
//                      driver.findElement(By.id("pass")).sendKeys("password");
//                     // Thread.sleep(5000);
//                      driver.findElement(By.id("u_0_2")).click(); 
//                      //Thread.sleep(7000);
//    }
	
	
}     

