package commons.Utils;

import commons.GlobalConstant;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.util.Map;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExelOneRow {
    private Sheet currentSheet;
    private String testDataExcelPath = GlobalConstant.PROJECT_PATH +"\\File\\DataLogin.xlsx" ;
    private Map<String, Integer> columns;

    public static ReadExelOneRow getExcelData() {
        return new ReadExelOneRow();
    }

    public void switchToSheet(String name) {
        columns = new HashMap<String, Integer>();
        try (var workbooks = WorkbookFactory.create(new File(testDataExcelPath))) {
            currentSheet = workbooks.getSheet(name);
            currentSheet.getRow(0).forEach(cell -> {
                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCellData(String columnName, int row) {
        var dataRow = currentSheet.getRow(row);
        return getCellValue(dataRow.getCell(columns.get(columnName)));

    }

    private static String getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return String.valueOf(cell.getDateCellValue());
                } else {
                    return String.valueOf((int) cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return null;
        }
    }

}

