package com.maven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Read {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MANIKANDAN\\eclipse-workspace\\Maven_Project\\target\\TestCase.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		
		
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				 
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					System.out.println(cell.getStringCellValue());
					
				}
				else if (cellType.equals(cellType.NUMERIC)) {
					
					double value = cell.getNumericCellValue();
					
					System.out.println(String.valueOf(value));
					
					
				}
				
			}
		}
	}

}
