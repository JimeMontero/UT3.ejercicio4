
public class Main {
    public static void main(String[] args) {
        Tienda calculador = new Tienda(168, 0);
        calculador.calcularDescuento();
        System.out.println("Precio final del producto: "+ calculador.precio);
    }
}