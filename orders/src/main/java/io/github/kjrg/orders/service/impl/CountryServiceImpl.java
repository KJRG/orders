package io.github.kjrg.orders.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private final Logger LOG = LoggerFactory.getLogger(CountryServiceImpl.class);
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> findAllCountries() {
		LOG.info("Finding all countries in the database");
		return StreamSupport.stream(countryRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
