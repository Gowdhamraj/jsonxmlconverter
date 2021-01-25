package com.gowdham.csw.jsonxmlconverter.converter.factory;

import com.gowdham.csw.jsonxmlconverter.converter.impl.XMLJSONConverter;
import com.gowdham.csw.jsonxmlconverter.converter.service.XMLJSONConverterI;

/**
 * Factory class that produces XMLJSON Converter
 * @author gowdhamraj.ramaraj
 */
public class ConverterFactory
{
	/**
	 * Gives converter to convert JSON to XML.
	 * @return {@link XMLJSONConverterI}
	 */
	public static XMLJSONConverterI getConverter()
	{
		return new XMLJSONConverter();
	}
}
