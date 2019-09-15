package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {
	@Test
	public void test() {
		final Double eur_fke= 100.0 / 25;
		final Double eur_fke2 = 4.0;
		assertEquals(eur_fke, eur_fke2);
	}
}
