package com.stano.springapp.application_services.person;

import com.stano.domain_jpa.id.EntityId;
import com.stano.springapp.application_contracts.person.PersonResponse;
import com.stano.springapp.domain.person.Person;
import java.util.UUID;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonResponseMapper {
  PersonResponse toResponse(Person person);

  default UUID map(EntityId id) {
    return id == null ? null : id.value();
  }
}
