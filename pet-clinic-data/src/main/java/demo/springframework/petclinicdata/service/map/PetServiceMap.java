package demo.springframework.petclinicdata.service.map;

import java.util.Set;

import demo.springframework.petclinicdata.model.Pet;
import demo.springframework.petclinicdata.service.PetService;

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
        return super.save(item.getId(), item);
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
