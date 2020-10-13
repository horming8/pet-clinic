package demo.springframework.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.springframework.petclinic.model.Pet;
import demo.springframework.petclinic.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet item) {
        return super.save(item);
    }

    @Override
    public void delete(Pet item) {
        super.delete(item);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
