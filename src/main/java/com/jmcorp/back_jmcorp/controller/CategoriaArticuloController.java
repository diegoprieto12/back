package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCategoriaArticulo;
import com.jmcorp.back_jmcorp.service.CategoriaArticuloService;

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
public class CategoriaArticuloController {

    @Autowired
    CategoriaArticuloService categoriaArticuloService;

    @GetMapping("/listarCategoriaArticulo")
    public List<TCategoriaArticulo> listarCategoriaArticulo() {
        return categoriaArticuloService.listarCategoriaArticulo();
    }

    @GetMapping("/listarCategoriaArticuloPorId")
    public ResponseEntity<TCategoriaArticulo> listarId(@RequestParam("id_cat_articulo") Long id_cat_articulo) {

        return ResponseEntity.ok(categoriaArticuloService.listarPorIdCategoriaArticulo(id_cat_articulo));

    }

    @PostMapping("/crearCategoriaArticulo")
    @ResponseBody
    public TCategoriaArticulo crearCategoriaArticulo(@RequestBody TCategoriaArticulo categoriaArticulo) {
        return this.categoriaArticuloService.crearCategoriaArticulo(categoriaArticulo);
    }

    @DeleteMapping(value = "/eliminarCategoriaArticulo/{id_cat_articulo}")
    public void eliminarCategoriaArticulo(@PathVariable Long id_cat_articulo) {
        try {
            categoriaArticuloService.eliminarCategoriaArticulo(id_cat_articulo);
        } catch (Exception e) {
            System.out.println("Error al eliminar la categoria del articulo");
        }
    }

    @PutMapping("/actualizarCategoriaArticulo/{id_cat_articulo}")
    public TCategoriaArticulo actualizarCategoriaArticulo(@RequestBody TCategoriaArticulo CategoriaArticulo) {
        TCategoriaArticulo actualizarCategoriaArticulo = categoriaArticuloService
                .actualizarCategoriaArticulo(CategoriaArticulo.getId_cat_articulo());
        actualizarCategoriaArticulo.setNombre_cat_articulo(CategoriaArticulo.getNombre_cat_articulo());
        actualizarCategoriaArticulo.setMargen_produccion_articulo(CategoriaArticulo.getMargen_produccion_articulo());
        actualizarCategoriaArticulo.setPorcentaje_ganacia_articulo(CategoriaArticulo.getPorcentaje_ganacia_articulo());
        categoriaArticuloService.crearCategoriaArticulo(actualizarCategoriaArticulo);
        return actualizarCategoriaArticulo;
    }
}