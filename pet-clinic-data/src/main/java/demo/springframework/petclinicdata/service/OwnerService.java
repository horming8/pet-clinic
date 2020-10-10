package demo.springframework.petclinicdata.service;

import demo.springframework.petclinicdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
