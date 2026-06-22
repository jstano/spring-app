package com.stano.springapp.application_services.person;

import com.stano.springapp.application_contracts.person.PersonCrudService;
import com.stano.springapp.application_contracts.person.PersonResponse;
import com.stano.springapp.domain.person.PersonId;
import com.stano.springapp.domain.person.PersonRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonCrudServiceImpl implements PersonCrudService {
  private final PersonRepository personRepository;
  private final PersonResponseMapper personResponseMapper;

  public PersonCrudServiceImpl(
      PersonRepository personRepository, PersonResponseMapper personResponseMapper) {
    this.personRepository = personRepository;
    this.personResponseMapper = personResponseMapper;
  }

  @Transactional(readOnly = true)
  @Override
  public PersonResponse getPerson(UUID id) {
    return personResponseMapper.toResponse(personRepository.get(new PersonId(id)));
  }

  @Transactional(readOnly = true)
  @Override
  public List<PersonResponse> getPeople() {
    return personRepository.findAll().stream().map(personResponseMapper::toResponse).toList();
  }
}
