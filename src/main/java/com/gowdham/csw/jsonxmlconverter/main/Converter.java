package com.gowdham.csw.jsonxmlconverter.main;

import com.gowdham.csw.jsonxmlconverter.converter.factory.ConverterFactory;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

/**
 * Application starter.
 * Run as standalone java application using CLI (Instructions in README.txt).
 * @author gowdhamraj.ramaraj
 */
@Command(name = "ConverterApp")
public class Converter implements Runnable
{
	@Parameters(index = "0", description = "Path to the input JSON file.")
	private String myInputJsonPath;

	@Parameters(index = "1", description = "Path to the output XML file.")
	private String myOutputXmlPath;

	public static void main(String[] args)
	{
		CommandLine.run(new Converter(), args);
		System.exit(0);
	}

	@Override
	public void run()
	{
		ConverterFactory.getConverter().createXMLJSONConverter(myInputJsonPath, myOutputXmlPath);
	}
}
