package com.example.springdata.associations.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface ManyToManyRepository extends CrudRepository<AuthorManyToMany,Integer> {
}
