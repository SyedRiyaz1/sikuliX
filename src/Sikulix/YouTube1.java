package Sikulix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTube1
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch 244\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();// 
		d.get("https://www.youtube.com");
		Thread.sleep(5000);
		// Search Box   x path 
		WebElement e=d.findElement(By.xpath("(//*[@id='search'])[1]"));
		e.sendKeys("Google CEO Sundar Pichai complete opening statement (C-SPAN)");
		// click search box
		d.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		// click that click link
		WebElement e2=d.findElement(By.xpath("//*[@title='Google CEO Sundar Pichai complete opening statement (C-SPAN)']"));
		e2.click();
		// sikulix  up to here
		System.out.println("***********************************");
		// screen class
		Screen s= new Screen();
		// skipadd
		
		// check it is there or not
		if(s.exists("skipadd1.png")!=null)
		{
			s.click("skipadd1.png");
		}
		     
		Thread.sleep(5000);
		Match m=s.find("pause1.png");
		int x=m.getX();
		int y=m.getY();
		System.out.println(x+"  "+y);
		// move the cursor to that loctaion that time all the video icon is visible so we use that one
		Location loc= new Location(x,y); // x cordinate and y co-ordinate
		 // to get the video i con
		s.wheel(loc, Button.LEFT,1);
		// pause video
		//s.click("pause1.png");// execute not exact click
		Thread.sleep(5000);
		// play video
		s.click("play1.png");
		Thread.sleep(5000);
		// exact click operation
		// move mouse pointer to the video icon buble i think
		s.wheel(loc,Button.LEFT,0); // bouble not visible so move that place
	   // s.mouseMove("volume.png");
		// one line converted in to
		/*Pattern p= new Pattern("volume420.png");
		p.similar(60);
		s.mouseMove(p);*/
		s.mouseMove("volumebulb.png");
		 
	    Thread.sleep(5000);
	     	}

}
