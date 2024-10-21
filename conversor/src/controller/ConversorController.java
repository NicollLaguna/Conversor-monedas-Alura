package controller;

import exceptions.ApiException;
import model.ConversorModel;
import view.ConsolaView;

public class ConversorController {

    private ConversorModel model;
    private ConsolaView view;

    public ConversorController(ConversorModel model, ConsolaView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciarConversor() {
        while (true) {
            int opcion = view.mostrarMenu();
            String baseMoneda = "";
            String monedaDestino = "";

            switch (opcion) {
                case 1:
                    baseMoneda = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    baseMoneda = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    baseMoneda = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    baseMoneda = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    baseMoneda = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    baseMoneda = "COP";
                    monedaDestino = "USD";
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }

            double cantidad = view.obtenerCantidad();

            try {
                double resultado = model.convertir(baseMoneda, monedaDestino, cantidad);
                view.mostrarResultado(resultado);
            } catch (Exception e) {
                view.mostrarMensajeError("Ha ocurrido un error inesperado: " + e.getMessage());
            }
        }
    }
}

