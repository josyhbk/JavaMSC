package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class solicitud {

    public Long getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Long id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_precalificacion() {
        return id_precalificacion;
    }

    public void setId_precalificacion(Long id_precalificacion) {
        this.id_precalificacion = id_precalificacion;
    }

    public float getMonto_solicitado() {
        return monto_solicitado;
    }

    public void setMonto_solicitado(float monto_solicitado) {
        this.monto_solicitado = monto_solicitado;
    }

    public float getMonto_autorizado() {
        return monto_autorizado;
    }

    public void setMonto_autorizado(float monto_autorizado) {
        this.monto_autorizado = monto_autorizado;
    }

    public float getTasa_aplicada() {
        return tasa_aplicada;
    }

    public void setTasa_aplicada(float tasa_aplicada) {
        this.tasa_aplicada = tasa_aplicada;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_solicitud;
    private Long id_cliente;
    private Long id_precalificacion;
    private float monto_solicitado;
    private float monto_autorizado;
    private float tasa_aplicada;
    private float cuota;
    private String fecha_solicitud;

}
