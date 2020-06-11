import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();


        lista.add(new Estudiante("7,7,7,7,4", "1", "Juan", true));
        lista.add(new Estudiante("6,7,6,5,4", "2", "Andres", true));
        lista.add(new Estudiante("7,7,7,7,4", "3", "Juan", false));
        lista.add(new Profesor("Android","10", "Jose", true));
        lista.add(new Estudiante("7,7,7,7,4", "3", "Juan", false));
        lista.add(new Profesor("Android","10", "Jose", true));
        lista.add(new Estudiante("7,7,7,7,4", "3", "Juan", false));

        int numero = 10;
        float numeroFloat = 12.5f;
        numero = (int)numeroFloat;
        System.out.println("Nunero : " + numero);

        ArrayList<Estudiante> listadoEstudiantes = new ArrayList<>();
        ArrayList<Profesor> listadoProfesores = new ArrayList<>();

        for(Persona individuo : lista) {
            if(individuo instanceof Estudiante) {
                Estudiante estud = (Estudiante) individuo;
                listadoEstudiantes.add(estud);
            }else if(individuo instanceof Profesor){
                //Profesor profe = (Profesor) individuo;
                listadoProfesores.add((Profesor) individuo);
            }
        }

        System.out.println("*********** ESTUDIANTES ************");
        for(Estudiante aux : listadoEstudiantes){
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Nombre: " + aux.getNotas());
        }

        System.out.println("*********** PROFES *************");
        for(Profesor aux : listadoProfesores){
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Asignaturas: " + aux.getAsignatura());
        }
    }
}
