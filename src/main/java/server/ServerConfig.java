package server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class ServerConfig {
	@Bean
	public Calculator calculator(){
		return new CalculatorImpl();
	}
	
	@Bean
	public RmiServiceExporter rmiExporter(Calculator calculator){
		RmiServiceExporter rmiExporter = new RmiServiceExporter();
		rmiExporter.setService(calculator);
		/*rmi://host:port/calculator_service*/		
		rmiExporter.setServiceName("calculator_service");
		rmiExporter.setServiceInterface(Calculator.class);
		return rmiExporter;
	}
}
