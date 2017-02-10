package io.github.kjrg.orders.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.kjrg.orders.model.Country;
import io.github.kjrg.orders.repository.CountryRepository;
import io.github.kjrg.orders.service.CountryService;

/**
 * {@link CountryService} implementation.
 *
 * @author Kris
 */
@Transactional
@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> findAllCountries() {
		return StreamSupport.stream(countryRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
