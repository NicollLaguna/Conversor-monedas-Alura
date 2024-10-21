package model;

import java.net.http.*;
import java.net.URI;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import exceptions.ApiException;

public class ApiService {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/aeda1dc13f06ee24883ebcf5/latest/";
    private final Gson gson;

    public ApiService() {
        this.gson = new Gson();
    }

    public JsonObject obtenerTasaCambio(String baseMoneda) throws IOException, InterruptedException, ApiException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + baseMoneda))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new ApiException("Error en la solicitud a la API: " + response.statusCode());
        }

        return gson.fromJson(response.body(), JsonObject.class);
    }
}

