package com.spade.excellibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	
	
	
public static String getusername() throws EncryptedDocumentException, IOException {
	
	String Username=null;
	String propertiesfilepath=".\\src\\main\\java\\com\\spade\\testcasedata\\testscenarios.xlsx";
	 FileInputStream file=new FileInputStream(propertiesfilepath);
Workbook wb= WorkbookFactory.create(file);
Sheet s=wb.getSheet("login_motor");
Row r= s.getRow(1);
Cell c1= r.getCell(0);	
  Username=   c1.getStringCellValue();

return Username;
	}


public static String getpassword() throws EncryptedDocumentException, IOException {
	
	String password=null;
	String propertiesfilepath=".\\src\\main\\java\\com\\spade\\testcasedata\\testscenarios.xlsx";
	 FileInputStream file=new FileInputStream(propertiesfilepath);
Workbook wb= WorkbookFactory.create(file);
Sheet s=wb.getSheet("login_motor");
Row r= s.getRow(1);
Cell c1= r.getCell(1);	
  password=   c1.getStringCellValue();

return password;
	}




}
