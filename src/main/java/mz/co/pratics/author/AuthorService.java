package mz.co.pratics.author;

import jakarta.enterprise.context.ApplicationScoped;
import mz.co.pratics.author.infrastructure.inbound.rest.AuthorRequestDTO;
import mz.co.pratics.author.infrastructure.outbound.AuthorRepository;
import mz.co.pratics.author.model.Author;

@ApplicationScoped 
public class AuthorService {



    private  final  AuthorRepository  authorRepository;



    public  AuthorService(AuthorRepository  authorRepository){

        this.authorRepository =  authorRepository;
    }

    private void  create(AuthorRequestDTO  data){

        var  author =  new  Author();



        authorRepository.persist(author);

        
    }
}
