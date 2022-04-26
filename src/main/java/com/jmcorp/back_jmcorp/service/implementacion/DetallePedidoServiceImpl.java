package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.DetallePedidoDao;
import com.jmcorp.back_jmcorp.model.TDetallePedido;
import com.jmcorp.back_jmcorp.service.DetallePedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    @Autowired
    DetallePedidoDao detallePedidoDao;

    @Override
    public TDetallePedido crearDetallePedido(TDetallePedido detalle_pedido) {
        TDetallePedido crearDetallePedido = detallePedidoDao.crearDetallePedido(detalle_pedido);
        return crearDetallePedido;
    }

    @Override
    public List<TDetallePedido> listarDetallePedido() {
        List<TDetallePedido> listarDetallePedido = detallePedidoDao.listarDetallePedido();
        return listarDetallePedido;
    }

    @Override
    public void eliminarDetallePedido(Long id_detalle_pedido) throws Exception {
        detallePedidoDao.eliminarDetallePedido(id_detalle_pedido);

    }

    @Override
    public TDetallePedido actualizarDetallePedido(Long id_detalle_pedido) {
        TDetallePedido actualizarDetallePedido = detallePedidoDao.actualizarDetallePedido(id_detalle_pedido);
        return actualizarDetallePedido;
    }

    @Override
    public TDetallePedido listarPorIdDetallePedido(Long id_detalle_pedido) {
        TDetallePedido listarPorId = detallePedidoDao.listarPorIdDetallePedido(id_detalle_pedido);
        return listarPorId;
    }
}