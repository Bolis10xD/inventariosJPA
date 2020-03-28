package com.uatx.inventarios.dto;

public class ProductoDTO {
    private String nombre;

    ImagenDTO imagendto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImagenDTO getImagendto() { return imagendto; }

    public void setImagendto(ImagenDTO imagendto) { this.imagendto = imagendto; }
}
