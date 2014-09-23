package be.stijn.intranet.controller;

import org.springframework.stereotype.Controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


@Controller
public class WebservicetestController {
	
	public static void main(String[] args) {
		Client client = Client.create();
		
		WebResource webResource = client.resource("http://localhost:8080/intranet/rest/json/outputs/get");
		
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		
		
		
	}
}
