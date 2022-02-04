import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {

	@Test
	public void multiplication() { 
		assertEquals(150, skillDemo.multiply(10,15));
	}
}