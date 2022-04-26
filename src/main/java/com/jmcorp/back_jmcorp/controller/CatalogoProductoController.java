package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCatalogoProducto;
import com.jmcorp.back_jmcorp.service.CatalogoProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogoProductoController {

    @Autowired
    CatalogoProductoService catalogoProductoService;

    @GetMapping("/listarCatalogoProducto")
    public List<TCatalogoProducto> listarCatalogoProducto() {
        return catalogoProductoService.listarCatalogoProducto();
    }

    @GetMapping("/listarCatalogoProductoPorId")
    public ResponseEntity<TCatalogoProducto> listarCatalogoId(@RequestParam("id_catalogo") Long id_catalogo) {

        return ResponseEntity.ok(catalogoProductoService.listarPorIdCatalogoProducto(id_catalogo));

    }

    @PostMapping("/crearCatalogoProducto")
    @ResponseBody
    public TCatalogoProducto crearCatalogoProducto(@RequestBody TCatalogoProducto CatalogoProducto) {
        return this.catalogoProductoService.crearCatalogoProducto(CatalogoProducto);
    }

    @DeleteMapping(value = "/eliminarCatalogoProducto/{id_catalogo}")
    public void eliminarCatalogoProducto(@PathVariable Long id_catalogo) {
        try {
            catalogoProductoService.eliminarCatalogoProducto(id_catalogo);
        } catch (Exception e) {
            System.out.println("Error al eliminar la CatalogoProducto");
        }
    }

    @PutMapping("/actualizarCatalogoProducto/{id_catalogo}")
    public TCatalogoProducto actualizarCatalogoProducto(@RequestBody TCatalogoProducto catalogoProducto) {
        TCatalogoProducto actualizarCatalogoProducto = catalogoProductoService
                .actualizarCatalogoProducto(catalogoProducto.getId_catalogo());
        actualizarCatalogoProducto.setNombre_catalogo(catalogoProducto.getNombre_catalogo());
        actualizarCatalogoProducto.setEstado_catalogo(catalogoProducto.getEstado_catalogo());
        catalogoProductoService.crearCatalogoProducto(actualizarCatalogoProducto);
        return actualizarCatalogoProducto;
    }
}