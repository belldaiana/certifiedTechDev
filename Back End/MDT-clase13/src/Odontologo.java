public class Odontologo {

    private Long id;
    private String nombre;
    private String apellido;
    private String matricula;

    public Odontologo(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public String setMatricula(String matricula) {
        this.matricula = matricula;
        return matricula;
    }

    public Long getId() {
        return id;
    }
}
