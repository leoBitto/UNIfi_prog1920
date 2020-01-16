package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Range;
import javamm.RangeSol;

@RunWith(Parameterized.class)
public class RangeTest {

	@Parameters(name = "(n = {0}; l = {1}; r = {2}; o = {3})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][4];
		for (int i = 0; i < 1000; ++i) {
			int l = 1 + (int) (Math.random() * 100);
			int r = l + (int) (Math.random() * 100);
			int n = 1 + (int) (Math.random() * 200);
			boolean o = ((int) (Math.random() * 2) == 0) ? false : true;
			m[i][0] = n;
			m[i][1] = l;
			m[i][2] = r;
			m[i][3] = o;
		}
		return Arrays.asList(m);
	}

	private int n;
	private int l;
	private int r;
	private boolean o;

	public RangeTest(int n, int l, int r, boolean o) {
		this.n = n;
		this.l = l;
		this.r = r;
		this.o = o;
	}

	@Test
	public void testExercise() {
		assertEquals(RangeSol.range(n, l, r, o), Range.range(n, l, r, o));
	}

}
