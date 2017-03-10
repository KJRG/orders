package io.github.kjrg.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import io.github.kjrg.orders.dto.CountryDto;
import io.github.kjrg.orders.mapper.CountryMapper;
import io.github.kjrg.orders.model.Country;
import io.github.kjrg.orders.service.CountryService;

/**
 * Controller for {@link Country} data.
 * 
 * @author Kris
 */
@Controller
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@Autowired
	private CountryMapper countryMapper;
	
	@RequestMapping(value = "")
	public ModelAndView list() {
		List<CountryDto> countries = countryMapper.map2Dto(countryService.findAllCountries());
		return new ModelAndView("countries", "countries", countries);
	}
	
}
