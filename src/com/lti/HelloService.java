package com.lti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;



@Path("/hello")
public class HelloService {
	
	
	@GET
	@Path("/{year}/{month}/{day}")
	public Response getDate(@PathParam("year") int year , @PathParam("month") int month ,@PathParam("day") int day) {
		String date=year+"/"+month+"/"+day;
		return Response.status(200).entity("Year/Month/Day : "+date).build();
		
	}

}
