package com.example.demo.precalificacion;

import com.example.demo.cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestResource(collectionResourceRel = "precalificacion", path = "precalificacion")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public interface IPrecalificacionRepository extends PagingAndSortingRepository<precalificacion, Long> {
}
