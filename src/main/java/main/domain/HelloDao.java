package main.domain;

import main.entity.Hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HelloDao extends CrudRepository<Hello, Integer> {
    List<Hello> findByLastName(String lastName);
}