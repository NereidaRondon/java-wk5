//Create two classes that implement the Logger interface

public class AsteriskLogger implements Logger{

	// The log method prints out the String it receives between 3 asterisks on either side of the String 
	@Override
	public void log(String log) {	
		System.out.println("***"+log+"***");
	}

	
	// The error method prints the String inside a box of asterisks, with the String preceded by the word “ERROR:”
	@Override
	public void error(String error) {
		System.out.println("******************************"+"\n"+"***Error: "+ error +"***"+"\n"+"******************************");	
	}
}
