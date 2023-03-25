public abstract class Persona {

    //Atributos
    protected String identificacionPersona;
    protected String nombre;
    protected String sexo;
    protected int edad;
    protected String raza;
    protected String estatura;


    // Constructores
    public Persona() {
    }

    public Persona(String identificacionPersona, String nombre, String sexo, int edad, String raza, String estatura) {
        this.identificacionPersona = identificacionPersona;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.raza = raza;
        this.estatura = estatura;
    }
}
