package demo.springframework.petclinicdata.service.map;

import java.util.Set;

import demo.springframework.petclinicdata.model.Vet;
import demo.springframework.petclinicdata.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

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
        return super.save(item.getId(), item);
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
