package demo.springframework.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.springframework.petclinic.model.Owner;
import demo.springframework.petclinic.model.Pet;
import demo.springframework.petclinic.service.OwnerService;
import demo.springframework.petclinic.service.PetService;
import demo.springframework.petclinic.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if (item == null) {
            return null;
        }
        // may not be necessary
        if (item.getPets() != null) {
            item.getPets().forEach(pet -> {
                if (pet.getType() == null) {
                    throw new RuntimeException("Pet type required");
                }
                if (pet.getType().getId() == null) {
                    pet.setType(petTypeService.save(pet.getType()));
                }
                if (pet.getId() == null) {
                    pet.setId(petService.save(pet).getId());
                }
            });
        }
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
