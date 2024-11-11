package Programas;

import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        // Crear un objeto de tipo Scanner para leer datos desde la consola
        Scanner lectura = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el sueldo mensual del empleado: ");
        double sueldoMensual = lectura.nextDouble();

        System.out.print("Ingrese los otros ingresos del empleado: ");
        double otrosIngresos = lectura.nextDouble();

        System.out.print("Ingrese los gastos mensuales del empleado: ");
        double gastosMensuales = lectura.nextDouble();

        // Crear un objeto Empleado
        Empleado empleado = new Empleado(sueldoMensual, otrosIngresos, gastosMensuales);

        // Calcular los ahorros
        double ahorroMensual = empleado.calcularAhorroMensual();
        double ahorroSemestral = empleado.calcularAhorroSemestral();
        double ahorroAnual = empleado.calcularAhorroAnual();

        // Mostrar los resultados
        System.out.println("Ahorro mensual proyectado: " + ahorroMensual);
        System.out.println("Ahorro semestral proyectado: " + ahorroSemestral);
        System.out.println("Ahorro anual proyectado: " + ahorroAnual);

        
    }
}
