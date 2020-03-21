package com.uatx.inventarios.controller;

import com.uatx.inventarios.dto.ProductoDTO;
import com.uatx.inventarios.model.Producto;
import com.uatx.inventarios.service.ProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/productos")
public class ProductosController {


    @Autowired
    private ProductoService productoService;

    @GetMapping("/guardar")
    @ResponseBody
    public Long guardarProducto(@RequestParam String nombre) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setNombre(nombre);
        return productoService.store(productoDTO);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/buscartodos")
    @ResponseBody()
    public List<Producto> buscarProducto() {
        return (List<Producto>) productoService.buscar();
    }


    @GetMapping("buscarporid")
    @ResponseBody
    public Producto buscarPorId(@RequestParam Long ID) {

        return productoService.buscarPorId(ID);
    }

    @GetMapping("borrarporid")
    @ResponseBody
    public String borrarPorId(@RequestParam Long ID) {

        return productoService.borrarPorId(ID);
    }


}
