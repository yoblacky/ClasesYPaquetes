package Personas;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private float calificacion;

    public Estudiante() {
        id = 0;
        nombre = "";
        apellido = "";
        edad = 0;
        curso = "";
        calificacion = 0.0f;
    }

    public Estudiante(int id, String nombre, String apellido, int edad, String curso, float calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public float getNota() {
        return calificacion;
    }

    public String getCurso() {
        return curso;
    }
}

