package com.walmart.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellUtils {
	public static Object[][] getExcelData(String fileName, String sheetName) throws IOException {
		Object[][] data = null;
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(Constants.Resources_PATH + "/testdata/" + fileName);
			XSSFSheet sheet = wb.getSheet(sheetName);
			int rowsIndex = sheet.getLastRowNum();// return last row index-index starts from 0

			data = new Object[rowsIndex][];

			for (int i = 1; i <= rowsIndex; i++) {
				XSSFRow row = sheet.getRow(i);
				int cols = row.getLastCellNum();// returns no of columns- index start from 0

				Object[] colData = new Object[cols];
				for (int j = 0; j < cols; j++) {
					colData[j] = row.getCell(j).toString();
				}
				data[i - 1] = colData;
			}

		} catch (IOException e) {

		} finally {
			wb.close();
		}

		return data;

	}
}
