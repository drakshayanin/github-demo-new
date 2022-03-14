package com.jrp.demo.web;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {

	// @PathVariable example
	
	@RequestMapping("/{UserId}")
	public String displayUser(@PathVariable int UserId)
	{
		return "User Found:"+UserId;
		
	}
	
	// path variable you can do like this also
	
	@RequestMapping("/{id}/{ids}")
	public String displayUsersNumber(@PathVariable("id") String id, @PathVariable("ids") String ids)
	{
		return "Users number: " +id+"   and  "+ ids;
	}
	
	// http://localhost:8080/user/12/Invoices?date=12/03/2022
	// through query parameter to assign to RequestParameter
	@RequestMapping("/{userId}/Invoices")
	public String displayUserInvoices(@PathVariable int userId,@RequestParam Date  date)
	{
		return "User id is:"+ userId +"on the date is"+ date;
	}
	
	// in the above example how to make the  date field is optional
	
	@RequestMapping("/invoices")
	public String dispalyUserDate(@RequestParam(value="d" ,required=false) Date dateOrNull)
	{
		return "date filed is optional display default date  :"+ dateOrNull;
	}
	
	
	
	
	
	
}
