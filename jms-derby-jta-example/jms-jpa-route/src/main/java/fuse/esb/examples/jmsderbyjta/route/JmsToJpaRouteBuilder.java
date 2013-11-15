package fuse.esb.examples.jmsderbyjta.route;

import org.apache.camel.builder.RouteBuilder;


public class JmsToJpaRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		
		from("file:jms-in").to("jpa:user");
		
	}

	
}
