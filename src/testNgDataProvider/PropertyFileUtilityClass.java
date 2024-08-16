package testNgDataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtilityClass {
	
	public static String readDataFromPropertyFile(String key) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "//Property.properties";
	
		FileInputStream file = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(file);
		String crediantial = prop.getProperty(key);
		return crediantial;
	}
	public static void main(String[] args) throws IOException {
		System.out.println(readDataFromPropertyFile("PassWord"));
	}

}
