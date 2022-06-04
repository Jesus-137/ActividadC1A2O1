package com.upchiapas.ActivitadC1A2O1;

import com.upchiapas.ActivitadC1A2O1.models.CatalogoPizza;
import com.upchiapas.ActivitadC1A2O1.models.Pedido;
import com.upchiapas.ActivitadC1A2O1.models.Pizza;
import com.upchiapas.ActivitadC1A2O1.models.Tienda;

import java.util.Scanner;

public class Main {
    private static Tienda objetoTienda;
    private static Pedido objetoPedido;
    private static CatalogoPizza menu;
    private static Pizza[] pizzas=new Pizza[2]; private static  Pizza[] pedidoPizza=new Pizza[2];
    private static Pedido[] pedidos=new Pedido[2];
    private static Scanner entrada=new Scanner(System.in);

    public static void main(String[] args) {
        String nomCliente; int contador;
        Pizza peperoni=new Pizza("Peperoni",10);
        Pizza jamon=new Pizza("Jamon", 15);
        pizzas[0]=peperoni;
        pizzas[1]=jamon;
        menu=new CatalogoPizza(pizzas);
        nomCliente=agregarNomCliente();
        contador=mostrarmenu(nomCliente);
        generarTicket(nomCliente, contador);
    }
    public static String agregarNomCliente(){
        String nombre;
        System.out.println("Ingrese el nombre del cliente");
        nombre=entrada.next();
        return nombre;
    }
    public static int mostrarmenu(String nomCliente){
        int opcion, i=0;
        do {
            System.out.println("Menu");
            System.out.println("Eliga una opcion");
            for (int j = 0; j < 2; j++) {
                System.out.println(j + 1 + "- Pizza de " + menu.getNombre(j)+" $"+pizzas[j].getPrecio());
            }
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    pedidoPizza[i] = pizzas[0];
                    objetoPedido = new Pedido(nomCliente, pedidoPizza, pizzas[0].getPrecio());
                    pedidos[i] = objetoPedido;
                    break;
                case 2:
                    pedidoPizza[i] = pizzas[1];
                    objetoPedido = new Pedido(nomCliente, pedidoPizza, pizzas[1].getPrecio());
                    pedidos[i] = objetoPedido;
                    break;
            }
            System.out.println("Quiere agregar otra pizza 1 para si y 2 para no");
            opcion=entrada.nextInt();
            i++;
        }while (opcion==1);
        return i;
    }
    public static void generarTicket(String nombre, int contador){
        objetoTienda=new Tienda(pedidos);
        System.out.println("Ticket de "+nombre);
        for (int i = 0; i < contador; i++) {
            System.out.println(pedidoPizza[i].getTipoPizza()+" $"+pedidos[i].getCosto());
        }
        objetoTienda.setCostoTotal(contador);
        System.out.println("Su total es "+objetoTienda.getCostoTotal());
    }
}
