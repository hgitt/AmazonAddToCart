import java.util.ArrayList;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup()
	{
		driver.get("https://www.amazon.in");
	System.out.println("amazon login success");
	}
@Test
public void testing()
{
	//search s23
	WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.sendKeys("s23");

	searchBox.submit();
	driver.findElement(By.linkText("Samsung Galaxy S23 5G (Green, 8GB, 128GB Storage)")).click();
	
	Set<String> s =driver.getWindowHandles();
	ArrayList ar=new ArrayList(s);
	System.out.println(ar.get(0));
	System.out.println(ar.get(1)); 
	driver.switchTo().window((String)ar.get(1));


	driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();





}
@After
public void tearDown()
{
	System.out.println("closed");
}
}
