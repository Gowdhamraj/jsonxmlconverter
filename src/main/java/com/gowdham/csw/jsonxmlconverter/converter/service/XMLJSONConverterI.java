package com.gowdham.csw.jsonxmlconverter.converter.service;

/**
 * Service that converts given JSON to XML
 * @author gowdhamraj.ramaraj
 */
public interface XMLJSONConverterI
{
	/**
	 * Converts given JSON content to XML content.
	 *
	 * @param inputJson JSON file that needs to be converted
	 * @param outputXml XML file that holds the converted content
	 */
	void createXMLJSONConverter(String inputJsonPath, String outputXmlPath);
}
