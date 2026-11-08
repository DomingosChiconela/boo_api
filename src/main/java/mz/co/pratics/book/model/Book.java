
package mz.co.pratics.book.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mz.co.pratics.author.model.Author;
import mz.co.pratics.common.persistence.GeneratedUlid;

@Entity
@Table(name = "books")
@Setter
@Getter
@AllArgsConstructor 
public class Book extends PanacheEntityBase {

    @Id
    @GeneratedUlid
    @Column(name = "id", length = 26, nullable = false, updatable = false)
    private String id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "isbn", nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(name = "language", length = 50)
    private String language;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "price", precision = 12, scale = 2)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "deleted_at")
    private Instant deletedAt;

    
}
