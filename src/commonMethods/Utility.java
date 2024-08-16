package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.asm.Advice.Argument;
import net.bytebuddy.asm.Advice.AssignReturned.ToArguments;

public class Utility {
	
	public static void screenShot(WebDriver driver, String name) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\MXShare\\"+name+".jpg");
		
		FileHandler.copy(src, dest);
		
	}
	
	public static void scrollDown(WebDriver driver ,WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	
	}
	
	public static String dataFromExcell(String fileName, String sheet,int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream(fileName);
		
		String value = WorkbookFactory.create(file).getSheet(sheet).getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
		
	}

}
