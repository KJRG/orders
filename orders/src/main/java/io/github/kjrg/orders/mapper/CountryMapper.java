package io.github.kjrg.orders.mapper;

import org.springframework.stereotype.Component;

import io.github.kjrg.orders.dto.CountryDto;
import io.github.kjrg.orders.model.Country;

/**
 * Perform mapping between {@link Country} and {@link CountryDto}.
 *
 * @author Kris
 */
@Component
public class CountryMapper extends AbstractMapper<Country, CountryDto> {

	@Override
	public Country map2Entity(CountryDto dto) {
		return new Country(dto.getName(), dto.getIsoCode());
	}

	@Override
	public CountryDto map2Dto(Country entity) {
		return new CountryDto(entity.getId(), entity.getName(), entity.getIsoCode());
	}
}
