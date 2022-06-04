package com.upchiapas.ActivitadC1A2O1.models;

import java.util.Arrays;
import java.util.Stack;

public class CatalogoPizza {
    private Pizza[] pizzas=new Pizza[2];
    public CatalogoPizza(Pizza[] pizzas){
        for (int i=0; i<2; i++) {
            this.pizzas[i] = pizzas[i];
        }
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }
    public String getNombre(int i){
        return pizzas[i].getTipoPizza();
    }
}
