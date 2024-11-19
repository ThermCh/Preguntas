package practica1;

import javax.swing.JOptionPane;

public class Practica1 {

    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos cursos va a agregar"));
        Curso curso[] = new Curso[cantidad];
        boolean ciclo = true;

        while (ciclo) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer:\n"
                    + "1.Agregar Cursos\n" + "2.Mostrar Cursos\n" + "3.Buscar cursos de profesor\n" + "4.Salir"));
            switch (opcion) {

                case (1):
                    for (int i = 0; i < curso.length; i++) {
                        String nameCurso = JOptionPane.showInputDialog("Cual es el nombre del curso:");
                        String idCurso = JOptionPane.showInputDialog("Cual es el id del curso:");

                        //Creacion del objeto profesor
                        String nameProfesor = JOptionPane.showInputDialog("Cual es el nombre del profesor:");
                        String idProfesor = JOptionPane.showInputDialog("Cual es el id del profesor:");
                        Profesor profesor = new Profesor(nameProfesor, idProfesor);
                        curso[i] = new Curso(nameCurso, idCurso, profesor);

                    }
                    break;
                case (2):
                    String mensaje = "";
                    for (int i = 0; i < curso.length; i++) {
                        mensaje += curso[i].mostrarClases();

                    }
                    JOptionPane.showMessageDialog(null, mensaje);

                    break;
                case (3):
                    String nomBuscar = JOptionPane.showInputDialog("Cual es el nombre del profesor que quiere buscar");
                    String mensaje1 = "";
                    for (int i = 0; i < curso.length; i++) {

                        if (curso[i].getProfesor().getName().toUpperCase().equals(nomBuscar.toUpperCase())) {
                            mensaje1 += curso[i].mostrarClases();
                        } else {
                            mensaje1 = "El profesor no tiene cursos";
                        }

                    }
                    JOptionPane.showMessageDialog(null, mensaje1);

                    break;
                case (4):
                    ciclo = false;
                    break;

                default:
                    break;
            }
        }

    }

}
