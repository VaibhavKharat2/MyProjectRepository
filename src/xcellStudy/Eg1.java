package xcellStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream myFile = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Documents\\ViShuBhav.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
	System.out.println(value);
	}

}
