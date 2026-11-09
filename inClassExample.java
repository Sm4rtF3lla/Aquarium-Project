import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class inClassExample {
    public static void main(String[] args) throws Exception{
        String openMeteoUrl = "https://api.open-meteo.com/v1/forecast?latitude=33.75&longitude=84.39&current_weather=true";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(openMeteoUrl)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            System.out.println("Weather data received:\n" + response.body());
        } else {
            System.out.println("Data not received. Status code: " + response.statusCode());
        }  
    }    
}



