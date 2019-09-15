package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Test5{

	@Test
	public void test() {
		final String[] currency1 = {"EUR", "USD", "GBP", "BTC", "ETH", "FKE"};
	    final String[] currency2 = {"BTC", "ETH", "EUR", "FKE", "GBP", "USD"};
				   
	    Arrays.sort(currency1);
		assertArrayEquals(currency1, currency2);
	}
}

