package com.opentext.common.output;

public class OutputHelper {
	
	GenerateOutput generateOutput;
	public OutputHelper(GenerateOutput generateOutput)
	{
		this.generateOutput=generateOutput;
	}

	public void generateOutput()
	{
		generateOutput.generateOutput();
	}
}
