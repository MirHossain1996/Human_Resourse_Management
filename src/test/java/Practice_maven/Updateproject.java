package Practice_maven;

import org.testng.annotations.Test;

public class Updateproject {

	@Test
	public void updateName() {
		System.out.println("Project name is updated ");
	}
	@Test(groups="smoke")
	public void updateproject() {
		System.out.println("Project  is updated ");
	}
}
