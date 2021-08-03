package com.example.demo.credito;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestResource(collectionResourceRel = "credito", path = "credito")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public interface ICreditoRepository {

}
