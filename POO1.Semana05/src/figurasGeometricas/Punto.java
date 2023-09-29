package figurasGeometricas;

public class Punto {
    private double coordenadaX;
    private double coordenadaY;

    public Punto() {
        coordenadaX = 0.0;
        coordenadaY = 0.0;
    }

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }
}
