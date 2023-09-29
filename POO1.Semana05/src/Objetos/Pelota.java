package Objetos;

public class Pelota {
    private float tamaño;
    private String color;

    public Pelota() {
        tamaño = 0.0f;
        color = "";
    }

    public Pelota(float tamaño, String color) {
        this.tamaño = tamaño;
        this.color = color;
    }

    public float getTamaño() {
        return tamaño;
    }
}
