package com.example.demo.precalificacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class precalificacion {

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCui_cliente() {
        return cui_cliente;
    }

    public void setCui_cliente(String cui_cliente) {
        this.cui_cliente = cui_cliente;
    }

    public String getPasaporte_cliente() {
        return pasaporte_cliente;
    }

    public void setPasaporte_cliente(String pasaporte_cliente) {
        this.pasaporte_cliente = pasaporte_cliente;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha_precalificacion() {
        return fecha_precalificacion;
    }

    public void setFecha_precalificacion(String fecha_precalificacion) {
        this.fecha_precalificacion = fecha_precalificacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_producto;
    private Long id_cliente;
    private String cui_cliente;
    private String pasaporte_cliente;
    private int estado;
    private String fecha_precalificacion;

}
