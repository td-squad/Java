public class Profesor extends Persona {

    private String asignatura;

    public Profesor(String asignatura, String rut, String nombre, boolean presente) {
        super(rut, nombre, presente);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + " Profesor{" +
                "asignatura='" + asignatura + '\'' +
                '}';
    }
}
