package com.company.repository;

import com.company.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien, Integer> {
}
