package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Integer idPasajero;
    private List<Equipaje> listadoEquipajes = new ArrayList<>();


    public Cliente(Integer idPasajero, List<Equipaje> listadoEquipajes) {
        this.idPasajero = idPasajero;
        this.listadoEquipajes = listadoEquipajes;
    }

    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    public List<Equipaje> getListadoEquipajes() {
        return listadoEquipajes;
    }

    public void setListadoEquipajes(List<Equipaje> listadoEquipajes) {
        this.listadoEquipajes = listadoEquipajes;
    }

    public void establecerPrecioPorTipo(String tipo, Integer precio) {
        listadoEquipajes.stream()
                .filter(equipaje -> equipaje.getTipo().equals(tipo))
                .forEach(equipaje -> equipaje.setPrecio(precio));
    }

    public void mostrarInformacionEquipajes() {
        listadoEquipajes.forEach(Equipaje::mostrarInformacionEquipaje);
    }
}
