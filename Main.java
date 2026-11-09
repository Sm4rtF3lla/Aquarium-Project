import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;
import org.json.JSONException;


public class Main {

    public static void main(String[] args) throws Exception {

        displayArtData(706020);

    }

    public static void displayArtData(int objectId) throws IOException, InterruptedException, JSONException {

        String url = String.format("https://collectionapi.metmuseum.org/public/collection/v1/objects/%d", objectId);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Request status: " + response.statusCode());

        if (response.statusCode() == 200) {

            JSONObject data = new JSONObject(response.body());
            System.out.println("Title: " + data.getString("title"));
            System.out.println("Artist: " + data.getString("artistDisplayName"));

        }

    }



}
