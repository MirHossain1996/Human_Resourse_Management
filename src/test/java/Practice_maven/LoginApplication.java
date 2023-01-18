package Practice_maven;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.model.ReportStats;

public class LoginApplication {

	@Test
	public void login() {
		Reporter.log("login the page  :");
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
