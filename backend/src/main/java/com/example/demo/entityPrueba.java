package com.example.demo;

import javax.persistence.*;


@Entity
public class entityPrueba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uno;
    private String dos;

    public Long getUno() {
        return uno;
    }

    public void setUno(Long uno) {
        this.uno = uno;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }



}
