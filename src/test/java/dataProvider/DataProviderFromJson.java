package dataProvider;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

import config.TestConfig;
import constants.GlobalConstants;
import dataprovider.JSONDataprovider;

public class DataProviderFromJson {

	@DataProvider(name = "dataProvider")
	public Iterator<Object[]> getData(Method method) {
		String className = method.getDeclaringClass().getSimpleName();
		String filePath = GlobalConstants.test_resourceDir + GlobalConstants.dataDirName + File.separator + className
				+ File.separator + method.getName() + ".json";
		return JSONDataprovider.getData(filePath, method);
	}

	@DataProvider(name = "adminDataProvider")
	public Object[][] adminDataProvider(Method method) {
		String className = method.getDeclaringClass().getSimpleName();
		String filePath = GlobalConstants.test_resourceDir + GlobalConstants.dataDirName + File.separator + "Admin"
				+ File.separator + TestConfig.getTestConfig().getEnvironment().toLowerCase() + File.separator
				+ className + ".json";
		return JSONDataprovider.getJSONData(filePath, method.getName());
	}
}
