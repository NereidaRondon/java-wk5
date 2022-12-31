// In the App class an instance of each of the logger classes is instantiated
// both interface methods are used in each of the instances

public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
				logger1.log("hello");
		logger1.error("This is an error!");
		
				
		Logger logger2 = new SpacedLogger();
				logger2.log("Bonjour!");
		logger2.error("Akuna Matata");
	}
}
