package demo.springframework.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.springframework.petclinic.model.PetType;
import demo.springframework.petclinic.service.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType item) {
        return super.save(item);
    }

    @Override
    public void delete(PetType item) {
        super.delete(item);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
