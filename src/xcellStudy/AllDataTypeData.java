package xcellStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataTypeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Documents\\ViShuBhav.xlsx");
	
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int rowNum = sheet.getLastRowNum();
		short colNum = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=rowNum;i++) {
			for(int j=0;j<colNum;j++) 
			{
				
				Cell cell = sheet.getRow(i).getCell(j);
				CellType type = cell.getCellType();
				
				if(type==CellType.STRING) {				
					System.out.print(cell.getStringCellValue()+", ");
				}else if(type==CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue()+", ");
				}else {
					System.out.print(cell.getBooleanCellValue()+", ");
				}	
			}
			System.out.println();
		}
			
	}

}
