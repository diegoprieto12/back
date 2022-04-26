package com.jmcorp.back_jmcorp.controller;

import java.util.List;
import java.util.Map;

import com.jmcorp.back_jmcorp.model.TElabCon;
import com.jmcorp.back_jmcorp.model.TProducto;
import com.jmcorp.back_jmcorp.service.ElabConService;
import com.jmcorp.back_jmcorp.service.ProductoService;
import com.jmcorp.back_jmcorp.service.implementacion.ElabConServiceImpl;

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
public class ElabConController {
    
    
    @Autowired
    ElabConService elabConService;

    @Autowired
    ElabConServiceImpl ElabConServiceImpl;

    @Autowired
    ProductoService productoService;

    @GetMapping("/listarelabCon")
    public List<TElabCon> listarelabCon() {
        return elabConService.listarTElabCon();
    }

    @GetMapping("/listarelabConPorId")
    public ResponseEntity<TElabCon> listarId(@RequestParam("id_elab_con") Long id_elab_con) {

        return ResponseEntity.ok(elabConService.listarPorIdTElabCon(id_elab_con));

    }

    /*
    @GetMapping("/listarElabConProdPorId")
    public ResponseEntity<TProducto> listarId(@RequestParam("id_producto") Long id_producto) {
        return ResponseEntity.ok(productoService.listarPorIdProducto(id_producto));

    }    
    //**************************************************************************************** 
	@GetMapping("/ListarElabconPorId/{id_producto}")
	public ResponseEntity<List<TElabCon>> ListarProductos(@RequestParam("id_producto") Long Pid) {
		return ResponseEntity.ok(ElabConServiceImpl.buscarCodigoProducto(Pid));
	}
    */
    
    @PostMapping("/crearelabCon")
    @ResponseBody
    public TElabCon crearelabCon(@RequestBody TElabCon elabCon) {
        return this.elabConService.crearTElabCon(elabCon);
    }

    @DeleteMapping(value = "/eliminarelabCon/{id_elab_con}")
    public void eliminarelabCon(@PathVariable Long id_elab_con) {
        try {
            elabConService.eliminarTElabCon(id_elab_con);
        } catch (Exception e) {
            System.out.println("Error al eliminar la elabCon");
        }
    }

    
    @PutMapping("/actualizarelabCon/{id_elab_con}")
    public TElabCon actualizarelabCon(@RequestBody TElabCon elabCon) {
        TElabCon actualizarelabCon = elabConService.actualizarTElabCon(elabCon.getId_elab_con());
        actualizarelabCon.setArticulo(elabCon.getArticulo());
        actualizarelabCon.setProducto(elabCon.getProducto());
        actualizarelabCon.setCantidad(elabCon.getCantidad());
        actualizarelabCon.setOrden(elabCon.getOrden());
        elabConService.crearTElabCon(actualizarelabCon);
        return actualizarelabCon;
    }

}

