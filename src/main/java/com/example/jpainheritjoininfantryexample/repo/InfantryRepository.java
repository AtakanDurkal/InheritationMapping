package com.example.jpainheritjoininfantryexample.repo;


import com.example.jpainheritjoininfantryexample.model.Infantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {
}
