package testNgDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;

public class SwagLabCrediatial {
	
	@DataProvider(name="idPass")
	public String[][] crediantialData(){
		
		String[][] credential = {{"standard_user","secret_sauce"},
				{"vaibhav@123","vaibhav@123"},{"locked_out_user","secret_sauce"}};
		
		return credential;
	}
	
	public static String[][] credintialData(String excellName,String sheet) throws FileNotFoundException{
		String path=System.getProperty("user.dir") + "\\" +excellName +".xlsx";
		FileInputStream myFile = new FileInputStream(path);
		
		return null;
	}

}
