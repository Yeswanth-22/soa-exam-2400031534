package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.SmartIrrigationZone;

public interface SmartIrrigationZoneService {
	SmartIrrigationZone add(SmartIrrigationZone s);
	List<SmartIrrigationZone> displayAll();
	String deleteById(Long id);
}
