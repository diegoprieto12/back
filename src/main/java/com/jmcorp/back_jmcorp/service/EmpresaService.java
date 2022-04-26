package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TEmpresa;

public interface EmpresaService {
    TEmpresa crearEmpresa(TEmpresa empresa);
	
	List<TEmpresa> listarEmpresa();

	void eliminarEmpresa(Long id_empresa) throws Exception;

	TEmpresa actualizarEmpresa(Long id_empresa);

	TEmpresa listarPorIdEmpresa(Long id_empresa);
}
