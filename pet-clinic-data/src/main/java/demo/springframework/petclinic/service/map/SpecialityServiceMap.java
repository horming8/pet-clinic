package demo.springframework.petclinic.service.map;

import java.util.Set;

import demo.springframework.petclinic.model.Speciality;
import demo.springframework.petclinic.service.SpecialityService;

public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality item) {
        return super.save(item);
    }

    @Override
    public void delete(Speciality item) {
        super.delete(item);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
