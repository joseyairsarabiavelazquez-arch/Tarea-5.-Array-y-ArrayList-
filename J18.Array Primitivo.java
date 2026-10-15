
public class j18_Array_Primitivo {
    public static void main(String[] args) {

        // Crear un arreglo primitivo de enteros
        int[] calificaciones = {8, 9, 7, 10, 6};

        // 1. Mostrar los elementos del arreglo
        System.out.println("Calificaciones:");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }

        // 2. Mostrar la cantidad de elementos
        System.out.println("Total de calificaciones: " + calificaciones.length);

        // 3. Consultar un elemento
        System.out.println("Primera calificacion: " + calificaciones[0]);

        // 4. Modificar un elemento
        calificaciones[2] = 8;

        System.out.println("Calificacion modificada: " + calificaciones[2]);
    }
}
