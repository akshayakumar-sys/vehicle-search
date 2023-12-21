package com.learn2code.vehicle.api.search.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="manufacture")
@Data
@NoArgsConstructor

public class manufacture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="manufacturer_name")
	private String manufacturerName;
	@Column(name="country_of_origin")
	private String countryOfOrigin;
}
