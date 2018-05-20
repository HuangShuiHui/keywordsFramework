package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelTest {
	
	public static void main(String[] args) {
//		createXls();
//		createXlsx();
		
	}
	

	public static void createXls() {
		Workbook wb = new HSSFWorkbook();
		
		try {
			
			FileOutputStream out = new FileOutputStream("wb.xls");
			wb.write(out);
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void createXlsx() {
		Workbook wb = new XSSFWorkbook();
		
		try {
			FileOutputStream out = new FileOutputStream("wb.xlsx");
			wb.write(out);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createSheet() {
		try {
			Workbook wb = new XSSFWorkbook();
			Sheet sheet = wb.createSheet("test");
			FileOutputStream out = new FileOutputStream("wb.xlsx");
			wb.write(out);
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
