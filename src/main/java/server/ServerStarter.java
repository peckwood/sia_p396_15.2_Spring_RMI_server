package server;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServerConfig.class);
		System.out.println("Server started");
	}
}
