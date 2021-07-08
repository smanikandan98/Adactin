package com.maven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Write {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\MANIKANDAN\\eclipse-workspace\\Maven_Project\\target\\TestCase.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		
		Sheet createSheet = wb.createSheet("TestCase");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Mani");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		wb.close();
		
		System.out.println("Sucessfull");
		
		
	}

}
