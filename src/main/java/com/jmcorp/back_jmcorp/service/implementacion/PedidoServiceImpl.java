package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.PedidoDao;
import com.jmcorp.back_jmcorp.model.TPedido;
import com.jmcorp.back_jmcorp.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    PedidoDao pedidoDao;

    @Override
    public TPedido crearPedido(TPedido pedido) {
        TPedido crearPedido = pedidoDao.crearPedido(pedido);
        return crearPedido;
    }

    @Override
    public List<TPedido> listarPedido() {
        List<TPedido> listarPedido = pedidoDao.listarPedido();
        return listarPedido;
    }

    @Override
    public void eliminarPedido(Long id_pedido) throws Exception {
        pedidoDao.eliminarPedido(id_pedido);

    }

    @Override
    public TPedido actualizarPedido(Long id_pedido) {
        TPedido actualizarPedido = pedidoDao.actualizarPedido(id_pedido);
        return actualizarPedido;
    }

    @Override
    public TPedido listarPorIdPedido(Long id_pedido) {
        TPedido listarPorId = pedidoDao.listarPorIdPedido(id_pedido);
        return listarPorId;
    }
}