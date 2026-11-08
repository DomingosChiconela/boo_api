package mz.co.pratics.author;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import mz.co.pratics.author.infrastructure.inbound.rest.AuthorRequestDTO;
import mz.co.pratics.author.infrastructure.inbound.rest.AuthorResponseDTO;
import mz.co.pratics.author.infrastructure.outbound.AuthorRepository;
import mz.co.pratics.author.model.Author;
import mz.co.pratics.author.transformer.AuthorMapper;

@ApplicationScoped 
public class AuthorService {



    private  final  AuthorRepository  authorRepository;
    private  final  AuthorMapper  authorMapper;



    public  AuthorService(AuthorRepository  authorRepository, AuthorMapper  authorMapper){

        this.authorRepository =  authorRepository;
        this.authorMapper =  authorMapper;
    }


    @Transactional 
    public AuthorResponseDTO  create(AuthorRequestDTO  data){

        var   author  =  this.authorMapper.dtoToEntity(data);

        authorRepository.persistAndFlush(author);

        return authorMapper.entityToDto(author);
        
    }


    public  AuthorResponseDTO get(String  id){

        Author   author  =  this.authorRepository.findById(id);
        if (author == null) {
            throw new NotFoundException("Author not found with id: " + id);
        }

        return  this.authorMapper.entityToDto(author);

    }


    public  List<AuthorResponseDTO> getAll(){

        List<Author> authors  =  this.authorRepository.listAll();

       return  authors.stream().map(authorMapper::entityToDto).toList();



    }

    public  void update(AuthorRequestDTO  data, String  id ){

        Author author  =   this.authorRepository.findById(id);

        if(author == null){

            throw new  NotFoundException("Author  not  found");

        }


         this.authorMapper.updateEntity(author, data);

    }




     public  void delete(String  id ){

        Author author  =   this.authorRepository.findById(id);

        if(author == null){

            throw new  NotFoundException("Author  not  found");

        }


        this.authorRepository.delete(author);
    }


}
