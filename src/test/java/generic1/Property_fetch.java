package generic1;

import java.io.FileInputStream;
import java.util.Properties;

import org.codehaus.groovy.classgen.ReturnAdder;

public class Property_fetch 
{
	

	public static String fetch_data(char[] e)
	{
		String value=null;
		try
		{
			Properties p=new Properties();
			p.load(new FileInputStream(".\\src\\test\\java\\utilize\\p.property_fetch"));
			String baseurl = null;
			value=p.getProperty(baseurl);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return value;
		
		
	}
	

}
