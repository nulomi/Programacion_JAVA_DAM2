import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExportarAlumnos {
    public static void main(String[] args) {
      Alumno alumno1= new Alumno("Al1","Apellido1","12345678T");
      Alumno alumno2= new Alumno("Al2","Apellido2","12345678T");
      String rutaFichero = "datos.csv";
        try (PrintWriter escritorAchivo = new PrintWriter(new FileWriter(rutaFichero))) {

            escritorAchivo.println("Nombre,Apellido,DNI");

            escritorAchivo.println(alumno1.getNombre() + "," +
                    alumno1.getApellido() + "," +
                    alumno1.getDni());

            escritorAchivo.println(alumno2.getNombre() + "," +
                    alumno2.getApellido() + "," +
                    alumno2.getDni());

            System.out.println("Archivo creado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

}
