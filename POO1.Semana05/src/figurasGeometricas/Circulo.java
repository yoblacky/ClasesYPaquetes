package figurasGeometricas;

public class Circulo {
        private double radio;
        private String color;

        public Circulo() {
            radio = 1.0;
            color = "red";
        }

        public Circulo(double radio, String color) {
            this.radio = radio;
            this.color = color;
        }

        public double getRadio() {
            return radio;
        }

        public double getArea() {
            return Math.PI * radio * radio;
        }
}
