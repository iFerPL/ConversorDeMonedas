import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {

    public Monedas datosRequeridos(String monedaBase, String monedaDestino ){

        String direccion = "https://v6.exchangerate-api.com/v6/c0ad218b6883e18e6026703a/pair/"+monedaBase+"/"+monedaDestino;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();


        try{
            HttpResponse <String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al realizar la conversión: " + e.getMessage());
        }

    }


}
