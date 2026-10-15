
public class j17_Arreglos_2 {

    public static void main(String[] args) {

        // Inicialización directa con calificaciones
        double[] calificaciones = {8.5, 9.0, 7.5, 10.0, 8.0, 9.5};
        double total = 0;

        /*
         Cómo recorrer un arreglo para calcular
         la suma y el promedio de calificaciones
        */

        System.out.println("--- Calificaciones de estudiantes ---");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": "
                    + calificaciones[i]);

            total += calificaciones[i];
        }

        double promedio = total / calificaciones.length;

        System.out.println("\nSuma de calificaciones: " + total);
        System.out.println("Promedio del grupo: " + promedio);
    }
}
