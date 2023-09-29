package figurasGeometricas;

public class Rectangulo {
    private float largo;
    private float ancho;

    public Rectangulo() {
        largo = 1.0f;
        ancho = 1.0f;
    }

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public float getAncho() {
        return ancho;
    }

    public float getArea() {
        return largo * ancho;
    }
}