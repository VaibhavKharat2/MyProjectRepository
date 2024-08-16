package testNgDataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

	@DataProvider(name = "Ashok")
	public String[][] myData() {
		String data[][] = { { "Vishal", "Kharat", "11111" }, 
				{ "Shubham", "Kharat", "22222" },
				{ "Vaibhav", "Kharat", "33333" } };
		return data;
	}

	@DataProvider(name="Balu")
	public String[][] myData1() {
		String data1[][] = { { "Vansh", "Kharat", "44444" }, 
				{ "Shruti", "Kharat", "55555" } };
		return data1;
	}
}
