package demo.springframework.petclinicdata.service;

import java.util.Set;

import demo.springframework.petclinicdata.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
