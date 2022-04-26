package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ClienteDao;
import com.jmcorp.back_jmcorp.model.TCliente;
import com.jmcorp.back_jmcorp.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteDao clienteDao;

    @Override
    public TCliente crearCliente(TCliente cliente) {

        TCliente crearCliente = clienteDao.crearCliente(cliente);
        return crearCliente;
    }

    @Override
    public List<TCliente> listarCliente() {
        List<TCliente> listarCliente = clienteDao.listarCliente();
        return listarCliente;
    }

    @Override
    public void eliminarCliente(Long id_cliente) throws Exception {
        clienteDao.eliminarCliente(id_cliente);

    }

    @Override
    public TCliente actualizarCliente(Long id_cliente) {
        TCliente actualizarCliente = clienteDao.actualizarCliente(id_cliente);
        return actualizarCliente;
    }

    @Override
    public TCliente listarPorIdCliente(Long id_cliente) {
        TCliente listarPorId = clienteDao.actualizarCliente(id_cliente);
        return listarPorId;
    }

}