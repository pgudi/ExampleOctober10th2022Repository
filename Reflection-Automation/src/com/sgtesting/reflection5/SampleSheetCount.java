package com.sgtesting.reflection5;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleSheetCount {

	public static void main(String[] args) {
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		try
		{
			fin=new FileInputStream(".\\DataFile\\data_Runner.xlsx");
			wb=new XSSFWorkbook(fin);
			int sc=wb.getNumberOfSheets();
			for(int i=0;i<sc;i++)
			{
				String name=wb.getSheetName(i);
				System.out.println(name);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
