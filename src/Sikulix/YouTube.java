package Sikulix;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTube 
{

	public static void main(String[] args) throws Exception
	{
		
		   System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		   System.setProperty("webdriver.chrome.silentOutput","true");
		   ChromeDriver d= new ChromeDriver();
		   d.manage().window().maximize();// 
		   d.get("https://www.youtube.com");
	       WebDriverWait w= new WebDriverWait(d,50);
	       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
	   
	       d.findElement(By.xpath("//input[@id='search']")).sendKeys("abdul kalam speech in european union reaction");
	           Thread.sleep(5000);
	           // click search icon
	           d.findElement(By.xpath("(//*[@aria-label='Search'])[2]")).click();
	           // click that link
	           Thread.sleep(5000);
	           d.findElement(By.xpath("//a[contains(text(),' Dr APJ Abdul Kalam makes India proud   EU speech')]")).click();
	           Thread.sleep(5000);
	         Screen s= new Screen();
	         Location l= new Location(100,100);
	         s.wheel(l,Button.LEFT,0); // mouse over 0>>> mouse over 
	      
	        Thread.sleep(5000);	        
	        s.click("pause.png");
	        Thread.sleep(5000);
	        s.wheel(l,Button.LEFT,0); // mouse over 0>>> mouse over 
	        s.click("play.png");
	        Thread.sleep(5000);
	        s.wheel(l,Button.LEFT,0);
	        //volume
	        s.mouseMove("volume.png");
	       //Pattern p= new Pattern("volume.png");
	        
	       //p.similar(70);
	       //s.click(p);
	        Thread.sleep(5000);
	        // volume status
	        Match m=s.find("volumebulb.png");
	        Location l2=new Location(m.getX()-10,m.getY());
	        s.dragDrop(m,l2);
	        Thread.sleep(2000);
}
}