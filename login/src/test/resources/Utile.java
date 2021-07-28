


public class Utile {
	
	
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Utileauthen {

		static public void autehn(String Name, String password, WebDriver d) {

			d.findElement(By.xpath("//input[@id='username']")).sendKeys(Name);

			d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

			d.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			

		}

	
		
		static public void AssertCorrect(String ExpectedResult, WebDriver d) {

			
			//1éremethode
//			 boolean contientsecure = d.findElement(By.xpath("//div[@id='flash']")).getText().contains(ExpectedResult);
//			Assert.assertTrue(contientsecure);
			
			//2ememéthode
		

	    String ActualResult = d.findElement(By.xpath("//div[@id='flash']")).getText();

	     Assert.assertEquals(ActualResult, ExpectedResult);

		}
		
		
		static public void loginWithCorrectUsernameAndWrongPassword(Webdriver driver, String username, String wrongPassword) {

			d.findElement(By.id("username")).sendKeys(username);

			d.findElement(By.id("password")).sendKeys(wrongPassword);

			d.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			

		}
		
		static public void loginWithCorrectUsernameAndCorrectPassword(Webdriver driver, String username, String password) {

			d.findElement(By.id("username")).sendKeys(username);

			d.findElement(By.id("password")).sendKeys(password);

			d.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			

		}
		
		
	}	


}
