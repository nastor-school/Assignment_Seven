package Assignment.Seven;

import org.junit.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void add() {
        Assert.assertEquals(4, App.add(2, 2), 1);
    }

	@Test
	public void multiply() {
		Assert.assertEquals(4, App.multiply(2, 2), 1);
    }
}
