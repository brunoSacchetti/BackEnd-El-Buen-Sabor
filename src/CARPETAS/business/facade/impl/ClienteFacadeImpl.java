package com.example.BackEndElBuenSabor.business.facade.impl;

import com.example.BackEndElBuenSabor.business.facade.IClienteFacade;
import com.example.BackEndElBuenSabor.business.mapper.IBaseMapper;
import com.example.BackEndElBuenSabor.business.services.IBaseService;
import com.example.BackEndElBuenSabor.business.services.IClienteService;
import com.example.BackEndElBuenSabor.domains.dtos.ClienteDto;
import com.example.BackEndElBuenSabor.domains.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteFacadeImpl extends BaseFacadeImpl<Cliente, ClienteDto,Long> implements IClienteFacade {
    public ClienteFacadeImpl(IBaseService<Cliente, Long> baseService, IBaseMapper<Cliente, ClienteDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IClienteService clienteService;

    @Override
    public ClienteDto asignarUsuario(Long id, Long idUsuario) {
        return baseMapper.toDTO(clienteService.asignarUsuario(id,idUsuario));
    }

    @Override
    public ClienteDto asignarImagen(Long id, Long idImagen) {
        return baseMapper.toDTO(clienteService.asignarImagen(id,idImagen));
    }

    @Override
    public ClienteDto asignarPedidos(Long id, List<Long> pedidosIds) {
        return baseMapper.toDTO(clienteService.asignarPedidos(id,pedidosIds));
    }

    @Override
    public ClienteDto removerPedidos(Long id, List<Long> pedidosIds) {
        return baseMapper.toDTO(clienteService.removerPedidos(id,pedidosIds));
    }

    @Override
    public ClienteDto asignarDomicilios(Long id, List<Long> domiciliosIds) {
        return baseMapper.toDTO(clienteService.asignarDomicilios(id,domiciliosIds));
    }

    @Override
    public ClienteDto removerDomicilios(Long id, List<Long> domiciliosIds) {
        return baseMapper.toDTO(clienteService.removerDomicilios(id,domiciliosIds));
    }

}
