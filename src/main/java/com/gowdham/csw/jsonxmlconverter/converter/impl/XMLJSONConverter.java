package com.gowdham.csw.jsonxmlconverter.converter.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

import com.gowdham.csw.jsonxmlconverter.converter.service.XMLJSONConverterI;

/**
 * Implementation of {@link XMLJSONConverterI} service.
 * Reads the input JSON file and converts into XML.
 * Create a new output XML file if one is not already present.
 * @author gowdhamraj.ramaraj
 */
public class XMLJSONConverter implements XMLJSONConverterI
{
	@Override
	public void createXMLJSONConverter(String inputJsonPath, String outputXmlPath)
	{
		JSONObject jsonObject = readJsonData(inputJsonPath);
		File outputXml = createFile(outputXmlPath);
		convertAndWriteToFile(jsonObject, outputXml);
	}

	private JSONObject readJsonData(String jsonPath)
	{
		System.out.println("\nReading JSON data from the location: " + jsonPath);
		String jsonData = "";
		try
		{
			jsonData = new String(Files.readAllBytes(Paths.get(jsonPath)));
		} catch (IOException e)
		{
			System.out.println("Exception during reading json file. Make sure the file exists and is valid.");
			e.getMessage();
		}
		return new JSONObject(jsonData);
	}

	private File createFile(String xmlPath)
	{
		File outputXml = new File(xmlPath);
		try 
		{
			if (outputXml.createNewFile())
			{
				System.out.println("Output XML file doesn't exists, creating new file in the location: " + xmlPath);
			}
			else
			{
				System.out.println("Output XML file already exists, writing to it in the location: " + xmlPath);
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Exception during creating new XML file.");
			e.getMessage();
		}
		return outputXml;
	}

	private void convertAndWriteToFile(JSONObject jsonObject, File outputXml)
	{
		System.out.println("Converting JSON to XML.");
		String xmlData = new StringBuilder().append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
				.append(XML.toString(jsonObject, "object")).toString();

		try (FileWriter fileWriter = new FileWriter(outputXml);)
		{
			fileWriter.write(xmlData);
			System.out.println("XML data written to file successfully.");
		}
		catch (IOException e)
		{
			System.out.println("Exception during writing to output file.");
			e.getMessage();
		}
	}
}
