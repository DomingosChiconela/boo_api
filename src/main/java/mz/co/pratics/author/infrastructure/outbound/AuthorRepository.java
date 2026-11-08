package mz.co.pratics.author.infrastructure.outbound;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import mz.co.pratics.author.model.Author;


@ApplicationScoped
public class AuthorRepository implements PanacheRepositoryBase<Author,String>{

}
