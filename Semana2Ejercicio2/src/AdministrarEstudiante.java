import java.util.ArrayList;

public class AdministrarEstudiante extends Estudiante {

    // Atributos

    //ArrayList<Estudiante> estudiantes = new ArrayList<>();

    ArrayList<String> estudiantes = new ArrayList<>();

    //Constructores



    //Metodos
    public void inscribirEstudiante(int idEstudiante, String nombreEstudiante){
        estudiantes.add(idEstudiante,nombreEstudiante);
    }

    public void inscribirmateriaAEstudiante(){
        inscribirMaterias(estudiantes);
        materias.set(this.estudiantes);
        estudiantes.add(idEstudiante,nombreEstudiante);
    }

    public void consultarMaterias(int idEstudiante){
        estudiantes.get(idEstudiante);

    }

    /*
    public ArrayList<String> consultarMaterias(String idEstudiantil){
        this.identificacionEstudiantil = idEstudiantil;
        return this.materias;
    }

     */

}
