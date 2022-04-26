package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.PedidoDao;
import com.jmcorp.back_jmcorp.model.TPedido;
import com.jmcorp.back_jmcorp.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoDaoImpl implements PedidoDao {

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public TPedido crearPedido(TPedido pedido) {
        TPedido crearPedido = pedidoRepository.save(pedido);
        return crearPedido;
    }

    @Override
    public List<TPedido> listarPedido() {
        List<TPedido> listarPedido = pedidoRepository.findAll();
        return listarPedido;
    }

    @Override
    public void eliminarPedido(Long id_pedido) throws Exception {
        pedidoRepository.deleteById(id_pedido);
    }

    @Override
    public TPedido actualizarPedido(Long id_pedido) {
        TPedido actualizarPedido = pedidoRepository.getById(id_pedido);
        return actualizarPedido;
    }

    @Override
    public TPedido listarPorIdPedido(Long id_pedido) {
        TPedido listarPedido = pedidoRepository.getById(id_pedido);
        return listarPedido;
    }

}