package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

public interface iSpecimenService {

	SpecimenDTO fetchById(int id);

	void save(SpecimenDTO specimenDTO);

}