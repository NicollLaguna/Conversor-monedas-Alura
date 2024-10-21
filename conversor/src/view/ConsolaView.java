package view;

import java.util.Scanner;

public class ConsolaView {

    private Scanner scanner;

    public ConsolaView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("****************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println();
        System.out.println("1) Dólar >> Peso argentino");
        System.out.println("2) Peso argentino >> Dólar");
        System.out.println("3) Dólar >> Real brasileño");
        System.out.println("4) Real brasileño >> Dólar");
        System.out.println("5) Dólar >> Peso colombiano");
        System.out.println("6) Peso colombiano >> Dólar");
        System.out.println("7) Salir");
        System.out.println();
        System.out.print("Elija una opción válida: ");
        return scanner.nextInt();
    }

    public double obtenerCantidad() {
        System.out.print("Ingrese la cantidad a convertir: ");
        return scanner.nextDouble();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("El resultado de la conversión es: " + resultado);
    }

    public void mostrarMensajeError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}

