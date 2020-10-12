package demo.springframework.petclinic.service;

import demo.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
