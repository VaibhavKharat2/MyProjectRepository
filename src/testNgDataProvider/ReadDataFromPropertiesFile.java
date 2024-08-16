package testNgDataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
	
		String filePath = System.getProperty("user.dir") + "//Property.properties";

		FileInputStream file = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(file);
		
		String value = prop.getProperty("UserId");
		System.out.println(value);
		
		System.out.println(prop.get("PassWord"));
	}}