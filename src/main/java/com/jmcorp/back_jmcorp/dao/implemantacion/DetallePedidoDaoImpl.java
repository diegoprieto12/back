package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.DetallePedidoDao;
import com.jmcorp.back_jmcorp.model.TDetallePedido;
import com.jmcorp.back_jmcorp.repository.DetallePedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DetallePedidoDaoImpl implements DetallePedidoDao {

    @Autowired
    DetallePedidoRepository detallePedidoRepository;

    @Override
    public TDetallePedido crearDetallePedido(TDetallePedido detalle_pedido) {
        TDetallePedido crearDetallePedido = detallePedidoRepository.save(detalle_pedido);
        return crearDetallePedido;
    }

    @Override
    public List<TDetallePedido> listarDetallePedido() {
        List<TDetallePedido> listarDetallePedido = detallePedidoRepository.findAll();
        return listarDetallePedido;
    }

    @Override
    public void eliminarDetallePedido(Long id_detalle_pedido) throws Exception {
        detallePedidoRepository.deleteById(id_detalle_pedido);

    }

    @Override
    public TDetallePedido actualizarDetallePedido(Long id_detalle_pedido) {
        TDetallePedido actualizarDetallePedido = detallePedidoRepository.getById(id_detalle_pedido);
        return actualizarDetallePedido;
    }

    @Override
    public TDetallePedido listarPorIdDetallePedido(Long id_detalle_pedido) {
        TDetallePedido listarPorId = detallePedidoRepository.getById(id_detalle_pedido);
        return listarPorId;
    }

}