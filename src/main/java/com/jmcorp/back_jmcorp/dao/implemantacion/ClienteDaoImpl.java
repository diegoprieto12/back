package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ClienteDao;
import com.jmcorp.back_jmcorp.model.TCliente;
import com.jmcorp.back_jmcorp.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDaoImpl implements ClienteDao {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public TCliente crearCliente(TCliente cliente) {
        TCliente crearCliente = clienteRepository.save(cliente);
        return crearCliente;
    }

    @Override
    public List<TCliente> listarCliente() {
        List<TCliente> listarCliente = clienteRepository.findAll();
        return listarCliente;
    }

    @Override
    public void eliminarCliente(Long id_cliente) throws Exception {
        clienteRepository.deleteById(id_cliente);

    }

    @Override
    public TCliente actualizarCliente(Long id_cliente) {
        TCliente actualizarCliente = clienteRepository.getById(id_cliente);
        return actualizarCliente;
    }

    @Override
    public TCliente listarPorIdCliente(Long id_cliente) {
        TCliente listarPorId = clienteRepository.getById(id_cliente);
        return listarPorId;
    }

}