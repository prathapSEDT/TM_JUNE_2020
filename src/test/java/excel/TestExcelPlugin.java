package excel;

import java.io.IOException;

public class TestExcelPlugin {
    public static void main(String[] args) throws IOException {
        ReadExcel excel=new ReadExcel();
excel.loadExcelData();
        excel.getData("Data","TC_04","Address");
    }
}
