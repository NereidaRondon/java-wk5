// The SpacedLogger adds spaces between each character of the String argument passed into its methods.

public class SpacedLogger implements Logger{

	//In order to add the spaces between the letters of the string, first the string is split into the individual letters using .split
	//Then put back together with a space using String.join
	
	@Override
	public void log(String log) {
		
	    log = String.join(" ", log.split(""));
		System.out.println(log);
		
	}

	
	@Override
	public void error(String error) {
		
		error = String.join(" ", error.split(""));
		System.out.println("ERROR: "+error);
	}

}
