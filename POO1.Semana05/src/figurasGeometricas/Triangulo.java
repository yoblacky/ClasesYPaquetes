package figurasGeometricas;

public class Triangulo {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo() {
        vertice1 = new Punto();
        vertice2 = new Punto();
        vertice3 = new Punto();
    }

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public double getPerimetro() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    private double calcularDistancia(Punto punto1, Punto punto2) {
        double deltaX = punto1.getCoordenadaX() - punto2.getCoordenadaX();
        double deltaY = punto1.getCoordenadaY() - punto2.getCoordenadaY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
