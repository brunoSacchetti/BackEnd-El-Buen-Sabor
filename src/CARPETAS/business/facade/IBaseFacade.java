package com.example.BackEndElBuenSabor.business.facade;

import com.example.BackEndElBuenSabor.domains.dtos.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface IBaseFacade <D extends BaseDto, ID extends Serializable> {
    D createNew(D request);
    D getById(Long id);
    List<D> getAll();
    void deleteById(Long id);
    D update(D request, Long id);
}
