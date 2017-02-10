package io.github.kjrg.orders.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.github.kjrg.orders.model.Country;

/**
 * Repository for {@link Country} class.
 * 
 * @author Kris
 */
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}
