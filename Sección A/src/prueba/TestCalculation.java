package prueba;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;

public class TestCalculation {
	@Test
	public void testFindMax() {
		assertEquals(10, Calculation.findMax(new int[] {1, 3, 4, 2, 10}));
		assertEquals(-1, Calculation.findMax(new int[] {-12, -8, -3, -1, -21}));
		assertEquals(100, Calculation.findMax(new int[] {100, -6, 0, 93, -5}));
	}
}
