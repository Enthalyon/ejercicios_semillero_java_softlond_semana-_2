import java.util.ArrayList;

public class AdministrarEstudiante extends Estudiante {

    // Atributos
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public AdministrarEstudiante(String identificacionPersona, String nombre, String sexo, int edad, String raza, String estatura, String identificacionEstudiantil, String grado, String jornadaDeEstudio) {
        super(identificacionPersona, nombre, sexo, edad, raza, estatura, identificacionEstudiantil, grado, jornadaDeEstudio);
    }

    public AdministrarEstudiante(String identificacionPersona, String nombre, String sexo, int edad, String raza, String estatura, String identificacionEstudiantil, ArrayList<String> materias, String grado, String jornadaDeEstudio) {
        super(identificacionPersona, nombre, sexo, edad, raza, estatura, identificacionEstudiantil, materias, grado, jornadaDeEstudio);
    }

    //Constructores



    //Metodos
    public void inscribirEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void inscribirmateriaAEstudiante(String id, ArrayList<String> materias){
        for (Estudiante estudiante: estudiantes) {
            if(estudiante.compararids(id)){
                estudiante.inscribirMaterias(materias);
            }
        }
    }

    public Estudiante consultarMateriasPorEstudiante(String idEstudiante){
        Estudiante estudianteHallado = null;

        for (Estudiante estudiante: estudiantes) {
            if(estudiante.compararids(idEstudiante)){
                estudianteHallado = estudiante;
            }
        }

        if(estudianteHallado == null){
            throw new RuntimeException("Estudiante no hallado");
        }
        return estudianteHallado;
    }

}
