import java.util.ArrayList;
public class Estudiante extends Persona{

    // Atributos
    protected String identificacionEstudiantil;

    protected ArrayList<String> materias = new ArrayList<>();

    protected String grado;

    protected String jornadaDeEstudio;


    // Contructores
    public Estudiante(String identificacionPersona, String nombre, String sexo, int edad, String raza, String estatura, String identificacionEstudiantil, String grado, String jornadaDeEstudio) {
        super(identificacionPersona, nombre, sexo, edad, raza, estatura);
        this.identificacionEstudiantil = identificacionEstudiantil;
        this.materias = materias;
        this.grado = grado;
        this.jornadaDeEstudio = jornadaDeEstudio;
    }
    public Estudiante(String identificacionPersona, String nombre, String sexo, int edad, String raza, String estatura, String identificacionEstudiantil, ArrayList<String> materias, String grado, String jornadaDeEstudio) {
        super(identificacionPersona, nombre, sexo, edad, raza, estatura);
        this.identificacionEstudiantil = identificacionEstudiantil;
        this.materias = materias;
        this.grado = grado;
        this.jornadaDeEstudio = jornadaDeEstudio;
    }

    // Metodos
    public void inscribirMateria(String materia){
        this.materias.add(materia);
    }

    public void inscribirMaterias(ArrayList<String> materias){
        this.materias.addAll(materias);
    }

    public boolean compararids(String id){
        return this.identificacionEstudiantil == id;
    }
}