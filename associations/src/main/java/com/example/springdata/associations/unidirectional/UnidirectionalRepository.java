package com.example.springdata.associations.unidirectional;

import org.springframework.data.repository.CrudRepository;

public interface UnidirectionalRepository extends CrudRepository<UnidirectionalAuthor, Integer> {
}
