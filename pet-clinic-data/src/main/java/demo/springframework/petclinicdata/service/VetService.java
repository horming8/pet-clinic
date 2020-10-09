package demo.springframework.petclinicdata.service;

import java.util.Set;

import demo.springframework.petclinicdata.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
