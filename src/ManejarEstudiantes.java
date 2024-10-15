
public class ManejarEstudiantes {
    public static void main(String[] args) {
        // Creación de tres objetos Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        // Asignación de valores
        estudiante1.setNombre("Juan Carlos");
        estudiante1.setEdad(20);
        estudiante1.setMatricula("1262373");

        estudiante2.setNombre("María García");
        estudiante2.setEdad(22);
        estudiante2.setMatricula("1273493");

        estudiante3.setNombre("Carlos López");
        estudiante3.setEdad(21);
        estudiante3.setMatricula("1293749");

        // Despliegue de los valores usando get e imprimiendo con la linea de comando
        System.out.println("Estudiante 1: " + estudiante1.getNombre() + ", Edad: " + estudiante1.getEdad() + ", Matrícula: " + estudiante1.getMatricula());
        System.out.println("Estudiante 2: " + estudiante2.getNombre() + ", Edad: " + estudiante2.getEdad() + ", Matrícula: " + estudiante2.getMatricula());
        System.out.println("Estudiante 3: " + estudiante3.getNombre() + ", Edad: " + estudiante3.getEdad() + ", Matrícula: " + estudiante3.getMatricula());
    }
}