package com.example.demo.buro_externo;

import com.example.demo.precalificacion.precalificacion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestResource(collectionResourceRel = "buro_externo", path = "buro_externo")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public interface IInformacionGeneralExternoRepository extends PagingAndSortingRepository<informacion_general_externo, Long> {
}
