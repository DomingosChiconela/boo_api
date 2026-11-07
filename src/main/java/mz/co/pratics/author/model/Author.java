package mz.co.pratics.author.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name ="authors")
public class Author  extends PanacheEntityBase{

    @Id 
    private  String id;

    @Column(name = "first_name")
    private  String  firstName;

    @Column(name = "last_name")
    private  String  lastName;

    private  String  biography;

    @Column(name = "birth_date")
    private  LocalDate  birthDate;

    @Column(name = "nationality")
    private  String   nationality;

    private  String    email;

    @Column(name = "created_at")
    private  LocalDateTime createdAt;

    @Column(name = "updated_at")
    private   LocalDateTime updatedAt;


 


}
