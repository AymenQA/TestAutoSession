package login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utile {

	

	public static class Utileauthen {

		static public void autehn(String Name, String password, WebDriver driver) {

			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Name);

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

			driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

		}

		static public void AssertCorrect(String ExpectedResult, WebDriver driver) {

			// 1éremethode
//			 boolean contientsecure = d.findElement(By.xpath("//div[@id='flash']")).getText().contains(ExpectedResult);
//			Assert.assertTrue(contientsecure);

			// 2ememéthode

			String ActualResult = driver.findElement(By.xpath("//div[@id='flash']")).getText();

			Assert.assertEquals(ActualResult, ExpectedResult);

		}

		static public void loginWithCorrectUsernameAndWrongPassword(WebDriver driver, String username,
				String wrongPassword) {

			driver.findElement(By.id("username")).sendKeys(username);

			driver.findElement(By.id("password")).sendKeys(wrongPassword);

			driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

		}

		static public void loginWithCorrectUsernameAndCorrectPassword(WebDriver driver, String username,
				String password) {

			driver.findElement(By.id("username")).sendKeys(username);

			driver.findElement(By.id("password")).sendKeys(password);

			driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

		}

	}

}
