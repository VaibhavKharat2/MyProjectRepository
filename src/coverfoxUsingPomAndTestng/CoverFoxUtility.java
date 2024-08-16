package coverfoxUsingPomAndTestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CoverFoxUtility {

	public static String getDataFromExcell(int row, int col) throws EncryptedDocumentException, IOException {

		String path = System.getProperty("user.dir") + "\\Vishubhav.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
