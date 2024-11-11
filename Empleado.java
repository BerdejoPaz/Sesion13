package Programas;
import java.util.Scanner;
class Empleado {
    // Atributos
    private double sueldoMensual;
    private double otrosIngresos;
    private double gastosMensuales;
    // Constructor
    public Empleado(double sueldoMensual, double otrosIngresos, double gastosMensuales) {
        this.sueldoMensual = sueldoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }
    // Métodos para obtener los valores
    public double getSueldoMensual() {
        return sueldoMensual;
    }
    public double getOtrosIngresos() {
        return otrosIngresos;
    }
    public double getGastosMensuales() {
        return gastosMensuales;
    }
    // Método para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return (sueldoMensual + otrosIngresos) - gastosMensuales;
    }
    // Método para calcular el ahorro semestral (6 meses)
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }
    // Método para calcular el ahorro anual (12 meses)
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
}

