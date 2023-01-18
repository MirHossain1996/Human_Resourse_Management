package Practice_maven;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups="smoke")
	public void create() {
		System.out.println("Project is Created .");
	}
	@Test
	public void edit() {
		System.out.println("Project Modified Successfully.");
	}
}
