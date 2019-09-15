package test;

import readingFile.ReadingFile;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Test4{

	@Test
	public void test() throws FileNotFoundException {
		double [] readingFile = ReadingFile.dealingFile();
		Double usd = readingFile[2];
		assertNotNull(usd);	
	}
}

