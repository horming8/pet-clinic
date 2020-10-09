package demo.springframework.petclinicdata.service;

import java.util.Set;

import demo.springframework.petclinicdata.model.Pet;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
