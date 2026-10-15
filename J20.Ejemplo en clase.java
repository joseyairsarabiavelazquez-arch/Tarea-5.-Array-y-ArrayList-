import java.util.ArrayList;

public class j20_ArrayList_3 {
    public static void main(String[] args) {

        // 1. Crear una lista de videojuegos
        ArrayList<String> videojuegos = new ArrayList<>();

        System.out.println("=== 1. MÉTODO .add() ===");

        // Agregamos videojuegos a la lista
        videojuegos.add("Minecraft");
        videojuegos.add("Fortnite");
        videojuegos.add("Roblox");

        // Agregamos otro videojuego en la posición 1
        videojuegos.add(1, "FIFA 25");

        System.out.println("Lista de videojuegos: " + videojuegos);


        System.out.println("\n=== 2. MÉTODO .get() ===");

        // Mostramos los videojuegos de las primeras posiciones
        String primerJuego = videojuegos.get(0);
        String segundoJuego = videojuegos.get(1);

        System.out.println("Videojuego en posición 0: " + primerJuego);
        System.out.println("Videojuego en posición 1: " + segundoJuego);


        System.out.println("\n=== 3. MÉTODO .set() ===");

        // Cambiamos FIFA 25 por GTA V
        videojuegos.set(1, "GTA V");

        System.out.println("Lista actualizada: " + videojuegos);


        System.out.println("\n=== 4. MÉTODO .remove() ===");

        // Eliminamos el videojuego de la posición 0
        videojuegos.remove(0);

        System.out.println("Después de eliminar posición 0: " + videojuegos);

        // Eliminamos un videojuego por su nombre
        videojuegos.remove("Roblox");

        System.out.println("Después de eliminar Roblox: " + videojuegos);


        System.out.println("\n=== ESTADO FINAL ===");

        // Mostramos cuántos videojuegos quedan
        System.out.println("Total de videojuegos: " + videojuegos.size());

        System.out.println("Videojuegos restantes: " + videojuegos);

    }
}