package io.github.kjrg.orders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * A class representing countries.
 * 
 * @author Kris
 */
@Entity
@Data
public class Country {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ISO_CODE")
	private String isoCode;

	/**
	 * Creates a new instance.
	 * 
	 * Default constructor is required by Hibernate.
	 */
	public Country() {
	}
	
	public Country(String name, String isoCode) {
		this.name = name;
		this.isoCode = isoCode;
	}
}
