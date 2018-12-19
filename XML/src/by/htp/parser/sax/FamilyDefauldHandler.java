package by.htp.parser.sax;

import org.xml.sax.Attributes;
import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.xml.entity.Family;
import by.htp.xml.entity.Father;
import by.htp.xml.entity.Mother;

public class FamilyDefauldHandler extends DefaultHandler {

	private Family family;
	private Mother mother;
	private String textValue;
	private Father father;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("start");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("end");

	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		textValue = new String(ch, start, length).trim();

		// intValue = new int(ch,start,length);

		// TODO Auto-generated method stub
		// super.characters(ch, start, length);

		// System.out.println("----------------------");
		// System.out.println(new String(ch, start, length));

		// System.out.println("***********************");

		// System.out.println("ch");
		// System.out.println(start+ " , "+ length);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		// super.endElement(uri, localName, qName);
		switch (qName) {
		case "family":

			break;
		case "mother":
			family.setMother(mother);
			break;
		case "maiden_name":
			mother.setMaidName(textValue);
			break;
		case "name":
			mother.setName(textValue);
			break;
		case "surname":
			mother.setSurname(textValue);
			break;
		case "father":
			family.setFather(father);
		case "age":
		int age = Integer.parseInt(textValue);
			mother.setAge(age);
		break;
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		// super.startElement(uri, localName, qName, attributes);

		/*
		 * System.out.println("uri" + uri); System.out.println(localName);
		 * System.out.println(qName); System.out.println(attributes);
		 * 
		 * System.out.println(attributes.getQName(0));
		 */

		switch (qName) {
		case "family":
			family = new Family();
			family.setAdress(attributes.getValue("adress"));

			break;
		case "mother":
			mother = new Mother();

			break;
		case "maiden_name":
			// mother.setMaidName(qName);
			break;
		case "name":
			// mother.setName(qName);
			break;
		case "surname":
			break;
		case "age":
			break;

		case "father":
			father = new Father();

			
		}

	}

	public Family getFamily() {
		return family;
	}

}
