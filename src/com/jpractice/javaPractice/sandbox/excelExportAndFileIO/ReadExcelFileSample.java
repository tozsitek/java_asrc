package com.jpractice.javaPractice.sandbox.excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ReadExcelFileSample {
  //private static final Logger LOG = LogManager.getLogger(ReadExcelFileSample.class);

  final DataFormatter df = new DataFormatter();
  public void readExcel(String filePath,String fileName,String sheetName) throws IOException {

    String valueAsString = "";

    // Create an object of File class to open xlsx file
    File file = new File(filePath + "\\" + fileName);

    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);

    Workbook crWorkbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name
    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file or xls
    if (fileExtensionName.equals(".xlsx")) {
      //If it is xlsx file then create object of XSSFWorkbook class
      crWorkbook = new XSSFWorkbook(inputStream);
    } else if (fileExtensionName.equals(".xls")) {
      //If it is xls file then create object of HSSFWorkbook class
      crWorkbook = new HSSFWorkbook(inputStream);
    }

    //Read sheet inside the workbook by its name
    Sheet crSheet = crWorkbook.getSheet(sheetName);

    //Find number of rows in excel file
    int rowCount = crSheet.getLastRowNum() - crSheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it
    for (int i = 0; i < rowCount + 1; i++) {
      Row row = crSheet.getRow(i);
      //Create a loop to print cell values in a row
      for (int j = 0; j < row.getLastCellNum(); j++) {
        //System.out.print(row.getCell(j).getStringCellValue().toString() + "|| ");
        Cell cell = row.getCell(j);
        if (cell.getCellType() == CellType.NUMERIC) {
          // Get the date value from the cell
          Date date = cell.getDateCellValue();
          // Print the date value
          System.out.print(date + " || ");
        }else{
          cell = (XSSFCell) row.getCell(j);
          valueAsString = df.formatCellValue(cell);
          System.out.print(valueAsString + "|| ");
        }
      }
      System.out.println();
    }

  }

  //Main function is calling readExcel function to read data from Excel file

  public static void main(String...strings) throws IOException{
    //Create an object of ReadExcelFileSample class
    ReadExcelFileSample objExcelFile = new ReadExcelFileSample();

    //Prepare the path of Excel file
    String filePath = System.getProperty("user.dir")+"\\src\\com\\jpractice\\resources";
    //Call read file method of the class to read data
    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","CRExcelDemo");
  }
}

