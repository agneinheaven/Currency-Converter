package currency;

import calculatingCurrency.CalculatingCurrency;

import readingFile.ReadingFile;
import test.Test1;
import test.Test2;
import test.Test3;
import test.Test4;
import test.Test5;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("CURRENCY CONVERTER\n");
		double number3Array[] = ReadingFile.dealingFile();
	    CalculatingCurrency.calculateCurrency(number3Array);
	    Test1 test1 = new Test1();
	    test1.test();
	    Test2 test2 = new Test2();
	    test2.test();
	    Test3 test3 = new Test3();
	    test3.test();
	    Test4 test4 = new Test4();
	    test4.test();
	    Test5 test5 = new Test5();
	    test5.test();
    }  
}