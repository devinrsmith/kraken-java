package com.devinrsmith.kraken.data.requests;

/**
* Created by dsmith on 8/16/14.
*/
public class Auth {
    private String api_key;
    private String api_secret;

    public Auth(String api_key, String api_secret) {
        this.api_key = api_key;
        this.api_secret = api_secret;
    }

    public String getApi_key() {
        return api_key;
    }

    public String getApi_secret() {
        return api_secret;
    }
}
