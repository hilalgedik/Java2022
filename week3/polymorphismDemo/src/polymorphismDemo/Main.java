package polymorphismDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
  //  EmailLogger logger = new EmailLogger();
   // logger.Log("Log Mesaji");
		
		//BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new EmailLogger(),new FileLogger(),new ConsoleLogger()};
	//	for (BaseLogger logger:loggers) {
	//		logger.Log("Log mesaji"); 
		
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
			
		}



	}


