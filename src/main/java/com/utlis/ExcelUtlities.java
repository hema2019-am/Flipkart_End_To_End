package com.utlis;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtlities {
    File path;
    public String ExcelRead(String Sheet, int RoNumber, int CellNumber) throws IOException {
         path = new File("src/main/resources/TestData/SeleniumTestData.xlsx");
        FileInputStream fis = new FileInputStream(path);
        Workbook ws = new XSSFWorkbook(fis);
        Sheet sh = ws.getSheet(Sheet);
        Row row = sh.getRow(RoNumber);
        Cell cell = row.getCell(CellNumber);
        return cell.getStringCellValue();

    }

    public void ExcelWrite(String Sheet, int RowNumber, int CellNumber, String text) throws IOException {
        path = new File("src/main/resources/TestData/SeleniumTestData.xlsx");
        FileInputStream fis = new FileInputStream(path);
        Workbook ws = new XSSFWorkbook(fis);
        Sheet sh = ws.getSheet(Sheet);
        Row row = sh.getRow(RowNumber);
        Cell cell = row.createCell(CellNumber);
        cell.setCellValue(text);
        FileOutputStream fos = new FileOutputStream(path);
        ws.write(fos);

    }
}
