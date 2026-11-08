package mz.co.pratics.author.transformer;

import jakarta.enterprise.context.ApplicationScoped;
import mz.co.pratics.author.infrastructure.inbound.rest.AuthorRequestDTO;
import mz.co.pratics.author.infrastructure.inbound.rest.AuthorResponseDTO;
import mz.co.pratics.author.model.Author;


@ApplicationScoped 
public class AuthorMapper {




    public Author dtoToEntity (AuthorRequestDTO  dto){

        var  author =  new  Author();
       
        author.setFirstName(dto.firstName());
        author.setLastName(dto.lastName());
        author.setBiography(dto.biography());
        author.setBirthDate(dto.birthDate());
        author.setNationality(dto.nationality());
        author.setEmail(dto.email());


        return  author;



    }


    public   AuthorResponseDTO entityToDto (Author author){

           return  new AuthorResponseDTO(
                author.getId(),
                author.getFirstName(),
                author.getLastName(),
                author.getBiography(),
                author.getBirthDate(),
                author.getNationality(),
                author.getEmail(),
                author.getCreatedAt(),
                author.getUpdatedAt()
            );

            
    }


        /**
     * Updates an existing author with request data.
     *
     * @param author the author to update
     * @param dto the request containing the updated data
     */
    public void updateEntity(Author author, AuthorRequestDTO dto) {
    author.setFirstName(dto.firstName());
    author.setLastName(dto.lastName());
    author.setBiography(dto.biography());
    author.setBirthDate(dto.birthDate());
    author.setNationality(dto.nationality());
    author.setEmail(dto.email());
    }
    

}
