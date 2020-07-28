package excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    static XSSFWorkbook workBook;
    public void loadExcelData() throws IOException {
        File f=new File("./TestData/challenge.xlsx");

        FileInputStream fileInputStream=new FileInputStream(f);

        workBook=new XSSFWorkbook(fileInputStream);
    }

    public int getRowCount(String sheetName)
    {
        XSSFSheet sheet=workBook.getSheet("Data");
        return sheet.getLastRowNum();
    }

    public int getColsCount(String sheetName)
    {
        XSSFSheet sheet=workBook.getSheet("Data");
        return sheet.getRow(0).getPhysicalNumberOfCells();
    }


    public int serachTestCase(String sheetName,String testCase){
    int rowfound=0;
        int rowcount=getRowCount(sheetName);
        XSSFSheet sheet=workBook.getSheet(sheetName);
        for (int r=1;r<=rowcount-1;r++){

           String crntTestCase= sheet.getRow(r).getCell(0).getStringCellValue().trim();
           if(testCase.trim().equalsIgnoreCase(crntTestCase)){
               rowfound=r;
               break;

           }

        }
return rowfound;

    }
    public int serachColumn(String sheetName,String column){
        int colfound=0;
        int colsCount=getColsCount(sheetName);
        XSSFSheet sheet=workBook.getSheet(sheetName);
        for (int c=0;c<=colsCount-1;c++){

            String header= sheet.getRow(0).getCell(c).getStringCellValue().trim();
            if(column.trim().equalsIgnoreCase(header)){
                colfound=c;
                break;

            }

        }
        return colfound;

    }



    public String getData(String sheetName,String testCase,String fieldName){

        int row=serachTestCase(sheetName,testCase) ;// search the test case position return the rownumber
        String data=null;
        int col=serachColumn(sheetName,fieldName);// search the column position return the column number
        XSSFSheet sheet=workBook.getSheet(sheetName);
        switch (sheet.getRow(row).getCell(col).getCellType()){
            case STRING:
                System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
                data=sheet.getRow(row).getCell(col).getStringCellValue();
                break;

            case NUMERIC:
                System.out.println(sheet.getRow(row).getCell(col).getNumericCellValue());
                data=String.valueOf(sheet.getRow(row).getCell(col).getNumericCellValue());
                break;

        }
        return data;

    }



}








