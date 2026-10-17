package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.SmartIrrigationZone;
import com.klef.soa.exam.service.SmartIrrigationZoneService;

@RestController
@RequestMapping("/SmartIrrigationZone")
public class SmartIrrigationZoneController {
	@Autowired
	private SmartIrrigationZoneService service;
	
	@GetMapping("/")
	public String testservice() {
		return "CURD Service is running";
	}
	@PostMapping("/add")
	public ResponseEntity<SmartIrrigationZone> add(@RequestBody SmartIrrigationZone s) {
		return new ResponseEntity<>(service.add(s),HttpStatus.CREATED);
	}
	@GetMapping("/displayall")
	public ResponseEntity<List<SmartIrrigationZone>> displayall() {
		return ResponseEntity.ok(service.displayAll());
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		return ResponseEntity.ok(service.deleteById(id));
	}
	@Value("${server.port}")
	private String port;
	@GetMapping("/instance")
	public String Instance() {
		return "Server is running on:"+port;
	}

}
