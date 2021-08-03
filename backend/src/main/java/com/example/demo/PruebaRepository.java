package com.example.demo;

import java.sql.ClientInfoStatus;
import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "prueba", path = "prueba")
public interface PruebaRepository extends Repository<Integer, Long> {


    @Procedure
    int GET_TOTAL_CARS_BY_MODEL(String model_in);

}
