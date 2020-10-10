package demo.springframework.petclinicdata.service.map;

import java.util.Set;

import demo.springframework.petclinicdata.model.Owner;
import demo.springframework.petclinicdata.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner item) {
        return super.save(item.getId(), item);
    }

    @Override
    public void delete(Owner item) {
        super.delete(item);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
