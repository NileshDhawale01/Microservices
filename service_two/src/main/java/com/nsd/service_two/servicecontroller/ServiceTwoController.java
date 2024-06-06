package com.nsd.service_two.servicecontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceTwo")
public class ServiceTwoController {

	@GetMapping("/serviceTwoTestOne")
	public ResponseEntity<Map<String, Object>> serviceTwoTestOne() {

		Map<String, Object> map = new HashMap<>();
		map.put("data service two", "this data come from service two test one");
		map.put("success", true);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

}
