package practica1;

import javax.swing.JOptionPane;

public class Curso {

    private String nameCurso;
    private String idCurso;
    private Profesor profesor;

    public Curso() {
    }

    public Curso(String nameCurso, String idCurso, Profesor profesor) {
        this.nameCurso = nameCurso;
        this.idCurso = idCurso;
        this.profesor = profesor;
    }

    public String getNameCurso() {
        return nameCurso;
    }

    public void setNameCurso(String nameCurso) {
        this.nameCurso = nameCurso;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor Profesor) {
        this.profesor = Profesor;
    }

    public String mostrarClases() {
        String mensaje = "El curso es: " + this.nameCurso + "\n"
                + "El Codigo del curso es: " + this.idCurso + "\n"
                + "El Nombre del profesor es: " + profesor.getName() + "\n"
                + "La identificacion del profesor es: " + profesor.getId() + "\n"
                + "******************************************************************\n";
        return mensaje;
    }

}
