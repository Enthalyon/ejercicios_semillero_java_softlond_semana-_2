import java.util.ArrayList;
public class Estudiante extends Persona{

    // Atributos
    protected String identificacionEstudiantil;

    protected ArrayList<String> materias = new ArrayList<>();

    protected String grado;

    protected String jornadaDeEstudio;


    // Contructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String sexo, int edad, String identificacionEstudiantil, String grado, String jornadaDeEstudio) {
        super(identificacionPersona, nombre, sexo, edad, raza, estatura);
        this.identificacionEstudiantil = identificacionEstudiantil;
        this.materias = inscribirMaterias();
        this.grado = grado;
        this.jornadaDeEstudio = jornadaDeEstudio;
    }


    // Metodos
    public void inscribirMaterias(String materia){
        this.materias.add(materia);
    };

}