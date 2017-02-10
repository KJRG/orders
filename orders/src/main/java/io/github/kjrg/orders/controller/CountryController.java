package io.github.kjrg.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.kjrg.orders.dto.CountryDto;
import io.github.kjrg.orders.mapper.CountryMapper;
import io.github.kjrg.orders.model.Country;
import io.github.kjrg.orders.service.CountryService;

/**
 * Controller for {@link Country} data.
 * 
 * @author Kris
 */
@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@Autowired
	private CountryMapper countryMapper;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<CountryDto> getAllCountries() {
		return countryMapper.map2Dto(countryService.findAllCountries());
	}
}
