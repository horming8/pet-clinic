package demo.springframework.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.springframework.petclinic.model.Owner;
import demo.springframework.petclinic.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

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
        return super.save(item);
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
