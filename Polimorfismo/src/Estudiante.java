public class Estudiante extends Persona {

    private String notas;

    public Estudiante(String notas, String rut, String nombre, boolean presente) {
        super(rut, nombre, presente);
        this.notas = notas;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return super.toString() + " Estudiante{" +
                "notas='" + notas + '\'' +
                '}';
    }
}
