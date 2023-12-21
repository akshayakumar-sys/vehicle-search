package com.learn2code.vehicle.api.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn2code.vehicle.api.search.DAO.ManufactoreDAO;
import com.learn2code.vehicle.api.search.entity.manufacture;
import com.learn2code.vehicle.api.search.service.ManufacturerService;

@Service
public class ManufactureServiceImpl implements ManufacturerService{
@Autowired
	private ManufactoreDAO manufactureDAO; 
	@Override
	public manufacture saveManufacturer(manufacture manufacture)
	{
		return manufactureDAO.save(manufacture);
	}
}
