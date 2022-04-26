package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.EmpresaDao;
import com.jmcorp.back_jmcorp.model.TEmpresa;
import com.jmcorp.back_jmcorp.repository.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpresaDaoImpl implements EmpresaDao {

    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public TEmpresa crearEmpresa(TEmpresa empresa) {
        TEmpresa crearEmpresa = empresaRepository.save(empresa);
        return crearEmpresa;
    }

    @Override
    public List<TEmpresa> listarEmpresa() {
        List<TEmpresa> listarCliente = empresaRepository.findAll();
        return listarCliente;
    }

    @Override
    public void eliminarEmpresa(Long id_empresa) throws Exception {
        empresaRepository.deleteById(id_empresa);

    }

    @Override
    public TEmpresa actualizarEmpresa(Long id_empresa) {
        TEmpresa actualizarEmpresa = empresaRepository.getById(id_empresa);
        return actualizarEmpresa;
    }

    @Override
    public TEmpresa listarPorIdEmpresa(Long id_empresa) {
        TEmpresa listarPorId = empresaRepository.getById(id_empresa);
        return listarPorId;
    }

}