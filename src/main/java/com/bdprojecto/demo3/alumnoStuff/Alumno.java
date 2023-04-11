package com.bdprojecto.demo3.alumnoStuff;

public class Alumno {
    private String nomAlumno;
    private double calificacion;
    private String Materia;
    private String matricula;

    public Alumno(String nomAlumno, double calificacion, String materia) {
        this.nomAlumno = nomAlumno;
        this.calificacion = calificacion;
        Materia = materia;
    }

    public Alumno(String nomAlumno, String matricula){
        this.nomAlumno = nomAlumno;
        this.matricula = matricula;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

