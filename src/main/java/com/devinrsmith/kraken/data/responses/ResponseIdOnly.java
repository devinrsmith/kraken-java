package com.devinrsmith.kraken.data.responses;

/**
* Created by dsmith on 8/16/14.
*/
public class ResponseIdOnly {
    private String id;

    public ResponseIdOnly() {
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ResponseIdOnly{" +
                "id='" + id + '\'' +
                '}';
    }
}
