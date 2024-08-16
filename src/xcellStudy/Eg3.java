package xcellStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Documents\\ViShuBhav.xlsx");
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet3");
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(2);
		
		System.out.println(cell.getCellType());
		//System.out.println(cell.getNumericCellValue());
		
		//System.out.println(cell.getStringCellValue());
		
		System.out.println(cell.getBooleanCellValue());
		
		
	}

}
