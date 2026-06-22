package com.stano.springapp.application_contracts.person;

import java.time.LocalDate;
import java.util.UUID;

public record PersonResponse(UUID id, String name, LocalDate birthDate, String address) {}
