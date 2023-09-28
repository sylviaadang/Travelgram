package com.sylviadang.traveljournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylviadang.traveljournal.models.Bio;
import com.sylviadang.traveljournal.repositories.BioRepository;

@Service
public class BioService {
	@Autowired
	private BioRepository bioRepository;
	
	public Bio create(Bio bio) {
		return bioRepository.save(bio);
	}
	
	public Bio update(Bio bio) {
		return bioRepository.save(bio);
	}
}
