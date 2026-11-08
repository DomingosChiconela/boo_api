package mz.co.pratics.author.infrastructure.inbound.rest;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public record  AuthorRequestDTO (

    @NotBlank(message = "First name is required")
    @Size(max = 100, message = "First name must not exceed 100 characters")
    String  firstName,

    @NotBlank(message = "Last name is required")
    @Size(max = 100, message = "Last name must not exceed 100 characters")
    String lastName, 

    @NotBlank(message = "First name is required")
    @Size(max = 500, message = "First name must not exceed 100 characters")
    String biography, 

    @PastOrPresent(message = "Birth date must be in the past or present")
    LocalDate birthDate, 

    @Size(max = 100, message = "Nationality must not exceed 100 characters")
    String nationality, 
    @Email(message = "Invalid email address")
    @Size(max = 255, message = "Email must not exceed 255 characters")
    String email)
    {}
