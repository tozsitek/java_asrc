package com.jpractice.javaPractice.sandbox.excelExportAndFileIO;
import static org.apache.poi.ss.usermodel.Cell.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
NOT WORKING YET, will need to use a different loop
 */
public class ReadExcelFileSample2 {
  public static void main(String[] args) throws IOException {
    // Create a FileInputStream object for the Excel file
    String filePath = System.getProperty("user.dir")+"\\src\\com\\jpractice\\resources";
    File file = new File(filePath + "\\" + "ExportExcel.xlsx");
    //Create an object of FileInputStream class to read excel file
    FileInputStream fis = new FileInputStream(file);


    // Create a Workbook object from the FileInputStream
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    // Get the first sheet from the Workbook
    Sheet sheet = workbook.getSheetAt(0);

    // Iterate through each row in the sheet
    int i = 0;
    int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
    for (Row row : sheet) {
      // Get the first cell in the row
      Cell cell = row.getCell(i);

      // Check if the cell is of type Date
      if (cell.getCellType() == CellType.NUMERIC) {
        // Get the date value from the cell
        Date date = cell.getDateCellValue();
        // Print the date value
        System.out.println(date);
      }else{
        System.out.print(cell.getStringCellValue().toString() + "|| ");
      }
      i++;
    }

    // Close the FileInputStream
    fis.close();
  }

}
