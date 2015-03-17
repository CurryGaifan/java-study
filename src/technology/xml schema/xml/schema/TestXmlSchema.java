package xml.schema;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class TestXmlSchema {
	public static void main(String[] args) throws IOException, SAXException,
			ParserConfigurationException {


		String xmlFile = "test.xml";
		String xsdFile1 = "./XSD/OIP-OIR.xsd";
		String xsdFile2 = "./XSD/XCAP.xsd";
		String xsdFile3 = "./XSD/24604_cdivn.xsd";
		String xsdFile4 = "./XSD/24604_serv_cap.xsd";
		String xsdFile5 = "./XSD/24604.xsd";
		String xsdFile6 = "./XSD/24611_serv_cap.xsd";
		String xsdFile7 = "./XSD/24611.xsd";
		String xsdFile8 = "./XSD/TIP-TIR R2.xsd";
		String xsdFile9 = "./XSD/CW.xsd";

		// 1. Lookup a factory for the W3C XML Schema language
		SchemaFactory schemaFactory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		// 2. Compile the schema.
		// File schemaLocation = new File(xsdFile);
		// Schema schema = factory.newSchema(schemaLocation);
		
		//<xs:include schemaLocation="common/client/ClientType.xsd"/>
//		<xs:schema xmlns:ss="http://uri.etsi.org/ngn/params/xml/simservs/xcap" xmlns:xs="http://www.w3.org/2001/XMLSchema" targetNamespace="http://uri.etsi.org/ngn/params/xml/simservs/xcap" elementFormDefault="qualified" attributeFormDefault="unqualified">
		String W3C_XSD_TOP_ELEMENT =
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
			   + "<xs:schema xmlns:ss=\"http://uri.etsi.org/ngn/params/xml/simservs/xcap\" " 
			   + "xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" " 
			   + "targetNamespace=\"http://uri.etsi.org/ngn/params/xml/simservs/xcap\" "
			   + "elementFormDefault=\"qualified\" " 
			   + "attributeFormDefault=\"unqualified\">\n"
			   + "<xs:include schemaLocation=\"" + xsdFile1 +"\"/>\n"
//			   + "<xs:include schemaLocation=\"" + xsdFile2 +"\"/>\n"
//			   + "<xs:include schemaLocation=\"" + xsdFile3 +"\"/>\n"
			   + "<xs:include schemaLocation=\"" + xsdFile4 +"\"/>\n"
			   + "<xs:include schemaLocation=\"" + xsdFile5 +"\"/>\n"
			   + "<xs:include schemaLocation=\"" + xsdFile6 +"\"/>\n"
			   + "<xs:include schemaLocation=\"" + xsdFile7 +"\"/>\n"
			   + "<xs:include schemaLocation=\"" + xsdFile8 +"\"/>\n"
			   + "<xs:include schemaLocation=\"" + xsdFile9 +"\"/>\n"
			   +"</xs:schema>";
		System.out.println(W3C_XSD_TOP_ELEMENT);
		Schema schema = schemaFactory.newSchema(new StreamSource(new StringReader(W3C_XSD_TOP_ELEMENT), "xsdTop"));
//		Schema schema = factory.newSchema(sources);
		
		// 3. Get a validator from the schema.
		Validator validator = schema.newValidator();

		// 4. Parse the document you want to check.
		Source source = new StreamSource(xmlFile);

		// 5. Check the document
		try {
			validator.validate(source);
			System.out.println(xmlFile + " is valid.");

		} catch (SAXException ex) {
			System.out.println(xmlFile + " is not valid because ");
			System.out.println(ex.getMessage());
		}

	}
}