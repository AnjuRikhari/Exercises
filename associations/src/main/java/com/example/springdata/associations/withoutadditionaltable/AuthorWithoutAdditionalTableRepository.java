package com.example.springdata.associations.withoutadditionaltable;

import org.springframework.data.repository.CrudRepository;

public interface AuthorWithoutAdditionalTableRepository extends CrudRepository<AuthorWithoutAdditionalTable, Integer> {
}
