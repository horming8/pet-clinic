package demo.springframework.petclinic.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import demo.springframework.petclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected final Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T item) {
        if (item == null) {
            return item;
        }

        item.setId(getNextId());
        map.put(item.getId(), item);
        return item;
    }

    void delete(T item) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(item));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        if (map.isEmpty()) {
            return 1L;
        }
        return Collections.max(map.keySet()) + 1;
    }
}
