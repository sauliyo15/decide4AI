package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        enum Tipos {
            K18, K23, K34, ESPECIAL
        }

        Equipaje equipaje1 = new Equipaje(1, Tipos.K18.toString());
        Equipaje equipaje2 = new Equipaje(2, Tipos.K23.toString() );
        Equipaje equipaje3 = new Equipaje(3, Tipos.K23.toString());
        Equipaje equipajeEspecial = new Equipaje(4, Tipos.ESPECIAL.toString());

        List<Equipaje> listadoEquipaje = new ArrayList<>();
        listadoEquipaje.add(equipaje1);
        listadoEquipaje.add(equipaje2);
        listadoEquipaje.add(equipaje3);
        listadoEquipaje.add(equipajeEspecial);

        Cliente cliente = new Cliente(1, listadoEquipaje);

        cliente.mostrarInformacionEquipajes();

        System.out.println("----------------------------------------");

        cliente.establecerPrecioPorTipo(Tipos.K23.toString(), 200);
        cliente.establecerPrecioPorTipo(Tipos.ESPECIAL.toString(), 150);

        cliente.mostrarInformacionEquipajes();

    }
}