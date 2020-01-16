package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Order;
import javamm.OrderSol;

@RunWith(Parameterized.class)
public class OrderTest {

	@Parameters(name = "(a = {0}; b = {1}; c = {2}; noA = {3})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][4];
		for (int i = 0; i < 1000; ++i) {
			int a = 1 + (int) (Math.random() * 1000);
			int b = 1 + (int) (Math.random() * 1000);
			int c = 1 + (int) (Math.random() * 1000);
			boolean noA = ((int) (Math.random() * 2)==0)?false:true;
			m[i][0] = a;
			m[i][1] = b;
			m[i][2] = c;
			m[i][3] = noA;
		}
		return Arrays.asList(m);
	}

	private int a;
	private int b;
	private int c;
	private boolean noA;

	public OrderTest(int a, int b, int c, boolean noA) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.noA = noA;
	}

	@Test
	public void testExercise() {
		assertEquals(OrderSol.order(a, b, c, noA), Order.order(a, b, c, noA));
	}

}
