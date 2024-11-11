import java.util.Scanner;

public class Compras {
    // Atributos
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    // Constructor
    public Compras(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }

    // Método para calcular el total de las compras
    public double total() {
        return compra1 + compra2 + compra3 + compra4;
    }

    // Método para calcular el promedio de las compras
    public double promedio() {
        return total() / 4;
    }

    // Método para obtener la mayor compra
    public double mayor() {
        return Math.max(Math.max(compra1, compra2), Math.max(compra3, compra4));
    }

    // Método para obtener la menor compra
    public double menor() {
        return Math.min(Math.min(compra1, compra2), Math.min(compra3, compra4));
    }

    // Método para mostrar los resultados
    public void mostrarResultados() {
        System.out.println("Total de las compras: " + total());
        System.out.println("Promedio de las compras: " + promedio());
        System.out.println("Mayor compra: " + mayor());
        System.out.println("Menor compra: " + menor());
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para ingresar los valores
        Scanner scanner = new Scanner(System.in);

        // Solicitar las compras al usuario
        System.out.println("Ingrese el monto de la compra 1:");
        double compra1 = scanner.nextDouble();
        System.out.println("Ingrese el monto de la compra 2:");
        double compra2 = scanner.nextDouble();
        System.out.println("Ingrese el monto de la compra 3:");
        double compra3 = scanner.nextDouble();
        System.out.println("Ingrese el monto de la compra 4:");
        double compra4 = scanner.nextDouble();

        // Crear el objeto Compra con los valores ingresados
        Compras compras = new Compras(compra1, compra2, compra3, compra4);

        // Mostrar los resultados
        compras.mostrarResultados();

        // Cerrar el scanner
        scanner.close();
    }
}
