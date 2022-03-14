package com.jrp.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloController {

	/*
	 * @RequestMapping(value="/basic",method=RequestMethod.GET) public String
	 * sayHello() { return "Hello world using springboot application"; }
	 */
	
	

	  @RequestMapping("/basic")
	  public String sayHelloBasic() 
	 { 
	   return "Hello world using springboot application pushing with code changes";
	  }
	
	
	
	// IN value if u did  not pass any thing also its working
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String sayHello()
	{
		return "<h1>Hello world using springboot application</h1>";
	}
	
	@RequestMapping(value="/proper",method=RequestMethod.GET)
	public String sayProper()
	{
		return "hello this is world proper programimg";
	}
	// POST method
	@RequestMapping("/User_Entry")
	public String UserForm()
	{
		return "<form action=\"/greetings/user_greetings\"   method=\"POST\">\r\n"
				+ "  <label for=\"fname\">First name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"fname\" ><br>\r\n"
				+ "  <label for=\"lname\">Last name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lname\" ><br><br>\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n"
				+ "</form>";
		
	}
	
	@RequestMapping(value="/user_greetings",method=RequestMethod.POST)
	public String printUserGreeting(@RequestParam String fname, @RequestParam String lname)
	{
	   return "Form submitted Successfully"+"first Name-->"+fname+"LastName----->"+ lname;	
	}
	// instead of the Post if use the GET method form details like first and last name show in the  URL
	// POST METHOD it wont show but GET method it will show
	
	// GET METHOD
	
	@RequestMapping("/User_Entry_Get")
	public String UserFormS()
	{
		return "<form action=\"/greetings/user_greetings_get\"   method=\"GET\">\r\n"
				+ "  <label for=\"fname\">First name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"fname\" ><br>\r\n"
				+ "  <label for=\"lname\">Last name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lname\" ><br><br>\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n"
				+ "</form>";
		
	}
	
	@RequestMapping(value="/user_greetings_get",method=RequestMethod.GET)
	public String printUserGreetingS(@RequestParam String fname, @RequestParam String lname)
	{
	   return "Form submitted Successfully"+"first Name-->"+fname+"LastName----->"+ lname;	
	}
	
	@RequestMapping(value="/orders/{id}",method=RequestMethod.GET)
	public String getOrder(@PathVariable String id)
	{
		return "Order_id===>"+id;
	}
	
	
}
