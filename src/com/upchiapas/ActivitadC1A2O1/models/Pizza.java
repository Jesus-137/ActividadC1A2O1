package com.upchiapas.ActivitadC1A2O1.models;

public class Pizza {
    private String tipoPizza;
    private int precio;
    public Pizza(String tipoPizza, int precio){
        this.tipoPizza=tipoPizza;
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipoPizza() {
        return tipoPizza;
    }
}
