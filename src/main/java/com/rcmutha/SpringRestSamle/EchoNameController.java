package com.rcmutha.SpringRestSamle;

import java.util.Map;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoNameController {

	@GetMapping(value="/echo/{name}/{location}")
	public User echoName(@PathVariable String name, @PathVariable String location,@RequestParam("age") int age,@PathVariable Map<String, String> varsMap ) {
		System.out.println(varsMap.keySet());
		return new User(name, location, age);
	}
	
	@GetMapping(value="/reqParam")
	public User echoName(@RequestParam MultiValueMap<String, String> params) {
		System.out.println(params.toString());
		return new User("test", "test", 32);
	}
	
}
