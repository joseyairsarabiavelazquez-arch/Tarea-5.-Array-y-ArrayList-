import java.util.ArrayList;

public class j18_ArrayList_3 {
    public static void main(String[] args) {

        // Crear una lista dinamica de videojuegos
        ArrayList<String> videojuegos = new ArrayList<>();

        // 1. Agregar elementos
        videojuegos.add("Minecraft");
        videojuegos.add("FIFA");
        videojuegos.add("Mario Kart");

        System.out.println("Lista inicial: " + videojuegos);
        System.out.println("Total de videojuegos: " + videojuegos.size());

        // 2. Eliminar un elemento
        videojuegos.remove("FIFA");

        // 3. Consultar y verificar
        System.out.println("\nLista despues de eliminar: " + videojuegos);
        System.out.println("¿Esta Minecraft?: " + videojuegos.contains("Minecraft"));
        System.out.println("Elemento en posicion 0: " + videojuegos.get(0));
    }
}