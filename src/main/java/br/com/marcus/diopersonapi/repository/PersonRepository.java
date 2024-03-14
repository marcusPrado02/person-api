package br.com.marcusprado.diopersonapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcusprado.diopersonapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    //
}
