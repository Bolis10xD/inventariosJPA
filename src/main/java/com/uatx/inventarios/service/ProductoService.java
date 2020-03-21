package com.uatx.inventarios.service;

import java.util.List;

import com.uatx.inventarios.dto.ProductoDTO;
import com.uatx.inventarios.model.Producto;

public interface ProductoService {

    Long store(ProductoDTO productoDTO);

    List<Producto> buscar();

    Producto buscarPorId(Long id);

    String borrarPorId(Long id);
}
