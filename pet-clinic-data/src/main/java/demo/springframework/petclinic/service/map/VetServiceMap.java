package demo.springframework.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.springframework.petclinic.model.Vet;
import demo.springframework.petclinic.service.SpecialityService;
import demo.springframework.petclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet item) {
        if (item == null) {
            return null;
        }
        if (item.getSpecialities() != null) {
            item.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    speciality.setId(specialityService.save(speciality).getId());
                }
            });
        }
        return super.save(item);
    }

    @Override
    public void delete(Vet item) {
        super.delete(item);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
