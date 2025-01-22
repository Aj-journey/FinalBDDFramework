package UtilityLayer;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {
	private static XSSFSheet sheet;

	public ExcelReader(String ExcelSheetPath, String SheetName) throws Exception {

		FileInputStream fis = new FileInputStream(ExcelSheetPath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
	}

	public Object getCellValue(int row, int cell) {
		XSSFCell cells = sheet.getRow(row).getCell(cell);

		if (cells == null || cells.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return " ";
		} else {
			if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
				return cells.getStringCellValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
				return cells.getRawValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
				return cells.getBooleanCellValue();
			} else {
				return "Please check excel sheet test data format";
			}
		}
	}

	public List<Map<String, Object>> readExcelTestData() {
		int rowCount = sheet.getLastRowNum() + 1;
		int cellCount = sheet.getRow(0).getLastCellNum();

		List<Map<String, Object>> rowTestData = new ArrayList<Map<String, Object>>();

		for (int i = 1; i < rowCount; i++) {
			Map<String, Object> columnTestData = new LinkedHashMap<String, Object>();

			for (int j = 0; j < cellCount; j++) {
				String columnName = getCellValue(0, j).toString();
				Object columnValue = getCellValue(i, j);

				columnTestData.put(columnName, columnValue);
			}

			rowTestData.add(columnTestData);

		}

		return rowTestData;
	}

}
