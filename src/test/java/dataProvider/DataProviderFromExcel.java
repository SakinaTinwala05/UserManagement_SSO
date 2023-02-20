package dataProvider;

import java.io.File;

import org.testng.annotations.DataProvider;

import constants.GlobalConstants;
import dataprovider.ExcelDataprovider;

public class DataProviderFromExcel {
	public static String FILE_PATH = GlobalConstants.test_resourceDir + GlobalConstants.dataDirName + File.separator
			+ "datalog.xlsx";

	@DataProvider(name = "createDept")
	public static Object[][] createDept() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "createDept");
	}

	@DataProvider(name = "editDept")
	public static Object[][] editDept() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "editDept");
	}

	@DataProvider(name = "deleteDept")
	public static Object[][] deleteDept() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "deleteDept");
	}

	@DataProvider(name = "createRole")
	public static Object[][] addRole() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "createRole");
	}

	@DataProvider(name = "editRole")
	public static Object[][] editRole() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "editRole");
	}

	@DataProvider(name = "deleteRole")
	public static Object[][] deleteRole() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "deleteRole");
	}
	
	@DataProvider(name = "createGroup")
	public static Object[][] addGroup() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "createGroup");
	}

	@DataProvider(name = "editGroup")
	public static Object[][] editGroup() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "editGroup");
	}

	@DataProvider(name = "deleteGroup")
	public static Object[][] deleteGroup() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "deleteGroup");
	}
	
	@DataProvider(name = "bulkDeleteGroup")
	public static Object[][] bulkDeleteGroup() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "bulkDeleteGroup");
	}
	
	@DataProvider(name = "createUser")
	public static Object[][] createUser() {
		return ExcelDataprovider.readExcelFileTo2D(FILE_PATH, "createUser");
	}
}
