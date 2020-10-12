package demo.springframework.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.springframework.petclinic.model.Vet;
import demo.springframework.petclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
