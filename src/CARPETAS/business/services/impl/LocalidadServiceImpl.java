package com.example.BackEndElBuenSabor.business.services.impl;

import com.example.BackEndElBuenSabor.business.services.ILocalidadService;
import com.example.BackEndElBuenSabor.business.services.IProvinciaService;
import com.example.BackEndElBuenSabor.domains.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements ILocalidadService {

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public Localidad asignarProvincia(Long id, Long idProvincia) {
        var localidad = getById(id);
        var provincia = provinciaService.getById(idProvincia);
        localidad.setProvincia(provincia);
        return update(localidad);
    }

}
