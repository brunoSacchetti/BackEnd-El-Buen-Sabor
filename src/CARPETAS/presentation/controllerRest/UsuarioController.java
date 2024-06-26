package com.example.BackEndElBuenSabor.presentation.controllerRest;

import com.example.BackEndElBuenSabor.business.facade.impl.UsuarioFacadeImpl;
import com.example.BackEndElBuenSabor.domains.dtos.UsuarioDto;
import com.example.BackEndElBuenSabor.domains.entities.Usuario;
import com.example.BackEndElBuenSabor.presentation.controllerRest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioDto,Long, UsuarioFacadeImpl> {
    public UsuarioController(UsuarioFacadeImpl facade) {
        super(facade);
    }
}
