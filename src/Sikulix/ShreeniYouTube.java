package Sikulix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class ShreeniYouTube 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable--notifications");
		ChromeDriver d= new ChromeDriver(co);
		d.manage().window().maximize();// 
		d.get("https://www.youtube.com");
		WebDriverWait wait=new WebDriverWait(d,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='search'])[1]")));
		
		// Search Box   x path 
		WebElement e=d.findElement(By.xpath("(//*[@id='search'])[1]"));
		e.sendKeys("Google CEO Sundar Pichai complete opening statement (C-SPAN)");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search-icon-legacy']")));
		
		// click search box
		d.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Google CEO Sundar Pichai complete opening statement (C-SPAN)']")));
		
		// click that click link
		WebElement e2=d.findElement(By.xpath("//*[@title='Google CEO Sundar Pichai complete opening statement (C-SPAN)']"));
		e2.click();
		
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//yt-formatted-string[text()='Ok']")));
			d.findElement(By.xpath("//yt-formatted-string[text()='Ok']")).click();
		}
		catch(Exception Ex)
		{
			System.out.println("No letter to click");
		}
		//Sikulix
		Screen s=new Screen();
		
		//Move mouse pointer to Video
		Location l=new Location(300,220);
		     int x=l.getX();
		     int y=l.getY();   // size of x and y:300 220
		//System.out.println(" size of x and y:"+x+" "+y);
		s.wheel(l,Button.LEFT,0);
		
		//Click pause
		s.click("E:\\ShreeniYoutube\\Pause.png");
		Thread.sleep(5000);
		
		//Get location of Play button 
		Match m=s.find("E:\\ShreeniYoutube\\Play.png");
		int x1=m.getX();
		int y1=m.getY();
		
		
		/*//Click Play using wheel() method
		//Location l1=new Location(x+0.5,y+0.5);
		s.click("E:\\ShreeniYoutube\\Play.png");
		Thread.sleep(3000);*/
		
		//
		Location l1=new Location(140,575);
		s.wheel(l1,Button.LEFT,0);
		 int x2=l1.getX();         // size of x and y:140 575
	     int y2=l1.getY(); 
		//System.out.println(" size of x and y:"+x2+" "+y2);
	     // mouse move to the volume 
	     s.mouseMove("E:\\ShreeniYoutube\\VolumeIcon.PNG");
	     // decrease the volume of buble icon
	     Match mb=s.find("E:\\ShreeniYoutube\\Bubble1.PNG");
	           int mx=    mb.getX();
	           int my  =  mb.getY();
	           Location lm=new Location(mx-20,y);
	          // System.out.println(" size of xm and my:"+mx+" "+my);
		         s.dragDrop(mb,lm);
		         Thread.sleep(5000);
		         // increase the volume
			    // s.mouseMove("E:\\ShreeniYoutube\\VolumeIcon.PNG");

	                  // Thread.sleep(5000);
		         s.wheel(l, Button.LEFT,0);
		         s.mouseMove("E:\\ShreeniYoutube\\VolumeIcon.PNG");
		         // lmn=new Location(mx+20,y);
		          // s.dragDrop(min,lmn);    
			     
			     /*Match min=s.find("E:\\ShreeniYoutube\\Bubble1.PNG");
		           int mxn=min.getX();
		           int myn=min.getY();
		          // System.out.println(" size of xm and my:"+mx+" "+my);
			       
			         Thread.sleep(5000);
			        // s.wheel(l, Button.LEFT,0); */
			         
		

	}

}
