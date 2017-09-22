package Export;

import edu.duke.*;
import org.apache.commons.csv.*;

public class ExportCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExportCountry ob = new  ExportCountry();
		FileResource fr = new FileResource(); 
		CSVParser parser = fr.getCSVParser(); 
		ob.countryInfo(parser , "coffee");

	}

	public void countryInfo (CSVParser parser, String exportOfInterest) 
	{ 
		// System.out.println("nahid");
		for(CSVRecord record : parser) 
		{ 
			String export = record.get("Exports");  
			if(export.contains(exportOfInterest)) 
			{ 
				String  country = record.get("Country"); 
				System.out.println(country);   
			} 

		}   
} 
	
}
