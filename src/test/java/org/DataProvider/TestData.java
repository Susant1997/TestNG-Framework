package org.DataProvider;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name ="login", indices = {0,2}, parallel = true)
	public String[][] myData() {
		
		String Data[][] = new String[3][2];
		Data[0][0] = "susant1997";
		Data[0][1] = "December@06";
		
		Data[1][0] = "csasikumarmes";
		Data[1][1] = "sql403";
		

		Data[2][0] = "sasikumar";
		Data[2][1] = "sql403";
		return Data;

	}

}
