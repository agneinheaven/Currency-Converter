package test;

import readingFile.ReadingFile;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Test1{

	@Test
	public void test() throws FileNotFoundException {
		double [] readingFile = ReadingFile.dealingFile();
		Double eur_eur1 =  100.0 / readingFile[0];
	    Double eur_eur2 = 100.0;
		assertEquals(eur_eur1, eur_eur2);
		
	}
	

}

