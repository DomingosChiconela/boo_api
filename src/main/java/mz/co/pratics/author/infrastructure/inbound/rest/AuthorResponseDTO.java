package mz.co.pratics.author.infrastructure.inbound.rest;

import java.time.Instant;
import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public record  AuthorResponseDTO (

    String  id,
    String  firstName,

    String lastName, 

    String biography, 

    LocalDate birthDate, 

    String nationality, 

    String email,

    Instant createdAt,
    Instant updatedAt



)





  
    
    {}
