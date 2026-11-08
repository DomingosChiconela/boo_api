package mz.co.pratics.author.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mz.co.pratics.book.model.Book;
import mz.co.pratics.common.persistence.GeneratedUlid;

@Entity 
@Table(name ="authors")
@Setter 
@Getter 
@AllArgsConstructor 
@NoArgsConstructor 
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


    @OneToMany (mappedBy = "author",fetch = FetchType.LAZY)
    private   List<Book> books = new  ArrayList<>();

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "deleted_at")
    private Instant deletedAt;

 


}
