package com.devinrsmith.kraken;

import com.devinrsmith.kraken.data.requests.URLRequest;
import com.devinrsmith.kraken.data.responses.Response;
import com.devinrsmith.kraken.data.responses.ResponseIdOnly;
import retrofit.RestAdapter;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by dsmith on 8/18/14.
 */
public interface KrakenIO {
    @POST("/v1/url")
    Response uploadImage(@Body URLRequest.Waiting request);

    @POST("/v1/url")
    ResponseIdOnly uploadImage(@Body URLRequest.Callback request);

    // todo other resources

    public static class Service {
        public static KrakenIO get(String endpoint) {
            final RestAdapter restAdapter = new RestAdapter.Builder().
                    setEndpoint(endpoint).
                    build();
            return restAdapter.create(KrakenIO.class);
        }
    }
}
