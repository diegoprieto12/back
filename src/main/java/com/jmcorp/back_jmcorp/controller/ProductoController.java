package com.jmcorp.back_jmcorp.controller;

import java.util.Date;
import java.util.List;

import javax.websocket.Decoder.Binary;

import com.jmcorp.back_jmcorp.model.TCatalogoProducto;
import com.jmcorp.back_jmcorp.model.TCategoriaArticulo;
import com.jmcorp.back_jmcorp.model.TCategoriaProducto;
import com.jmcorp.back_jmcorp.model.TProducto;
import com.jmcorp.back_jmcorp.model.TUsuario;
import com.jmcorp.back_jmcorp.service.CatalogoProductoService;
import com.jmcorp.back_jmcorp.service.CategoriaProductoService;
import com.jmcorp.back_jmcorp.service.ProductoService;
import com.jmcorp.back_jmcorp.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import java.awt.Image;

@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

    // @Autowired
    TProducto producto;

    @Autowired
    UsuarioService usuarioservice;
    @Autowired
    CategoriaProductoService categoriaProductoService;
    @Autowired
    CatalogoProductoService catalogoProductoService;

    @GetMapping("/listarProducto")
    public List<TProducto> listarProducto() {
        return productoService.listarProducto();
    }

    @GetMapping("/listarProductoPorId")
    public ResponseEntity<TProducto> listarId(@RequestParam("id_producto") Long id_producto) {

        return ResponseEntity.ok(productoService.listarPorIdProducto(id_producto));

    }

    @PostMapping("/crearProducto")
    @ResponseBody
    public TProducto crearProducto(@RequestBody TProducto producto) {
        return this.productoService.crearProducto(producto);
    }

    @PostMapping(value = "/crearProducto2/{nombre_producto}/{estado_producto}/{imagen_producto}/{codigo_barras_producto}/{precio_producto}/{precio_costo}/{descuento_producto}   /{tiempo_produccion_producto}/{porcentaje_ganacia_producto}/{alto_producto}/{ancho_producto}/{profundidad_producto}/{contenido_producto}/{web_producto}/{usuario}/{categoria_producto}/{catalogo_producto}/{porcentaje_ganancia}/{iva_producto}")
    @ResponseBody
    public ResponseEntity<TProducto> save(
            @PathVariable(name = "nombre_producto") String nombre_producto,
            @PathVariable(name = "estado_producto") String estado_producto,
            //@PathVariable(name = "imagen_producto") Image imagen_producto,
            @PathVariable(name = "codigo_barras_producto") String codigo_barras_producto,
            @PathVariable(name = "precio_producto") double precio_producto,
            @PathVariable(name = "precio_costo") double precio_costo,
            @PathVariable(name = "descuento_producto") Long descuento_producto,
            @PathVariable(name = "tiempo_produccion_producto") Date tiempo_produccion_producto,
            @PathVariable(name = "porcentaje_ganacia_producto") Long porcentaje_ganacia_producto,
            @PathVariable(name = "alto_producto") String alto_producto,
            @PathVariable(name = "ancho_producto") String ancho_producto,
            @PathVariable(name = "profundidad_producto") String profundidad_producto,
            @PathVariable(name = "contenido_producto") String contenido_producto,
            @PathVariable(name = "web_producto") String web_producto,
            @PathVariable(name = "usuario") Long usuario,
            @PathVariable(name = "categoria_producto") Long categoria_producto,
            @PathVariable(name = "catalogo_producto") Long catalogo_producto,
            @PathVariable(name = "porcentaje_ganancia") Long porcentaje_ganancia,
            @PathVariable(name = "iva_producto") Number iva_producto) {
        TProducto ord = new TProducto();
        ord.setNombre_producto(nombre_producto);
        ord.setEstado_producto(estado_producto);
        //ord.setImagen_producto(imagen_producto);
        ord.setCodigo_barras_producto(codigo_barras_producto);
        ord.setPrecio_producto(precio_producto);
        ord.setPrecio_costo(precio_costo);
        ord.setDescuento_producto(descuento_producto);
        ord.setTiempo_produccion_producto(tiempo_produccion_producto);
        ord.setPorcentaje_ganacia_producto(porcentaje_ganacia_producto);
        ord.setAlto_producto(alto_producto);
        ord.setAncho_producto(ancho_producto);
        ord.setProfundidad_producto(profundidad_producto);
        ord.setContenido_producto(contenido_producto);
        ord.setWeb_producto(web_producto);
        TUsuario ordencv = new TUsuario();
        ordencv = usuarioservice.listarPorIdUsuario(usuario);
        ord.setUsuario(ordencv);
        // ___________________________________________________________________________
        TCategoriaProducto ordencv1 = new TCategoriaProducto();
        ordencv1 = categoriaProductoService.listarPorIdCategoriaProducto(categoria_producto);
        ord.setCategoria_producto(ordencv1);
        // ___________________________________________________________________________
        TCatalogoProducto ordencv2 = new TCatalogoProducto();
        ordencv2 = catalogoProductoService.listarPorIdCatalogoProducto(catalogo_producto);
        ord.setCatalogo_producto(ordencv2);

        TProducto ord1 = productoService.crearProducto(ord);
        return new ResponseEntity<TProducto>(ord, HttpStatus.OK);
    }

    @DeleteMapping(value = "/eliminarProducto/{id_producto}")
    public void eliminarProducto(@PathVariable Long id_producto) {
        try {
            productoService.eliminarProducto(id_producto);
        } catch (Exception e) {
            System.out.println("Error al eliminar el producto");
        }
    }

    @PutMapping("/actualizarProducto/{id_producto}")
    public TProducto actualizarProducto(@RequestBody TProducto producto) {
        TProducto actualizarProducto = productoService.actualizarProducto(producto.getId_producto());
        actualizarProducto.setCodigo_barras_producto(producto.getCodigo_barras_producto());
        actualizarProducto.setNombre_producto(producto.getNombre_producto());
        actualizarProducto.setEstado_producto(producto.getEstado_producto());
        actualizarProducto.setImagen(producto.getImagen());
        actualizarProducto.setPrecio_producto(producto.getPrecio_producto());
        actualizarProducto.setPrecio_costo(producto.getPrecio_costo());
        actualizarProducto.setDescuento_producto(producto.getDescuento_producto());
        actualizarProducto.setTiempo_produccion_producto(producto.getTiempo_produccion_producto());
        actualizarProducto.setUsuario(producto.getUsuario());
        actualizarProducto.setCategoria_producto(producto.getCategoria_producto());
        actualizarProducto.setCatalogo_producto(producto.getCatalogo_producto());
        actualizarProducto.setAlto_producto(producto.getAlto_producto());
        actualizarProducto.setAncho_producto(producto.getAncho_producto());
        actualizarProducto.setProfundidad_producto(producto.getProfundidad_producto());
        actualizarProducto.setContenido_producto(producto.getContenido_producto());
        actualizarProducto.setWeb_producto(producto.getWeb_producto());
        actualizarProducto.setIva_producto(producto.getIva_producto());
        actualizarProducto.setPorcentaje_ganacia_producto(producto.getPorcentaje_ganacia_producto());
        productoService.crearProducto(actualizarProducto);
        return actualizarProducto;
    }

    @PutMapping("/actualizarProducto2/{id_producto}")
    public TProducto actualizarProducto(@PathVariable Object[] imagen) {
        TProducto actualizarProducto = productoService.actualizarProducto(producto.getId_producto());
        //actualizarProducto.setImagen_producto(producto.getImagen_producto());
        productoService.crearProducto(actualizarProducto);
        return actualizarProducto;
    }
}