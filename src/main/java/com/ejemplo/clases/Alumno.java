package com.ejemplo.clases;

/**
 * La clase Alumno representa a un estudiante.
 */
public class Alumno {
    private String identificador;
    private String nombre;
    private String curso;

    /**
     * Constructor de la clase Alumno.
     * @param identificador identificador del alumno.
     * @param nombre nombre del alumno.
     * @param curso curso actual del alumno.
     */

    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }

    /**
     * Método para matricular al alumno en un nuevo curso.
     * @param curso El nuevo curso en el que se matriculará el alumno.
     */

    public void matricular(String curso){
        this.curso = curso + " 1";
    }

    /**
     * Método para pasar al alumno al siguiente curso.
     * Si el alumno está en el último curso, se pone  como titulado.
     */
    public void pasarDeCurso(){
        String[] curso = this.curso.split(" ");
        int numeroCurso = Integer.parseInt(curso[1]);
        if(numeroCurso == 1)
        {
            this.curso = curso[0] + " " + (numeroCurso + 1);
        }
        else{
            this.curso = "Titulado en " + curso[0];
        }
    }

    /**
     * Método getter para obtener el id del alumno.
     * @return El identificador único del alumno.
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Método setter para establecer el id del alumno.
     * @param identificador El nuevo id del alumno.
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Método getter para obtener el nombre del alumno.
     * @return nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del alumno.
     * @param nombre  nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el curso actual del alumno.
     * @return El curso actual del alumno.
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Método setter para establecer el curso actual del alumno.
     * @param curso El nuevo curso actual del alumno.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
