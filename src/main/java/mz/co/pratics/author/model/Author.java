package mz.co.pratics.author.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import mz.co.pratics.common.persistence.GeneratedUlid;

@Entity 
@Table(name ="authors")
public class Author  extends PanacheEntityBase{

    @Id 
    @GeneratedUlid 
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

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "deleted_at")
    private Instant deletedAt;

 


}
