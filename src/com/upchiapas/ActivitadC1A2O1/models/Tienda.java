package com.upchiapas.ActivitadC1A2O1.models;

public class Tienda {
    private Pedido[] pedidos=new Pedido[2];
    private int costoTotal;
    public Tienda(Pedido[] pedidos){
        int i=0;
        while (i<2) {
            this.pedidos[i] = pedidos[i];
            i++;
        }
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setCostoTotal(int contador) {
        int costoTotal=0;
        for (int i = 0; i < contador; i++) {
            costoTotal = pedidos[i].getCosto() + costoTotal;
        }
        this.costoTotal = costoTotal;
    }
    public int getCostoTotal() {
        return costoTotal;
    }
}
