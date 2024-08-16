package a_FullSeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellStudy1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Consider the index of excell row and column start from 0

		// To read perticular data from excell
		/*
		 * FileInputStream file = new FileInputStream("E:\\Vishubhav.xlsx"); String
		 * text=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).
		 * getStringCellValue(); System.out.println(text);
		 */

		// to read all string data from the excell

		/*
		 * FileInputStream file = new FileInputStream("E:\\Vishubhav.xlsx"); Workbook
		 * myWorkBook = WorkbookFactory.create(file); Sheet sheet =
		 * myWorkBook.getSheet("Sheet1"); for(int i=0;i<3;i++) { for(int j=0;j<2;j++) {
		 * String s=sheet.getRow(i).getCell(j).getStringCellValue();
		 * System.out.print(s+"  "); } System.out.println(); }
		 */

		FileInputStream file = new FileInputStream("E:\\Vishubhav.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(file);
		Sheet sheet = myWorkBook.getSheet("Sheet2");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum()-1;
	//	System.out.println(sheet.getLastRowNum()); //it gives row account
	//  System.out.println(sheet.getRow(0).getLastCellNum());//reduce size by 1 gives actual

		for(int i=0;i<=row;i++) {
			
			for(int j=0;j<=col;j++) {
				Cell cell = sheet.getRow(i).getCell(j);
			
				CellType cellType = cell.getCellType();
				
				if(cellType == CellType.STRING) {
					System.out.print(cell.getStringCellValue()+"--");
				}else if(cellType == CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue()+"--");
				}else {
					System.out.print(cell.getBooleanCellValue()+"--");
				}
			}
			System.out.println();
		}
	}

}
