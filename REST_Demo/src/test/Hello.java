package test;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello { 

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML()
	{
		String resource = "<?xml version='1.0'?>"+
		"<hello> Hiii Rahul Dubey <hello>";
		
		return resource;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML()
	{
		String resource = "<h2>"+
		" Hiii Rahul Dubey HTML </h2>";
		
		return resource;
	}
	
	
}
