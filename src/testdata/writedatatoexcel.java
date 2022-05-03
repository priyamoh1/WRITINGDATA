package testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writedatatoexcel 
{
@Test
public void writedata() throws IOException
{
	FileInputStream fis=new FileInputStream("./data/demodata.xlsx");
	XSSFWorkbook eb=new XSSFWorkbook(fis);
	System.out.println(eb);
	//Sheet s=eb.getSheet("pintu");
	Sheet s=eb.createSheet("priyaranjan mohanty");
	Row r=s.createRow(2);
	Cell c=r.createCell(2);
	c.setCellValue("madness");
	FileOutputStream fos=new FileOutputStream("./data/demodata.xlsx");
	eb.write(fos);
}
}
