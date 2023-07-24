package api.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	static String strFilePath;
	static int sheetNo, rowNo;
	public static void setFilePath(String path) {
		strFilePath = path;
	}
	
	public static void setSheetNo (int i) {
		sheetNo = i;
	}
	public static void setRowNo (int i) {
		rowNo = i;
	}
	public static Row GetRowData() throws IOException {
		File excelFile = new File(strFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetNo);
		Row rowData = sheet.getRow(rowNo);
		return rowData;
	}
}
	
