package Amazon.com.user;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public int sum(int a,int b) {
		int expected = 100;
		int res = a+b;
		return res;
	}
	public static void main(String[] args) {
		AppTest at = new AppTest();
		at.sum(50,50);
	}
}
