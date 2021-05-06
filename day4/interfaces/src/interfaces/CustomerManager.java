package interfaces;

public class CustomerManager {
	
	/*private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}*/
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	// loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi: " + customer.getFirstName());
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veritabanına loglandı");*/
		
		//this.logger.log(customer.getFirstName());
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi: " + customer.getFirstName());
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veritabanına loglandı");*/
		
		//this.logger.log(customer.getFirstName());
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
