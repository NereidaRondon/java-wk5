
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		
		System.out.println("***"+log+"***");
	}

	@Override
	public void error(String error) {
		
		System.out.println("******************************"+"\n"+"***Error: "+ error +"***"+"\n"+"******************************");
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
