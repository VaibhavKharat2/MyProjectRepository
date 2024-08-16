package xcellStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

  FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Documents\\ViShuBhav.xlsx");
  
  Workbook data = WorkbookFactory.create(file);
 Sheet sheet = data.getSheet("Sheet2");
 

 
 
 for(int i=0; i<=7;i++) {
	 
	 for(int j=0;j<=4;j++) {
		 
		String value = sheet.getRow(i).getCell(j).getStringCellValue();
		
		System.out.print(value +" ");
	 }
	 System.out.println();
 }
	}

}
