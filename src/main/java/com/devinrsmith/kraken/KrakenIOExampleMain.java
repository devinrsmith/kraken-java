package com.devinrsmith.kraken;

import com.devinrsmith.kraken.data.requests.Auth;
import com.devinrsmith.kraken.data.requests.URLRequest;
import com.devinrsmith.kraken.data.responses.Response;

import java.util.concurrent.ExecutionException;

/**
 * Created by dsmith on 8/18/14.
 */
public class KrakenIOExampleMain {

    public static final String API_ENDPOINT = "https://api.kraken.io";

    public static void showUsage() {
        System.out.println(KrakenIOExampleMain.class.getSimpleName() + " api_key api_secret url");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        if (args.length != 3) {
            showUsage();
            System.exit(1);
        }

        final String apiKey = args[0];
        final String apiSecret = args[1];
        final String url = args[2];

        final KrakenIO service = KrakenIO.Service.get(API_ENDPOINT);

        final URLRequest.Waiting waitingRequest = URLRequest.builder(new Auth(apiKey, apiSecret), url).
                lossy(true).
                quality(70).
                build();

        final Response response = service.uploadImage(waitingRequest);
        System.out.println(response.getKraked_url() + " : " + 100 * (response.getOriginal_size() - response.getKraked_size()) / response.getOriginal_size() + "% smaller");
    }
}
