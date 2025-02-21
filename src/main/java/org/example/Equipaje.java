package org.example;

public class Equipaje {

    private Integer idEquipaje;
    private String tipo;
    private Integer precio;


    public Equipaje(Integer idEquipaje, String tipo) {
        this.idEquipaje = idEquipaje;
        this.tipo = tipo;
    }

    public Integer getIdEquipaje() {
        return idEquipaje;
    }

    public void setIdEquipaje(Integer idEquipaje) {
        this.idEquipaje = idEquipaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void mostrarInformacionEquipaje() {
        String auxiliarPrecio = (precio == null) ? "no definido todavía" : String.valueOf(precio);
        System.out.println("Equipaje número: " + this.idEquipaje + " del tipo: " + this.tipo + " con precio: " + auxiliarPrecio);
    }
}
