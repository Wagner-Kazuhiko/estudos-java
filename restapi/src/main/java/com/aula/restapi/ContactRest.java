package com.aula.restapi;

import com.aula.restapi.database.RepositoryContact;
import com.aula.restapi.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactRest {
    @Autowired
    private RepositoryContact repository;

    //method GET
    @GetMapping
    public List<Contact> list(){
        return repository.findAll();
    }

    //method POST
    @PostMapping
    public void save(@RequestBody Contact contact){
        repository.save(contact);
    }

    //method PUT
    @PutMapping
    public void alter(@RequestBody Contact contact){
        if (contact.getId() > 0) {
            repository.save(contact);
        }
    }

    //method DELETE
    @DeleteMapping
    public void delete(@RequestBody Contact contact){
        repository.delete(contact);
    }
}
