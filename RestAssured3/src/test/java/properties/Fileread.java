package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.log4testng.Logger;

public class Fileread {

	
	public static Map<String,String> fileandev= new HashMap<String,String>();
	public static Properties propMain=new Properties();
	private static final Logger logger=Logger.getLogger(Fileread.class);
	public static String Basereader(String str) throws IOException
	{
		logger.debug("Read all properties from file");
		try {
		FileInputStream configPropFile=  new FileInputStream(System.getProperty("user.dir")+"/resources/config/Config.properties");
		if(configPropFile!=null) {
			propMain.load(configPropFile);
			logger.debug("config file has been loaded");
		}
		}
		catch(IOException e)
		{
			logger.error("Fileread IOException: "+e.getMessage());
			e.printStackTrace();
		}
		return propMain.getProperty(str);
	
	}
	public static String EndPointreader(String str) throws IOException
	{
		logger.debug("Read all properties from file");
		try {
		FileInputStream configPropFile=  new FileInputStream(System.getProperty("user.dir")+"/resources/api/EndPoint.properties");
		if(configPropFile!=null) {
			propMain.load(configPropFile);
			logger.debug("config file has been loaded");
		}
		}
		catch(IOException e)
		{
			logger.error("Fileread IOException: "+e.getMessage());
			e.printStackTrace();
		}
		return propMain.getProperty(str);
	}
	
}
