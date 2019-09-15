package readingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFile {
	
	public static double[] dealingFile() throws FileNotFoundException {
		File file = new File("Attachment.csv");
	    Scanner reader = new Scanner(file);
	    ArrayList<String> rows = new ArrayList<String>(); 
	    String currencyName[] = new String[6];
	    int currName = 0;
	    int currRate = 0;
	    double number3Array[] = new double[6];
	    double number3;
	    
	    while (reader.hasNextLine()) {
	    	String line = reader.nextLine();
	        String currencyArray[] = line.split(",");
	        currencyName[currName] = currencyArray[0];
	        currName++;
	        
	        if (currencyArray.length == 2) {
	        	number3Array[currRate] = Double.parseDouble(currencyArray[1]);
	    	    currRate++;
	        }
	        if(currencyArray.length == 3) {
	        	String number1[] = currencyArray[1].split("\"");
	    	    String number2[] = currencyArray[2].split("\"");
	            number3 = Double.parseDouble(number1[1] + "." + number2[0]);
	            number3Array[currRate] = number3;
	            currRate++;	      
	        }
	        rows.add(line);
	     }    
	     reader.close();
	     return number3Array;
    }
}