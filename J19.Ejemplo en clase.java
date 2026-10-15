import java.util.ArrayList;

public class j19_ArrayList_2 {
    public static void main(String[] args) {

        // Creamos una lista para guardar precios
        ArrayList<Integer> precios = new ArrayList<>();

        precios.add(150);
        precios.add(80);
        precios.add(250);
        precios.add(45);
        precios.add(300);

        System.out.println("--- Registro de precios ---");

        // Recorremos la lista con for-each
        for (Integer precio : precios) {
            if (precio >= 100) {
                System.out.println("Precio $" + precio + ": Producto caro");
            } else {
                System.out.println("Precio $" + precio + ": Producto economico");
            }
        }
    }
}