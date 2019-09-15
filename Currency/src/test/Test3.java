package test;

import readingFile.ReadingFile;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Test3{

	@Test
	public void test() throws FileNotFoundException {
		
		double [] readingFile = ReadingFile.dealingFile();
		Double eur_gbp1 =  100.0 / readingFile[2];
		Double eur_gbp2 = 100.0;
		assertNotEquals(eur_gbp1, eur_gbp2);		
	}
}

