package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Six;
import javamm.SixSol;

@RunWith(Parameterized.class)
public class SixTest {

	@Parameters(name = "(a = {0}; b = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 1000; ++i) {
			int x = 1 + (int) (Math.random() * 100);
			int y = 1 + (int) (Math.random() * 100);
			m[i][0] = x;
			m[i][1] = y;
		}
		return Arrays.asList(m);
	}

	private int x;
	private int y;

	public SixTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(SixSol.six(x,  y), Six.six(x,  y));
	}

}
