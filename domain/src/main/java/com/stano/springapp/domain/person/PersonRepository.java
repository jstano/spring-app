package com.stano.springapp.domain.person;

import com.stano.domain_jpa.repository.EntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends EntityRepository<Person, PersonId> {}
