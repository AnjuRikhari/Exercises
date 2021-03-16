package com.example.springdata.associations.bidirectional;

import org.springframework.data.repository.CrudRepository;

public interface BidirectionalRepository extends CrudRepository<BidirectionalAuthor, Integer> {
}
