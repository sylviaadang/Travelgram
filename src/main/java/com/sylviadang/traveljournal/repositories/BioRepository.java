package com.sylviadang.traveljournal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sylviadang.traveljournal.models.Bio;

public interface BioRepository extends CrudRepository<Bio, Long>{
	List<Bio> findAll();


}
