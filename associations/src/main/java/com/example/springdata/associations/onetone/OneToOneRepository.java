package com.example.springdata.associations.onetone;

import org.springframework.data.repository.CrudRepository;

public interface OneToOneRepository extends CrudRepository<AuthorOneToOne, Integer> {
}
