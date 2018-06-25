package stevejobs;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.Number;
import jxl.write.WritableWorkbook;
public class Framework1 
{
public static void main(String[] args) throws Exception
{
    // Connect to excel 
	File f=new File("Book1.xls");
	// Open that excel file for reading
	Workbook rwb=Workbook.getWorkbook(f);
	Sheet rsh=rwb.getSheet(0);  // o means Sheet1
	int nour=rsh.getRows();
	// Open excel file writing
	int nouc=rsh.getColumns();
	WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
	WritableSheet wsh=wwb.getSheet(0); // 0 means Sheet1
	System.out.println(nouc);
	// Set Date and time to result
	Date d=new Date();
	SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
	String cname=df.format(d);
	Label l=new Label(nouc,0,cname);
	wsh.addCell(l);
	// Data Driven from 2nd row(index is 1)
		for(int i=1;i<nour;i++)
		{
			int x=Integer.parseInt(rsh.getCell(0,i).getContents());
			int y=Integer.parseInt(rsh.getCell(1,i).getContents());
			int z=x+y;
			
			Number n= new Number(2,i,z);
			wsh.addCell((WritableCell) n);
		}
		
	wwb.write();
	rwb.close();
	wwb.close();


}
}







