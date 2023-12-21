package com.learn2code.vehicle.api.search.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn2code.vehicle.api.search.entity.ManufactureYear;



public interface ManufactureYearDAO  extends JpaRepository<ManufactureYear, Integer>{

}
