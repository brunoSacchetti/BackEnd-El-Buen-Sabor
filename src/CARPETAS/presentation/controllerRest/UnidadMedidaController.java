package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.UnidadMedidaFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.UnidadMedidaDto;
import com.example.BackEndElBuenSabor.domains.entities.UnidadMedida;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadesMedidas")
public class UnidadMedidaController extends BaseControllerImpl<UnidadMedida, UnidadMedidaDto,Long, UnidadMedidaFacadeImpl> {
    public UnidadMedidaController(UnidadMedidaFacadeImpl facade) {
        super(facade);
    }
}
