package com.aula.restapi.database;

import com.aula.restapi.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryContact extends JpaRepository<Contact, Long> {

}
