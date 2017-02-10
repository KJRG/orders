package io.github.kjrg.orders.mapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Base class for all mapper classes. Mapper classes are used to perform mapping
 * between entities and DTOs.
 * 
 * @author Kris
 *
 * @param <E> entity class
 * @param <D> DTO class
 */
public abstract class AbstractMapper<E, D> {

	public abstract E map2Entity(D dto);
	
	public abstract D map2Dto(E entity);
	
	public List<E> map2Entity(List<D> dtoList) {
		return dtoList.stream().map(d -> map2Entity(d)).collect(Collectors.toList());
	}
	
	public List<D> map2Dto(List<E> entityList) {
		return entityList.stream().map(e -> map2Dto(e)).collect(Collectors.toList());
	}
}
