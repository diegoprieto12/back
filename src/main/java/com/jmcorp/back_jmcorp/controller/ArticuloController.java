package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TArticulo;
import com.jmcorp.back_jmcorp.service.ArticuloService;

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
public class ArticuloController {

    @Autowired
    ArticuloService articuloService;

    @GetMapping("/listarArticulo")
    public List<TArticulo> listarArticulo() {
        return articuloService.listarArticulo();
    }

    @GetMapping("/listarArticuloPorId")
    public ResponseEntity<TArticulo> listarId(@RequestParam("id_articulo") Long id_articulo) {

        return ResponseEntity.ok(articuloService.listarPorIdArticulo(id_articulo));

    }

    @PostMapping("/crearArticulo")
    @ResponseBody
    public TArticulo crearArticulo(@RequestBody TArticulo articulo) {
        return this.articuloService.crearArticulo(articulo);
    }

    @DeleteMapping(value = "/eliminarArticulo/{id_articulo}")
    public void eliminarArticulo(@PathVariable Long id_articulo) {
        try {
            articuloService.eliminarArticulo(id_articulo);
        } catch (Exception e) {
            System.out.println("Error al eliminar la articulo");
        }
    }

    @PutMapping("/actualizarArticulo/{id_articulo}")
    public TArticulo actualizarArticulo(@RequestBody TArticulo articulo) {
        TArticulo actualizarArticulo = articuloService.actualizarArticulo(articulo.getId_articulo());
        actualizarArticulo.setNombre_articulo(articulo.getNombre_articulo());
        actualizarArticulo.setDescripcion_articulo(articulo.getDescripcion_articulo());
        actualizarArticulo.setColor_articulo(articulo.getColor_articulo());
        actualizarArticulo.setSin_elaborar(articulo.getSin_elaborar());
        actualizarArticulo.setEstado_articulo(articulo.getEstado_articulo());
        actualizarArticulo.setImagen(articulo.getImagen());
        actualizarArticulo.setPrecio_articulo(articulo.getPrecio_articulo());
        actualizarArticulo.setDescuento_articulo(articulo.getDescuento_articulo());
        actualizarArticulo.setCategoria_articulo(articulo.getCategoria_articulo());
        actualizarArticulo.setPrecio_costo_articulo(articulo.getPrecio_costo_articulo());
        actualizarArticulo.setMargen_produccion_articulo(articulo.getMargen_produccion_articulo());
        actualizarArticulo.setPorcentaje_ganacia_articulo(articulo.getPorcentaje_ganacia_articulo());
        actualizarArticulo.setPrecio_produccion_articulo(articulo.getPrecio_produccion_articulo());
        actualizarArticulo.setStock_minimo_articulo(articulo.getStock_minimo_articulo());
        actualizarArticulo.setCodigo_barras_articulo(articulo.getCodigo_barras_articulo());
        actualizarArticulo.setIva_articulo(articulo.getIva_articulo());
        actualizarArticulo.setMedida(articulo.getMedida());
        actualizarArticulo.setPrecio_final_articulo(articulo.getPrecio_final_articulo());
        actualizarArticulo.setId_proveedor(articulo.getId_proveedor());
        articuloService.crearArticulo(actualizarArticulo);
        return actualizarArticulo;
    }

}