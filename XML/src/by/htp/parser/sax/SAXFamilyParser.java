package by.htp.parser.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SAXFamilyParser {

	public static void main(String[] args) {
		try {
			parseFamilyXML();
		} catch (FamilyParseException e) {
			e.printStackTrace();
		}
	}

	public static void parseFamilyXML() throws FamilyParseException {

		try {
			// XMLReader reader = XMLReaderFactory.createXMLReader("");

			SAXParserFactory parserFactory = SAXParserFactory.newInstance();
			SAXParser parser = parserFactory.newSAXParser();
			XMLReader reader = parser.getXMLReader();

			reader.setContentHandler(null);
			FamilyDefauldHandler hdltr = new FamilyDefauldHandler();
			parser.parse("resources/family.xml", hdltr);
			
			System.out.println(hdltr.getFamily());
			
			
			
			
		} catch (SAXException | ParserConfigurationException | IOException e) {
			throw new FamilyParseException("some problem during SAX parser", e);

		}
	}
}
