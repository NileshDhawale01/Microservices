package com.nsd.service_one.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsd.service_one.config.ServiceTwoConncet;

@RestController
@RequestMapping("/serviceOne")
public class ServiceOneController {

	@Autowired
	ServiceTwoConncet serviceTwoConncet;

	@GetMapping("/serviceOneTestOne")
	public ResponseEntity<Map<String, Object>> serviceTwoTestOne() {

		Map<String, Object> map = new HashMap<>();
		map.put("data", "this data come from service One test one");
		map.put("success", true);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping("/serverOneTestTwo")
	public ResponseEntity<Map<String, Object>> getData() {

		Map<String, Object> map = new HashMap<>();
		map.put("This is get from service one", "this response contain another service data.");
		map.put("Service Two Call", serviceTwoConncet.serviceTwoTestOne().getBody());
		map.put("success", true);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
}
