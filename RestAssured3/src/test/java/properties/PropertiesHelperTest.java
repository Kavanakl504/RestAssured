package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.log4testng.Logger;


public class PropertiesHelperTest {

	private static final Logger logger=Logger.getLogger(PropertiesHelperTest.class);
	private final Properties configProp = new Properties();
	private final Properties apiEndPoint = new Properties();
	
	private PropertiesHelperTest()
	{
		logger.debug("Read all properties from file");
		try {
			FileInputStream configPropFile= getFileInputStream(System.getProperty("user.dir")+"resources/config/Config.properties");
			if(configPropFile!=null) {
				configProp.load(configPropFile);
			}
			logger.debug("config file has been loaded");
			
			FileInputStream apiEndpoint= getFileInputStream(System.getProperty("user.dir")+"resources/api/EndPoint.properties");
			if(apiEndpoint!=null) {
				configProp.load(configPropFile);
			}
			logger.debug("config file has been loaded");
		}catch(IOException e)
		{
			
			logger.error("PropertiesHelper IOException: "+e.getMessage());
			e.printStackTrace();
			
		}
	}
	
	private static class LazyHolder{
		private static final PropertiesHelperTest INSTANCE = new PropertiesHelperTest();
	}
	public static PropertiesHelperTest getInstance()
	{
		return LazyHolder.INSTANCE;
	}
	public String getConfigproperties(String key) {
		return configProp.getProperty(key);
	}
	
	public String getapiEndPoint(String key) {
		return apiEndPoint.getProperty(key);
	}
	public FileInputStream getFileInputStream(String filepath)
	{
		
		FileInputStream fileInputStream = null;
		try {
			fileInputStream= new FileInputStream(filepath);
		}
		catch(Exception e) {
			logger.error("getFileInputStream() exception msg : "+e.getMessage());
		}
		return fileInputStream;
		
	}
}
