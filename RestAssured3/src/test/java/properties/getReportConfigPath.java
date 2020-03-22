package properties;

import java.util.Properties;

public class getReportConfigPath {
	
	public String getReport()
	{
	final Properties configProp = new Properties();
	String reportConfigPath=configProp.getProperty("reportConfigPath");
	if(reportConfigPath!= null)
		return reportConfigPath;
	else throw new RuntimeException("Report Config path not specified");
	}
	
}
