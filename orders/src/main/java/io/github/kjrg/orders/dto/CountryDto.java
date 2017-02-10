package io.github.kjrg.orders.dto;

import io.github.kjrg.orders.model.Country;
import lombok.Data;

/**
 * DTO for {@link Country} model class.
 * 
 * @author Kris
 */
@Data
public class CountryDto {

	private Long id;
	private String name;
	private String isoCode;
	
	public CountryDto(Long id, String name, String isoCode) {
		this.id = id;
		this.name = name;
		this.isoCode = isoCode;
	}
}
