import repository.Bebida;
import repository.impl.BebidaSimple;
import repository.impl.DecoradorConChocolate;
import repository.impl.DecoradorConCrema;
import repository.impl.DecoradorConSirope;

public class Main {
    public static void main(String[] args) {
        Bebida bebida = new BebidaSimple();
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadiendo crema
        bebida = new DecoradorConCrema(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadiendo chocolate
        bebida = new DecoradorConChocolate(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadiendo sirope
        bebida = new DecoradorConSirope(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());
    }
}