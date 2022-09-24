package com.ginszt.calc.module.calc;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "calculate", path = "calculate")
public interface CalculateRepository extends PagingAndSortingRepository<Calculate, Long> {

}
