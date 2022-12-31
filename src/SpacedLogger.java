
public class SpacedLogger implements Logger{

  	
	@Override
	public void log(String log) {
		
		// TODO Auto-generated method stub
	    log = String.join(" ", log.split(""));
		System.out.println(log);
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		error = String.join(" ", error.split(""));
		System.out.println("ERROR: "+error);
	}

}
