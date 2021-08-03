package com.example.demo.credito;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class credito {

    public Long getId_credito() {
        return id_credito;
    }

    public void setId_credito(Long id_credito) {
        this.id_credito = id_credito;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Long id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public float getMonto_solicitado() {
        return monto_solicitado;
    }

    public void setMonto_solicitado(float monto_solicitado) {
        this.monto_solicitado = monto_solicitado;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public float getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(float tasa_interes) {
        this.tasa_interes = tasa_interes;
    }

    public String getFecha_autorizacion() {
        return fecha_autorizacion;
    }

    public void setFecha_autorizacion(String fecha_autorizacion) {
        this.fecha_autorizacion = fecha_autorizacion;
    }

    public String getFecha_desembolso() {
        return fecha_desembolso;
    }

    public void setFecha_desembolso(String fecha_desembolso) {
        this.fecha_desembolso = fecha_desembolso;
    }

    public String getEstado_credito() {
        return estado_credito;
    }

    public void setEstado_credito(String estado_credito) {
        this.estado_credito = estado_credito;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getCuotas_pagadas() {
        return cuotas_pagadas;
    }

    public void setCuotas_pagadas(int cuotas_pagadas) {
        this.cuotas_pagadas = cuotas_pagadas;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_credito;
    private Long id_cliente;
    private Long id_solicitud;
    private float monto_solicitado;
    private float cuota;
    private float tasa_interes;
    private String fecha_autorizacion;
    private String fecha_desembolso;
    private String estado_credito;
    private int plazo;
    private int cuotas_pagadas;
}
