package popUpStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		
		String id = "admin";
		String pass = "admin";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://"+id+":"+pass+"@"+"the-internet.herokuapp.com/basic_auth");
		
		String s =driver.findElement(By.tagName("p")).getText();
		System.out.println(s);

		
	}

}
/*
//How to handle https://username:password@URL
//username: admin
//password: admin
//url:https://the-internet.herokuapp.com/basic_auth

String username="admin";
String password="admin";

*/