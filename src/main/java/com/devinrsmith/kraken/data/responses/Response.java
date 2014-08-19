package com.devinrsmith.kraken.data.responses;

/**
* Created by dsmith on 8/16/14.
*/
public class Response {
    private Boolean success;
    private String file_name;
    private Long original_size;
    private Long kraked_size;
    private Long saved_bytes;
    private String kraked_url;

    public Response() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getFile_name() {
        return file_name;
    }

    public Long getOriginal_size() {
        return original_size;
    }

    public Long getKraked_size() {
        return kraked_size;
    }

    public Long getSaved_bytes() {
        return saved_bytes;
    }

    public String getKraked_url() {
        return kraked_url;
    }

    @Override
    public String toString() {
        return "Response{" +
                ", success=" + success +
                ", file_name='" + file_name + '\'' +
                ", original_size=" + original_size +
                ", kraked_size=" + kraked_size +
                ", saved_bytes=" + saved_bytes +
                ", kraked_url='" + kraked_url + '\'' +
                '}';
    }
}
