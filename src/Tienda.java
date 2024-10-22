public class Tienda {
    public double precio;
    public double descuento;

    public Tienda(double precio, double descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }
    public  void calcularDescuento () {
        if (precio > 100) {
            System.out.println("Se aplica un 10% de descuento");
            descuento = precio * 0.10;
            precio =precio-descuento;
        } else {
            System.out.println("No se aplicará ningún descuento.");
        }
    }
}
