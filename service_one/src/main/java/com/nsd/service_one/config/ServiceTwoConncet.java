package com.nsd.service_one.config;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("SERVICETWO")
public interface ServiceTwoConncet {

	@GetMapping("/serviceTwo/serviceTwoTestOne")
	public ResponseEntity<Map<String, Object>> serviceTwoTestOne();
}
