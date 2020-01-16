package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Party;
import javamm.PartySol;

@RunWith(Parameterized.class)
public class PartyTest {

	@Parameters(name = "(s = {0}; w = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 1000; ++i) {
			int x = 1 + (int) (Math.random() * 100);
			boolean y = ((int) (Math.random() * 2)==0)?false:true;
			m[i][0] = x;
			m[i][1] = y;
		}
		return Arrays.asList(m);
	}

	private int x;
	private boolean y;

	public PartyTest(int x, boolean y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(PartySol.party(x,  y), Party.party(x,  y));
	}

}
