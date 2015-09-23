import java.io.IOException;

import nu.xom.Builder;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class XMLBrowse {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParsingException 
	 * @throws ValidityException 
	 */
	public static void main(String[] args) throws ValidityException, ParsingException, IOException 
	{
		String strXMLFile = "XMLTEST.XML";//"WEBDAV-test_env.xml";//"fibonacci.xml";//"XMLTEST.XML";
					
		Builder XMLBuilder = new Builder();
		
		XMLBuilder.build(strXMLFile);

		System.out.println(XMLBuilder.getNodeFactory());
		
		
		
	
	}

}
