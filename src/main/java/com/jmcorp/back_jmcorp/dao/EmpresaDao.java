package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TEmpresa;

public interface EmpresaDao {
    TEmpresa crearEmpresa(TEmpresa empresa);
	
	List<TEmpresa> listarEmpresa();

	void eliminarEmpresa(Long id_empresa) throws Exception;

	TEmpresa actualizarEmpresa(Long id_empresa);

	TEmpresa listarPorIdEmpresa(Long id_empresa);
}
