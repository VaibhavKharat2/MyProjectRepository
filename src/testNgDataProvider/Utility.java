package testNgDataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Utility {
	
	@DataProvider(name = "familyMember")
	public String[][] familyData() throws EncryptedDocumentException, IOException{
		String[][] familydata=getDataFromExcel("Vishubhav", "Sheet3");
		return familydata;
	}

	public static String[][] getDataFromExcel(String fileName, String sheet)
			throws EncryptedDocumentException, IOException {

		String path = System.getProperty("user.dir") + "\\" + fileName + ".xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet mySheet = WorkbookFactory.create(file).getSheet(sheet);
		int rowCount = mySheet.getLastRowNum();
		int cellCount = mySheet.getRow(0).getLastCellNum() - 1;
		String data[][] = new String[rowCount + 1][cellCount + 1];
		for (int i = 0; i <= rowCount; i++) {

			for (int j = 0; j <= cellCount; j++) {

				String myData = mySheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j] = myData;
			}

		}
		return data;
	}

}
