package com.upchiapas.ActivitadC1A2O1.models;

public class Pedido {
    private String cliente;
    private Pizza[] pizzas;
    private int costo;
    public Pedido(String cliente, Pizza[] pizzas, int costo){
        this.cliente=cliente;
        this.pizzas=pizzas;
        this.costo=costo;
    }

    public String getCliente() {
        return cliente;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public int getCosto() {
        return costo;
    }
}
