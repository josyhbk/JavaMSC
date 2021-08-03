package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cliente {

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getApellido_casada() {
        return apellido_casada;
    }

    public void setApellido_casada(String apellido_casada) {
        this.apellido_casada = apellido_casada;
    }

    public float getSalario_nominal() {
        return salario_nominal;
    }

    public void setSalario_nominal(float salario_nominal) {
        this.salario_nominal = salario_nominal;
    }

    public float getSalario_bruto() {
        return salario_bruto;
    }

    public void setSalario_bruto(float salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public float getSalario_liquido() {
        return salario_liquido;
    }

    public void setSalario_liquido(float salario_liquido) {
        this.salario_liquido = salario_liquido;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id_cliente;
    public String cui;
    public String pasaporte;
    public String primer_nombre;
    public String segundo_nombre;
    public String primer_apellido;
    public String segundo_apellido;
    public String apellido_casada;
    public float salario_nominal;
    public float salario_bruto;
    public float salario_liquido;



}
