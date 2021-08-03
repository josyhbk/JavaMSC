package com.example.demo.buro_externo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class informacion_general_externo {

    public Long getId_informacion_general_externo() {
        return id_informacion_general_externo;
    }

    public void setId_informacion_general_externo(Long id_informacion_general_externo) {
        this.id_informacion_general_externo = id_informacion_general_externo;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public float getMonto_saldo_directo() {
        return monto_saldo_directo;
    }

    public void setMonto_saldo_directo(float monto_saldo_directo) {
        this.monto_saldo_directo = monto_saldo_directo;
    }

    public float getMonto_saldo_indirecto() {
        return monto_saldo_indirecto;
    }

    public void setMonto_saldo_indirecto(float monto_saldo_indirecto) {
        this.monto_saldo_indirecto = monto_saldo_indirecto;
    }

    public String getCcr() {
        return ccr;
    }

    public void setCcr(String ccr) {
        this.ccr = ccr;
    }

    public float getMonto_ccr() {
        return monto_ccr;
    }

    public void setMonto_ccr(float monto_ccr) {
        this.monto_ccr = monto_ccr;
    }

    public int getMeses_ccr() {
        return meses_ccr;
    }

    public void setMeses_ccr(int meses_ccr) {
        this.meses_ccr = meses_ccr;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_informacion_general_externo;
    private String cui;
    private String pasaporte;
    private float monto_saldo_directo;
    private float monto_saldo_indirecto;
    private String ccr;
    private float monto_ccr;
    private int meses_ccr;
    private String nombre_completo;

}
