package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCategoriaProducto;
import com.jmcorp.back_jmcorp.service.CategoriaProductoService;

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
public class CategoriaProductoController {

    @Autowired
    CategoriaProductoService categoriaProductoService;

    @GetMapping("/listarCategoriaProducto")
    public List<TCategoriaProducto> listarCategoriaProducto() {
        return categoriaProductoService.listarCategoriaProducto();
    }

    @GetMapping("/listarCategoriaProductoPorId")
    public ResponseEntity<TCategoriaProducto> listarId(@RequestParam("id_cat_producto") Long id_cat_producto) {

        return ResponseEntity.ok(categoriaProductoService.listarPorIdCategoriaProducto(id_cat_producto));

    }

    @PostMapping("/crearCategoriaProducto")
    @ResponseBody
    public TCategoriaProducto crearCategoriaProducto(@RequestBody TCategoriaProducto categoriaProducto) {
        return this.categoriaProductoService.crearCategoriaProducto(categoriaProducto);
    }

    @DeleteMapping(value = "/eliminarCategoriaProducto/{id_cat_producto}")
    public void eliminarCategoriaProducto(@PathVariable Long id_cat_producto) {
        try {
            categoriaProductoService.eliminarCategoriaProducto(id_cat_producto);
        } catch (Exception e) {
            System.out.println("Error al eliminar la categoria");
        }
    }

    @PutMapping("/actualizarCategoriaProducto/{id_cat_producto}")
    public TCategoriaProducto actualizarCategoriaProducto(@RequestBody TCategoriaProducto categoriaProducto) {
        TCategoriaProducto actualizarCategoriaProducto = categoriaProductoService
                .actualizarCategoriaProducto(categoriaProducto.getId_cat_producto());
        actualizarCategoriaProducto.setNombre_cat_producto(categoriaProducto.getNombre_cat_producto());
        categoriaProductoService.crearCategoriaProducto(actualizarCategoriaProducto);
        return actualizarCategoriaProducto;
    }
}