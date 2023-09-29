package Personas;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado() {
        id = 0;
        nombre = "";
        apellido = "";
        salario = 0;
    }

    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public int getSalarioAnual() {
        return salario * 12;
    }
}
