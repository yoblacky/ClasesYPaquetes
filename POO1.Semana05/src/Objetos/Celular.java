package Objetos;

public class Celular {
    private int numero;
    private String marca;
    private String color;
    private String modelo;
    private String plan;

    public Celular() {
        numero = 0;
        marca = "";
        color = "";
        modelo = "";
        plan = "";
    }

    public Celular(int numero, String marca, String color, String modelo, String plan) {
        this.numero = numero;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.plan = plan;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
}