package com.uatx.inventarios.service.impl;

import com.uatx.inventarios.dto.ProductoDTO;
import com.uatx.inventarios.model.Producto;
import com.uatx.inventarios.repository.ProductoRepository;
import com.uatx.inventarios.service.ProductoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Long store(ProductoDTO productoDTO) {
        Producto producto = new Producto();
        producto.setNombre(productoDTO.getNombre());

        productoRepository.save(producto);

        return producto.getId();
    }

    @Override
    public List<Producto> buscar() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto buscarPorId(Long ID) {

        return productoRepository.findById(ID).orElse(null);
    }

    @Override
    public String borrarPorId(Long id) {
        Producto prodcutoBorrado = buscarPorId(id);

        productoRepository.deleteById(id);
        return "El producto eliminado es " + prodcutoBorrado.getNombre();
    }
}
