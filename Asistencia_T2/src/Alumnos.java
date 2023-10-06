/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhonatan
 */
public class Alumnos {
    
    String alumno;
    String curso;
    int aula;

    public Alumnos() {
    }

    
    public Alumnos(String alumno, String curso, int aula) {
        this.alumno = alumno;
        this.curso = curso;
        this.aula = aula;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "alumno=" + alumno + ", curso=" + curso + ", aula=" + aula + '}';
    }

   
    
    
}
