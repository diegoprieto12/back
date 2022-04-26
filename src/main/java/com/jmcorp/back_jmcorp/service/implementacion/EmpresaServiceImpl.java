package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.EmpresaDao;
import com.jmcorp.back_jmcorp.model.TEmpresa;
import com.jmcorp.back_jmcorp.service.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    EmpresaDao empresaDao;

    @Override
    public TEmpresa crearEmpresa(TEmpresa empresa) {
        TEmpresa crearEmpresa = empresaDao.crearEmpresa(empresa);
        return crearEmpresa;
    }

    @Override
    public List<TEmpresa> listarEmpresa() {
        List<TEmpresa> listarEmpresa = empresaDao.listarEmpresa();
        return listarEmpresa;
    }

    @Override
    public void eliminarEmpresa(Long id_empresa) throws Exception {
        empresaDao.eliminarEmpresa(id_empresa);

    }

    @Override
    public TEmpresa actualizarEmpresa(Long id_empresa) {
        TEmpresa actualizaEmpresa = empresaDao.actualizarEmpresa(id_empresa);
        return actualizaEmpresa;
    }

    @Override
    public TEmpresa listarPorIdEmpresa(Long id_empresa) {
        TEmpresa listarPorId = empresaDao.listarPorIdEmpresa(id_empresa);
        return listarPorId;
    }

}