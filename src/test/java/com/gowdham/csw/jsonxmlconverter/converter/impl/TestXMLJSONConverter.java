package com.gowdham.csw.jsonxmlconverter.converter.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.gowdham.csw.jsonxmlconverter.converter.factory.ConverterFactory;
import com.gowdham.csw.jsonxmlconverter.converter.service.XMLJSONConverterI;

/**
 * Test class for {@link XMLJSONConverter}
 * @author gowdhamraj.ramaraj
 */
public class TestXMLJSONConverter
{
	private static final String INPUT_JSON_FILE = "src/test/resources/example.json";
	private static final String OUTPUT_XML_FILE = "src/test/resources/example.xml";

	private XMLJSONConverterI myConverter; 

	@Before
	public void setup()
	{
		myConverter = ConverterFactory.getConverter();
	}

	/**
	 * Given:
	 * 1. Location of input json file
	 * 2. Location of output json file
	 *
	 * When:
	 * The input json is converted to output xml using {@link XMLJSONConverterI} service
	 *
	 * Then:
	 * The xml has to be created in the given output location
	 */
	@Test
	public void testCreateXMLJSONConverterHasCreatedOutput()	
	{
		myConverter.createXMLJSONConverter(INPUT_JSON_FILE, OUTPUT_XML_FILE);
		
		File xmlFile = new File(OUTPUT_XML_FILE);
		assertThat(xmlFile.exists()).isTrue();
	}
}
