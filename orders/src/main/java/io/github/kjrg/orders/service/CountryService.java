package io.github.kjrg.orders.service;

import java.util.List;

import io.github.kjrg.orders.model.Country;

/**
 * Service for managing {@link Country} data.
 *
 * @author Kris
 */
public interface CountryService {

	/**
	 * Find all countries.
	 * 
	 * @return list of countries
	 */
	List<Country> findAllCountries();
}
