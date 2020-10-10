package demo.springframework.petclinicdata.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected final Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T item) {
        return map.put(id, item);
    }

    void delete(T item) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(item));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

}
