package Objetos;

public class Automovil {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String tipo;

    public Automovil() {
        placa = "";
        marca = "";
        modelo = "";
        color = "";
        tipo = "";
    }

    public Automovil(String placa, String marca, String modelo, String color, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

