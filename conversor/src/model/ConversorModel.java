package model;

import com.google.gson.JsonObject;
import exceptions.ApiException;

import java.io.IOException;

public class ConversorModel {

    private ApiService apiService;

    public ConversorModel() {
        this.apiService = new ApiService();
    }

    public double convertir(String baseMoneda, String monedaDestino, double cantidad) throws IOException, InterruptedException, ApiException {
        try {
            JsonObject datosApi = apiService.obtenerTasaCambio(baseMoneda);

            if (!datosApi.get("conversion_rates").getAsJsonObject().has(monedaDestino)) {
                throw new ApiException("La moneda de destino no está disponible: " + monedaDestino);
            }

            double tasaCambio = datosApi.get("conversion_rates").getAsJsonObject().get(monedaDestino).getAsDouble();
            return cantidad * tasaCambio;
        } catch (ApiException e) {
            throw new ApiException("Error durante la conversión: " + e.getMessage());
        }
    }
}
