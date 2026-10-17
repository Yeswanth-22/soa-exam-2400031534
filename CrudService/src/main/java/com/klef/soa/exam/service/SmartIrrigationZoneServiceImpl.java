package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.SmartIrrigationZone;
import com.klef.soa.exam.repository.SmartIrrigationZoneRepository;

@Service
public class SmartIrrigationZoneServiceImpl implements SmartIrrigationZoneService{
	
	@Autowired
	private SmartIrrigationZoneRepository repo;

	@Override
	public SmartIrrigationZone add(SmartIrrigationZone s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public List<SmartIrrigationZone> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteById(Long id) {
		// TODO Auto-generated method stub
		SmartIrrigationZone s=repo.findById(id).orElse(null);
		repo.delete(s);
		return "sucessfully delete";
	}

}
