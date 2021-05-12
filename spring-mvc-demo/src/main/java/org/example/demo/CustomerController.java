package org.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("/customers")
	public String getCustomer()
	{
		return "hello-customer";
	}
}
